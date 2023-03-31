package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 * Handler
 */
@Controller
public class testController {
	@ResponseBody
	@RequestMapping("/test")
	public String testEndpoint(){
		return "This is Test Endpoint";
	}
}
