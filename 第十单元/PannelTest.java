import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Label;

public class PannelTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame����");
        //����һ��Panel����
        Panel panel = new Panel();
        //�����������һ��Label��һ��TextField���
        panel.add(new Label("����"));
        panel.add(new TextField(20));
        //��Panel��ӵ�Frame
        frame.add(panel);
        //����Frame������Ӧ��С
        frame.pack();
        frame.setVisible(true);
    }
}