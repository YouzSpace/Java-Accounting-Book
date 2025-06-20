package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ToolsJDBC {

	// 增加记录到数据库的方法
	public static void add(String date, String ct, String price, String ms) {
		// 为了方便调用这个方法，我们给方法添加修饰词static，方法可以直接通过类名调用，不需要先创建对象再调用这
		Connection conn;
		// 1.加载连接数据库的驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("请检查是否做了准备环境的工作！或者驱动类全称是否书写正确：");
			e.printStackTrace();
		}

		try {
			// 2.创建连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
			// 3.创建sql语句并执行
			String sql = "insert into records(date,ct,price,ms) values(?,?,?,?)";
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setString(1, date);
			prep.setString(2, ct);
			prep.setString(3, price);
			prep.setString(4, ms);
			prep.execute();
		} catch (SQLException e) {
			System.out.println("请认真检查数据库地址是否正确或者数据库是否启动了");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		add("2023-06-19", "测试商品", "99.99", "这是一条测试记录");
		System.out.println("cg");

	}
}
