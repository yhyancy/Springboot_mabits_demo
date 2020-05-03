package com.yh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.yh.entity.User;


@Mapper
@Repository
public interface UserMapper {
	// 选择全部用户
	List<User> selectUser();
	
	// 根据id选择用户
	User selectUserById(int id);
	
	// 修改一个用户
	int updateUser(User user);
	
	// 根据id删除用户
	int deleteUser(int id);

}
