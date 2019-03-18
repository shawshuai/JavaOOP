//<applet code=HelloApplet.class width=300 height=200 >
//</applet>
import java.awt.Graphics;
import java.applet.Applet;
public class HelloApplet extends Applet
{  
      
      private static final long serialVersionUID = 1L;

      public void paint(Graphics g)
      {  g.drawString("Hello the Applet world!",20,20);
      }
}
//by shawshuai 20170403041 at 2019-3-2 02:16:00