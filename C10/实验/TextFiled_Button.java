import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

class TextFiled_Button extends Frame {
    private class WindowsCloser extends WindowsAdapter
    {
        public void windowClosing(WindowsEvent e){
            System.exit(0);
        }
        TextFiled_Button(){
            Panel buttons = new Panel();
            buttons.setLayout(new FlowLayout());
            buttons.add(new Button("确定"));
            buttons.add(new Button("取消"));
            Panel textGrid = new Panel();
            textGrid.setLayout(new GridLayout(2,2));
            for(int i=0;i<4;i++){
                textGrid.add(new TextField(4));
                //这里框架窗口的布局代码
            }
            addWindowListener(new WindowCloser());
            setSize(200,120);
            setVisible(true);
        }
        public void main(Sting[] args){
            TextFiled_Button tb = new TextFiled_Button();
        }
    }
}