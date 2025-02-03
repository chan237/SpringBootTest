package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.domain.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController		//@Controller + @ResponsBody
public class RESTController {
	
	@GetMapping("blog")
	public User httpGet() {
		User user = User.builder().id(1).userName("zeus").passwoard("123456").email("zeus@gmail").build();
		return user;
	}
	@PostMapping("blog")
	//@ResponsBody = 자바객체를 제이슨방식으로 바꿔서 브라우저에게 보낸다
	//@RequestBody = 브라우저가 제이슨방식으로 보내면 자바객체로 바꾼다
	public User httpPost(@RequestBody User user) {
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user);
		return user;
	}
	@PutMapping("blog")
	public String httpPut(@RequestBody User user) {
		return "put 요청처리"+user.toString();
	}
	@DeleteMapping("blog")
	public String httpDelete(@RequestParam int id) {
		return "delete 요청처리"+id;
	}
}
