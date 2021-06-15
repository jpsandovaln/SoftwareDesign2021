package decorator;

import javax.swing.*;
import java.awt.*;

public class SecondButton extends ButtonComponent  {
    private JButton button;

    public SecondButton(String label) {
        this.button = new JButton(label);
    }

    @Override
    public void setStyle() {
        this.button.setBounds(50, 200, 95, 30);
        this.button.setBackground(Color.WHITE);
    }

    @Override
    public JButton getButton() {
        return this.button;
    }
}