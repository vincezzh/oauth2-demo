package com.beibang.oauth.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beibang.oauth.demo.model.RestResponse;

@Controller
@RequestMapping("/business")
public class BusinessController {
	
	@ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.POST, produces = "application/json")
    public RestResponse<String> getBusiness() {
        try {
        	System.out.println("/business/get");
            return new RestResponse<String>(true, null, "Hello World");
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse<String>(false, e.getMessage(), null);
        }

    }
}
