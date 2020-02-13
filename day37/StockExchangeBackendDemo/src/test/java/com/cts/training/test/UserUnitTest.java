//package com.cts.training.test;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.BeforeClass;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.cts.project.dao.UserDao;
//import com.cts.project.daoimpl.UserDAOImpl;
//import com.cts.project.model.User;
//
//public class UserUnitTest {
//	private static AnnotationConfigApplicationContext context;
//	private static UserDao userDAO;
//	private static User user;
//	
//	@BeforeClass
//	public static void init() 
//	{
//		context=new AnnotationConfigApplicationContext();
//		context.scan("com.cts.project");
//		context.refresh();
//		user=(User)context.getBean("user");
//		userDAO=(UserDao) context.getBean("userDAO");
//	  	
//	}
//
//	@Test
//	public void testGetAllUsers() {
//		List<User> users=userDAO.getAllUsers();
//		assertEquals(2, users.size());
//	}
//	@Test
//	public void test_update_user_success()
//	{
//		User u=userDAO.getUserById(27);
//		u.setUsername("anu");
//		assertEquals( true, userDAO.updateUser(u));
//	}
//	@Test
//	@Ignore
//	public void test_add_user()
//	{
//		User u=new User(103,"Roshni","roshni@gmail.com",765432,"rochi","rochi");
//		assertEquals(true, userDAO.addUser(u));
//	}
//	
//	@Test
//	@Ignore
//	public void test_delete_user()
//	{
//		User u=userDAO.getUserById(31);
//		assertEquals(true, userDAO.deleteUser(u));
//	}
//	
//	@Test(expected=NullPointerException.class)
//	public void test_delete_user_by_id_fail()
//	{
//		User u=userDAO.getUserById(100);
//		assertEquals(true, u.getEmail());
//	}
//	
//	@Test(expected=NullPointerException.class)
//	public void test_get_user_by_id_fail()
//	{
//		User u=userDAO.getUserById(50);
//		assertEquals("Anand",u.getUsername());
//	}
//	
//	@Test(expected=NullPointerException.class)
//	public void test_update_user_by_id_fail()
//	{
//		User u=userDAO.getUserById(100);
//		u.setUsername("anu");
//		assertEquals( true, userDAO.updateUser(u));
//	}
//
//}
