package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Controller
public class Index extends HandlerInterceptorAdapter {
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView mac = new ModelAndView("index");
		mac.addObject("message","Hello World!");
		return mac;
	}
	@RequestMapping("/jump")
	public ModelAndView jump(){
		ModelAndView mac = new ModelAndView("redirect:/index");
		return mac;
	}

}
