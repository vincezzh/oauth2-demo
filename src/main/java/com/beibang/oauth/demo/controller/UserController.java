package com.beibang.oauth.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beibang.oauth.demo.model.RestResponse;
import com.beibang.oauth.demo.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.POST, produces = "application/json")
    public RestResponse<User> getUser() {
        try {
            User user1 = new User();
            user1.setUsername("Vince");
            System.out.println("/user/get");
            return new RestResponse<User>(true, null, user1);
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse<User>(false, e.getMessage(), null);
        }

    }
}
