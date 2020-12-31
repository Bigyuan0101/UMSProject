package com.yuan.ums.util;

import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 * @Name ConstantUtil
 * @Description
 * @Author admin
 * @Date 2020/12/30 21:20
 * @Version 2.0
 */
public class ConstantUtil {
	private static Properties props = new Properties();

	static {
		try{
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * <b>分页信息：默认开始页码</b>
	 * @author admin
	 * @param
	 * @return
	 * @date 2020/12/30 21:23
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));
	/**
	 * <b>分页信息：默认开始页码</b>
	 * @author admin
	 * @param
	 * @return
	 * @date 2020/12/30 21:23
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
	/**
	 * <b>系统状态：启用状态</b>
	 * @author admin
	 * @param
	 * @return
	 * @date 2020/12/30 21:23
	 */
	public static final Integer STATUS_ENABLE = Integer.parseInt(props.getProperty("status.enable"));
	/**
	 * <b>系统状态：禁用状态</b>
	 * @author admin
	 * @param
	 * @return
	 * @date 2020/12/30 21:23
	 */
	public static final Integer STATUS_DISABLE = Integer.parseInt(props.getProperty("status.disable"));
}
