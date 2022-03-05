import java.awt.*;
import javax.swing.*;

class drawfigures extends JPanel
  {

      public void paintComponent( Graphics g )
     {
         super.paintComponent( g ); 
         this.setBackground( Color.WHITE );

         g.setColor( Color.RED );
         g.drawLine( 5, 30, 380, 30 );

         g.setColor( Color.BLUE );
         g.drawRect( 5, 40, 90, 55 );  
         g.fillRect( 100, 40, 90, 55 );
   
         g.setColor( Color.MAGENTA );
         g.drawOval( 195, 100, 90, 55 );
         g.fillOval( 290, 100, 90, 55 );
    }
} 
 class LinesRectsOvals
  {
     public static void main( String args[] )
     {

          JFrame f = new JFrame( "Drawing lines, rectangles and ovals" );
          f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

          drawfigures ob = new drawfigures();
          ob.setBackground( Color.WHITE );
          f.add(ob); 
          f.setSize( 400, 210 ); 
          f.setVisible( true ); 
     }

 }


