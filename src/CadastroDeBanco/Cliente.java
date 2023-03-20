package CadastroDeBanco;

import java.util.Scanner;

//Defina um sistema onde seja possível realizar o saque e depósito de um valor
//informado pelo usuário. O sistema deve solicitar qual operação o cliente deseja
//realizar. Caso digite 1, ele pode realizar um depósito, caso digite 2, ele pode
//realizar um saque
public class Cliente {
    public static void main(String[] args) {

        int usuario;
        Banco cliente = new Banco();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto você tem em conta? ");
        cliente.total(entrada.nextDouble());

        System.out.println("""
                Qual operação você quer realizar? 
                1 - depósito
                2 - saque""");
        usuario = entrada.nextInt();

        switch (usuario) {
            case 1:
                System.out.println("Quanto você vai depositar? ");
                cliente.setDeposito(entrada.nextDouble());
                System.out.println("Você agora tem em conta: " + cliente.getDeposito());
                break;
            case 2:
                System.out.println("Quanto você quer sacar? ");
                cliente.setSaque(entrada.nextDouble());
                System.out.println("Você agora tem em conta: " + cliente.getSaque());
                break;
            default:
                System.out.println("inválido!");
        }



    }
}
