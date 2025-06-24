package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ToolsJDBC {

	// ���Ӽ�¼�����ݿ�ķ���
	public static void add(String date, String ct, String price, String ms) {
		// Ϊ�˷������������������Ǹ�����������δ�static����������ֱ��ͨ���������ã�����Ҫ�ȴ��������ٵ�����
		Connection conn;
		// 1.�����������ݿ������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("�����Ƿ�����׼�������Ĺ���������������ȫ���Ƿ���д��ȷ��");
			e.printStackTrace();
		}

		try {
			// 2.��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
			// 3.����sql��䲢ִ��
			String sql = "insert into records(date,ct,price,ms) values(?,?,?,?)";
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setString(1, date);
			prep.setString(2, ct);
			prep.setString(3, price);
			prep.setString(4, ms);
			prep.execute();
		} catch (SQLException e) {
			System.out.println("�����������ݿ��ַ�Ƿ���ȷ�������ݿ��Ƿ�������");
			e.printStackTrace();
		}
	}

	// ��ѯ��

	public static void cha(DefaultTableModel dm) { // Ϊ�˷������������������Ǹ�����������δ�static����������ֱ��ͨ���������ã�����Ҫ�ȴ��������ٵ����������
		Connection conn;
		// 1.�����������ݿ������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("�����Ƿ�����׼�������Ĺ���������������ȫ���Ƿ���д��ȷ��");
			e.printStackTrace();
		}

		try {
			//// 2.��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
			// 3.����sql��䲢ִ��
			String sql = "select * from records";
			PreparedStatement prep = conn.prepareStatement(sql);

			ResultSet jieguo = prep.executeQuery();

			while (jieguo.next()) {
				Object[] row = { jieguo.getInt(1), jieguo.getString(2), jieguo.getString(3), jieguo.getString(4),
						jieguo.getString(5) };
				dm.addRow(row);
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "��ѯʧ�ܣ����Ժ����Ի�����ϵ����Ա��");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		add("2023-06-19", "������Ʒ", "99.99", "����һ�����Լ�¼");
		System.out.println("cg");

	}
}
