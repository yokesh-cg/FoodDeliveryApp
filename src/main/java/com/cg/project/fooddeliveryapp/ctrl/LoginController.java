package com.cg.project.fooddeliveryapp.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Login;
import com.cg.project.fooddeliveryapp.service.ILoginService;




@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	ILoginService iLoginService;
	
	
	@GetMapping("/signin/{userName}/{password}")
	public Login signIn(@PathVariable String userName, String password) {
		return iLoginService.signIn(userName, password);

	}
	
	@PostMapping("/signup")
	public Login signUp(@RequestBody Login login) {
		return iLoginService.signUp(login);
	}
}
