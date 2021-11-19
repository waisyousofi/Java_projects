package FirstPrac;

import java.util.Scanner;

public class AllStarts {

	public static void main(String[] args) {
		
		AllStarts obj = new AllStarts();
//		obj.StartPyramid();
//		obj.StarRev();
//		obj.Start2();
//		obj.Start3();
//		obj.Start4();
//		obj.Start5();
//		obj.Start6();
//		obj.Start7();
//		obj.Start8();
//		obj.Start9();
//		obj.Start11();
//		obj.Start12();
//		obj.Start13();
		
//		obj.nStart1();
//		obj.nStart2();
//		obj.nStart3();
//		obj.nStart4();
//		obj.nStart5();
//		obj.nStart6();
//		obj.nStart7();	
//		obj.nStart8();
		obj.cStart1();
		
		
		//ascivalue 
		char a='A',aa='a';
		int ia=a,iaa=aa;
		System.out.println("\na"+ia+" aa"+iaa);
		
	}
	
	public void StartPyramid() 
	{
		Scanner intscr=new Scanner(System.in);
		System.out.println("enter number");
		int num = intscr.nextInt();
		int row;
		int space=0;
		int col=0;
		for(row=1;row<=num;row++) 
		{		
			for(space=row;space<num;space++) {
				System.out.print(" ");
			}			
			for(col=1;col<=(row*2)-1;col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}			
	}

	
	public void StarRev() 
	{
		int space=0,row=0,col=0,num=0;
		
		Scanner scri=new Scanner(System.in);
		System.out.println("enter");
		num=scri.nextInt();
		

		for(row=num;row>0;row--) 
		{
			for(space=0;space<num-row;space++)
			{
				System.out.print(" ");								
			}
			for(col=0;col<(2*row)-1;col++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}		
	}

	public void Start2() {
		int num=5;
		
		int row,col,space=0;
		for(row=0;row<num;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void Start3() {
		int num=5;
		
		int row,col;
		for(row=0;row<num;row++)
		{
			for(col=0;col<num-row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void Start4() 
	{
		int num=5;
		
		int row,col,space=0;
		for(row=1;row<=num;row++)
		{
			for(space=1;space<=(num-row);space++)
			{
				System.out.print(" ");			
			}
			for(col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}			
		
	}


	public void Start5() 
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=0;row<num;row++)
		{
			for(space=num-row;space>1;space--)
			{
				System.out.print(" ");			
			}
			for(col=0;col<=row;col++)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
	}

	public void Start6() 
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=0;row<num;row++)
		{
			for(space=num-row;space>1;space--)
			{
				System.out.print(" ");			
			}
			for(col=0;col<=row;col++)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
	}
	
	public void Start7() 
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=0;row<num;row++)
		{
			for(space=num-row;space>1;space--)
			{
				System.out.print(" ");			
			}
			for(col=0;col<(2*row+1);col++)
			{
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for(row=1;row<=num-1;row++)
		{
			for(space=1;space<=row;space++)
			{
				System.out.print(" ");			
			}
			
			for(col=1;col<=2*(num-row)-1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void Start8() 
	{
		int num=5,col=0,row=0,space=0;
		for(row=0;row<num;row++)
		{
			for(space=num-row;space>1;space--)
			{
				System.out.print(" ");			
			}
			for(col=0;col<=row;col++)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		for(row=1;row<num;row++)
		{
			for(space=1;space<=row;space++)
			{
				System.out.print(" ");			
			}
			for(col=num;col>row;col--)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
		
	}

	public void Start9() 
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("*");				
			}
			System.out.println();
		}
		for(row=num-1;row>=1;row--)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("*");				
			}
			System.out.println();
		}
	}

	public void Start10() 
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("*");				
			}
			System.out.println();
		}
		for(row=num-1;row>=1;row--)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	public void Start11() 
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=0;row<num;row++)
		{
			for(space=0;space<=row;space++)
			{
				System.out.print(" ");				
			}
			for(col=row;col<num;col++)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		for(row=0;row<num;row++)
		{
			for(space=row;space<num;space++)
			{
				System.out.print(" ");				
			}
			for(col=0;col<=row;col++)
			{
				System.out.print("* ");				
			}
			System.out.println();
		}
	}

	public void Start12() 
	{
		int num=9,col=0,row=0,space=0;
		
		for(row=num;row>=1;row--)
		{
			for(space=num;space>row;space--)
			{
				System.out.print(" ");				
			}
			for(col=(2*row-1);col>=1;col--)
			{
				if(col==1 || col==(2*row-1)||row==num)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
//		System.out.println("part2");
		for(row=1;row<=num;row++)
		{
			for(space=num;space>row;space--)
			{
				System.out.print(" ");				
			}
			for(col=1;col<=(2*row-1);col++)
			{
				if(col==1 || col==(2*row-1)||row==num)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
	
	
	public void Start13() 
	{
		int num=9,col=0,row=0,space=0;
		
		for(row=1;row<=num;row++)
		{
			for(space=num;space>row;space--)
			{
				System.out.print(" ");				
			}
			for(col=1;col<=(2*row-1);col++)
			{
				if(col==1 || col==(2*row-1)||row==2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
		for(row=1;row<=num-1;row++)
		{
			for(space=1;space<=row;space++)
			{
				System.out.print(" ");				
			}
			for(col=1;col<=(2*(num-row)-1);col++)
			{
				if(col==1 || col==(2*(num-row)-1)||row==num-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
	
	
	public void nStart1()
	{
		int num=5,col=0,row=0,space=0;
		
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}		
	}
	
	public void nStart2()
	{
		int num=5,col=0,row=0,counter=0;
		
		for(row=1;row<=num;row++)
		{			
			for(col=1;col<=row;col++)
			{
				counter++;
				System.out.print(counter+" ");
			}
			System.out.println();
		}		
	}
	
	public void nStart3()
	{

		int num = 5;    //n is the number of rows you want to print

		for (int row = 0; row < num; row++)   
		{  
		int number = 1;  
		System.out.printf("%" +(num-row)*2+"s","");
		for (int col = 0; col <=row; col++)   
		{			 
			System.out.printf("%4d", number);
			number = number * (row - col) / (col + 1);  
			number=number*(row-col)/(col+1);
		}  
		System.out.println();  
		}  		
	}

	public void nStart4() {
		
		int row=0,col=0,space=0,num=5;
		for(row=1;row<=num;row++)
		{
			for(space=row;space<num;space++)
			{
				System.out.print(" ");				
			}
			for(col=row;col>=1;col--)
			{
				System.out.print(col);
			}
			for(int right =2;right<=row;right++)
			{
				System.out.print(right);
			}
			System.out.println();
		}
		for(row=num-1;row>=1;row--)
		{
			for(space=row;space<=num-1;space++)
			{
				System.out.print(" ");				
			}
			for(col=row;col>=1;col--)
			{
				System.out.print(col);
			}
			for(int right =2;right<=row;right++)
			{
				System.out.print(right);
			}
			System.out.println();
		}
	}


	public void nStart5() 
	{		
		int row=0,col=0,space=0,num=5;
		for(row=1;row<=num;row++)
		{
			for(space=1;space<row;space++)
			{
				System.out.print(" ");				
			}
			for(col=row;col<=num;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for(row=num-1;row>=1;row--)
		{
			for(space=1;space<row;space++)
			{
				System.out.print(" ");				
			}
			for(col=row;col<=num;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}


	public void nStart6() 
	{		
		int row=0,col=0,space=0,num=5;
		for(row=num;row>=1;row--)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for(row=2;row<=num;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public void nStart7() 
	{		
		int row=0,col=0,space=0,num=5;
		for(row=1;row<=num;row++)
		{
			for(col=row;col<=num;col++)
			{
				System.out.print(col+" ");
			}			
			for(int row2=1;row2<row;row2++)
			{
				System.out.print(row2+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------part2------------");
		int tem2=num;
		for(row=1;row<=num;row++)
		{
			for(col=row;col<=num;col++)
			{
				System.out.print(col+" ");
			}			
			int temp=col;
			for(int row2=temp;row2>tem2;row2--)
			{
				System.out.print(temp+" ");
				temp--;
			}
			tem2--;
			System.out.println();
		}
	}


	public void nStart8() 
	{	
		
		int row=0,col=0,space=0,num=5,min=0;
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=num;col++)
			{
				min=row<col?row:col;
				System.out.print(num-min+1+" ");
			}
			
			for (col = num; col >= 1; col--)   
			{
				min = row < col ? row : col;
				System.out.print(num - min + 1+ " ");   
			}   
			System.out.println();
		}
		
		for(row=num;row>=1;row--)
		{
			for(col=1;col<=num;col++) 
			{
				min=row<col?row:col;
				System.out.print(num-min+1+" ");
			}
			for (col=num;col>=1;col--) 
			{
				min=row<col?row:col;
				System.out.print(num-min+1+" ");   
			}
			System.out.println();
		}
		
		
	}						

	
	public void cStart1() 
	{	
		
		int row=0,col=0,space=0,num=6,min=0;
		char alpha='A';
		for(row=num;row>=1;row--)
		{			
			for(col=1;col<=row;col++)
			{
				System.out.print(alpha+" ");				
			}
			System.out.println();
			alpha++;
		}
		for(row=1;row<=num;row++)
		{			
			for(col=1;col<=row;col++)
			{
				System.out.print(alpha+" ");				
			}
			System.out.println();
			alpha--;
		}	
		
		
		System.out.println("\n----------------part2\n-----------------"
				+ "");
		
		alpha='A';
		for(row=1;row<=num;row++)
		{	
			for(space=num;space>row;space--)
			{
				System.out.print(" ");	
			}
			for(col=1;col<=row;col++)
			{
				if(row%2==0) 
				{
					System.out.print(alpha+" ");
				}
				else
				{
					System.out.print(row+" ");
				}								
			}
			System.out.println();
			alpha++;
		}
				
		System.out.println("-----------part3-------------");
		
		alpha='A';
		for(row=1;row<=num;row++)
		{	
			for(space=num;space>row;space--)
			{
				System.out.print(" ");	
			}
			
			for(col=1;col<=row;col++)
			{
				if(col==1||col==row) 
				{
					System.out.print(alpha+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			alpha++;
		}
		
	}
	
	
}