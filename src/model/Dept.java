package model;

import com.jfinal.plugin.activerecord.Model;

public class Dept extends Model<Dept>{

	public int id;
	public String name;
	
	public static final Dept deptDao = new Dept();
}
