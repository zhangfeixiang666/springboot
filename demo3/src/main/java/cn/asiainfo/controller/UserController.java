package cn.asiainfo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 16:16
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping("{id}")
	public String findOne(@PathVariable("id") Long id){

		return "helolo";
	}
}
