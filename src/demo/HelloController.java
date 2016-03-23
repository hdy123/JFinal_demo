package demo;


import model.User;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
	
	

	public void index(){
		User user = User.userDao.findById(1);
		String username = user.getStr("username");
		String password = user.getStr("password");
		
		renderText("username: "+username+"; password: "+password);
	}
}
