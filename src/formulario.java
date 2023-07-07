import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario {
    private JPanel rootPanel;
    private JTextField name;
    private JTextField ci;
    private JTextField age;
    private JButton cargarButton;
    private JButton guardarButton;
public formulario() {
    guardarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    cargarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
    public static void main(String[] args) {

        JFrame frame = new JFrame("formulario");
        frame.setContentPane(new formulario().rootPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

}

