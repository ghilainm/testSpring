package testspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserPreferences {
	
	@RequestMapping("/userPreference") 
	public String userPreference(){
		return "userPreference";
	}

}
