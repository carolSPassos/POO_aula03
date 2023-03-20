package CadastrodePessoas;

import CadastrodePessoas.CadastroDePessoa;

import java.util.Scanner;

public class CadastroDePessoaMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        CadastroDePessoa pessoa = new CadastroDePessoa();

        System.out.println("Qual seu nome? ");
        pessoa.setNome(entrada.nextLine());
        System.out.println("Qual seu endereço? ");
        pessoa.setEndereco(entrada.nextLine());

        System.out.println("Qual sua idade? ");
        pessoa.setIdade(entrada.nextInt());


        System.out.println("Nome: " + pessoa.getNome() +
                "\nIdade: " + pessoa.getIdade() +
                "\nEndereço: " + pessoa.getEndereco());
        System.out.println("proximo aniversario vc fará: " + pessoa.aniver());
    }
}
