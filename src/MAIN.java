import javax.swing.JFrame;

public class MAIN {
    private static FrameBuilder frame = new FrameBuilder();
    private static JFrame LoginFrame;
    public static PanelBuilder Panels;

    static {
        LoginFrame = frame.GetLoginFrame();
        Panels = new PanelBuilder();
    }

    public MAIN() {
    }

    public static void main(String[] args) {
        Panels.focusinit();
    }

    protected void Successful() {
        LoginFrame.dispose();

        System.out.println("Logged-in");
    }
}
