package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.OperatingCompanyBean;
import com.clientui.proxies.MicroServiceOperatingCompanyProxies;

@Controller
public class ClientController {
	@Autowired
	private MicroServiceOperatingCompanyProxies microServiceOperatingCompanyProxies;
	
	@RequestMapping("/operating")
	public String operatingAccueil(Model model) {
		List<OperatingCompanyBean> operatings = microServiceOperatingCompanyProxies.findAll();
		model.addAttribute("operatings", operatings);
		return "Operating";
	}
}
