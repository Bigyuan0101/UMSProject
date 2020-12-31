package com.yuan.ums.service.impl;

import com.yuan.ums.dao.UserDao;
import com.yuan.ums.pojo.entity.User;
import com.yuan.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>用户信息业务层接口实现类</b>
 * @Name UserService
 * @Description
 * @Author admin
 * @Date 2020/12/30 23:19
 * @Version 2.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @author admin
	 * @param [cellphone]
	 * @return com.yuan.ums.pojo.entity.User
	 * @date 2020/12/31 10:40
	 */
	@Override
	public User getUserByCellphone(String cellphone) throws Exception {
		User query = new User();
		query.setCellphone(cellphone);
		//进行查询
		List<User> userList = userDao.findListByQuery(query);
		if (userList != null && !userList.isEmpty()){
			return userList.get(0);
		}
		return null;
	}
}
