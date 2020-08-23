package com.jdbc;

import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.controller.GetterSetter;











public class Dao {

	public DriverManagerDataSource ds;
	public JdbcTemplate jt;
	
//	public Dao(DataSource dataSource) {
	//	jt = new JdbcTemplate(dataSource);
	//}
	
	




	public void dao()
	{
		ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("root");
		
		jt =new JdbcTemplate(ds);
		

		
	}
  


 // update receipe set col1 = val 1,col2  where 
//number3
public List<GetterSetter> list(GetterSetter gs) 
{
	String sql="select * from Recipe WHERE ingrident1= '"+gs.getIngridient1()+"' AND ingrident2 ='"+gs.getIngridient2()+"' AND  ingrident3 ='"+gs.getIngridient3()+"' AND diet= '"+gs.getDiet()+"' AND cusine= '"+gs.getCuisine()+"'";                                                             
	
	RowMapper<GetterSetter> rm= new RowMapper<GetterSetter>()
	{
		
		 public GetterSetter mapRow(ResultSet result,int row) throws SQLException{
			 
			 String ingridient1=result.getString("ingrident1");
			 String ingridient2=result.getString("ingrident2");
			 String ingridient3=result.getString("ingrident3");
			 String diet=result.getString("diet");
			 String cuisine=result.getString("cusine");
			 String food = result.getString("food");
			 return new GetterSetter(ingridient1,ingridient2,ingridient3,diet,cuisine,food);
		 }
	};
	return jt.query(sql,rm);
	
}

 //  Map<Integer> name = new Map<Integer>();
  // name.put()
	//select * from Recipe WHERE ingrident1='Pork' AND ingrident2='Beans' AND ingrident3='Hard Rolls' AND diet='Non-Vegetarian' AND cusine='mexican';
}
