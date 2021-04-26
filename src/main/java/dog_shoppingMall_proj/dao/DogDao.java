package dog_shoppingMall_proj.dao;

import java.util.List;

import dog_shoppingMall_proj.dto.Dog;

public interface DogDao {
	List<Dog> selectDogList();
	
	Dog selectDog(int id);
	
	int updateReadCount(int id);
	
	int insertDog(Dog dog);
}
