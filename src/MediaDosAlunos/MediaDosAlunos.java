package MediaDosAlunos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaDosAlunos {
    public static final DecimalFormat df = new DecimalFormat();
    public static void main(String[] args) {

        NotasDoAluno notas = new NotasDoAluno();
        Scanner entradaDeNotas = new Scanner(System.in);

        System.out.println("Nota 1: ");
        notas.setNota1(entradaDeNotas.nextDouble());
        System.out.println("Nota 2: ");
        notas.setNota2(entradaDeNotas.nextDouble());
        System.out.println("Nota 3: ");
        notas.setNota3(entradaDeNotas.nextDouble());

        Double media = notas.getMedia();
        System.out.println("Sua média foi: " + df.format(media));

        if (media >= 7.0) {
            System.out.println("Aprovado por média");
        } else if (media >= 4.0 && media < 7.0) {
            System.out.println("Final");
        } else {
            System.out.println("Reprovado");
        }
    }
}
