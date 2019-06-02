

import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

public class Button {
    ImageIcon icon;
    ImageIcon icon2;
    ImageIcon icon3;

    public Button() {
    }

    public JButton GetClose() {
        this.icon = new ImageIcon("images/cross2.png");
        this.icon2 = new ImageIcon("images/cross.png");
        JButton log = new JButton();
        log.setBorderPainted(false);
        log.setBorder((Border)null);
        log.setMargin(new Insets(0, 0, 0, 0));
        log.setContentAreaFilled(false);
        log.setIcon(this.icon2);
        log.setRolloverIcon(this.icon);
        log.setPressedIcon(this.icon);
        log.setDisabledIcon(this.icon);
        return log;
    }

    public JButton GetBack() {
        this.icon = new ImageIcon("images/back2.png");
        this.icon2 = new ImageIcon("images/back.png");
        this.icon3 = new ImageIcon("images/back3.png");
        JButton log = new JButton();
        log.setBorderPainted(false);
        log.setBorder((Border)null);
        log.setMargin(new Insets(0, 0, 0, 0));
        log.setContentAreaFilled(false);
        log.setIcon(this.icon2);
        log.setRolloverIcon(this.icon);
        log.setPressedIcon(this.icon);
        log.setDisabledIcon(this.icon);
        return log;
    }

    public JButton GetLogin() {
        this.icon = new ImageIcon("images/login1.jpg");
        this.icon2 = new ImageIcon("images/login2.jpg");
        this.icon3 = new ImageIcon("images/login3.jpg");
        return getButton();
    }

    public JButton GetSave() {
        this.icon = new ImageIcon("images/save1.jpg");
        this.icon2 = new ImageIcon("images/save2.jpg");
        this.icon3 = new ImageIcon("images/save3.jpg");
        return getButton();
    }

    public JButton GetSet() {
        this.icon = new ImageIcon("images/sup1.jpg");
        this.icon2 = new ImageIcon("images/sup2.jpg");
        this.icon3 = new ImageIcon("images/sup3.jpg");
        return getButton();
    }

    private JButton getButton() {
        JButton log = new JButton();
        log.setBorderPainted(false);
        log.setBorder((Border)null);
        log.setMargin(new Insets(0, 0, 0, 0));
        log.setContentAreaFilled(false);
        log.setIcon(this.icon);
        log.setOpaque(false);
        log.setRolloverIcon(this.icon2);
        log.setPressedIcon(this.icon3);
        log.setDisabledIcon(this.icon);
        return log;
    }
}
