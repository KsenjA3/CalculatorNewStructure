import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class KeyboardInput {


    /**
     * result of calculation
     * from PanelText
     */
    private Double dResult;

    private CalculateBasicInput calculateCurrent;


    KeyboardInput () {
        calculateCurrent = new CalculateBasicInput();
        textPanelInputKeys();
    }

    /**
     * behavior keys inputing  to textPanel
     */
    private class TextPanelInputKeysAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = PanelText.textInput.getText();

            str = str.replace("+", " + ");
            str = str.replace("-", " - ");
            str = str.replace("/", " / ");
            str = str.replace("*", " * ");

            while (str.contains("  "))
                str = str.replaceAll("  ", " ");

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '+', '-', '/', '*' -> {
                        switch (str.charAt(i + 2)) {
                            case '+', '-', '/', '*' -> str = str.substring(0, i) + str.substring(i + 2);
                        }
                    }
                }
            }
            //Change FONT
            PanelText.setFontBoldResult();

            PanelText.textInput.setText(PanelText.strInput = str);

            dResult = calculateCurrent.calculateInput(PanelText.strInput);
            PanelText.strResult = "=" + Operations.printNumber(dResult);
            PanelText.textRezult.setText(PanelText.strResult);

            PanelTextLog.sbLog.append(PanelText.strInput).append("\n").append(PanelText.strResult).append("\n");
            PanelTextLog.textLog.setText(PanelTextLog.sbLog.toString());

            //focus to visible keyPenel
          //  focusVisibleKeyPenel ();

        }
    }


    /**
     * inputing Keys to textPanel
     */
    private void textPanelInputKeys() {
        var textPanelInputKeysAction = new TextPanelInputKeysAction();
        PanelText.textInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "focusKeyPanel");
        PanelText.textInput.getActionMap().put("focusKeyPanel", textPanelInputKeysAction);

        PanelText.textInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, 0), "correctInput");
        PanelText.textInput.getActionMap().put("correctInput", textPanelInputKeysAction);

        ignoreLetter(
                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',
                'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M',
                '<', '>', '?', '!', '@', '#', '$', '%', '^', '&', '(', ')', ':', ';', '"', ',', '[', ']', '{', '}', '`', '~',
                'ё', 'й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ъ', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о', 'л', 'д', 'ж', 'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю',
                'Ё', 'Й', 'Ц', 'У', 'К', 'Е', 'Н', 'Г', 'Ш', 'Щ', 'З', 'Х', 'Ъ', 'Ф', 'Ы', 'В', 'А', 'П', 'Р', 'О', 'Л', 'Д', 'Ж', 'Э', 'Я', 'Ч', 'С', 'М', 'И', 'Т', 'Ь', 'Б', 'Ю'
        );
    }

    /**
     * ignor keys inputing to textInputPanel
     * @param var ignoring keys
     */
    private void ignoreLetter(char... var) {
        for (char c : var) {
            PanelText.textInput.getInputMap().put(KeyStroke.getKeyStroke(c), "none");
        }
    }

}
