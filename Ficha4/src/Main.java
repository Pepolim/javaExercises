import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ex1

        int num = 0;

        System.out.println("digite um numero de 1 a 20 para mostrar a tabuada desse numero");
        num = Integer.parseInt(scan.nextLine());

        if (num > 0 && num <= 20) {
            for (int i = 1; i <= 10; i++) {

                System.out.println(num + "*" + i + "= " + num * i);
            }
        }
        else System.out.println("erro");

        //ex2

        for (int i = 0; i < 201; i++) {
            if (i<101)System.out.println(i);
            else System.out.println(200-i);
        }
        //mesma coisa
        int i = 0;
        boolean incr = true;

        while(i > -1){
            System.out.println(i);

            if (incr)
                i++;
            else i--;

            if (i == 100)
                incr = false;
        }

        //ex3

        for (int i = 10; i <= 110; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //ex4
        int alunos = 0;
        int reprovados = 0;
        //float nota = 0f;
        float somaTurma = 0f;

        System.out.println("Quantos alunos tem a turma?");
        alunos = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= alunos; i++) {
            float nota = 0f;
            System.out.println("Introduza a nota do " + i + "º aluno");
            nota = Float.parseFloat(scan.nextLine());

            if (nota > 20) {
                System.out.println("Não existem notas superiores a 20");
                break;
            }
            somaTurma += nota;

            if (nota < 9.5f)
                reprovados++;
            else if (i == alunos) {
                System.out.println("A média da turma é: " + somaTurma/alunos);
                System.out.println(alunos - reprovados + " alunos foram aprovados e " + reprovados + " reprovados");
            }

        }

        //ex5
        Random rand = new Random();

        int randNum = rand.nextInt(100);

        System.out.println(randNum);

        System.out.println("Tente adivinhar o numero entre 0 e 100 com 5 tentativas");

        for (int i = 1; i <= 5; i++) {
            int numUtil = 0;

            if (i == 5)
                System.out.println("Ultima tentativa!");
            else
                System.out.println(i + "ª tentativa");

            numUtil= Integer.parseInt(scan.nextLine());

            if (numUtil == randNum)
                System.out.println("Parabens!!!");
            else if (Math.abs(numUtil - randNum) <= 5)
                System.out.println("A escaldar");
            else if (Math.abs(numUtil - randNum) <= 10)
                System.out.println("Muito quente");
            else if (Math.abs(numUtil - randNum) <= 15)
                System.out.println("Quente");
            else
                System.out.println("Frio");

        }
    }
}