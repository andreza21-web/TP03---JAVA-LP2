package pessoa;

public class Pessoa {
    static int kp = 0;
    String nome;
    char sexo;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        kp++;
    }

    public static int getKp() {
        return kp;
    }

    public static void setKp(int kp) {
        Pessoa.kp = kp;
    }
   
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
