package model;

import java.util.Date;

import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User>{
	public int id;
	public String username;
	public String password;
	public String email;
	public String depName;
	public Integer managerId;
	public String phone;
	public String introduction;
	public Sex sex;
	public Date birthday;
	
	public static final User userDao = new User();
     
	public enum Sex{
	  男,女
	}
}
     