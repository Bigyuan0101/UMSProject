package com.yuan.ums.controller;

import com.yuan.ums.base.controller.BaseController;
import com.yuan.ums.pojo.entity.User;
import com.yuan.ums.service.UserService;
import com.yuan.ums.util.ConstantUtil;
import com.yuan.ums.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * <b>用户信息控制层</b>
 * @Name UserController
 * @Description
 * @Author admin
 * @Date 2020/12/30 23:20
 * @Version 2.0
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Resource(name = "userService")
	private UserService userService;
	/**
	 * <b>转发到登陆界面</b>
	 * @author admin
	 * @param []
	 * @return java.lang.String
	 * @date 2020/12/30 23:25
	 */
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String forwordLoginPage() throws Exception{
		return "user/user_login";
	}

	/**
	 * <b>用户登陆</b>
	 * @Name UserController
	 * @Description
	 * @Author admin
	 * @Date 2020/12/31 10:17
	 * @Version 2.0
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String loginUser(String cellphone,String password) throws Exception{
		//判断用户所提交的cellphone 和 Password 是否提交
		if (cellphone != null && !"".equals(cellphone.trim())
				&& password != null && !"".equals(password.trim())){
			//用户填写的登陆信息有效
			//通过cellphone 查询用户信息
			User user = userService.getUserByCellphone(cellphone);

			if (user!=null && user.getStatus().equals(ConstantUtil.STATUS_ENABLE)){
				//对于密码进行加密
				password = MD5Util.encrypt(password);
				if (user.getPassword().equals(password)){
					session.setAttribute("user",user);
					//重定向到首页面
					return "redirect/index";
				}
			}
		}
		return "redirect:login";
	}
}
