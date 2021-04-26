package dog_shoppingMall_proj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dog_shoppingMall_proj.dao.DogDAO;
import dog_shoppingMall_proj.dto.Dog;

public class DogDaoImpl implements DogDAO {

	private static final DogDaoImpl instance = new DogDaoImpl();

	public static DogDaoImpl getInstance() {
		return instance;
	}

	private DogDaoImpl() {}

	private Connection con;

	public void setCon(Connection con) {
		this.con = con;
	}
	
	@Override
	public List<Dog> selectDogList() {
		return null;
	}


	@Override
	public Dog selectDog(int id) {
		return null;
	}

	@Override
	public int updateReadCount(int id) {
		String sql = "";
		return 0;
	}

	@Override
	public int insertDog(Dog dog) {
		String sql = "";
		return 0;
	}

}
