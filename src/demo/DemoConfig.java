package demo;

import model.User;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.SqlReporter;
import com.jfinal.plugin.activerecord.cache.EhCache;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

import controller.UserController;

public class DemoConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants arg0) {	
		arg0.setDevMode(true);
		arg0.setViewType(ViewType.JSP);
		SqlReporter.setLog(true);
	
		
	}

	@Override
	public void configHandler(Handlers arg0) {
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
		//mysql数据源
		C3p0Plugin dsMysql = new C3p0Plugin("jdbc:mysql://localhost/test","root","");
		arg0.add(dsMysql);
		
		ActiveRecordPlugin arpMysql = new ActiveRecordPlugin("mysql",dsMysql);
		arg0.add(arpMysql);
		arpMysql.setShowSql(true);
	    arpMysql.setCache(new EhCache());
	    arpMysql.addMapping("user", User.class);
	}

	@Override
	public void configRoute(Routes arg0) {
		arg0.add("/hello",HelloController.class);
		arg0.add("/user",UserController.class);
	}

}
