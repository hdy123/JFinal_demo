package model;

import com.jfinal.plugin.activerecord.Model;

public class Authority extends Model<Authority>{
	
	public int id;


	public static final Authority authDao = new Authority();
}
