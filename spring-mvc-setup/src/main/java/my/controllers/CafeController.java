package my.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : LEX_YU
 * @date : 2023/4/1
 */
@Controller
public class CafeController {
    @RequestMapping("/cafe")
    public String showWelcomePage(Model model) {
        System.out.println("This is show Welcome Page Endpoint");
        // Sending data to view
        String coffee = "Coffee";

        model.addAttribute("coffee", coffee);
        model.addAttribute("title", "Cafe Shop");

        return "welcome-page";
    }


    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest request, Model model) {
        // handle the data received from the user
        String foodType = request.getParameter("foodType");

        // adding the captured value to the model
        model.addAttribute("foodType", foodType);

        // set the user data with the model object and send it to view

        return "process-order";
    }
}
