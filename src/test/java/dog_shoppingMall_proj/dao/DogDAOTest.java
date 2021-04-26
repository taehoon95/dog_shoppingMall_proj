package dog_shoppingMall_proj.dao;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dog_shoppingMall_proj.JdbcUtil;
import dog_shoppingMall_proj.dao.impl.DogDaoImpl;

public class DogDAOTest {

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
	public void testSelectDogList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectDog() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateReadCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertDog() {
		fail("Not yet implemented");
	}

}
