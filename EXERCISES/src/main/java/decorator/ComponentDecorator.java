package decorator;

import javax.swing.*;

public class ComponentDecorator extends ButtonComponent{
    private ButtonComponent component;

    public ComponentDecorator(ButtonComponent component) {
        this.component = component;
    }

    @Override
    public void setStyle() {
        component.setStyle();
    }

    @Override
    public JButton getButton() {
        return component.getButton();
    }
}
