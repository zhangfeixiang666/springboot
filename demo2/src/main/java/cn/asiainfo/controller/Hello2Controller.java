package cn.asiainfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 15:56
 * @Version 1.0
 */
@RestController
@RequestMapping("h")
public class Hello2Controller {
	@RequestMapping("s")
	public String sayHello(){
		int i =10/0;
		return "hello everyone";
	}
}
