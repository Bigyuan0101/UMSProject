package com.yuan.ums.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * <b>基础控制层</b>
 * @Name BaseController
 * @Description
 * @Author admin
 * @Date 2020/12/30 23:17
 * @Version 2.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
