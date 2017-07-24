insert into companies values('Alibaba', 'Jack');
insert into companies values('Tencent', 'Pony');

# ----

insert into users values ('admin', '$2a$10$8P9wF0eayTfG8efVtmyXze9Fs8GA2TpCHK3b1lvUHp4hqi9o4n.L.', true);
insert into authorities values ('admin', 'ADMIN');
insert into authorities values ('admin', 'USER');

# ----

insert into store(latitude, longitude, location) values
  (31.247853, 121.456753, "Shanghai Huatie Lvke Service Co., Ltd. Zonghe Office Building"),
  (31.224533, 121.450420, "Jing'an Kerry Centre Office Building Erzuo"),
  (31.220670, 121.457891, "Jin Jiang Dickson Center");

insert into material(name, unit) values
  ("Coco","g"),
  ("Salt","g"),
  ("Syrup","ml"),
  ("Vallina","g"),
  ("White Sugar","g"),
  ("Coffee Bean","g"),
  ("Cream","ml"),
  ("Milk","ml"),
  ("Water","ml"),
  ("Caramel Sauce","ml"),
  ("Chocolate Cream","ml");

insert into material_remain(storeId, materialId, amount) values
  (1, 2, 5) on duplicate key update amount = amount + 5;