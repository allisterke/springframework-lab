package com.ally.web.controller;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zk")
public class ZooKeeperController {
    private ZooKeeper zooKeeper;

    public ZooKeeperController() throws Exception {
        zooKeeper = new ZooKeeper("10.214.224.227:21811,10.214.224.227:21812,10.214.224.227:21813", 100,
                new Watcher() {
                    @Override
                    public void process(WatchedEvent event) {
                        // TODO
                    }
                });
    }

    @PostMapping
    public String setValue(@RequestParam String path,
                           @RequestParam String value) throws Exception {
        if(zooKeeper.exists(path, false) == null) {
            zooKeeper.create(path, value.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        }
        else {
            zooKeeper.setData(path, value.getBytes(), 0);
        }
        return "ok";
    }

    @GetMapping
    public String getValue(@RequestParam String path) throws Exception {
        return new String(zooKeeper.getData(path, false, new Stat()));
    }
}
