package controller;

import java.util.List;

import model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class UserController extends Controller{

	public void addUser(){
		User user = getModel(User.class);
		user.set("password", "123").save();
		findList();
	}
	
	public void delUser(){
		User.userDao.deleteById(getPara("id"));
		findList();
	}
	
	public void updateUser(int id){
		User.userDao.findById(id).set("password",getPara("password")).update();
	}
	
	public void findUser(){
		Record user = Db.findFirst("select * from user where username = '"+getPara("username")+"' and password = '"+getPara("password")+"'");	
		if(user!=null)
		   renderText("登录成功");
		else
		   renderText("登录失败");
	}
	
	public void findList(){
		List<User> user = User.userDao.find("select * from user");	
		setAttr("user",user);
		renderJson();
		this.render("/login/showUser.jsp");
	}
	public void index(){
		renderText("hahahh");
	}
}
