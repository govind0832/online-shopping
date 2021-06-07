create table category(

id IDENTITY,
name VARCHAR(50),
description VARCHAR(225),
image_url VARCHAR(50),
is_active BOOLEAN,


CONSTRAINT pk_category_id PRIMARY KEY (id)

)


insert into category(name,description,image_url,is_active) values("Phone","Good phone","phony.jpg",true);