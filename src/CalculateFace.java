import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculateFace extends JFrame {

    /**
     * Components
     */
    private JFrame frame;
    private Container container;

    private CardLayout cardTypeCalc;
    private JPanel cardPanel;
    private PanelKeyBasic keyPanelBasic;
    private PanelKeyEngineer keyPanelEngineer;
    //   private PanelKeyIT keyPanelIT;
    private PanelTextLog textPanel;

    /**
     * MENU
     */
    private JMenuBar jmb;
    private JPopupMenu jpu;
    private JCheckBoxMenuItem jchbLog;
    private JMenuItem jmiShowLogPopup, jmiHideLogPopup, jmiClearLogPopup, jmiCopyLogPopup,
            jmiClearLog, jmiCopyLog;
    private JRadioButtonMenuItem jmiSimple, jmiEngineer, jmiIT;
//    private MakeMenuItem actionCopy, actionPaste, actionClearLog, actionCopyLog,
//            actionBrief, actionSimple, actionEngineer, actionIT;
//   private MakeLogMenuItem actionLog, actionShowLogPopup, actionHideLogPopup;

    int widthSize, hieghtSize;


    CalculateFace () {
            //create frame
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame();
        frame.setTitle("КАЛЬКУЛЯТОР");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //create Content Pane
        container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        frame.add(Box.createVerticalGlue());
        frame.setContentPane(container);

        textPanel = new PanelTextLog();
   //   keyPanelBasic = new PanelKeyBasic();
        keyPanelEngineer = new PanelKeyEngineer();

        new KeyboardInput();

            // width keyPanel= width frame = textPanel
 //       widthSize=keyPanelBasic.getWidthKeyPanel();
        widthSize=keyPanelEngineer.getWidthKeyPanel();

            // hieght frame
        hieghtSize=textPanel.getHeightTextPanel()+MySizePanel.HIEGHT_SIZE_KEY.get();

        container.add(textPanel.getTextPanel(widthSize));
    //    container.add(keyPanelBasic.getKeyPanel());
        container.add(keyPanelEngineer.getKeyPanel());

        frame.setPreferredSize(new Dimension(widthSize, hieghtSize));

        //    container.add(cardPanel);

        // управление панелью log
        // textPanel.setVisibleTextPanelLog (false, frame, widthSize);

        //перемещение focus


        frame.pack();
        frame.setVisible(true);

    }





}
