package cn.asiainfo.service;

import cn.asiainfo.pojo.User;

import java.util.List;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 15:19
 * @Version 1.0
 */
public interface IUserService {

	List<User> findAll ();

	boolean addUer(User user);

	boolean deleteUser(User user);

	User findOne(User user);

	Boolean updateUser(User user);
}
