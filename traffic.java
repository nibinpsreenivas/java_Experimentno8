import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class traffic extends JFrame implements ActionListener
{
   JRadioButton r,g,y;    
   JButton b;
   JPanel p;
   JFrame f;
  
  public static void main(String[] args)
    {
       traffic s = new traffic();
        s.field();
    }
   void field()
      { 
       JFrame f = new JFrame("Student Details");
       JPanel p = new JPanel(); 
       
        
        r=new JRadioButton("red");  
        r.setBounds(100,50,100,30);
       
              
        g=new JRadioButton("green");  
        g.setBounds(100,100,100,30);
        
        y=new JRadioButton("yellow");    
        y.setBounds(100,150,100,30);
        
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r);
        bg.add(g);
        bg.add(y);
        b=new JButton("click");    
        b.setBounds(100,200,80,30);
        p.add(r);   
        p.add(y);
        p.add(g);
        p.add(b);
      
         
        b.addActionListener(this);  
        p.setLayout(new FlowLayout());
        f.add(p);
        f.setSize(200,200);
        f.show();
        f.setLayout(null);    
     
     }
    public void actionPerformed(ActionEvent e)
    {
        if(r.isSelected())
        { 
           b.setBackground(Color.RED); 
         }
       if(y.isSelected())
          {    
             b.setBackground(Color.YELLOW);
             
          } 
       if(g.isSelected())
          {    
            
            b.setBackground(Color.GREEN);
           
          } 
             
    }
   
  

   
  }
