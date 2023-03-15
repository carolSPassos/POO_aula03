package MediaDosAlunos;

public class NotasDoAluno {

    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double media;

    public void setNota1(Double nota1){
        this.nota1 = nota1;
    }
    public Double getNota1(){
        return nota1;
    }

    public void setNota2(Double nota2){
        this.nota2 = nota2;
    }
    public Double getNota2(){
        return nota2;
    }

    public void setNota3(Double nota3){
        this.nota3 = nota3;
    }
    public Double getNota3(){
        return nota3;
    }

    public void setMedia(Double media){
        this.media = media;
    }
    public Double getMedia(){
        Double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}
