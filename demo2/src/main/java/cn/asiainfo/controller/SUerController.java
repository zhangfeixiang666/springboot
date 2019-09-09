package cn.asiainfo.controller;

import cn.asiainfo.exception.MyException;
import cn.asiainfo.pojo.SUer;
import cn.asiainfo.service.ISUerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/6 15:41
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class SUerController {

	@Autowired
	private ISUerService uerService;

	/**
	 * 检验用户名是否存在
	 * @param uid
	 * @return
	 */
	@GetMapping("check")
	public Map checkUid(String uid){

		Map<String,Object> map = new HashMap();
		SUer sUer = new SUer();
		sUer.setUid(uid);

		try {
			 int i = uerService.checkUid(sUer);
			 if(i>0){
			 	map.put("flag",false);
			 	map.put("message","用户名已存在，请重新填入！");
			 }else {
				 map.put("flag",true);
				 map.put("message","可以使用");
			 }

		} catch (Exception e) {

			try {
				throw new MyException("uid出错");
			} catch (MyException e1) {
				e1.printStackTrace();
			}

		}
		return  map ;

	}
}
