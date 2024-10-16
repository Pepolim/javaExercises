import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //exerc1

        String corSem = "";

        System.out.println("Digite a cor do semafro\n");
        corSem = scan.nextLine().toLowerCase();

        if (corSem.equals("verde"))
            System.out.printf("pode avançar");
        else if (corSem.equals("amarelo"))
            System.out.printf("preste atenção");
        else if (corSem.equals("vermelho"))
            System.out.printf("PARE");
        else
            System.out.printf("cor invalida");

        //exerc2

        float soma = 0F;
        float numComp = 0F;

        System.out.println("Escreva 3 numeros");
        soma += Float.parseFloat(scan.nextLine());
        soma += Float.parseFloat(scan.nextLine());
        numComp = Float.parseFloat(scan.nextLine());

        if (soma < numComp)
            System.out.println(soma + " é menor que " + numComp);
        else if(soma == numComp)
            System.out.println(soma + " é igual a " + numComp);
        else
            System.out.println(soma + " é maior que " + numComp);

        //exerc3

        char gen;

        System.out.printf("Qual o seu género?\nM - Masculino\nF - Feminino\nI - Indiferenciado\n");
        gen = scan.nextLine().toLowerCase().charAt(0);

        if (gen == 'm')
            System.out.printf("O seu género é Masculino\n");
        else if (gen == 'f')
            System.out.printf("O seu género é Feminino\n");
        else if (gen == 'i')
            System.out.printf("O seu género é Indiferenciado\n");
        else
            System.out.printf("género errado");

        //Exerc4

        float num = 0f;

        System.out.printf("Digite um numero\n");
        num = Float.parseFloat(scan.nextLine());

        if (num % 2 == 0)
            System.out.printf("Par");
        else
            System.out.printf("Impar");

        //Exerc5

        float num1 = 0F;
        float num2 = 0F;
        float num3 = 0F;

        System.out.println("Escreva 3 numeros");
        num1 = Float.parseFloat(scan.nextLine());
        num2 = Float.parseFloat(scan.nextLine());
        num3 = Float.parseFloat(scan.nextLine());

        if (num1 == num2)
            System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
        else
            System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + (num1*num2*num3));

        //exerc6

        float num6 = 0f;

        System.out.println("Escreva 1 numero");
        num6 = Float.parseFloat(scan.nextLine());

        if (num6 > 0)
            System.out.printf("O dobro é " + (num6*2));
        else if (num6 < 0)
            System.out.printf("O quadruplo é " + (num6*4));
        else
            System.out.printf("numero invalido");
    }
}