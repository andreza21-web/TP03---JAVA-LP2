package calculadora;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();
        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Calculadora");
    }

    private void organizarLayout() {

        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new DimensionUIResource(233, 60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
        System.out.println("iniciou");
    }
}
