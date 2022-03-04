import java.awt.*;
import javax.swing.*;

public class waveform extends JPanel 
{
	int sf = 200;
	int cycles;
	int points;
	double[] sines;
	int[] pts;
        
        public static void main(String[] args) 
	{
		
		JFrame f = new JFrame("wave pattern");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.yellow);
		f.setSize(500, 500);

		waveform obj = new waveform();
		obj.setcycles(15);
		f.add(obj);
		f.setVisible(true);
	}
	
	public  void setcycles(int cycles) 
	{
		this.cycles = cycles;
		this.points = sf * cycles * 2;
		this.sines = new double[points];
		for (int i = 0; i < points; i++) 
		{
			double radians = (Math.PI / sf) * i;
			this.sines[i] = Math.sin(radians);
		}
	}

	public void paintComponent(Graphics g) 
	{
		int maxWidth = getWidth();
		double hstep = (double) maxWidth / (double) points;
		int maxHeight = getHeight();
		pts = new int[points];
		for (int i = 0; i < points; i++)
		{
			pts[i] = (int) (sines[i] * maxHeight / 3 * .85 + maxHeight / 2);
		}
		g.setColor(Color.BLUE);
		for (int i = 1; i < points; i++) 
		{
			int x1 = (int) ((i - 1) * hstep);
			int x2 = (int) (i * hstep);
			int y1 = pts[i - 1];
			int y2 = pts[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}

	
}
