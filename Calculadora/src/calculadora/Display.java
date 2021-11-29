package calculadora;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import modelo.Memoria;
import modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador {

    private JLabel visor;

    public Display() {

        Memoria.getInstancia().adicionarObservador(this);
        setBackground(new ColorUIResource(46, 49, 50));
        // instancia a memoria
        visor = new JLabel(Memoria.getInstancia().getTextoAtual());
        visor.setForeground(Color.WHITE);
        visor.setFont(new Font("courier", Font.PLAIN, 30));
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(visor);
    }

    @Override
    public void valorAlterado(String novoValor) {
        visor.setText(novoValor);
    }

}
