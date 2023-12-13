import javax.swing.*;
import java.awt.event.ActionEvent;

class ButtonsIT extends ButtonsBasic{

    ButtonsIT() {
        makeButtons();
        makeITButtons();
    }


    /**
     * create engineer Buttons
     */

    void makeITButtons() {

        createButton(new ButtonsIT.CreateITButton(")"),")",
                MyColors.COLOR_SIGN.get(), MyFonts.FONT_BUTTON.get() );
        createButton(new ButtonsIT.CreateITButton("("),"(",
                MyColors.COLOR_SIGN.get(), MyFonts.FONT_BUTTON.get() );

        createButton(new ButtonsIT.CreateITButton("Not"),"Not",
                MyColors.COLOR_SIGN.get(), MyFonts.FONT_BUTTON_BOTTOM.get() );
        createButton(new ButtonsIT.CreateITButton("And"),"And",
                MyColors.COLOR_SIGN.get(), MyFonts.FONT_BUTTON_BOTTOM.get() );
        createButton(new ButtonsIT.CreateITButton("Or"),"Or",
                MyColors.COLOR_SIGN.get(), MyFonts.FONT_BUTTON_BOTTOM.get() );
        createButton(new ButtonsIT.CreateITButton("Xor"),"Xor",
                MyColors.COLOR_SIGN.get(), MyFonts.FONT_BUTTON_BOTTOM.get() );

        createButton(new ButtonsIT.CreateITButton("A"),"A",
                MyColors.COLOR_BUTTON.get(), MyFonts.FONT_BUTTON.get() );
        createButton(new ButtonsIT.CreateITButton("B"),"B",
                MyColors.COLOR_BUTTON.get(), MyFonts.FONT_BUTTON.get() );
        createButton(new ButtonsIT.CreateITButton("С"),"С",
                MyColors.COLOR_BUTTON.get(), MyFonts.FONT_BUTTON.get() );
        createButton(new ButtonsIT.CreateITButton("D"),"D",
                MyColors.COLOR_BUTTON.get(), MyFonts.FONT_BUTTON.get() );
        createButton(new ButtonsIT.CreateITButton("E"),"E",
                MyColors.COLOR_BUTTON.get(), MyFonts.FONT_BUTTON.get() );
        createButton(new ButtonsIT.CreateITButton("F"),"F",
                MyColors.COLOR_BUTTON.get(), MyFonts.FONT_BUTTON.get() );

    }

    class CreateITButton extends AbstractAction {
        String name;

        CreateITButton(String nameButton) {
            super(nameButton);
            name = nameButton;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
}
