package zhu.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;


public class MySQLConnector {
	private Connection conn;
	
	public MySQLConnector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsn_test?useSSL=false", "root", "root");
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isNameExist(String name){
		try {
			PreparedStatement ps = conn.prepareStatement("select count(*) as num from user where name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getInt("num") > 0 ? true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void saveUser(Set<String> names){
		try {
			PreparedStatement ps = conn.prepareStatement("insert into user (name) values (?)");
			
			for(String name:names){
				ps.setString(1, name);
				ps.addBatch();
			}
			ps.executeBatch();
			ps.close();
			conn.commit();
			System.out.println("保存完用户");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveUserInfo(List<UserInfo> userInfos){
		try {
			PreparedStatement ps = conn.prepareStatement("insert into user_info (name,location,nums) values (?,?,?)");
			for(UserInfo userInfo : userInfos){
				ps.setString(1, userInfo.getName());
				ps.setString(2, userInfo.getLocation());
				ps.setInt(3, userInfo.getNums());
				ps.addBatch();
			}
			ps.executeBatch();
			ps.close();
			conn.commit();
			System.out.println("finish UserInfo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
