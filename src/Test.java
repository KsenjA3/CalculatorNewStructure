import javax.swing.*;
import java.awt.*;

class Test extends JFrame {
    Test(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        var frame = new JFrame();
        frame.setTitle("ТЕСТ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        frame.add(Box.createVerticalGlue());
        frame.setContentPane(container);

        var Panel1= new PanelText();

        var Panel2= new PanelTextLog();


        container.add(Panel2.getTextPanel(400));

        //container.add();
        frame.setPreferredSize(new Dimension(400, Panel2.getHeightTextPanel()));
        frame.pack();

        //      Panel2.setVisibleTextPanelLog (true, frame,800);



        frame.setVisible(true);
    }
}

