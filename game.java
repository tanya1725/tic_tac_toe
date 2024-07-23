import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
public class game extends JFrame implements ActionListener
{
	int flg=0,s=0,p=0;
  JButton b1=new JButton("");
  JButton b2=new JButton("");
  JButton b3=new JButton("");
  JButton b4=new JButton("");
  JButton b5=new JButton("");
  JButton b6=new JButton("");
  JButton b7=new JButton("");
  JButton b8=new JButton("");
  JButton b9=new JButton("");
  JButton b10=new JButton(" EXIT");
  JButton b11=new JButton(" play again");
  
  JLabel lb1=new JLabel();
  JLabel lb2=new JLabel();
  JLabel lb3=new JLabel();
  JLabel lb4=new JLabel();
  JLabel lb5=new JLabel();
  JLabel lb6=new JLabel();
  JLabel lb7=new JLabel();
  JLabel lb8=new JLabel();
  JLabel lb9=new JLabel();
  JLabel lb10=new JLabel();
  JLabel lb11=new JLabel();
  JLabel lb12=new JLabel();
  JLabel lb13=new JLabel();
  JLabel lb14=new JLabel();
  JLabel lb15=new JLabel();
  JLabel lb17=new JLabel();
  JLabel lb18=new JLabel();
  JLabel lb19=new JLabel();
  JLabel lb20=new JLabel();
  JLabel lblimg=new JLabel(new ImageIcon("tic.jpg"));
  String pp1,pp2;
  public game(String p1,String p2)
  {
	  pp1=p1;
	  pp2=p2;
	  lb10.setText("USER:1");
	  lb11.setText("USER:2");
	 lb12.setText(pp1);
     lb13.setText(pp2);	 
	 lb17.setText(pp1);
	 lb18.setText(pp2);
	 lb10.setHorizontalAlignment(JLabel.CENTER);
	 lb11.setHorizontalAlignment(JLabel.CENTER);
	 lblimg.setHorizontalAlignment(JLabel.CENTER);
	  
  setTitle("TIC TAC TOE...");
  setLayout(null);
  setVisible(true);
  setSize(570,570);
  lb1.setBounds(100,50,100,100);
  lb2.setBounds(210,50,100,100);
  lb3.setBounds(320,50,100,100);
  lb4.setBounds(100,160,100,100);
  lb5.setBounds(210,160,100,100);
  lb6.setBounds(320,160,100,100);
  lb7.setBounds(100,270,100,100);
  lb8.setBounds(210,270,100,100);
  lb9.setBounds(320,270,100,100);
  lb10.setBounds(100,370,100,40);
  lb11.setBounds(250,370,100,40);
  lb12.setBounds(100,420,100,40);
  lb13.setBounds(250,420,100,40);
  lb14.setBounds(120,500,280,40);
  lb15.setBounds(430,50,60,40);
  lb17.setBounds(430,90,60,40);
  lb18.setBounds(500,90,60,40);
  lb19.setBounds(430,140,60,40);
  lb20.setBounds(500,140,60,40);
  lblimg.setBounds(0,0,600,600);

  
	lb1.setHorizontalAlignment(JLabel.CENTER);
	lb2.setHorizontalAlignment(JLabel.CENTER);
	lb3.setHorizontalAlignment(JLabel.CENTER);
	lb4.setHorizontalAlignment(JLabel.CENTER);
	lb5.setHorizontalAlignment(JLabel.CENTER);
	lb6.setHorizontalAlignment(JLabel.CENTER);
	lb7.setHorizontalAlignment(JLabel.CENTER);
	lb8.setHorizontalAlignment(JLabel.CENTER);
	lb9.setHorizontalAlignment(JLabel.CENTER);
	lb14.setHorizontalAlignment(JLabel.CENTER);
	lb19.setHorizontalAlignment(JLabel.CENTER);
	lb20.setHorizontalAlignment(JLabel.CENTER);
  
  b1.setBounds(100,50,100,100);
  b2.setBounds(210,50,100,100);
  b3.setBounds(320,50,100,100);
  b4.setBounds(100,160,100,100);
  b5.setBounds(210,160,100,100);
  b6.setBounds(320,160,100,100);
  b7.setBounds(100,270,100,100);
  b8.setBounds(210,270,100,100);
  b9.setBounds(320,270,100,100);
  b10.setBounds(470,400,80,60);
  b11.setBounds(360,400,100,60);
  
  add(lb1);
  add(lb2);
  add(lb3);
  add(lb4);
  add(lb5);
  add(lb6);
  add(lb7);
  add(lb8);
  add(lb9);
  add(lb10);
  add(lb11);
  add(lb12);
  add(lb13);
  add(lb14);
  add(lb15);
  add(lb17);
  add(lb18);
  add(lb19);
  add(lb20);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
  add(b6);
  add(b7);
  add(b8);
  add(b9);
  add(b10);
  add(b11);
  add(lblimg);
  repaint();
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  
  b10.setBackground(new Color(0,0,200));
  b11.setBackground(new Color(198,104,188));
  
  lb1.setOpaque(true);
  lb2.setOpaque(true);
  lb3.setOpaque(true);
  lb4.setOpaque(true);
  lb5.setOpaque(true);
  lb6.setOpaque(true);
  lb7.setOpaque(true);
  lb8.setOpaque(true);
  lb9.setOpaque(true);
  lb10.setOpaque(true);
  lb11.setOpaque(true);
  lb12.setOpaque(true);
  lb13.setOpaque(true);
  lb14.setOpaque(true);
  lb17.setOpaque(true);
  lb18.setOpaque(true);
  lb19.setOpaque(true);
  lb20.setOpaque(true);
  
b1.setVisible(true);
b2.setVisible(true);
b3.setVisible(true);
b4.setVisible(true);
b5.setVisible(true);
b6.setVisible(true);
b7.setVisible(true);
b8.setVisible(true);
b9.setVisible(true);


  b1.setBackground(new Color(198,104,188));
  b2.setBackground(new Color(198,104,188));
  b3.setBackground(new Color(198,104,188));
  b4.setBackground(new Color(198,104,188));
  b5.setBackground(new Color(198,104,188));
  b6.setBackground(new Color(198,104,188));
  b7.setBackground(new Color(198,104,188));
  b8.setBackground(new Color(198,104,188));
  b9.setBackground(new Color(198,104,188));
  
  lb1.setBackground(new Color(198,104,188));
  lb2.setBackground(new Color(198,104,188));
  lb3.setBackground(new Color(198,104,188));
  lb4.setBackground(new Color(198,104,188));
  lb5.setBackground(new Color(198,104,188));
  lb6.setBackground(new Color(198,104,188));
  lb7.setBackground(new Color(198,104,188));
  lb8.setBackground(new Color(198,104,188));
  lb9.setBackground(new Color(198,104,188));
  lb10.setBackground(new Color(0,0,235));
  lb11.setBackground(new Color(0,0,235));
  lb12.setBackground(new Color(236,185,235));
  lb13.setBackground(new Color(236,185,235));
  lb14.setBackground(new Color(236,185,235));
  lb15.setForeground(new Color(0,0,235));
  lb17.setForeground(new Color(0,0,0));
  lb18.setForeground(new Color(0,0,0));
  lb19.setForeground(new Color(0,0,0));
  lb20.setForeground(new Color(0,0,0));

  
  lb1.setFont(new Font("Courier New",Font.BOLD,80));
  lb2.setFont(new Font("Courier New",Font.BOLD,80));
  lb3.setFont(new Font("Courier New",Font.BOLD,80));
  lb4.setFont(new Font("Courier New",Font.BOLD,80));
  lb5.setFont(new Font("Courier New",Font.BOLD,80));
  lb6.setFont(new Font("Courier New",Font.BOLD,80));
  lb7.setFont(new Font("Courier New",Font.BOLD,80));
  lb8.setFont(new Font("Courier New",Font.BOLD,80));
  lb9.setFont(new Font("Courier New",Font.BOLD,80)); 
  lb10.setFont(new Font("Courier New",Font.BOLD,10));
  lb11.setFont(new Font("Courier New",Font.BOLD,10));
  lb12.setFont(new Font("Courier New",Font.BOLD,10));
  lb13.setFont(new Font("Courier New",Font.BOLD,10));
  lb10.setFont(new Font("Courier New",Font.BOLD,20));
  lb11.setFont(new Font("Courier New",Font.BOLD,20));
  lb12.setFont(new Font("Courier New",Font.BOLD,20));
  lb13.setFont(new Font("Courier New",Font.BOLD,20));
  lb14.setFont(new Font("Courier New",Font.BOLD,30));
  lb15.setFont(new Font("Courier New",Font.BOLD,30));
  lb17.setFont(new Font("Courier New",Font.BOLD,20));
  lb18.setFont(new Font("Courier New",Font.BOLD,20));
  lb19.setFont(new Font("Courier New",Font.BOLD,20));
  lb20.setFont(new Font("Courier New",Font.BOLD,20));
  repaint();

  }
  public void actionPerformed(ActionEvent e)
  {
	  int flag=0;
	if(e.getSource()==b1)
	{
		b1. setVisible(false);
		if(flg==1)
		{
		   lb13.setBackground(new Color(0,0,235));
		   lb12.setBackground(new Color(236,185,235));
		   ImageIcon icon=new ImageIcon("0.jpg");
		   JLabel lb1=new JLabel(icon);
		   flg=0;
		}
		else
		{
		  lb12.setBackground(new Color(0,0,235));
		  lb13.setBackground(new Color(236,185,235));
		  lb1.setText("x");
		  flg=1;
		}
	}
	
	if(e.getSource()==b2)
	{
		b2. setVisible(false);
		if(flg==1)
		{
		  lb13.setBackground(new Color(0,0,235));
		  lb12.setBackground(new Color(236,185,235));
		  lb2.setText("0");
		  flg=0;
		}
		else
		{
		  lb12.setBackground(new Color(0,0,235));
		  lb13.setBackground(new Color(236,185,235));
		  lb2.setText("x");
		  flg=1;
		}
	}
	
	if(e.getSource()==b3)
	{
        b3. setVisible(false);
        if(flg==1)
	    {
		  lb13.setBackground(new Color(0,0,235));
		  lb12.setBackground(new Color(236,185,235));
		  lb3.setText("0");
          flg=0;
	    }
        else
        {
		  lb12.setBackground(new Color(0,0,235));
		  lb13.setBackground(new Color(236,185,235));
		  lb3.setText("x");
		  flg=1;
	    }
    }
    if(e.getSource()==b4)
    {
        b4. setVisible(false);
         if(flg==1)
	     {
		   lb13.setBackground(new Color(0,0,235));
		   lb12.setBackground(new Color(236,185,235));
		   lb4.setText("0");
           flg=0;
	     }
         else
         {
			 lb12.setBackground(new Color(0,0,235));
			 lb13.setBackground(new Color(236,185,235));
			 lb4.setText("x");
		     flg=1;
	     }
    }	
	if(e.getSource()==b5)
    {
        b5. setVisible(false);
        if(flg==1)
        {
		 lb13.setBackground(new Color(0,0,235));
		 lb12.setBackground(new Color(236,185,235));
		 lb5.setText("0");
         flg=0;
        }
        else
		{
		 lb12.setBackground(new Color(0,0,235));
		 lb13.setBackground(new Color(236,185,235));
		 lb5.setText("x");
	     flg=1;
	     }
    }	
	if(e.getSource()==b6)
	{
         b6. setVisible(false);
         if(flg==1)
	     {
		   lb13.setBackground(new Color(0,0,235));
		   lb12.setBackground(new Color(236,185,235));
		   lb6.setText("0");
           flg=0;
	     }
         else
         {
			lb12.setBackground(new Color(0,0,235));
			lb13.setBackground(new Color(236,185,235));
			lb6.setText("x");
		    flg=1;
	     }
    }	
    if(e.getSource()==b7)
	{
           b7. setVisible(false);
           if(flg==1)
	        {
			 lb13.setBackground(new Color(0,0,235));
			 lb12.setBackground(new Color(236,185,235));
			 lb7.setText("0");
             flg=0;
	        }
           else
           {
			 lb12.setBackground(new Color(0,0,235));
			 lb13.setBackground(new Color(236,185,235));
			 lb7.setText("x");
		     flg=1;
	       }
	     }	
		if(e.getSource()==b8)
	     {
           b8. setVisible(false);
           if(flg==1)
	        {
			 lb13.setBackground(new Color(0,0,235));
			 lb12.setBackground(new Color(236,185,235));
			 lb8.setText("0");
             flg=0;
	        }
           else
           {
			 lb12.setBackground(new Color(0,0,235));
			 lb13.setBackground(new Color(236,185,235));
			 lb8.setText("x");
		     flg=1;
	       }
	     }	
		if(e.getSource()==b9)
	     {
           b9. setVisible(false);
           if(flg==1)
	        {
			 lb13.setBackground(new Color(0,0,235));
			 lb12.setBackground(new Color(236,185,235));
			 lb9.setText("0");
             flg=0;
	        }
           else
           {
			 lb12.setBackground(new Color(0,0,235));
			 lb13.setBackground(new Color(236,185,235));
			 lb9.setText("x");
		     flg=1;
	       }
	     }	
		 if(e.getSource()==b10)
		 { 
			 if(s>p)
			 {
				JOptionPane.showMessageDialog(null,pp1+" "+" winner winner chicken dinner");
			 }
			 if(s<p)
			 {
				 JOptionPane.showMessageDialog(null,pp2+" "+" winner winner chicken dinner");
			 }
			 
			 if(s==p)
			 {
				JOptionPane.showMessageDialog(null," M A T C H  D r a w  ");
			 }
		 
		 	 game2 obj=new game2();
			 this.dispose();	
		 }			 
		 if(e.getSource()==b11)
		 {
			 flg=0;
			 b1.setVisible(true);
			 b2.setVisible(true);
			 b3.setVisible(true);
			 b4.setVisible(true);
			 b5.setVisible(true);
			 b6.setVisible(true);
			 b7.setVisible(true);
			 b8.setVisible(true);
			 b9.setVisible(true);
			 
            lb1.setBackground(new Color(198,104,188));
            lb2.setBackground(new Color(198,104,188));
            lb3.setBackground(new Color(198,104,188));
            lb4.setBackground(new Color(198,104,188));
            lb5.setBackground(new Color(198,104,188));
            lb6.setBackground(new Color(198,104,188));
            lb7.setBackground(new Color(198,104,188));
            lb8.setBackground(new Color(198,104,188));
            lb9.setBackground(new Color(198,104,188));
			 
			 
			 lb1.setText("");
			 lb2.setText("");
			 lb3.setText("");
			 lb4.setText("");
			 lb5.setText("");
			 lb6.setText("");
			 lb7.setText("");
			 lb8.setText("");
			 lb9.setText("");
			 JOptionPane.showMessageDialog(null,"play again");
		 }
			 
		 
if(lb1.getText().equals(lb2.getText())&&lb1.getText().equals(lb3.getText()))
{
	if((lb1.getText().length()!=0)&&(lb2.getText().length()!=0)&&(lb3.getText().length()!=0))
	{
	flag=1;
  lb1.setBackground(new Color(0,0,190));
  lb2.setBackground(new Color(0,0,190));
  lb3.setBackground(new Color(0,0,190));
  

  }
}
 if(lb4.getText().equals(lb5.getText())&&lb4.getText().equals(lb6.getText()))
{
	if((lb4.getText().length()!=0)&&(lb5.getText().length()!=0)&&(lb6.getText().length()!=0))
	{
     flag=1;
  lb4.setBackground(new Color(0,0,190));
  lb5.setBackground(new Color(0,0,190));
  lb6.setBackground(new Color(0,0,190));
  }
}
 if(lb7.getText().equals(lb8.getText())&&lb7.getText().equals(lb9.getText()))
 {
	 if((lb7.getText().length()!=0)&&(lb8.getText().length()!=0)&&(lb9.getText().length()!=0))
	 {
    flag=1;
  lb7.setBackground(new Color(0,0,190));
  lb8.setBackground(new Color(0,0,190));
  lb9.setBackground(new Color(0,0,190));
  } 
 }
 if(lb1.getText().equals(lb5.getText())&&lb1.getText().equals(lb9.getText()))
{
	if((lb1.getText().length()!=0)&&(lb5.getText().length()!=0)&&(lb9.getText().length()!=0))
	{
    flag=1;

  lb1.setBackground(new Color(0,0,190));
  lb5.setBackground(new Color(0,0,190));
  lb9.setBackground(new Color(0,0,190));
  }
}
 if(lb3.getText().equals(lb5.getText())&&lb3.getText().equals(lb7.getText()))
{
	if((lb3.getText().length()!=0)&&(lb5.getText().length()!=0)&&(lb7.getText().length()!=0))
	{
    flag=1;
  lb3.setBackground(new Color(0,0,190));
  lb5.setBackground(new Color(0,0,190));
  lb7.setBackground(new Color(0,0,190));
  }
}
   if(lb1.getText().equals(lb4.getText())&&lb1.getText().equals(lb7.getText()))
{
	if((lb1.getText().length()!=0)&&(lb4.getText().length()!=0)&&(lb7.getText().length()!=0))
	{
    flag=1;
  lb1.setBackground(new Color(0,0,190));
  lb4.setBackground(new Color(0,0,190));
  lb7.setBackground(new Color(0,0,190));
  }
}
 if(lb2.getText().equals(lb5.getText())&&lb2.getText().equals(lb8.getText()))
{
	if((lb2.getText().length()!=0)&&(lb5.getText().length()!=0)&&(lb8.getText().length()!=0))
	{
    flag=1;
  lb2.setBackground(new Color(0,0,190));
  lb5.setBackground(new Color(0,0,190));
  lb8.setBackground(new Color(0,0,190));
  }
}
 if(lb3.getText().equals(lb6.getText())&&lb3.getText().equals(lb9.getText()))
{
	if((lb3.getText().length()!=0)&&(lb6.getText().length()!=0)&&(lb9.getText().length()!=0))
	{
    flag=1;
  lb3.setBackground(new Color(0,0,190));
  lb6.setBackground(new Color(0,0,190));
  lb9.setBackground(new Color(0,0,190));
  }
}

  if(flag==1)
  { 
 
	  if(flg==1)
	  {
	  s=s+5;
	  lb19.setText(" "+s);
	  }
	     else
		  {
			  p=p+5;
		  lb20.setText(" "+p);
		  }
	 
			b1.setVisible(false);
			b2.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b3.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);	 
  
  }

  
  if(flag==0)
	{
		if((lb1.getText().length()!=0)&&(lb2.getText().length()!=0)&&(lb3.getText().length()!=0)&&(lb4.getText().length()!=0)&&(lb5.getText().length()!=0)&&(lb6.getText().length()!=0)&&((lb7.getText().length()!=0)&&(lb8.getText().length()!=0)&&(lb9.getText().length()!=0)))
		{
			b1.setVisible(false);
			b2.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b3.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
		
		}
  }
  }

   }