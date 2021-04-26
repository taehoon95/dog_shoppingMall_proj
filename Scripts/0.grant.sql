drop user 'user_dog_shoppingmall'@'localhost';

grant all
     on dog_shoppingmall.*
     to 'user_dog_shoppingmall'@'localhost'
identified by 'rootroot';

-- file 권한(backup, load) -- root만 권한 부여 가능
GRANT File 
   ON *.*
   TO 'user_dog_shoppingmall'@'localhost';