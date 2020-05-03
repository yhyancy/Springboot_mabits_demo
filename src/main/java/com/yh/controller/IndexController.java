package com.yh.controller;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yh.entity.User;
import com.yh.mapper.UserMapper;


@RestController
public class IndexController {
	
//	JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	public IndexController(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
	
	@Autowired
	private UserMapper userMapper;
	@GetMapping("/listUser")
	public String selectUser() {
		List<User> users = userMapper.selectUser();
		for (User user: users) {
			System.out.println(user);
		}
		return "ok";
	}
	
//	
//    @GetMapping("/userList")
//    public List<Map<String, Object>> userList() {
//        String sql = "select * from user_info";
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//        return maps;       
//    }
//    
//    //新增一个用户
//    @GetMapping("/addUser")
//    public String addUser() {
//        //插入语句
//        String sql = "INSERT INTO user_info VALUES (4,'test','123456','admin','dlyhua@cn.ibm.com','17615196688','Y',NULL)";
//        jdbcTemplate.update(sql);
//        //查询
//        return "addUser-ok";
//    }
//    
//    //修改用户信息
//    @GetMapping("/updateUser/{id}")
//    public String updateUser(@PathVariable("id") int id) {
//        //插入语句
//        String sql = "update user_info set user_name='test1'  where id=" + id;
//        //数据
////        Object[] objects = new Object[2];
////        objects[0] = "小明2";
////        objects[1] = "zxcvbn";
////        jdbcTemplate.update(sql, objects);
//        jdbcTemplate.update(sql);
//        //查询
//        return "updateUser-ok";
//    }
//    
//    //删除用户
//    @GetMapping("/delUser/{id}")
//    public String delUser(@PathVariable("id") int id) {
//        //插入语句
//        String sql = "delete from user_info where id=" + id;
//        jdbcTemplate.update(sql);
//        //查询
//        return "delUser-ok";
//    }
    


}
