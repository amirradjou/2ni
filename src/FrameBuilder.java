

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBuilder {
    static Button button = new Button();
    ImageIcon j1 = new ImageIcon("images/bg1.png");
    JLabel img;
    public static PanelBuilder panels = new PanelBuilder();
    public static JPanel SignupPanel;
    public static JPanel LoginPanel;
    final JFrame login;

    static {
        SignupPanel = panels.GetSignup();
        LoginPanel = panels.GetLogin();
    }

    public FrameBuilder() {
        this.img = new JLabel(this.j1);
        this.login = new JFrame("صفحه ورود");
    }

    public JFrame GetLoginFrame() {
        LoginPanel.setVisible(true);
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int y = screensize.height;
        int x = screensize.width;
        this.img.setBounds(0, 0, 400, 400);
        this.login.setUndecorated(true);
        this.login.setBackground(new Color(0.1F, 0.1F, 0.1F, 0.9F));
        JButton close = button.GetClose();
        close.setBounds(693, 0, 20, 20);
        this.login.setBounds(x / 4 - 30, y / 4 - 20, 713, 404);
        this.login.setLayout((LayoutManager)null);
        this.login.add(close);
        this.login.getContentPane().setBackground(Color.blue);
        this.login.add(SignupPanel);
        SignupPanel.setVisible(false);
        this.login.add(LoginPanel);
        this.login.add(this.img);
        ActionListener closing = ae -> FrameBuilder.this.login.dispose();
        close.addActionListener(closing);
        this.login.setVisible(true);
        return this.login;
    }

    public void SignupShow() {
        SignupPanel.setVisible(true);
        LoginPanel.setVisible(false);
    }

    public void SignupHide() {
        SignupPanel.setVisible(false);
        LoginPanel.setVisible(true);
    }
}
