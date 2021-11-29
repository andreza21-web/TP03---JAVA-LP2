package pessoa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Label;

public class FormPessoa implements ActionListener {

    private List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

    private JFrame frame = new JFrame();

    private Label labelNumero = new Label("Numero:");
    private Label labelNome = new Label("Nome:");
    private Label labelSexo = new Label("Sexo:");
    private Label labelIdade = new Label("Idade:");

    private TextField fieldNumero = new TextField(10);
    private TextField fieldNome = new TextField(10);
    private JRadioButton jRadioSexoM = new JRadioButton("M");
    private JRadioButton jRadioSexoF = new JRadioButton("F");
    private TextField fieldIdade = new TextField(10);

    private JButton buttonOK = new JButton();
    private JButton buttonClear = new JButton();
    private JButton buttonShow = new JButton();
    private JButton buttonExit = new JButton();
    private JButton buttonSexo = new JButton();

    private JPanel p = new JPanel();
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();

    FormPessoa() {
        buttonOK.setText("OK");
        buttonClear.setText("Limpar");
        buttonShow.setText("Mostrar");
        buttonExit.setText("Sair");

        buttonOK.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonShow.addActionListener(this);
        buttonExit.addActionListener(this);


        buttonSexo.add(jRadioSexoF);
        buttonSexo.add(jRadioSexoM);
        // 400x180
        frame.setSize(400, 280);
        frame.setLocation(200, 200);
        frame.setTitle("TP03 - LP2l4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(labelNumero);
        panel.add(fieldNumero);
        fieldNumero.disable();
        panel.add(labelNome);
        panel.add(fieldNome);
        panel.add(labelSexo);
        panel.add(buttonSexo);
        panel.add(labelIdade);
        panel.add(fieldIdade);

        panel2.add(buttonOK);
        panel2.add(buttonClear);
        panel2.add(buttonShow);
        panel2.add(buttonExit);

        p.add(panel);
        p.add(panel2);
        frame.add(p);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new FormPessoa();

        System.out.println("Iniciou");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        switch (command) {
            case "OK":
                String nome = fieldNome.getText();
                int idade = Integer.parseInt(fieldIdade.getText());
                char sexo = 'F';
                if (jRadioSexoF.isSelected()) {
                    sexo = 'F';
                }
                if (jRadioSexoM.isSelected()) {
                    sexo = 'M';
                }

                Pessoa pessoa = new Pessoa(nome, sexo, idade);
                listaPessoa.add(pessoa);

                fieldNome.setText("");
                jRadioSexoF.getActionCommand();
                jRadioSexoM.getActionCommand();
                fieldIdade.setText("");
                System.out.println(pessoa);
                break;

            case "Limpar":
                fieldNome.setText("");
                jRadioSexoF.getActionCommand();
                jRadioSexoM.getActionCommand();
                fieldIdade.setText("");
                break;

            case "Mostrar":
                String dadosPessoa = new String();

                for (Pessoa student : listaPessoa) {

                    dadosPessoa += student.toString() + ",";
                    dadosPessoa += "Nome:" + student.getNome() + ", ";
                    dadosPessoa += "\n";
                }

                JOptionPane.showMessageDialog(null, dadosPessoa);
                break;

            case "Sair":
                frame.dispose();
                break;
        }

    }
}