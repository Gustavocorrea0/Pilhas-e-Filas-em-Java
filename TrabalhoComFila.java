import java.util.Comparator;
import java.util.LinkedList;

public class TrabalhoComFila {
    public static LinkedList<Integer> F1 = new LinkedList<Integer>();
    public static LinkedList<Integer> F2 = new LinkedList<Integer>();

    public static void main(String[] args){

        F1.add(112); 
        F1.add(900);
        F1.add(15);
        F1.add(13);
        F1.add(222);
        F1.add(231);
        F1.add(212);
        F1.add(202);

        F2.add(181);
        F2.add(700);
        F2.add(23);
        //F2.add(6);
        F2.add(15);
        F2.add(578);
        //F2.add(21);
        F2.add(9);

        // SE AS PILHAS SÃO IGUAIS OU UMA É MAIOR QUE A OUTRA
        System.out.println("-----------------------------------------");
        if (F1.size() > F2.size()){
            System.out.println("A Primeira fila (F1) é maior");
        } else if (F1.size() < F2.size()) {
            System.out.println("A Segunda fila (F2) é Maior");
        } else {
            System.out.println("Ambas as filas são iguais");
        }
        System.out.println("-----------------------------------------");

        //MAIOR, MÉDIO E MAIOR
        maiorMedioMenorPrimeiraPilha();
        System.out.println("-----------------------------------------");
        maiorMedioMenorSegundaPilha();
        System.out.println("-----------------------------------------");

        //NÚMEROS PARES
        numerosParesPrimeiraPilha();
        System.out.println("-----------------------------------------");
        numerosParesSegundaPilha();
        System.out.println("-----------------------------------------");
    }

    private static void maiorMedioMenorPrimeiraPilha(){
        System.out.println("O Maior número da primeira fila (F1) é " + F1.stream().max(Comparator.comparing(Integer::intValue)).get());
        System.out.println("O Menor número da primeira fila (F1) é " + F1.stream().min(Comparator.comparing(x -> x)).get());
        System.out.println("A Média aritmética da Primeira fila (F1) é " + Math.round(F1.stream().mapToInt(Integer::intValue)
                .summaryStatistics().getAverage()));

        Integer maior = 100000,
                menor = -100,
                adicao = 0,
                quantidade = 0;
        for (Integer x:F1){
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
        System.out.println("O Maior número da segunda fila (F2) é " + F2.stream().max(Comparator.comparing(Integer::intValue)).get());
        System.out.println("O Menor número da segunda fila (F2) é " + F2.stream().min(Comparator.comparing(x -> x)).get());
        System.out.println("A Média aritmética da Segunda fila (F2) é " + Math.round(F2.stream().mapToDouble(Integer::intValue).summaryStatistics().getAverage()));

        Integer maior = 100000,
                menor = -100,
                adicao = 0,
                quantidade = 0;
        for (Integer j: F2) {
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
        System.out.println("Números Pares Primeira fila(F1): ");
        for (Integer k: F1){
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
    }
    private static void numerosParesSegundaPilha(){
        System.out.println();
        System.out.println("Números Pares Segunda fila(F2): ");
        for (Integer p: F2){
            if (p % 2 == 0){
                System.out.println(p);
            }
        }
    }
}

//GUSTAVO ALFREDO CORREA DA SILVA :)