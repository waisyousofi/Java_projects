import java.util.*;
import java.sql.*;
class Assignment3
{
	Connection con;
	ResultSet result;
	PreparedStatement pstm;
	Statement stm;
	int rollno,ch;
	String name,adds;
	Scanner scrs=new Scanner(System.in);
	Scanner scri=new Scanner(System.in);

	public static void main(String args[])
	{
		Assignment3 obj=new Assignment3();
		obj.select();
	}

	public Assignment3()
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			con=DriverManager.getConnection("jdbc:sqlserver://waisullahyousofi97;databasename=School","sa","root");	
		}
		catch(Exception e)
		{}
	}

	public void select()
	{
		
		String yn;
		do
		{
			System.out.println("1-Inserting\n2-Projecting\n3-Updating\n4-Deleting\n5-searching\n6-exit");
			ch=scri.nextInt();
			switch(ch)
			{	
				case 1:
					addRecord();
					break;
				case 2:
					show();	
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				case 5:
					search();
					break;
				case 6:
					System.exit(0);
					try
					{
						con.close();
					}
					catch(Exception e)
					{}
					break;
				default:	

					System.out.println("invlaid choice");
			}
			System.out.println("Do you want to continue(y/n)");
			yn=scrs.next();
			if(!(yn.equals("y")))
			{
					try
					{
						con.close();
					}
					catch(Exception e)
					{}	
			}
		}while(yn.equals("y"));
	}
	public void addRecord()
	{
		System.out.println("Enter roll number :");
		rollno=scri.nextInt();
		System.out.println("Enter name:");
		name=scrs.nextLine();name=scrs.nextLine();
		System.out.println("Enter address");
		adds=scrs.nextLine();
		try
		{
			pstm=con.prepareStatement("insert into student1 values(?,?,?)");
			pstm.setInt(1,rollno);
			pstm.setString(2,name);
			pstm.setString(3,adds);
			int i=pstm.executeUpdate();
			System.out.println(i+" row inserted");
			
			System.out.println("connected with db");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}


	public void show()
	{
		try
		{
		 	stm=con.createStatement();
			result=stm.executeQuery("select * from student1");			
			while(result.next())
			{
				System.out.println(result.getInt(1)+"  "+result.getString(2)+"   "+result.getString(3));
			}		
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	
	public void delete()
	{
		System.out.println("Enter the roll number to delete:");
		rollno=scri.nextInt();
		try
		{
			pstm=con.prepareStatement("delete from student1 where rollno=?");
			pstm.setInt(1,rollno);
			int i=pstm.executeUpdate();
			System.out.println(i+" row deleted");
			
		}
		catch(Exception e)
		{
			
		}	
	}  

	public void update()
	{
		
		System.out.println("Enter the roll number as condition:");
		rollno=scri.nextInt();
		System.out.println("Enter new name");
		name=scrs.nextLine();name=scrs.nextLine();
		System.out.println("Enter new address:");
		adds=scrs.nextLine();
		try
		{
			pstm=con.prepareStatement("update student1 set name=?,adds=? where rollno=?");
			pstm.setString(1,name);
			pstm.setString(2,adds);
			pstm.setInt(3,rollno);
			int i=pstm.executeUpdate();
			System.out.println(i+"row upated");
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void search()
	{
		System.out.println("1-by roll number\n2-by name\n3-by char");
		ch=scri.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("enter  rollno  :");
				rollno=scri.nextInt();
				try
				{ 
					pstm=con.prepareStatement("select * from student1 where rollno=?");
					pstm.setInt(1,rollno);
					result=pstm.executeQuery();
					while(result.next())
					{
						System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3));			
					}			
				}
				catch(Exception e)
				{
					System.out.println("error"+e);
				}
				break;
			case 2:
				System.out.println("enter name :");
				name=scrs.nextLine();name=scrs.nextLine();
				try
				{ 
					pstm=con.prepareStatement("select * from student1 where name=?");
					pstm.setString(1,name);
					result=pstm.executeQuery();
					while(result.next())
					{
						System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3));			
					}			
				}
				catch(Exception e)
				{
					System.out.println("error"+e);
				}				
				break;
			case 3:
				String alpha;
				System.out.println("enter first alphabit :");
				alpha=scrs.next();
				try
				{ 
					pstm=con.prepareStatement("select * from student1 where name like ?");
					pstm.setString(1,"%"+alpha+"%");
					result=pstm.executeQuery();
					while(result.next())
					{
						System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3));			
					}			
				}
				catch(Exception e)
				{
					System.out.println("error"+e);
				}
				break;
			default:
				System.out.println("invalid choice");
		}
	}
}


