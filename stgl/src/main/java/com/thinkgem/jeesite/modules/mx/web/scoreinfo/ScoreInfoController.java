/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.web.scoreinfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.thinkgem.jeesite.modules.mx.entity.scoreinfo.ScoreInfo;
import com.thinkgem.jeesite.modules.mx.service.scoreinfo.ScoreInfoService;

/**
 * 分数明细Controller
 * @author sfdotz
 * @version 2017-12-16
 */
@Controller
@RequestMapping(value = "${adminPath}/mx/scoreinfo/scoreInfo")
public class ScoreInfoController extends BaseController {

	@Autowired
	private ScoreInfoService scoreInfoService;
	
	@ModelAttribute
	public ScoreInfo get(@RequestParam(required=false) String id) {
		ScoreInfo entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scoreInfoService.get(id);
		}
		if (entity == null){
			entity = new ScoreInfo();
		}
		return entity;
	}
	
	@RequiresPermissions("mx:scoreinfo:scoreInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScoreInfo scoreInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScoreInfo> page = scoreInfoService.findPage(new Page<ScoreInfo>(request, response), scoreInfo); 
		model.addAttribute("page", page);
		return "modules/mx/scoreinfo/scoreInfoList";
	}

	@RequiresPermissions("mx:scoreinfo:scoreInfo:view")
	@RequestMapping(value = "form")
	public String form(ScoreInfo scoreInfo, Model model,String flag) {

		model.addAttribute("flag",flag);
		model.addAttribute("scoreInfo", scoreInfo);
		return "modules/mx/scoreinfo/scoreInfoForm";
	}

	@RequiresPermissions("mx:scoreinfo:scoreInfo:edit")
	@RequestMapping(value = "save")
	public String save(ScoreInfo scoreInfo, Model model, RedirectAttributes redirectAttributes,String flag) {
		if (!beanValidator(model, scoreInfo)){
			return form(scoreInfo, model,"1");
		}
		/**
		 * 1 加分2扣分
		 */
		if("1".equals(flag)){
			scoreInfoService.addScore(scoreInfo);
		}
		if ("2".equals(flag)){
			scoreInfoService.minusScore(scoreInfo);
		}
		scoreInfoService.save(scoreInfo);
		addMessage(redirectAttributes, "保存明细成功");
		return "redirect:"+Global.getAdminPath()+"/mx/scoreinfo/scoreInfo/?repage";
	}
	
	@RequiresPermissions("mx:scoreinfo:scoreInfo:edit")
	@RequestMapping(value = "delete")
	public String delete(ScoreInfo scoreInfo, RedirectAttributes redirectAttributes) {
		scoreInfoService.delete(scoreInfo);
		addMessage(redirectAttributes, "删除明细成功");
		return "redirect:"+Global.getAdminPath()+"/mx/scoreinfo/scoreInfo/?repage";
	}

}