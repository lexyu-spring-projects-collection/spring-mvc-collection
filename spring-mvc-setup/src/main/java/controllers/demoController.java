package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 * Handler
 */
@Controller
public class demoController {

	//@ResponseBody
	@RequestMapping("/demo")
	public String demoEndpoint() {
		System.out.println("This is Demo Endpoint");
		return "Demo";
//		return "/vi/ew/Demo.jsp";
//		return "/view/Demo.html";
	}
}
