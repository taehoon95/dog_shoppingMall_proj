package dog_shoppingMall_proj.ds;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JndiDs {
	private static DataSource ds;
	
	private JndiDs() {}
	
	static {
		try {
			InitialContext ic = new  InitialContext(); // 1. JNDI 서버 객체 생성
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/dog_shoppingMall_proj"); // 2. lookup()
			System.out.println("ds : " + ds);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void commit(Connection con) {
		try {
			con.commit();
			System.out.println("commit success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
			System.out.println("rollback success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
