package org.easeyourlease.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easeyourlease.constants.URIConstants;
import org.easeyourlease.login.LoginRequestDTO;
import org.easeyourlease.login.LoginResponseDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoginController {
	
	@RequestMapping(value = URIConstants.LOGIN, 
			method= {RequestMethod.POST})
@ResponseBody
public LoginResponseDTO login(HttpServletRequest request, HttpServletResponse response, @RequestBody LoginRequestDTO loginRequestDTO){

String user = "Mudrita";
String pass = "123";

String  password = loginRequestDTO.getPasscode();
String  userId = loginRequestDTO.getUserID();

System.out.println("Login parameters passowrd : " +password + "userId : " +userId);
LoginResponseDTO loginRes = new 	LoginResponseDTO();

if(user.equalsIgnoreCase(userId) && pass.equals(password)) {
	loginRes.setUserId(userId);
	loginRes.setMsg("Success");	
}
else {
	loginRes.setUserId(userId);
	loginRes.setMsg("Login denied");
}
return loginRes;
}

}
