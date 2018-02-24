//************************************************************ 
// Aspirin2.java
//
// CSIT 111 Final  
// Problem 1: Draw structural formula for Aspirin
// By Monti Karlo Lameg
//************************************************************ 
import javax.swing.JApplet; 
import java.awt.*;

public class Aspirin2 extends JApplet 
{
      public void paint (Graphics page) 
      {
         setBackground (Color.white);
         
         //Left Figure
         page.drawLine(80, 260, 150, 280);
         page.drawLine(150, 280, 220, 260);
         
         page.drawLine(160, 277, 160, 350);
         page.drawLine(140, 277, 140, 350);
         
         //Hexagon Branches
         page.drawLine(240, 260, 300, 280);
         page.drawLine(350, 250, 350, 175);
         page.drawLine(350, 175, 390, 150);
         page.drawLine(350, 180, 310, 170);
         page.drawLine(358, 170, 310, 158);
         
         //Hexagon
         page.drawLine(300, 280, 300, 350);
         page.drawLine(400, 280, 400, 350);
         page.drawLine(300, 280, 350, 250);
         page.drawLine(350, 250, 400, 280);
         page.drawLine(300, 350, 350, 380);
         page.drawLine(350, 380, 400, 350);
         
         //Lines within hexagon
         page.drawLine(310, 290, 310, 340);
         page.drawLine(350, 260, 390, 284);
         page.drawLine(350, 370, 390, 346);
         
         //Text

         Font myFont = new Font("TimesRoman", Font.BOLD, 24);
         page.setFont(myFont);
         page.drawString("OH", 400, 155);
         page.drawString("O", 285, 170);
         page.drawString("O", 223, 257);
         page.drawString("O", 141, 370);
         page.drawString("H  C", 25, 265);
  
         Font myFont1 = new Font("TimesRoman", Font.BOLD, 15);
         page.setFont(myFont1);
         page.drawString("3", 46, 270);
         
         Font myFont2 = new Font("TimesRoman", Font.BOLD, 50);
         page.setFont(myFont2);
         page.drawString("Acetylsalycilic Acid", 25, 70);
         
         
         
      }
}
         
