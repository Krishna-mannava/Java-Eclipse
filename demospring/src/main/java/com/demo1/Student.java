package com.demo1;

public class Student {  
private String name;  
private String pass;
public String getName() {  
    return name;  
}  

public String getPass() {  
    return name;  
} 
  
public void setName(String name) {  
    this.name = name;  
}  
public void setPass(String pass) {  
    this.pass = pass;  
}
  
public void validate(String user, String pwd){  
    if(user.equals(name)&& pwd.equals(pass))
    {
    	System.out.println("Login Successful");
    }
}  
}  