import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Grid3 implements ActionListener,KeyListener
{
	JFrame frame;
	JLabel lrno,lname,laddress,lgen,lqua,lhob;
	JTextField tbrno,tbname,tbaddress,tbgen;
	JCheckBox sing,dance,read,cycling;
	JButton bfst,bnxt,blst,bprs,badd,bupt,bsbt,bdel,bsave,bcancel;
	JRadioButton rmale,rfemale;
	JComboBox drop;
	String[] menu={"--select--","Diploma","Graduate","Post"};
	JPanel jpgen,jpleft,jpright,jphob;
	ButtonGroup gb;
	GridLayout layout;
	FlowLayout layout2,layout3;
	int flag=1;
	int rollnumber;
//db
	Connection con;
	Statement stm,stm2;
	PreparedStatement pstm;
	ResultSet result,rslastrno;
	
	public static void main(String args[])
	{
		Grid3 obj=new Grid3();
		obj.disp();
		//obj.clearControl();
		obj.Register();
		obj.connect();
	}

	public Grid3()
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://waisullahyousofi97;databaseName=Login1","sa","root");
		}
		catch(Exception e)
		{
		}
		
		frame=new JFrame("Login");
		lrno=new JLabel("Enter your rollno:");
		lname=new JLabel("Enter your name :");
		laddress=new JLabel("Enter your address :");
		lgen=new JLabel("select your gender :");
		lqua=new JLabel("what is your qualification :");
		lhob=new JLabel("Select your hobby.");
		
		sing=new JCheckBox("Singing");
		dance=new JCheckBox("Dancing");
		read=new JCheckBox("Reading");
		cycling=new JCheckBox("Cycling");

		tbrno=new JTextField(20);
		tbname=new JTextField(20);
		tbaddress=new JTextField(20);
		tbgen=new JTextField(20);
		bfst=new JButton("First");
		blst=new JButton("Last");
		bprs=new JButton("Previous");
		bnxt=new JButton("Next");
		badd=new JButton("Add");
		bupt=new JButton("Update");
		bsbt=new JButton("Submit");
		bdel=new JButton("Delete");
		bsave=new JButton("save");
		bcancel=new JButton("cancel");
		rmale=new JRadioButton("Male");
		rfemale=new JRadioButton("Female");
		drop=new JComboBox(menu);
		jpgen=new JPanel();
		jpleft=new JPanel();
		jpright=new JPanel();
		jphob=new JPanel();
		gb=new ButtonGroup();
		layout=new GridLayout(7,2);
		layout2=new FlowLayout();
		layout3=new FlowLayout();
	}	
	
	public void disp()
	{
		frame.setLayout(layout);
		frame.add(lrno);
		frame.add(tbrno);
		tbrno.setEditable(false);

		frame.add(lname);
		frame.add(tbname);
		tbname.setEditable(false);

		frame.add(laddress);
		frame.add(tbaddress);
		tbaddress.setEditable(false);
		
		frame.add(lgen);
		frame.add(jpgen);
		jpgen.add(rmale);
		jpgen.add(rfemale);
		gb.add(rmale);
		rmale.setEnabled(false);
		gb.add(rfemale);
		rfemale.setEnabled(false);
		
		frame.add(lhob);
		frame.add(jphob);
		jphob.setLayout(layout2);
		jphob.add(sing);


		sing.setEnabled(false);
		dance.setEnabled(false);
		read.setEnabled(false);
		cycling.setEnabled(false);
		
		jphob.add(dance);
		jphob.add(read);
		jphob.add(cycling);
		frame.add(lqua);

		frame.add(drop);
		drop.setEnabled(false);

		frame.add(jpleft);	
		frame.add(jpright);
		jpleft.setLayout(layout3);
		jpright.setLayout(layout3);
		jpleft.add(bfst);
		jpleft.add(blst);
		jpleft.add(bnxt);
		jpleft.add(bprs);
		jpright.add(badd);
		jpright.add(bupt);
		jpright.add(bsbt);
		jpright.add(bdel);
		jpright.add(bsave);
		jpright.add(bcancel);

		bcancel.setEnabled(false);
		bsave.setEnabled(false);

		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public void clearControl()
	{
		
		tbname.setText("");
		tbaddress.setText("");
		gb.remove(rmale);
		gb.remove(rfemale);
		rmale.setSelected(false);
		rfemale.setSelected(false);
		gb.add(rmale);
		gb.add(rfemale);

		drop.setSelectedItem("--select--");
			
		sing.setSelected(false);
		dance.setSelected(false);
		cycling.setSelected(false);
		read.setSelected(false);
		sing.setEnabled(false);
		dance.setEnabled(false);
		cycling.setEnabled(false);
		read.setEnabled(false);

	}
		
	public void enabling()
	{			

		read.setEnabled(true);
		sing.setEnabled(true);
		dance.setEnabled(true);
		cycling.setEnabled(true);
		
		bcancel.setEnabled(true);
		tbname.setEditable(true);
		tbaddress.setEditable(true);
		rmale.setEnabled(true);
		rfemale.setEnabled(true);	
		drop.setEnabled(true);
		
		bsave.setEnabled(true);
	}
		
		
	public void disabling()
	{
		sing.setSelected(false);
		read.setSelected(false);	
		dance.setSelected(false);
		cycling.setSelected(false);
			
		bfst.setEnabled(false);
		bnxt.setEnabled(false);
		blst.setEnabled(false);
		bprs.setEnabled(false);
		bupt.setEnabled(false);
		bsbt.setEnabled(false);
		bdel.setEnabled(false);
		badd.setEnabled(false);			
		
		tbname.setText("");
		tbaddress.setText("");
		gb.remove(rmale);
		gb.remove(rfemale);
		rmale.setSelected(false);
		rfemale.setSelected(false);
		gb.add(rmale);
		gb.add(rfemale);
		drop.setSelectedItem("--select--");
	}
		
	public void save_enable()
	{

		bfst.setEnabled(true);
		bnxt.setEnabled(true);
		blst.setEnabled(true);			
		bprs.setEnabled(true);
		badd.setEnabled(true);
		bupt.setEnabled(true);
		bsbt.setEnabled(true);
		bdel.setEnabled(true);
		bsave.setEnabled(true);
		bcancel.setEnabled(true);
	}

	public void actionPerformed(ActionEvent aevt)
	{
		
		/*if( aevt.getSource().equals(badd) || aevt.getSource().equals(bnxt)||
		    aevt.getSource().equals(bprs) || aevt.getSource().equals(bsbt)||aevt.getSource().equals(bdel))*/

		if(aevt.getSource().equals(bsave))
		{
			/*if(tbrno.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame,"Enter rollno","Error",JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			else */
			if(tbname.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame,"Enter name","Error",JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			else if(tbaddress.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame,"Enter address","Error",JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			else if(!(rmale.isSelected()||rfemale.isSelected()))
			{		
				JOptionPane.showMessageDialog(frame,"Select your gender","Error",JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			//sing,dance,read,cycling;
			else if(!( sing.isSelected()||dance.isSelected()||read.isSelected()||cycling.isSelected()))	
			{
				JOptionPane.showMessageDialog(frame,"select your hobby","Error",JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			else if(drop.getSelectedItem().equals("--select--"))
			{
				JOptionPane.showMessageDialog(frame,"enter your qualification","Error",JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			
		}

		if(aevt.getSource().equals(bfst))
		{
			System.out.println("first button clicked");
		}
		else if(aevt.getSource().equals(blst))
		{
			System.out.println("last button clicked");	
		}
		else if(aevt.getSource().equals(bprs))
		{
			System.out.println("privous");
		}
		else if(aevt.getSource().equals(badd))
		{
			System.out.println("Add button clicked");
			disabling();
			enabling();		
		}
		else if(aevt.getSource().equals(bupt))
		{
			System.out.println("update");
		}
		else if(aevt.getSource().equals(bsbt))
		{
			System.out.println("submit");
		}
		else if(aevt.getSource().equals(bnxt))
		{
			System.out.println("next button clicked");
		}
		else if(aevt.getSource().equals(bsave))
		{
			
			String hobby2="";
			if(flag==1)
			{
			
				System.out.println("saved");
				try
				{
					
					stm2=con.createStatement();
					rslastrno=stm2.executeQuery("select max(rollno) from details");	
					while(rslastrno.next())
					{
						rollnumber=rslastrno.getInt(1);
					}
					rollnumber++;
					pstm=con.prepareStatement("insert into details values(?,?,?,?,?,?)");
					pstm.setInt(1,rollnumber);	
					System.out.println("new roll number is generated");
					pstm.setString(2,tbname.getText());
					pstm.setString(3,tbaddress.getText());
	
					if(rmale.isSelected())
					{
						pstm.setString(4,"m");
					}
					else if(rfemale.isSelected())
					{
						pstm.setString(4,"f");
					}

					if(sing.isSelected())
					{
						hobby2="Singing;";
					}
					if(dance.isSelected())
					{
						hobby2+="Dancing;";
					}
					if(read.isSelected())
					{
						hobby2+="Reading;";
					}
					if(cycling.isSelected())
					{
						hobby2+="Cycling";
					}
					pstm.setString(5,hobby2);
					if(drop.getSelectedItem().equals("Post"))
					{
						pstm.setString(6,"Post");
						drop.setSelectedItem(true);
					}
					else if(drop.getSelectedItem().equals("Diploma"))
					{
						pstm.setString(6,"Diploma");
						drop.setSelectedItem(true);
					}
					else if(drop.getSelectedItem().equals("Graduate"))
					{
						pstm.setString(6,"Graduate");
						drop.setSelectedItem(true);
					}
					
					int i=pstm.executeUpdate();
					System.out.println("inserted");	

					tbrno.setText(""+rollnumber);
					con.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				JOptionPane.showMessageDialog(frame,"new roll number is genereated","rollnumber-Informative",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(frame,"Record saved successully","success",JOptionPane.INFORMATION_MESSAGE);
				save_enable();
			}
			else
			{
				System.out.println("enter all the data");
			}
			
			
		}
		else if(aevt.getSource().equals(bcancel))
		{
			System.out.println("canceled");
			tbrno.setText("");
			tbname.setText("");
			tbaddress.setText("");
			gb.remove(rmale);
			gb.remove(rfemale);
			rmale.setSelected(false);
			rfemale.setSelected(false);		
			gb.add(rmale);
			gb.add(rfemale);

			sing.setSelected(false);
			dance.setSelected(false);
			read.setSelected(false);
			cycling.setSelected(false);
			drop.setSelectedItem("--select--");
			
		}
		else
		{
			System.out.println("Delete");
		}
	
	}
	
	public void keyPressed(KeyEvent kevt1)
	{		
	}
	public void keyReleased(KeyEvent kevt2)
	{
	}
	public void keyTyped(KeyEvent kevt)
	{
		if(kevt.getSource().equals(tbrno))	
		{
			if(kevt.getKeyChar()>='0' && kevt.getKeyChar()<='9')
			{
				
			}
			else
			{
				if(kevt.getKeyChar()=='\b')
				{
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"enter numric value","Error",JOptionPane.ERROR_MESSAGE);
					kevt.consume();
				}
			}
		}
		
		if(kevt.getSource().equals(tbname))
		{
			if( (kevt.getKeyChar()>='A' && kevt.getKeyChar()<='Z') || (kevt.getKeyChar()>='a' && kevt.getKeyChar()<='z'))
			{
								
			}
			else
			{
				if(kevt.getKeyChar()=='\b'||kevt.getKeyChar()==' ')
				{
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Enter letters only","Error",JOptionPane.ERROR_MESSAGE);
					kevt.consume();
				}
			}
		}
		
	}
	public void Register()
	{
	
		bfst.addActionListener(this);
		bnxt.addActionListener(this);
		blst.addActionListener(this);
		bprs.addActionListener(this);
		badd.addActionListener(this);
		bupt.addActionListener(this);
		bsbt.addActionListener(this);
		bdel.addActionListener(this);
		bsave.addActionListener(this);
		bcancel.addActionListener(this);

		tbrno.addKeyListener(this);
		tbname.addKeyListener(this);
	}


	public void connect()
	{
		clearControl();
		try
		{	
			
			String quan="";
			stm=con.createStatement();
			result=stm.executeQuery("select * from details");
			result.next();
			
				
				tbname.setText(result.getString(2));
				tbaddress.setText(result.getString(3));		
				String s=result.getString(4);	
				if(s.equals("m"))
				{
					rmale.setSelected(true);	
				}
				else if(s.equals("f"))
				{
					rfemale.setSelected(true);
				}
				String st=result.getString(5);
				String[] spt=st.split(";");	
				for(String p:spt)
				{
					
					if( p.equals("Singing")||p.equals("singing"))
					{
						sing.setSelected(true);
					}
					if( p.equals("Dancing")||p.equals("dancing"))
					{
						dance.setSelected(true);
					}
					if( p.equals("Reading")||p.equals("reading"))
					{
						read.setSelected(true);
					}
					if(p.equals("Cycling")||p.equals("cycling"))
					{
						cycling.setSelected(true);
					}
				}

				quan=result.getString(6);
				
				if(quan.equals("Diploma"))
				{
					drop.setSelectedItem("Diploma");
				}
				else if(quan.equals("Post"))
				{
					drop.setSelectedItem("Post");
				}
				else if(quan.equals("Graduate"))
				{
					drop.setSelectedItem("Graduate");
				}
				rollnumber=result.getInt(1);
			
			System.out.println(quan);	
			System.out.println(rollnumber);
				
		}
		catch(Exception e){}
	}
}

