package com.nt.encoder;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PaswordEncoder {
	public static void main(String[] args) { 
		BCryptPasswordEncoder encode=new  		BCryptPasswordEncoder();
	String pass1=	encode.encode("rani");
	String pass2=	encode.encode("hyd");
	String pass3=	encode.encode("hyd");
	System.out.println(pass1);
	System.out.println(pass2);
	System.out.println(pass3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
