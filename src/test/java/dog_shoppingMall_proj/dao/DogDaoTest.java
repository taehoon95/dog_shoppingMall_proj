package dog_shoppingMall_proj.dao;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dog_shoppingMall_proj.JdbcUtil;
import dog_shoppingMall_proj.dao.impl.DogDaoImpl;
import dog_shoppingMall_proj.dto.Dog;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DogDaoTest {

	private static Connection con = JdbcUtil.getConnection();
	private static DogDaoImpl dao = DogDaoImpl.getInstance();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao.setCon(con);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test04SelectDogList() {
		System.out.println("test04SelectDogList");
		
		List<Dog> list = dao.selectDogList();

		Assert.assertNotNull(list);
		System.out.println(list);
	}

	@Test
	public void test03SelectDog() {
		System.out.println("test03SelectDog");
		
		Dog dog = dao.selectDog(5);
		
		Assert.assertNotNull(dog);
		System.out.println(dog);
	}

	@Test
	public void test02UpdateReadCount() {
		System.out.println("test02UpdateReadCount");
		
		int res = dao.updateReadCount(5);
		
		Assert.assertEquals(1, res);
		System.out.println("update res >>" + res);
	}

	@Test
	public void test01InsertDog() {
		System.out.println("test01InsertDog");
		
		Dog dog = new Dog(5, "개", 1000, "개.jpg", "미국", 1, 20, "잘뛴다");

		int res = dao.insertDog(dog);
		Assert.assertEquals(1, res);
	}

}
