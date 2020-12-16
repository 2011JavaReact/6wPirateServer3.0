package com.revature.pirate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pirate.model.Role;
import com.revature.pirate.util.HibernateUtility;

public class DatabaseRoleDAO {

//	public Role findRoleByName(String name) {
//		
//		try (Connection connection = JDBCUtility.getConnection()) {
//			String sqlQuery = "SELECT * "
//					+ "FROM role r "
//					+ "WHERE r.role = ? ";
//			
//			PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
//			
//			pstmt.setString(1, name);
//			
//			ResultSet rs = pstmt.executeQuery();
//			
//			if (rs.next()) {
//				int id = rs.getInt(1);
//				String role = rs.getString(2);
//				return new Role(id, role);
//			} else {
//				return null;
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return null;
//	}
	
	public Role findRoleByName(String name) {
		try (Session session = HibernateUtility.getSession()) {
			Transaction tx = session.beginTransaction();
			
			Role role = (Role) session.createQuery("from Role r where r.role = :role").setParameter("role", name).getSingleResult();
			
			tx.commit();
			
			return role;
		} catch (Exception e) {
			return null;
		}
	}
	
}
