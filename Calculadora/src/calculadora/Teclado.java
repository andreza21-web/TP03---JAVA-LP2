package calculadora;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.Memoria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {

    private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
    private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
    private final Color COR_CINZA = new Color(101, 101, 94);

    public Teclado() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints componente = new GridBagConstraints();
        componente.weightx = 1;
        componente.weighty = 1;
        componente.fill = GridBagConstraints.BOTH;

        setLayout(layout);

        componente.gridwidth = 3;
        adicionarBotao("AC", COR_CINZA_ESCURO, componente, 0, 0);
        componente.gridwidth = 1;
        adicionarBotao("/", COR_CINZA, componente, 3, 0);

        adicionarBotao("7", COR_CINZA_CLARO, componente, 0, 1);
        adicionarBotao("8", COR_CINZA_CLARO, componente, 1, 1);
        adicionarBotao("9", COR_CINZA_CLARO, componente, 2, 1);
        adicionarBotao("*", COR_CINZA, componente, 3, 1);

        adicionarBotao("4", COR_CINZA_CLARO, componente, 0, 2);
        adicionarBotao("5", COR_CINZA_CLARO, componente, 1, 2);
        adicionarBotao("6", COR_CINZA_CLARO, componente, 2, 2);
        adicionarBotao("-", COR_CINZA, componente, 3, 2);

        adicionarBotao("1", COR_CINZA_CLARO, componente, 0, 3);
        adicionarBotao("2", COR_CINZA_CLARO, componente, 1, 3);
        adicionarBotao("3", COR_CINZA_CLARO, componente, 2, 3);
        adicionarBotao("+", COR_CINZA, componente, 3, 3);

        componente.gridwidth = 2;
        adicionarBotao("0", COR_CINZA_CLARO, componente, 0, 4);
        componente.gridwidth = 1;
        adicionarBotao(",", COR_CINZA_CLARO, componente, 2, 4);
        adicionarBotao("=", COR_CINZA, componente, 3, 4);

    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints componente, int x, int y) {
        componente.gridx = x;
        componente.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, componente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processarComando(botao.getText());
            System.out.println(botao.getText());
        }
    }
}
