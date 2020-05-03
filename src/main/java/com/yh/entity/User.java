package com.yh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// id, user_name, password, user_type, email, mobile_num, confirmed, update_ts

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	private int id;
	private  String user_name;
	private String password;
	private String user_type;
	private String email;
	private String mobile_num;
	private String confirmed;
	private String update_tS;
	
}
