package com.market.utils;



import java.util.List;

import javax.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("jdbcUtils")
public class  JdbcUtils {
	@Resource
	 private JdbcTemplate jdbcTemplate;
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    /**
     * 查询结果为一条记录
     * @param sql
     * @param obj
     * @param clazz
     * @return
     */
	public  <T> T queryObject(String sql,Object[] obj,Class<T> clazz){
		 T t=jdbcTemplate.queryForObject(sql, obj,new BeanPropertyRowMapper<T>(clazz) );
	     return t;
	}
	/**
	 * 查询结果为list集合
	 * @param sql
	 * @param obj
	 * @param clazz
	 * @return
	 */
	public <T> List<T> queryList(String sql,Object[] obj,Class<T> clazz){
		List<T> list=jdbcTemplate.queryForList(sql, obj, clazz);
		return list;
	}
	/**
	 * 用于删除，更改
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int updateObject(String sql,Object[] obj){
		return jdbcTemplate.update(sql, obj);
	}
	/**
	 * 用于增加
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int insertObject(String sql,Object[] obj){
		return jdbcTemplate.update(sql, obj);
	}
	/**
	 * 查询表中记录的总条数
	 * @param sql
	 * @return
	 */
    public int queryCount(String sql){
    	return jdbcTemplate.queryForInt(sql);
    }
	 
}
