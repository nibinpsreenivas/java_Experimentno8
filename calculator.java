import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener {
	
	static JFrame f;
	static JTextField l;
        String a,b,c ;
	calculator()
	{
		a = b = c = "";
	}
	public static void main(String args[])
	{
	
		f = new JFrame("calculator");
		calculator c = new calculator();
		l = new JTextField(16);
		l.setEditable(false);
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		beq1 = new JButton("=");
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("*");
		beq = new JButton("C");
		be = new JButton(".");
		JPanel p = new JPanel();
		
		
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);

		
		p.add(l);
		p.add(ba);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bs);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bm);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bd);
		p.add(be);
		p.add(b0);
		p.add(beq);
		p.add(beq1);

		
		p.setBackground(Color.red);

		f.add(p);

		f.setSize(200, 220);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		String d = e.getActionCommand();

		
		if ((d.charAt(0) >= '0' && d.charAt(0) <= '9') || d.charAt(0) == '.') {
			
			if (!b.equals(""))
				c = c + d;
			else
				a = a + d;

			l.setText(a + b + c);
		}
		else if (d.charAt(0) == 'C') {
			
			a = b = c = "";

			
			l.setText(a + b + c);
		}
		else if (d.charAt(0) == '=') {

			double s;

			
			if (b.equals("+"))
				s = (Double.parseDouble(a) + Double.parseDouble(c));
			else if (b.equals("-"))
				s = (Double.parseDouble(a) - Double.parseDouble(c));
			else if (b.equals("/"))
				s = (Double.parseDouble(a) / Double.parseDouble(c));
			else
				s = (Double.parseDouble(a) * Double.parseDouble(c));

			
			l.setText(a + b + c + "=" + s);

			
			a = Double.toString(s);

			b = c = "";
		}
		else {
			
			if (b.equals("") || c.equals(""))
				b = d;
			
			else {
				double s;

				
				if (b.equals("+"))
					s = (Double.parseDouble(a) + Double.parseDouble(c));
				else if (a.equals("-"))
					s = (Double.parseDouble(a) - Double.parseDouble(c));
				else if (a.equals("/"))
					s = (Double.parseDouble(a) / Double.parseDouble(c));
				else
					s = (Double.parseDouble(a) * Double.parseDouble(c));

			
				a = Double.toString(s);

				b = d;

				c = "";
			}

		
			l.setText(a + b + c);
		}
	}
}

