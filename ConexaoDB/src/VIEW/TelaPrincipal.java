
package VIEW;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("Tela Principal");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Você está conectado(a)!", JLabel.CENTER);
        add(label);
 
    }
}
