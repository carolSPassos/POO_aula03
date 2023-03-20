package CadastroFaculdade;

public class Professor {
    private String nome;
    private String endereco;
    private int matricula;
    private double salario;
    private double horasDeTrabalho;
    private double valorDaHora = 85.5;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setHorasDeTrabalho(double horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public double getSalario() {
        salario = horasDeTrabalho * valorDaHora;
        return salario;
    }


}
