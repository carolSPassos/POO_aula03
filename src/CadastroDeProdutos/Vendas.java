package CadastroDeProdutos;

import java.util.Scanner;

public class Vendas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Qual produto? ");
        produto.setNomeDoProduto(entrada.nextLine());
        System.out.println("Código do produto: ");
        produto.setCodigo(entrada.nextInt());
        System.out.println("Quantidade de produto: ");
        produto.setQuantidade(entrada.nextInt());

        System.out.println("Produto: " + produto.getNomeDoProduto() +
                "\nCodigo: " + produto.getCodigo() +
                "\nQuantidade: " + produto.getQuantidade());
        System.out.println("Cadastrado!");

        int repetir;
        do {

            System.out.println("""
                    Deseja fazer uma venda?
                    0 - Não
                    1 - Sim""");

            int escolha = entrada.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Encerrando programa!");
                    break;
                case 1:
                    System.out.println("Quantos produtos você venderá? ");
                    produto.setQuantidadeDeVenda(entrada.nextInt());
                    System.out.println("Agora você tem " + produto.getQuantidadeDeVenda() + " " + produto.getNomeDoProduto());
                    break;
                default:
                    System.out.println("Inválido");
            }
            System.out.println("Digite 2 para repetir a operação");
            repetir = entrada.nextInt();

        } while (repetir == 2);
        System.out.println("Fim");

    }

}
