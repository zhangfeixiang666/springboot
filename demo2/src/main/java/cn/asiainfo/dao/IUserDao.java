package cn.asiainfo.dao;

import cn.asiainfo.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/5 15:18
 * @Version 1.0
 */
@org.apache.ibatis.annotations.Mapper
public interface IUserDao extends Mapper<User> {
}
