package com.updev.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	
	@RequestMapping(value = "/")
	public String ko1()
	{
		return "main";
	}
	// 회원가입폼으로 이동
	@RequestMapping(value = "/signup")
	public String ko2()
	{
		return "signup";
	}
	
	
}
