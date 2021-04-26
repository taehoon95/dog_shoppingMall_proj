select id,kind,price,image,country,height,weight,content,readcount from dog;

select id,kind,price,image,country,height,weight,content,readcount from dog where id = 1;

update dog set readcount = readcount  + 1 where id = ?;

insert into dog 
(kind, price, image, country, height, weight, content, readcount) values 
('푸들', 1000, 'pu.jpg', '프랑스', 1, 20, '털 많다', 0);

delete from dog where id = 5;