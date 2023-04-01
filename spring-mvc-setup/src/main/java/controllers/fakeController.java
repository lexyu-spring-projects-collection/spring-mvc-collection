package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 */
@Controller
public class fakeController {

	@ResponseBody
	@RequestMapping("/fake")
	public String fakeEndpoint() {
		System.out.println("This is fake Endpoint");
		return "This is fake Endpoint";
	}


}
