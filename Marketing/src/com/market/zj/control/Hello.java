package com.market.zj.control;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.utils.JdbcUtils;
import com.market.zj.bean.User;

@Controller
@Scope("prototype")
@RequestMapping(value="/hello")
public class Hello {
	@Resource
	private JdbcUtils jdbcUtils;//例子，此处应为service层的接口
	public void setJdbcUtils(JdbcUtils jdbcUtils) {
		this.jdbcUtils = jdbcUtils;
	}
	@RequestMapping(value="/hello",method=RequestMethod.POST)
 public String hell(){
		 
	 return "MyJsp";
 }
	
}
