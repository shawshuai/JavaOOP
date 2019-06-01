import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Label;

public class PannelTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame窗口");
        //创建一个Panel容器
        Panel panel = new Panel();
        //向容器中添加一个Label和一个TextField组件
        panel.add(new Label("姓名"));
        panel.add(new TextField(20));
        //将Panel添加到Frame
        frame.add(panel);
        //设置Frame的自适应大小
        frame.pack();
        frame.setVisible(true);
    }
}