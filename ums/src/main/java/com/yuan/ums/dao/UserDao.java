package com.yuan.ums.dao;

import com.yuan.ums.pojo.entity.User;

import java.util.List;

/**
 * <b>用户数据持久层接口</b>
 * @Name UserDao
 * @Description
 * @Author admin
 * @Date 2020/12/30 22:04
 * @Version 2.0
 */
public interface UserDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @author admin
	 * @param [query]
	 * @return java.util.List<com.yuan.ums.pojo.entity.User>
	 * @date 2020/12/30 22:06
	 */
	List<User> findListByQuery(User query) throws Exception;
	/**
	 * <b>保存对象信息</b>
	 * @author admin
	 * @param [entity]
	 * @return integer
	 * @date 2020/12/30 22:06
	 */
	Integer save(User entity) throws Exception;
	/**
	 * <b>修改对象信息</b>
	 * @author admin
	 * @param [entity]
	 * @return java.lang.Integer
	 * @date 2020/12/30 22:08
	 */
	Integer update(User entity) throws Exception;
}
