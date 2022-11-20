import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class ControleDeAeroporto {

    private static LinkedList<String> fila = new LinkedList<String>();
    private static Scanner scanner = new Scanner(System.in);
    private static String aviao;

    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        //MENU
        int opcao;
        do {
            System.out.println("+---------------------------------------------+");
            System.out.println("|         Sistema de controle de Aeroporto    |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|    1 - Adicionar Avião;                     |");
            System.out.println("|    2 - Avioes que estão na fila de espera;  |");
            System.out.println("|    3 - Autorizar Decolagem;                 |");
            System.out.println("|    4 - Numero de aviões em espera;          |");
            System.out.println("|    5 - Sair                                 |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|  Qual é a opção selecionada:                |");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarAviaoAFila();
                    break;
                case 2:
                    listarAvioesDaFila();
                    break;
                case 3:
                    autorizarDecolagem();
                    break;
                case 4:
                    mostrarQuantidadeDeAvioesNaFila();
                    break;
                case 5:
                    System.out.println("+---------------------------------------------+");
                    System.out.println("|                   Saindo...                 |");
                    System.out.println("+---------------------------------------------+");
                    System.exit(5);
                    break;
                default:
                    opcaoInvalida();

            }
        } while (opcao == 5);
    }

    private static void adicionarAviaoAFila() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|  Adicionar avião a Fila de espera para decolagem  |");
        System.out.println("+---------------------------------------------------+");
        System.out.println("|  Qual é o nome da Aeronave:                       |");
        aviao = scanner.next();
        fila.add(aviao);
        System.out.println("+---------------------------------------------------+");
        System.out.println("| " + aviao + " foi adicionado a fila");
        System.out.println("+---------------------------------------------------+");
        menu();
    }

    private static void listarAvioesDaFila() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|         Esta é a lista aviões em espera:          |");
        for (String espera : fila) {
            System.out.println(" " + espera);
        }
        System.out.println("+---------------------------------------------------+");
        menu();
    }


    private static void autorizarDecolagem() {
        String decolar;
        System.out.println("Autorizar decolagem");
        System.out.println();
        if (fila.peek() == null){
            System.out.println("+---------------------------------------------------+");
            System.out.println("|      A fila não possui aviões para decolagem      |");
            System.out.println("+---------------------------------------------------+");
            menu();
        } else {
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("| A aeronave que está pronta para decolar é: " + fila.peek());
            System.out.println("+----------------------------------------------------------------+");
            System.out.println("| Deseja autorizar decolagem [s] para sim ou [n] para não: ");
            decolar = scanner.next();

            if (Objects.equals(decolar, "s")) {
                fila.remove(fila.peek());
                System.out.println("+---------------------------------------------------+");
                System.out.println("|                   Aeronave Decolou                |");
                System.out.println("+---------------------------------------------------+");
            } else if (Objects.equals(decolar, "n")) {
                System.out.println("+---------------------------------------------------+");
                System.out.println("|                   Voltando ao Menu                |");
                System.out.println("+---------------------------------------------------+");
            } else {
                System.out.println("+---------------------------------------------------+");
                System.out.println("|                    Opção Invalida                 |");
                System.out.println("+---------------------------------------------------+");
            }
            menu();
        }

        //criar uma função de opção invalida
    }

    private static void mostrarQuantidadeDeAvioesNaFila() {
        if (fila.size() == 1) {
            System.out.println("A fila possui " + fila.size() + " avião");
        } else if (fila.size() <= 0) {
            System.out.println("+---------------------------------------------------+");
            System.out.println("|        A fila de espera não possui aviões         |");
            System.out.println("+---------------------------------------------------+");
        } else {
            System.out.println("+---------------------------------------------------+");
            System.out.println("| A fila de espera possui " + fila.size() + " aviões");
            System.out.println("+---------------------------------------------------+");
        }
        menu();
    }


    private static void opcaoInvalida(){
        System.out.println("+---------------------------------------------+");
        System.out.println("|               Opção Invalida!!!             |");
        System.out.println("+---------------------------------------------+");
        menu();
    }
}
//GUSTAVO ALFREDO CORREA DA SILVA :)