insert into companies values('Alibaba', 'Jack');
insert into companies values('Tencent', 'Pony');

----

insert into users values ('admin', '$2a$10$8P9wF0eayTfG8efVtmyXze9Fs8GA2TpCHK3b1lvUHp4hqi9o4n.L.', true);
insert into authorities values ('admin', 'ADMIN');
insert into authorities values ('admin', 'USER');

----

insert into store(name, latitude, longitude, location) values
  ("Store 1", 31.247853, 121.456753, "Shanghai Huatie Lvke Service Co., Ltd. Zonghe Office Building"),
  ("Store 2", 31.224533, 121.450420, "Jing'an Kerry Centre Office Building Erzuo"),
  ("Store 3", 31.220670, 121.457891, "Jin Jiang Dickson Center");

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

insert into material_settings
  select m.id materialId, 1000*(round(rand()) % 5 + 2), 1000*(round(rand()) % 10 + 5) from material m;

insert into material_remain
  select s.id storeId, ms.materialId materialId, round(rand() * ms.fill) amount
  from material_settings ms join store s;