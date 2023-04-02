package com.lex.controllers;

import com.lex.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : LEX_YU
 * @date : 2023/4/2
 */
@Controller
public class AppController {
    @RequestMapping("/")
    public String showHomepage(@ModelAttribute("defaultUser") UserDTO userDTO
//            Model model
    ) {
        // read the default values from dto
//        UserDTO defaultUser = new UserDTO();
//        model.addAttribute("defaultUser", defaultUser);

        return "home-page";
    }

    @RequestMapping("/process-page")
    public String showResultPage(
            @ModelAttribute("userDTO") UserDTO userDTO
//            @RequestParam(value = "username") String username,
//            @RequestParam("anothername") String anotherName,
//                                 Model model
    ) {

//        System.out.println(username + ", " + anotherName);
        System.out.println(userDTO.getUsername() + ", " + userDTO.getAnothername());

//        model.addAttribute("userDTO", userDTO);
//        model.addAttribute("username", username);
//        model.addAttribute("anothername", anotherName);

        return "result-page";
    }
}
