package dog_shoppingMall_proj;
import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

public class JdbcUtilTest {

	@Test
	public void testConnection() {
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
		
		System.out.println("con >>" + con);
	}

}
