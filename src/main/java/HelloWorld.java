import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;
    private JLabel lblMensagem2 = new JLabel("Eu Rafael estive aqui ");

    public HelloWorld() {
        setContentPane(panel1);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
