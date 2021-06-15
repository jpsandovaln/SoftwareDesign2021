package decorator;

import javax.swing.*;
import java.awt.*;

public class PrimaryButton extends  ButtonComponent {
    private JButton button;

    public  PrimaryButton(String label) {
        this.button = new JButton(label);
    }

    @Override
    public void setStyle() {
        this.button.setBounds(50, 100, 95, 30);
        this.button.setBackground(Color.BLUE);
    }

    @Override
    public JButton getButton() {
        return this.button;
    }
}
