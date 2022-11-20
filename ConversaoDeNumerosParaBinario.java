import java.util.Scanner;
import java.util.Stack;

public class ConversaoDeNumerosParaBinario {
    static Stack<Integer> pilha = new Stack<Integer>();
    static Stack<Integer> pilha2 = new Stack<Integer>();
    static Scanner scanner = new Scanner(System.in);
    static int numero;
    static String avancar;
    static int opcao;
    public static void main(String[] args){
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                      Bem vindo!!!                      |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|  Este programa transforma numeros decimais em binario. | ");
        menu();
    }

    private static void menu(){
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                   Selecione uma opção                  |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                 1 - Adicionar número;                  |");
        System.out.println("|             2 - Mostra número convertido;              |");
        System.out.println("|                       3 - Sair.                        |");

        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                receberNumeros();
                break;
            case 2:
                conversaoEApresentacaoBinario();
                break;
            case 3:
                System.out.println("+--------------------------------------------------------+");
                System.out.println("|                         Saindo...                      |");
                System.out.println("+--------------------------------------------------------+");
                System.exit(3);
                break;
            default:
                opcaoInvalida();
        }
    }
    private static void receberNumeros() {
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Digite o numero:                                       |");
        numero = scanner.nextInt();
        pilha.push(numero);
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               Número adicionado a pilha!               |");
        menu();
    }
    private static void conversaoEApresentacaoBinario(){
        while(numero != 0){
            int j = numero % 2;
            pilha2.push(j);
            numero /= 2;
        }
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| Binarios:                                              |");
        while (!(pilha2.isEmpty())){
            System.out.print("  " + pilha2.pop());
        }
        System.out.println();
        menu();
    }

    private static void opcaoInvalida(){
        System.out.println("Opção Invalida!!!");
        menu();
    }
}

//GUSTAVO ALFREDO CORREA DA SILVA :)