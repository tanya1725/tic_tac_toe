import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
public class game2 extends Frame implements ActionListener
{
	int flg=0,flag=0;
	
  JTextField tx1=new JTextField(10);
  JTextField tx2=new JTextField(10);
  JButton b1=new JButton("Start");
  JLabel lb1=new JLabel(" ENTER USER 1:");
  JLabel lb2=new JLabel(" ENTER USER 2:");
  JLabel lblimg=new JLabel(new ImageIcon("toe.gif"));
  JLabel lblimg2=new JLabel(new ImageIcon("toe.gif"));
  public game2 ()
  {
  setLayout(null);
  setVisible(true);
  setSize(570,570);
  lb1.setBounds(20,480,170,40);
  tx1.setBounds(210,480,170,30);
  lb2.setBounds(20,520,170,40);
  tx2.setBounds(210,520,170,30);
  tx1.setFont(new Font("Courier New",Font.BOLD,20));
  tx2.setFont(new Font("Courier New",Font.BOLD,20));
  lb1.setFont(new Font("Courier New",Font.BOLD,20));
  lb2.setFont(new Font("Courier New",Font.BOLD,20));
  lb1.setForeground(new Color(75,128,255));
  lb2.setForeground(new Color(75,128,255));
  lblimg.setBounds(0,0,570,470);
  lblimg2.setBounds(0,0,570,470);
  repaint();
  setBackground(new Color(0,0,0));
  b1.setBounds(400,490,125,60);
  add(lb1);
  add(lb2);
  add(tx1);
  add(tx2);
  add(b1);
  add(lblimg);  
  add(lblimg2);
  repaint();
  b1.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getSource()==b1)
	  {
		  if((tx1.getText().trim().length()!=0)&&(tx2.getText().length()!=0))
		  {
		   game obj=new game(tx1.getText(),tx2.getText());
		   repaint();
		   this.dispose();
	      }
		  if((tx1.getText().length()==0)&&(tx2.getText().length()!=0))
			{
				JOptionPane.showMessageDialog(null,"please enter user 1");
			}
			if((tx2.getText().length()==0)&&(tx1.getText().length()!=0))
			{
				JOptionPane.showMessageDialog(null,"please enter user 2");
			}
			if((tx2.getText().length()==0)&&(tx1.getText().length()==0))
			{
				JOptionPane.showMessageDialog(null,"please enter user name");
			}	
      }
  }
  public static void main(String args[])
  {
	  game2 obj=new game2();
  }
}
  