package com.demo.application;

import java.util.Scanner;

import user_portal.Model;
//import model class from its package 
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        Model obj=new Model();
        while(true)
        {
            System.out.println("Choose one of the following:\n1.Customer Login\n2.Vendor Login\n3.Display Items\n4.Exit");
            int ch = sc.nextInt();
        switch(ch)
            {   
                case 1: 
                System.out.println("-------------------Customer Login-----------------");
                System.out.println("Enter Login user name:");
                obj.setUserName(sc.next());
                System.out.println("Enter Login Password:");
                obj.setPwd(sc.next());
                obj.retrieve();
                break;
                
                case 2: 
                System.out.println("-------------------Vendor Login-----------------");
                System.out.println("Enter Login user name:");
                obj.setUserName(sc.next());
                System.out.println("Enter Login Password:");
                obj.setPwd(sc.next());
                obj.retrieve();
                break;
                
                case 3:
                 System.out.println("-------------------Store Items-----------------");
                 obj.display();
                
                break;
                default:
                    System.out.println("Choose your option wisely");
                
            }
        }
        
    

	}

}
