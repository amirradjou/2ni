
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelBuilder extends PanelBuilder2 {

    static int login_flag = 0;
    public static String[] user_list = new String[5];
    public static String[] passw_list = new String[5];
    public Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int x;
    int y;
    public static JTextField usnmtf = new JTextField();
    public JLabel text;
    public JLabel usnm;
    public JLabel pass;
    public JPanel panel;
    final JPasswordField passtf;

    public PanelBuilder() {
        this.x = (int)this.screensize.getWidth();
        this.y = (int)this.screensize.getHeight();
        this.text = new JLabel("ورود");
        this.usnm = new JLabel("نام کاربری");
        this.pass = new JLabel("گذرواژه");
        this.panel = new JPanel();
        this.passtf = new JPasswordField();
    }

    public JPanel GetLogin() {
        JLabel l1 = new JLabel(new ImageIcon("images/tpb.png"));
        JLabel l2 = new JLabel(new ImageIcon("images/tpb.png"));
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Button buttons = new Button();
        JButton login = buttons.GetLogin();
        this.panel.setLayout((LayoutManager)null);
        JButton settings = buttons.GetSet();
        settings.setBounds(this.x / 10 - 90, this.y / 3 - 20, 77, 35);
        usnmtf.setBorder((Border)null);
        login.setBounds(this.x / 10 + 10, this.y / 3 - 20, 77, 35);
        this.passtf.setBorder((Border)null);
        usnmtf.setFont(new Font("", 0, 16));
        usnmtf.setOpaque(false);
        usnmtf.setForeground(Color.black);
        this.passtf.setForeground(Color.black);
        l1.setBounds(this.x / 50, 90, 220, 30);
        l1.setLayout(null);
        usnmtf.setBounds(0, 2, 220, 28);
        l1.add(usnmtf);
        this.panel.add(l1);
        l2.setBounds(this.x / 50, 170, 220, 30);
        l2.setLayout(null);
        this.passtf.setOpaque(false);
        this.passtf.setBounds(0, 2, 220, 28);
        l2.add(this.passtf);
        this.panel.add(l2);
        this.text.setFont(new Font("", 2, 20));
        this.text.setBounds(this.x / 10 - 30, 10, 100, 30);
        this.text.setForeground(Color.black);
        this.usnm.setFont(new Font("", 2, 13));
        this.usnm.setBounds(this.x / 50, 60, 100, 30);
        this.usnm.setForeground(Color.black);
        this.pass.setFont(new Font("", 2, 13));
        this.pass.setBounds(this.x / 50, 140, 100, 30);
        this.pass.setForeground(Color.black);
        this.panel.add(this.usnm);
        this.panel.add(this.pass);
        this.panel.add(this.text);
        this.panel.add(login);
        this.panel.setBorder(blackline);
        this.panel.setBackground(new Color(0.7F, 0.7F, 0.4F, 0.8F));
        this.panel.add(settings);
        this.panel.setBounds(384, 48, 273, 298);
        usnmtf.setText("نام کاربری");
        this.passtf.setText("گذرواژه");
        usnmtf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    PanelBuilder.this.passtf.requestFocusInWindow();
                }

            }
        });
        usnmtf.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                PanelBuilder.usnmtf.selectAll();
            }
        });
        this.passtf.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                PanelBuilder.this.passtf.selectAll();
            }
        });
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                PanelBuilder.this.loged();
            }
        };
        login.addActionListener(al);
        this.passtf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    PanelBuilder.this.loged();
                }

            }
        });
        ActionListener al3 = ae -> {
            FrameBuilder fb = new FrameBuilder();
            fb.SignupShow();
        };
        settings.addActionListener(al3);
        return this.panel;
    }

    public void focusinit() {
        usnmtf.setText("نام کاربری");
        usnmtf.requestFocusInWindow();
        usnmtf.selectAll();
        usnmtf.requestFocusInWindow();
    }

    private void loged() {
        String user = usnmtf.getText();
        String passw = String.valueOf(this.passtf.getPassword());

        for (int i = 0; i < passw_list.length; i++) {
            if (user.equals(user_list[i]) && passw.equals(passw_list[i])) {
                login_flag=1;
            }
        }


        if (login_flag==1) {
            MAIN obj = new MAIN();
            obj.Successful();
        } else {
            JOptionPane.showMessageDialog(null, "نام کاربری با گذرواژه مطابقت ندارد", "", 0);
            this.passtf.setText("");
            usnmtf.setText("نام کاربری");
            usnmtf.requestFocusInWindow();
        }

    }
}
