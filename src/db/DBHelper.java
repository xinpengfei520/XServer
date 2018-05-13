package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @date 2018年5月12日
 * @author Vancy Function:数据库连接帮助类
 */
public class DBHelper {

	public static final String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "xinpengfei";
	public static final String password = "123456";

	public Connection conn = null;
	public PreparedStatement pst = null;

	public DBHelper(String sql) {
		try {
			Class.forName(name);
			//Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				pst = conn.prepareStatement(sql);
			} else {
				System.out.println("conn is null !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (this.conn != null) {
				this.conn.close();
			}
			if (this.pst != null) {
				this.pst.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
