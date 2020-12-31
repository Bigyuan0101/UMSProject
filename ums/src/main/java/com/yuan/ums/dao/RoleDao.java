package com.yuan.ums.dao;

import com.yuan.ums.pojo.entity.Role;

import java.util.List;

/**
 * <b>角色数据持久层接口</b>
 * @Name RoleDao
 * @Description
 * @Author admin
 * @Date 2020/12/30 23:02
 * @Version 2.0
 */
public interface RoleDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @author admin
	 * @param [query]
	 * @return java.util.List<com.yuan.ums.pojo.entity.Role>
	 * @date 2020/12/30 22:06
	 */
	List<Role> findListByQuery(Role query) throws Exception;
	/**
	 * <b>保存对象信息</b>
	 * @author admin
	 * @param [entity]
	 * @return integer
	 * @date 2020/12/30 22:06
	 */
	Integer save(Role entity) throws Exception;
	/**
	 * <b>修改对象信息</b>
	 * @author admin
	 * @param [entity]
	 * @return java.lang.Integer
	 * @date 2020/12/30 22:08
	 */
	Integer update(Role entity) throws Exception;
}
