package com.yuan.ums.controller;

import com.yuan.ums.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <b>首页面控制器</b>
 * @Name IndexController
 * @Description
 * @Author admin
 * @Date 2020/12/31 10:46
 * @Version 2.0
 */
@Controller("indexController")
public class IndexController extends BaseController {
	@GetMapping("/index")
	public String index(ModelMap map) throws Exception{
		return "index";
	}
}
