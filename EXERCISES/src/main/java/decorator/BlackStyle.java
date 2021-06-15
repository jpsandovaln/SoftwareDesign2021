package decorator;

import java.awt.*;

public class BlackStyle extends ComponentDecorator {
    public BlackStyle(ButtonComponent component) {
        super(component);
    }

    @Override
    public void setStyle() {
        super.setStyle();
        super.getButton().setBackground(Color.BLACK);
        super.getButton().setForeground(Color.WHITE);
        super.getButton().setBounds(50, 100, 150, 50);
    }
}
