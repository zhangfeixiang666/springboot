package cn.asiainfo.service;

import cn.asiainfo.pojo.SUer;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/6 15:47
 * @Version 1.0
 */

public interface ISUerService {
	int checkUid(SUer sUer)throws Exception;

	int insertOne(SUer sUer)throws Exception;

	int selectOne(SUer sUer)throws Exception;
}
