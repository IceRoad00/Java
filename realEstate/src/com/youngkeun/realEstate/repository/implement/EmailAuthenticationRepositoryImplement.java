package com.youngkeun.realEstate.repository.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.youngkeun.realEstate.repository.EmailAuthenticationRepository;

public class EmailAuthenticationRepositoryImplement implements EmailAuthenticationRepository {
	
	private Connection connection;
	public EmailAuthenticationRepositoryImplement () {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			final String URL = "jdbc:mysql://127.0.0.1:3306/real_estate";
			final String USERNAME = "root";
			final String USERPASSWORD = "root";
			
			this.connection = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			
		}
	}

	@Override
	public boolean existsByEmail(String email) throws SQLException {
		
		boolean result = false;
		
		final String SQL = "SELECT * FROM email_authentication WHERE email = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(SQL);
		preparedStatement.setString(1, email);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		result = resultSet.next();
				
		return result;
	}

	@Override
	public void save(String email, String AuthenticationCode) throws SQLException{
		
		final String SQL = "INSERT INTO email_authentication VALUES (?, ?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(SQL);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, AuthenticationCode);
		
		preparedStatement.executeUpdate();

	}

}
