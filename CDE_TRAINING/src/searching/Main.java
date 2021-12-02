package searching;


import java.util.*;
public class Main
{
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a>99||a<10||b>99||b<10)
        {   
            System.out.println(String.valueOf(a)+" and "+String.valueOf(b)+" are not correct pair");
        }
        else 
        {
        	Main obj= new Main();
        	int ra=obj.rvs(a);
        	int rb=obj.rvs(b);
        	if(a*b==ra*rb)
            {
            System.out.println(String.valueOf(a)+" and "+String.valueOf(b)+" are correct pair");
            }
            else
            {
            	System.out.println(String.valueOf(a)+" and "+String.valueOf(b)+" are not correct pair");
            }
         }
    } 
    int rvs(int num)
    {
        int r,rnum=0;
        while (num>0)
        {
            r=num%10;
            rnum=rnum*10+r;
            num/=10;
        }
        return(rnum);
    }
}