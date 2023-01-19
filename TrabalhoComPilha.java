import java.util.Comparator;
import java.util.Stack;

public class TrabalhoComPilha {
    public static Stack<Integer> P1;
    public static Stack<Integer> P2;

    public static void main(String[] args){

        P1 = new Stack<Integer>();
        P1.push(10);
        P1.push(22);
        P1.push(8);
        P1.push(13);
        P1.push(88);
        P1.push(11);
        P1.push(26);
        //P1.push(3);

        P2 = new Stack<Integer>();

        P2.push(11);
        P2.push(0);
        P2.push(23);
        P2.push(6);
        P2.push(17);
        P2.push(50);
        P2.push(21);
        P2.push(8);

        // TESTAR SE AS PILHAS SÃO IGUAIS OU UMA É MAIOR QUE A OUTRA
        System.out.println("+-----------------------------------------+");
        if (P1.size() > P2.size()){
            System.out.println("A Primeira pilha (P1) é maior");
        } else if (P1.size() < P2.size()) {
            System.out.println("A Segunda pilha (P2) é Maior");
        } else {
            System.out.println("Ambas as pilhas são iguais");
        }
        System.out.println("+-----------------------------------------+");

        //MAIOR, MÉDIO E MAIOR
        maiorMedioMenorPrimeiraPilha();
        System.out.println("+-----------------------------------------+");
        maiorMedioMenorSegundaPilha();
        System.out.println("+-----------------------------------------+");

        //NÚMEROS PARES
        numerosParesPrimeiraPilha();
        System.out.println("+-----------------------------------------+");
        numerosParesSegundaPilha();
        System.out.println("+-----------------------------------------+");
    }

    private static void maiorMedioMenorPrimeiraPilha(){
        System.out.println("O Maior número da primeira pilha (P1) é " + P1.stream().max(Comparator.comparing(Integer::intValue)).get());
        System.out.println("O Menor número da primeira pilha (P1) é " + P1.stream().min(Comparator.comparing(x -> x)).get());
        System.out.println("A Média aritmética da primeira pilha (P1) é " + Math.round(P1.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage()));

        Integer maior = 100000,
                menor = -100,
                adicao = 0,
                quantidade = 0;
        for (Integer x:P1){
                if (x < menor ){
                    menor = x.intValue();
                }
                if (x > maior) {
                    menor = x.intValue();
                }
                adicao = x.intValue();
                quantidade = 1;
            }
    }
    private static void maiorMedioMenorSegundaPilha(){
        System.out.println("O Maior número da segunda pilha (P2) é " + P2.stream().max(Comparator.comparing(Integer::intValue)).get());
        System.out.println("O Menor número da segunda pilha (P2) é " + P2.stream().min(Comparator.comparing(x -> x)).get());
        System.out.println("A Média aritmética da segunda pilha (P2) é " + Math.round(P2.stream().mapToDouble(Integer::intValue).summaryStatistics().getAverage()));

        Integer maior = 100000,
                menor = -100,
                adicao = 0,
                quantidade = 0;
        for (Integer j: P2) {
            if (j < menor ){
                menor = j.intValue();
            }
            if (j > maior) {
                menor = j.intValue();
            }
            adicao = j.intValue();
            quantidade = 1;
        }

    }
    private static void numerosParesPrimeiraPilha(){
        System.out.println();
        System.out.println("Números Pares Primeira pilha (P1): ");
        for (Integer k: P1){
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
    }
    private static void numerosParesSegundaPilha(){
        System.out.println();
        System.out.println("Números Pares Segunda pilha (P2): ");
        for (Integer p: P2){
            if (p % 2 == 0){
                System.out.println(p);
            }
        }
    }

}

//GUSTAVO ALFREDO CORREA DA SILVA :)

