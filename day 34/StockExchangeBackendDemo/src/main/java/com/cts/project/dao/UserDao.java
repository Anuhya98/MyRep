package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.User;

public interface UserDao 
{
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public boolean isValidUser(String user,String password);
    public User getUserById(int id);
    public List<User> getAllUsers();
}
