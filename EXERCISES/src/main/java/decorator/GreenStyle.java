package decorator;

import java.awt.*;

public class GreenStyle extends ComponentDecorator {
    public GreenStyle(ButtonComponent component) {
        super(component);
    }

    @Override
    public void setStyle() {
        super.setStyle();
        super.getButton().setBackground(Color.GREEN);
        super.getButton().setForeground(Color.BLACK);
        super.getButton().setBounds(50, 100, 1200, 50);
    }
}
