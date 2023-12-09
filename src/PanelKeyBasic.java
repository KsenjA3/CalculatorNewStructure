import javax.swing.*;
import java.awt.*;
import java.util.*;

class PanelKeyBasic {

    ButtonsBasic buttonsBasic;

    private JPanel keyPanelBasic;

    GridBagLayout gbag;
    GridBagConstraints gbc;

    PanelKeyBasic() {


        // create keyPanel
        keyPanelBasic = new JPanel();
        keyPanelBasic.setBackground(MyColors.COLOR_PANE.get());
        keyPanelBasic.setPreferredSize(new Dimension(MySizePanel.WIDTH_SIZE_BASIC.get(), MySizePanel.HIEGHT_SIZE_KEY.get()));

        //GridBagLayout
        gbag = new GridBagLayout();
        gbc = new GridBagConstraints();

        // GridBagLayout keyPanel
        keyPanelBasic.setLayout(gbag);
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 100;
        gbc.weighty = 100;

        buttonsBasic =  new ButtonsBasic ();
        HashMap<String,JButton> listButtons= buttonsBasic.getButtons();
        Set <Map.Entry<String,JButton>> set =listButtons.entrySet();

        for (Map.Entry<String,JButton> button : set) {
            switch (button.getKey()) {

                // line 1
                case "AC" ->
                        makeGridBagConstraints(0, 0, 1, 1, 0, 10);
                case "C" ->
                        makeGridBagConstraints(0, 1, 1, 1, 0, 29);
                case "MR" ->
                        makeGridBagConstraints(0, 2, 1, 1, 0, 1);
                case "M+" ->
                        makeGridBagConstraints(0, 3, 1, 1, 0, 4);
                case "M-" ->
                        makeGridBagConstraints(0, 4, 1, 1, 0, 11);

                //line 2
                case "7" ->
                        makeGridBagConstraints(1, 0, 1, 1, 0, 20);
                case "8" ->
                        makeGridBagConstraints(1, 1, 1, 1, 0, 20);
                case "9" ->
                        makeGridBagConstraints(1, 2, 1, 1, 0, 20);
                case " / " ->
                        makeGridBagConstraints(1, 3, 1, 1, 0, 8);
                case " % " ->
                        makeGridBagConstraints(1, 4, 1, 1, 0, 0);

                //line 3
                case "4" ->
                        makeGridBagConstraints(2, 0, 1, 1, 0, 20);
                case "5" ->
                        makeGridBagConstraints(2, 1, 1, 1, 0, 20);
                case "6" ->
                        makeGridBagConstraints(2, 2, 1, 1, 0, 20);
                case " * " ->
                        makeGridBagConstraints(2, 3, 1, 1, 0, 6);
                case " √ " ->
                        makeGridBagConstraints(2, 4, 1, 1, 0, 8);

                //line 4
                case "1" ->
                        makeGridBagConstraints(3, 0, 1, 1, 0, 20);
                case "2" ->
                        makeGridBagConstraints(3, 1, 1, 1, 0, 20);
                case "3" ->
                        makeGridBagConstraints(3, 2, 1, 1, 0, 20);
                case " + " ->
                        makeGridBagConstraints(3, 3, 1, 1, 0, 6);
                case " = " ->
                        makeGridBagConstraints(3, 4, 1, 2, 53, 6);

                //line 5
                case "0" ->
                        makeGridBagConstraints(4, 0, 2, 1, 0, 71);
                case "." ->
                        makeGridBagConstraints(4, 2, 1, 1, 0, 30);
                case " - " ->
                        makeGridBagConstraints(4, 3, 1, 1, 0, 16);

            }

            keyPanelBasic.add(button.getValue(), gbc);
        }

    }


    /**
     * get  KeyPanel
     * @return Basic KeyPanel
     */
    JPanel getKeyPanel() {
        return keyPanelBasic;
    }


    /**
     * get Width Basic KeyPanel
     * @return Width KeyPanel
     */
    int getWidthKeyPanel () {
        return MySizePanel.WIDTH_SIZE_BASIC.get();
    }

    /**
     * setings GridBagConstraints
     * @param gridy row button
     * @param gridx column button
     * @param gridwidth width button
     * @param gridheight height button
     * @param ipady inly filling button along vertical
     * @param ipadx inly filling button along horizontal
     */
    void makeGridBagConstraints(int gridy, int gridx, int gridwidth, int gridheight, int ipady, int ipadx) {
        gbc.gridy = gridy;
        gbc.gridx = gridx;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
        gbc.ipady = ipady;
        gbc.ipadx = ipadx;
    }

}
