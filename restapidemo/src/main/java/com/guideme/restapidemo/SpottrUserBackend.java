package com.guideme.restapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.PreparedStatement;

public class SpottrUserBackend {
	List<SpottrUser> SpottrUserList = new ArrayList<SpottrUser>();
	
	
	public SpottrUserBackend()
	{

		
		
	}
	
	
	
	
	
	public List<SpottrUser> getStudent() throws SQLException
	{
		
		List<SpottrUser> dbSpottrUser = new ArrayList<SpottrUser>();
		ResultSet result = getConnection().createStatement().executeQuery("select * from SpottrUserDBData"); 
		
		
		while(result.next())
		{
			SpottrUser sptr = new SpottrUser();
			sptr.setEmail(result.getString(2));
			sptr.setPassword(result.getString(3)); 
			sptr.setBio(result.getString(4)); 
			sptr.setGender(result.getString(5));
			sptr.setPreferredGender(result.getString(6));
			sptr.setLocation(result.getString(7));
			sptr.setAge(result.getInt(8)); 
			dbSpottrUser.add(sptr);
		}
		
		return dbSpottrUser;
		
	} 
	
	
	public SpottrUser getSpottrUser(String username) throws SQLException
	{
				
		ResultSet result = getConnection().createStatement().executeQuery("select * from SpottrUserDBData"); 
		
		SpottrUser return_value = null;
		while(result.next())
		{
			if(username.contentEquals(result.getString(2)))
			{
				
				System.out.println("This is value for username: " + username + " this us the match inside DB: " + result.getString(2));
				return_value = new SpottrUser();
				return_value.setEmail(result.getString(2));
				return_value.setPassword(result.getString(3));
				return_value.setBio(result.getString(4));
				return_value.setGender(result.getString(5));
				return_value.setPreferredGender(result.getString(6));
				return_value.setLocation(result.getString(7));
				return_value.setAge(result.getInt(8));
				
				return return_value;
			}
		 
		} 	
		
		System.out.println("Didn't find your user Big RIP");
		return return_value;
		
	}
	
	public void createSpottrUser(SpottrUser user) throws Exception // Needs to be Modified
	{
		PreparedStatement ps = getConnection().prepareStatement("insert into SpottrUserDBData (spottr_email , spottr_password, spottr_bio, spottr_gender, spottr_preferredGender, spottr_location, spottr_age) values (? , ?, ?, ?, ?, ?, ?)");
		ps.setString(1, user.getEmail());
		
		System.out.println("This is email of input: " + user.getEmail());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getBio());
		ps.setString(4, user.getGender());
		ps.setString(5, user.getPreferredGender());
		ps.setString(6, user.getLocation());
		ps.setInt(7, user.getAge());
		ps.executeUpdate();
		
	}
	
	public void updateSpottrUserPassword(SpottrUser user) throws Exception // Needs to be Modified
	{
		PreparedStatement ps = getConnection().prepareStatement("update SpottrUserDBData  set spottr_password = ? where spottr_username = ?");
		ps.setString(1, user.getEmail());
		ps.setString(2, user.getPassword());
		int cout = ps.executeUpdate();
		System.out.println("Updated Count : " + cout);
		
	}
	
	
	public void dropSpottrUser(String username) throws Exception
	{
		PreparedStatement ps = getConnection().prepareStatement("delete from SpottrUserDBData where spottr_username = ?");
		ps.setString(1, username); 
		int cout = ps.executeUpdate();
		System.out.println("Updated Count : " + cout);
		
	}
	
	
	public Connection getConnection() throws SQLException 
	
	{
		Connection con = null; 
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SpottrUserDB?user=root&password=password&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=America/Los_Angeles");
			
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return con;
		
	}
	

}
