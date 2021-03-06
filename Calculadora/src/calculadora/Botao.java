package calculadora;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {

        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setForeground(Color.WHITE);
        setFont(new Font("courier", Font.PLAIN, 25));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
