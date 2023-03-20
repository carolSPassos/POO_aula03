package CadastroFaculdade;

public class Aluno {
    private String nomeALuno;
    private String enderecoAluno;
    private int matriculaAluno;
    private double nota1;
    private double nota2;
    private double media;

    public String getNomeALuno() {
        return nomeALuno;
    }

    public void setNomeALuno(String nomeALuno) {
        this.nomeALuno = nomeALuno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        media = (nota1 + nota2) / 2;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
