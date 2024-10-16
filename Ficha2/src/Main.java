import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ex1
        float peso = 0f;
        float altura = 0f;

        System.out.printf("digite o seu peso em Kg: ");
        peso = Float.parseFloat(scan.nextLine());

        System.out.printf("digite a sua altura em metros: ");
        altura = Float.parseFloat(scan.nextLine());

        System.out.printf("O seu Índice de massa corporal é: "+(peso / (altura * altura)));

        //Ex2
        float preco = 0f;
        float dinheiro = 0f;

        System.out.printf("Digite o preço do produto: ");
        preco = Float.parseFloat(scan.nextLine());

        System.out.printf("Digite o dinheiro recebido: ");
        dinheiro = Float.parseFloat(scan.nextLine());

        System.out.printf("O troco é: " + (dinheiro - preco));

        //Ex3
        float lado = 0f;

        System.out.println("Digite o tamanho do lado do quadrado: ");
        lado = Float.parseFloat(scan.nextLine());

        System.out.println("A área do quadrado é: " + (lado * lado) + "\nO perimetro do quadrado é: " + 4 * lado );

        //Ex4
        float preco2 = 0f;

        System.out.println("Qual é o preço do seu produto?");
        preco2 = Float.parseFloat(scan.nextLine());

        System.out.println("O preço sem Desconto de 10% fica por " + preco + "\nO preço com Desconto de 10% fica por " + (preco * 0.90f));

        //Ex5
        int idade = 0;
        int ano = Year.now().getValue();

        System.out.printf("Digite a sua idade: ");
        idade = Integer.parseInt(scan.nextLine());

        System.out.printf("Voce nasceu em: " + (ano - idade));
    }

}