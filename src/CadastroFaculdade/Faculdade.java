package CadastroFaculdade;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Faculdade {

    public static final DecimalFormat df = new DecimalFormat();

    public static void main(String[] args) {

        Professor professor = new Professor();
        Aluno aluno = new Aluno();

       Scanner entrada = new Scanner(System.in);
        System.out.println("Cadastro do Professor\n");
        System.out.println("nome: ");
        professor.setNome(entrada.nextLine());

        System.out.println("Endereço: ");
        professor.setEndereco(entrada.nextLine());

        System.out.println("Matrícula: ");
        professor.setMatricula(entrada.nextInt());

        System.out.println("Horas trabalhadas: ");
        professor.setHorasDeTrabalho(entrada.nextDouble());

        System.out.println("Seu salário será de: " + df.format(professor.getSalario()));

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("\nCadastro do Aluno");
        System.out.println("Nome: ");
        aluno.setNomeALuno(entrada2.nextLine());

        System.out.println("Endereço: ");
        aluno.setEnderecoAluno(entrada2.nextLine());

        System.out.println("Matrícula: ");
        aluno.setMatriculaAluno(entrada2.nextInt());

        System.out.println("Nota 1: ");
        aluno.setNota1(entrada2.nextDouble());

        System.out.println("Nota 2: ");
        aluno.setNota2(entrada2.nextDouble());

        System.out.println("Sua média foi: " + df.format(aluno.getMedia()));

        double media = aluno.getMedia();
        if (media >= 7.0) {
            System.out.println("Aprovado por média");
        } else if (media >= 4.0 && media < 7.0) {
            System.out.println("Final");
        } else {
            System.out.println("Reprovado");
        }

    }
}
