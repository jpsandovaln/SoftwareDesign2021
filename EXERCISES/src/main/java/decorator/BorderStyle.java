package decorator;

import javax.swing.border.LineBorder;
import java.awt.*;

public class BorderStyle extends ComponentDecorator {
    public BorderStyle(ButtonComponent component) {
        super(component);
    }

    @Override
    public void setStyle() {
        super.setStyle();
        super.getButton().setBorder(new LineBorder(Color.RED));
    }
}
