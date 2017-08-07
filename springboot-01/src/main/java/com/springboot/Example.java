package com.springboot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pojo.User;
import com.springboot.service.UserService;

@RestController
public class Example {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	@RequestMapping("/userlist")
	@ResponseBody
	List<User> userlist() {
		List<User> list = userService.query();
        return list;
    }
	
}
