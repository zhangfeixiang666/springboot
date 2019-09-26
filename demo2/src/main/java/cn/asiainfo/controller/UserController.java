package cn.asiainfo.controller;

import cn.asiainfo.pojo.User;
import cn.asiainfo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/25 16:29
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private IUserService userService;
	@GetMapping("findAll")
	public List<User> findAllUser(){
		List<User> users = userService.findAll();
		return users;
	}
	@RequestMapping("add")
	public String addUser(User user){
		String flag = "";
		boolean flag1 = userService.addUer(user);
		if (flag1){
			flag = "87777";
		}
		return flag;
	}
	@GetMapping("delete")
	public Boolean deleteUser(Long id){
		Boolean flag = false;
		User user = new User();
		user.setId(id);
		flag = userService.deleteUser(user);
		return flag;
	}
	@GetMapping("findOne")
	public User findOne(Long id){
		User user = new User();
		user.setId(id);
		User u = userService.findOne(user);
		return u;
	}
	@PostMapping("update")
	public Boolean updateUser(User user){
		return userService.updateUser(user);
	}
}
