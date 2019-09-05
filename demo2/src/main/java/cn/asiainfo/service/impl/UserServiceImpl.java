package cn.asiainfo.service.impl;

import cn.asiainfo.dao.IUserDao;
import cn.asiainfo.pojo.User;
import cn.asiainfo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 15:21
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public List<User> findAll() {

		List<User> users = userDao.selectAll();
		return users;
	}
}
