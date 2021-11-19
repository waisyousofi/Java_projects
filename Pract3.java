package FirstPrac;

import java.util.*;

public class Pract3
{

    public static void main(String args [])
    {
    	check2();
    }
    public static void check2()
    {
    	Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number (3-digit number )");
        int n=scr.nextInt();
    	
        String[] upt19 = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        		"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};        
        String[] multipleoftens = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String hw=" Hundred ";
        
        if(n>=0)
        {
    		int last=n%10;//0
    		int nn=n/10;//10
    		int second=nn%10;//0if 3 dgt
    		int trd=n/100;//first of 3 digt----1
        	
    		
    		if(n<20) 
        	{
        		System.out.println(upt19[n]);
        	}
        	else if(n<100)
        	{
        		System.out.println(multipleoftens[nn]+""+upt19[last]);
        	}
        	else if(n>=100)
        	{
        		System.out.println(upt19[trd]+""+hw +""+multipleoftens[second]+" "+upt19[last]);
        	}
        		
        }          
    }
    
    
    static public void check()
    {
        Scanner in =new Scanner(System.in);        
        System.out.println("Enter the number (3-digit number )");
        int n=in.nextInt();
        if(n<1 ||n>999) //condition for wrong input, -ve condition
            System.out.println("Wrong Input,Sorry");
        else
        {
            int u=n%10;//last digit
            int tt=n/10;
            int t=tt%10;//second digit
            int h=n/100;//fist digit
            String uw[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
            String tw[]={" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String hw=" Hundred ";
            if(n<20)//till 19
                System.out.println(uw[n]);
            else if(n<100)//till 99
                System.out.println(tw[t]+" "+uw[u]);
            else //from 100 to 999
                System.out.println(uw[h]+hw+tw[t]+" "+uw[u]);
        }
    }
}
