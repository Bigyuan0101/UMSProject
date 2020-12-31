package com.yuan.ums.service;

import com.yuan.ums.pojo.entity.User;

/**
 * <b>用户信息业务层接口</b>
 * @Name UserService
 * @Description
 * @Author admin
 * @Date 2020/12/30 23:19
 * @Version 2.0
 */
public interface UserService {
	/**
	 * <b>根据手机号码，查询用户信息</b>
	 * @Name UserService
	 * @Description
	 * @Author admin
	 * @Date 2020/12/31 10:24
	 * @Version 2.0
	 */
	User getUserByCellphone(String cellphone) throws Exception;
}
