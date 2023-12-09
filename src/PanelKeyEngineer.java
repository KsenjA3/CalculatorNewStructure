import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class PanelKeyEngineer extends PanelKeyBasic{

     private JPanel keyPanelEngineer, keyPanel;

     PanelKeyEngineer() {

          // create Engineer keyPanel
          keyPanelEngineer = new JPanel();
          keyPanelEngineer.setBackground(MyColors.COLOR_PANE.get());
          keyPanelEngineer.setPreferredSize(new Dimension(MySizePanel.WIDTH_SIZE_ENGINEER.get(), MySizePanel.HIEGHT_SIZE_KEY.get()));

          //GridBagLayout
          gbag = new GridBagLayout();
          gbc = new GridBagConstraints();

          // GridBagLayout keyPanel
          keyPanelEngineer.setLayout(gbag);
          gbc.fill = GridBagConstraints.CENTER;
          gbc.weightx = 100;
          gbc.weighty = 100;

          var buttonsEngineer =  new ButtonsEngineer ();
          HashMap<String,JButton> listButtons= buttonsEngineer.getButtons();
          Set<Map.Entry<String,JButton>> set =listButtons.entrySet();


          for (Map.Entry<String,JButton> button : set) {
               switch (button.getKey()) {

                    // line 1
                    case "±" -> {
                        makeGridBagConstraints(0, 0, 1, 1, 4, 20);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }case "("-> {
                       makeGridBagConstraints(0, 1, 1, 1, 0, 25);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }case ")"-> {
                       makeGridBagConstraints(0, 2, 1, 1, 0, 25);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }



                   // line 2
                    case "sin" -> {
                        makeGridBagConstraints(1, 0, 1, 1, 12, 10);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }case "ln"-> {
                       makeGridBagConstraints(1, 1, 1, 1, 5, 15);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }case "x²"-> {
                       makeGridBagConstraints(1, 2, 1, 1, 5, 15);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }


                   // line 3
                    case "cos" -> {
                        makeGridBagConstraints(2, 0, 1, 1, 12, 10);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }case "lg"-> {
                       makeGridBagConstraints(2, 1, 1, 1, 5, 10);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }case "x³"-> {
                       makeGridBagConstraints(2, 2, 1, 1, 5, 10);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }


                   // line 4
                    case "tg"-> {
                        makeGridBagConstraints(3, 0, 1, 1, 5, 10);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }case "x!"->{
                       makeGridBagConstraints(3, 1, 1, 1, 5, 10);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }case "xⁿ" -> {
                       makeGridBagConstraints(3, 2, 1, 1, 5, 10);
                       keyPanelEngineer.add(button.getValue(), gbc);
                    }


                   // line 5
                    case "π"-> {
                        makeGridBagConstraints(4, 0, 1, 1, 4, 10);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }case "1/x"-> {
                        makeGridBagConstraints(4, 1, 1, 1, 15, 5);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }case "³√" -> {
                        makeGridBagConstraints(4, 2, 1, 1, 4, 10);
                        keyPanelEngineer.add(button.getValue(), gbc);
                    }
               }
          }

          // create  keyPanel included Engineer and Basic keyPanels
          keyPanel = new JPanel();
          keyPanel.setLayout(new BoxLayout(keyPanel, BoxLayout.X_AXIS));
          keyPanel.add(keyPanelEngineer);
          keyPanel.add(super.getKeyPanel());

     }

     /**
      * get  KeyPanel
      * @return Engineer KeyPanel
      */
     @Override
     JPanel getKeyPanel() {
          return keyPanel;
     }


     /**
      * get Width Engineer KeyPanel
      * @return Width KeyPanel
      */
     @Override
     int getWidthKeyPanel () {
          return MySizePanel.WIDTH_SIZE_BASIC.get()+MySizePanel.WIDTH_SIZE_ENGINEER.get();
     }


}
