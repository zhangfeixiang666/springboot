package cn.asiainfo.service.impl;

import cn.asiainfo.dao.ISUerDao;
import cn.asiainfo.pojo.SUer;
import cn.asiainfo.service.ISUerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhangfeixiang
 * @Date 2019/9/6 15:51
 * @Version 1.0
 */
@Service
public class SUSerServiceImpl implements ISUerService {
	@Autowired
	private ISUerDao uerDao;
	@Override
	public int checkUid(SUer sUer) throws Exception {

		int i = uerDao.selectCount(sUer);
		return i;
	}

	@Override
	public int insertOne(SUer sUer) throws Exception {

		return uerDao.insert(sUer);
	}

	@Override
	public int selectOne(SUer sUer) throws Exception{
		return uerDao.selectCount(sUer);
	}
}
