package cn.asiainfo.controller;

import cn.asiainfo.pojo.User;
import cn.asiainfo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 10:53
 * @Version 1.0
 */
@RestController
@RequestMapping("hello")
public class HelloController {

	@Autowired
	private IUserService userService;
	@RequestMapping("users")
	public List<User> user(){
		//int i = 10/0;

		List<User> all = userService.findAll();
		System.out.println("all = " + all);
		return all;
	}
}
