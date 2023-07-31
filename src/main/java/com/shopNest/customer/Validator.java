package com.shopNest.customer;

import com.shopNest.dbHandler.DataFetcher;

public class Validator {
public static boolean isValid(String uname,String pass) {
	String dbpass=DataFetcher.fetchPass(uname);
	if(pass.equals(dbpass)) {
		return true;
	}
	else {
		return false;
	}
}
}
