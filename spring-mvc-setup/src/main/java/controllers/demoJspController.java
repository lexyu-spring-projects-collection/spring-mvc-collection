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
public class demoJspController {

	//@ResponseBody
	@RequestMapping("/demo1")
	public String demoJspEndpoint() {
		System.out.println("This is Demo Jsp Endpoint");
		return "Demo1";
//		return "/vi/ew/Demo1.jsp";
//		return "/view/Demo2.html";
	}
}
