import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.*;

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
            String filePath = "datos.dat";

            name.setText(name.getText());
            ci.setText(ci.getText());
            age.setText(age.getText());

            String [] info={name.getText(),ci.getText(),age.getText()};

            try (FileOutputStream fileOut=new FileOutputStream(filePath);
                 ObjectOutputStream obOut=new ObjectOutputStream(fileOut)){

                obOut.writeObject(info);
                System.out.println("archivo escrito correctamente");

            }catch (IOException m){
                throw new RuntimeException(m);
            }
            /*---------------------------------------------*/
            /*
            try(
                    FileInputStream fileIn=new FileInputStream(filePath);
                    ObjectInputStream obIn= new ObjectInputStream(fileIn)
            ){
                info readObject=(info)obIn.readObject();
                System.out.println("El objeto en disco es: "+readObject);
                System.out.println(readObject.name.);
                System.out.println(readObject.getNombre());
            }catch (IOException a){
                throw new RuntimeException(a);
            }catch (ClassNotFoundException b){
                throw new RuntimeException(b);
            }
            */




        }
    });
    cargarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    rootPanel.addComponentListener(new ComponentAdapter() {
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

