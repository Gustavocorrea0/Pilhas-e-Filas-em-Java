import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class SepararNumerosParesEImpares {

    static final Scanner scanner = new Scanner(System.in);
    static Stack<Integer> pilha = new Stack<Integer>();
    static LinkedList<Integer> filaPar = new LinkedList<Integer>();
    static LinkedList<Integer> filaImpar = new LinkedList<Integer>();
    static int numero;

    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                            Bem vindo!!!                             |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|  Este programa recebe seus números e os separa em pares e impares.  |");
        System.out.println("| Assim que um número negativo for digitado o sistema será encerrado. |");
        System.out.println("+---------------------------------------------------------------------+");

        do {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("| Digite um numero:                                                   |");
            numero = scanner.nextInt();
            pilha.push(numero);
        } while (numero > -1);

        // Divide os numeros
        if (pilha.peek() == null) {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|                     Números não inseridos                           |");
        } else {
            for (Integer k : pilha) {
                if (k % 2 == 0) {     //TESTA NÚMEROS PARES - TEST EVEN NUMBERS
                    filaPar.add(k);
                } else {
                    filaImpar.add(k); //TESTA NÚMEROS IMPARES - TEST ODD NUMBERS
                }

            }
        }

        System.out.println("+---------------------------------------------------------------------+");
        numerosPares();
        numerosImpares();
    }

    private static void numerosPares() {
        System.out.println();
        if (filaPar.isEmpty()) {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|                         Sem números pares                           |");
            System.out.println("+---------------------------------------------------------------------+");
        } else {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|                          Números pares:                             |");
            for (int mostrarFilaPar : filaPar) {
                System.out.println(mostrarFilaPar);
            }
        }
    }
    private static void numerosImpares() {
        if (filaImpar.isEmpty()) {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|                        Sem números Impares                          |");
            System.out.println("+---------------------------------------------------------------------+");
        } else {

            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|                        Números impares:                             |");
            for (int mostrarFilaImpar : filaImpar) {
                System.out.println(mostrarFilaImpar);
            }
        }
    }
}

//GUSTAVO ALFREDO CORREA DA SILVA :)