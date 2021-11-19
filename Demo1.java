package FirstPrac;
import java.util.Random;
import java.util.Scanner;

public class Demo1 {
	
	
	static int str=0,nex=1,temp=0;
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Demo1 cobj= new Demo1();
//		cobj.generateRandomnum(0,10);
//		cobj.fibonacci(10);
		int count1=5;
//		System.out.println(str+"\n"+nex);
//		recursive(count1-2);
		
//		cobj.primeNumb(5);
		
//		cobj.Reverseofnum(151);
		
//		cobj.factorial(5);
		
//		int f=0;
//		f=recurfact(5);
//		System.out.println(f);		
		
//		cobj.armstrong(153);
//		cobj.armsCount(1,1000);
		
		cobj.customArmCount();
	}
	
	
	public void generateRandomnum(int start, int end) {
		//while vs for loop
		//for: when we know the number of iterations for example trainer says go 30pushups then i start and finish
		// while: when we dont knwo the number of iterations, we just know to iterate.
//			for eg: when trainer says start pushups then i will start without knwoing when to 
//			stop, utill the trainer say enough. whether it 20 to 30 repetitions.  

		Random robj = new Random();
		// between two range
		int s = start, limit = end;
		//here we know the no of iteration is 30
		int i, result = 0;
		for (i = s; i <= limit; i++) {
			 System.out.println("for pushup count: "+i);
		}		
		//when we dont knwo
		String trainer="yes";
		while(trainer.equals("yes")) {			
			
			int itr=0;
			for(itr=1;itr<=100;itr++) {//here we used for bcoz we want 100 limit for eampel
				Random random=new Random();
				int res=random.nextInt(100);
				System.out.println("while pushup count "+itr);
				if(res==0) {
					System.out.println("Enough!");
					trainer="enough";
					break;
				}
			}	
		}
	}
	
	
	public void fibonacci(int limit) {

		int start=0, next=1,i,temp;
		System.out.println(start+"\n"+next);
		for(i=2;i<=limit;i++) {
			
			temp=start+next;
			System.out.println(temp);
			start=next;
			next=temp;			
		}
	}

	
	public void primeNumb(int num) {
		int rept,flag = 0,i = 0;
		
		rept=num/2;
		if((num==0)||(num==1)) {
			System.out.println("non prime");
		}else {
			for(i=2;i<=rept;i++){				
				if(num%i==0){
					System.out.println("non-prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("prime number");
			}
		}
	}	

		
	static void recursive(int count) {					

		if(count>0) 
		{
			temp = str+nex;
			System.out.println(temp);
			str=nex;
			nex=temp;			
			recursive(count-1);			
		}
	}
	
	
	public void Reverseofnum(int num) {
		int r=0; int rev=0;
		int org=num;
		if(num<10) {
			System.out.println("non reverseable");
		}
		else
		{
			while(num>0)
			{
				r=num%10;
				num=num/10;				
				rev=rev*10+r;								
			}
			System.out.println(rev);
			if(org==rev) {
				System.out.println("palindrom number");
			}
		}		 
	}

	
	public void factorial(int num) {
		
		int fact=1,i=0;
		if((num==0)||(num==1)) 
		{
			System.out.println(1+"");
		}
		else if(num>0) 
		{
			for(i=1;i<=num;i++) 
			{
				fact=fact*i;				
			}
			System.out.println(fact+"");
		}
	}

	static int recurfact(int n)
	{
		if(n>0)
			return (n*recurfact(n-1));
		else
			return 1;
	}


	public boolean armstrong(int num) {
		boolean flag=false;
		int temp=0,lastn=0,arm=0,digits=0;
		int org=num;
		temp=num;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0) {
			lastn=num%10;
			num=num/10;
			arm+=Math.pow(lastn, digits);
			
			temp=temp/10;
		}
		
		if(org==arm) 
		{
			flag=true;
		}
		return flag;
	}
	
	public void armsCount(int start,int end) {
		
		int i=0;		
		for(i=start;i<=end;i++) {
			boolean flag=armstrong(i);
			if(flag) {
				System.out.println("Armstrong:\t"+i);
			}
		}
	}
	
	public void customArmCount() 
	{
		int uinput;
		Scanner intscr = new Scanner(System.in);
		System.out.println("enter a num t check:\n");
		uinput = intscr.nextInt();
		
		boolean flag=armstrong(uinput);
		if(flag) {
			System.out.println("Armstrong:\t"+uinput);
		}else {
			System.out.println("Non-Armstrong:\t"+uinput);
		}
	}	
}