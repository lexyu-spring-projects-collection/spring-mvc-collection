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
public class demoHtmlController {

	//@ResponseBody
	@RequestMapping("/demo2")
	public String demoHtmlEndpoint() {
		System.out.println("This is Demo Html Endpoint");
		return "Demo2";
//		return "/vi/ew/Demo1.jsp";
//		return "/view/Demo2.html";
	}
}
