/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.web.userinfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.mx.entity.userinfo.UserInfo;
import com.thinkgem.jeesite.modules.mx.service.userinfo.UserInfoService;

/**
 * 管理用户信息，包括社团考评Controller
 * @author sfdotz
 * @version 2017-12-16
 */
@Controller
@RequestMapping(value = "${adminPath}/mx/userinfo/userInfo")
public class UserInfoController extends BaseController {

	@Autowired
	private UserInfoService userInfoService;
	
	@ModelAttribute
	public UserInfo get(@RequestParam(required=false) String id) {
		UserInfo entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = userInfoService.get(id);
		}
		if (entity == null){
			entity = new UserInfo();
		}
		return entity;
	}
	
	@RequiresPermissions("mx:userinfo:userInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<UserInfo> page = userInfoService.findPage(new Page<UserInfo>(request, response), userInfo);
		//User user =

		model.addAttribute("page", page);
		return "modules/mx/userinfo/userInfoList";
	}

	@RequiresPermissions("mx:userinfo:userInfo:view")
	@RequestMapping(value = "form")
	public String form(UserInfo userInfo, Model model) {
		model.addAttribute("userInfo", userInfo);
		return "modules/mx/userinfo/userInfoForm";
	}

/*
	@RequiresPermissions("mx:userinfo:userInfo:edit")
	@RequestMapping(value = "info")
	public String info(UserInfo userInfo, HttpServletResponse response, Model model) {

		User user = UserUtils.getUser();
		UserInfo userInfotmp = userInfoService.findByNumber(user.getLoginName());

		if (userInfotmp != null) {
*/
/*			userInfotmp.setAge(userInfo.getAge());
			userInfotmp.setCompany(userInfo.getCompany());
			userInfotmp.setSex(userInfo.getSex());
			userInfotmp.setHomeplace(userInfo.getHomeplace());
			userInfotmp.setHonour(userInfo.getHonour());
			userInfotmp.setIntroduction(userInfo.getIntroduction());
			userInfotmp.setLocation(userInfo.getLocation());
			userInfotmp.setEmail(userInfo.getEmail());
			userInfotmp.setWork(userInfo.getWork());*//*

			System.out.println("-----------sfdotz@gmail.com-----------" + userInfotmp + "是userInfotmp的值,当前类是UserInfoController.info()");
			userInfo.setId(userInfotmp.getId());
			userInfo.setClazz(userInfotmp.getClazz());
			userInfo.setNumber(userInfotmp.getNumber());
			userInfoService.updaUserInfo(userInfo);

			model.addAttribute("message", "保存信息成功");
		}
		model.addAttribute("userInfo", userInfotmp);
		model.addAttribute("Global", new Global());
		return "modules/mx/userinfo/userInfoUpdate";
	}
*/

	@RequiresPermissions("mx:userinfo:userInfo:edit")
	@RequestMapping(value = "save")
	public String save(UserInfo userInfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, userInfo)){
			return form(userInfo, model);
		}
		userInfoService.save(userInfo);
		addMessage(redirectAttributes, "保存用户信息成功");
		return "redirect:"+Global.getAdminPath()+"/mx/userinfo/userInfo/?repage";
	}
	
	@RequiresPermissions("mx:userinfo:userInfo:edit")
	@RequestMapping(value = "delete")
	public String delete(UserInfo userInfo, RedirectAttributes redirectAttributes) {
		userInfoService.delete(userInfo);
		addMessage(redirectAttributes, "删除用户信息成功");
		return "redirect:"+Global.getAdminPath()+"/mx/userinfo/userInfo/?repage";
	}

}