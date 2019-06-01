import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

import javax.swing.plaf.ButtonUI;

import org.w3c.dom.Text;

public class Calculator extends Frame{
    private TextField display = new TextField();
    private Button one = new Button("1");
    private Button two = new Button("2");
    private Button three = new Button("3");
    private Button four = new Button("4");
    private Button five = new Button("5");
    private Button six = new Button("6");
    private Button seven = new Button("7");
    private Button eight = new Button("8");
    private Button nine = new Button("9");
    private Button zero = new Button("0");
    private Button point = new Button(".");
    private Button add = new Button("+");
    private Button sub = new Button("-");
    private Button mul = new Button("×");
    private Button div = new Button("÷");
    private Button result = new Button("等于");
    private Button clr = new Button("清除");
    private class WindowCloser extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    Calculator(){
        super("计算器");
        setup();
        addWindowListener(new WindowCloser());
        pack();
        setVisible(true);
    }
    void setup(){

    }
    public static void main(String args[]) {
        Calculator cal = new Calculator();
        
    }
}