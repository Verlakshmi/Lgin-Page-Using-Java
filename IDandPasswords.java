package com.priya.loginSystem;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Priya","Pizza");
        logininfo.put("Bromethus","PASSWORD");
        logininfo.put("Saurabh","Priya123");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
