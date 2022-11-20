import java.util.*;

public class NumerosComunsEmPilhaEFila {
    static ArrayList<Integer> numerosComuns(Stack<Integer> p, Queue<Integer> f) {
        ArrayList<Integer> numerosComuns = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();

        while (f.size() > 0) {
            set.add(f.poll());
        }

        while (!p.isEmpty()) {
            int temp = p.pop();
            if (!set.add(temp)) {
                numerosComuns.add(temp);
            }
        }
        return numerosComuns;
    }

    public static void main(String[] args) {
        Stack<Integer> p = new Stack<Integer>();

        // OS NUMEROS PODEM SER TROCADOS
        // NUMBERS CAN BE CHANGED

        p.push(7);
        p.push(10);
        p.push(23);
        p.push(2);

        System.out.println("Números P: ");
        for (int num1 : p) {
            System.out.println(num1);
        }

        LinkedList<Integer> f = new LinkedList<Integer>();

        // OS NUMEROS PODEM SER TROCADOS
        // NUMBERS CAN BE CHANGED

        f.add(9);
        f.add(23);
        f.add(0);
        f.add(10);

        System.out.println("Números de F: ");
        for (int num : f) {
            System.out.println(num);
        }

        ArrayList<Integer> retorno = numerosComuns(p, f);

        if (retorno.size() == 0) {
            System.out.println("P e F não possuem números comuns");
        } else {
            System.out.println("Números comuns em P e F: ");
            for (int i = 0; i < retorno.size(); i++) {
                System.out.println(retorno.get(i) + "");
            }
        }
    }
}

//GUSTAVO ALFREDO CORREA DA SILVA :)