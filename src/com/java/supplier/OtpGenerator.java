package com.java.supplier;

import java.util.function.Supplier;

public class OtpGenerator {

public static void main(String[] args) {
	Supplier<String> getOtp=()->{
		String otp="";
		for(int i=1;i<=6;i++) {
			otp= otp +((int)(Math.random()*10));
		}
		return otp;
	};
	
	System.out.println(getOtp.get());
	System.out.println(getOtp.get());
	System.out.println(getOtp.get());
}
}
