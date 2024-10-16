import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*
        //ex1
        String nome = "Nuno Pepolim";
        String cidade = "Ovar";
        System.out.println("o meu nome é " + nome + " e vivo em " + cidade);

        //ex2
        int val1 = 10;
        int val2 = 3;
        float div;
        div = val2;

        System.out.println(val1 + " mais " + val2 + " é igual a " + (val1 + val2));
        System.out.println(val1 + " menos " + val2 + " é igual a " + (val1 - val2));
        System.out.println(val1 + " vezes " + val2 + " é igual a " + (val1 * val2));
        System.out.println(val1 + " a dividir por " + val2 + " é igual a " + (val1 / div));

        //ex3
        System.out.println((85 * (1 * 3 + 3) / (70 - 8F)));

        //ex4

        Scanner scan = new Scanner(System.in);

        int idade = 0;
        float salario = 0;
        char sexo = ' ';
        String nome = "";
        boolean casado = false;

        System.out.println("Qual é a sua idade?");
        idade = Integer.parseInt(scan.nextLine());
        System.out.println("Qual é o seu salario?");
        salario = Float.parseFloat(scan.nextLine());
        System.out.println("O seu sexo é M(masculino) ou F(feminino)?");
        sexo = scan.nextLine().charAt(0);
        System.out.println("Qual é o seu Nome?");
        nome = scan.nextLine();
        System.out.println("É casado/a?\n" + "True or False?");
        casado = Boolean.parseBoolean(scan.nextLine());

        if (casado == true){
            System.out.println("Com a informação indicada voce chama-se "+nome+" com o sexo "+sexo+" idade de "+idade+" com o salario de "+salario+" e neste momento está casado/a");
        }
        else System.out.println("Com a informação indicada voce chama-se "+nome+" com o sexo "+sexo+" idade de "+idade+" com o salario de "+salario+" e neste momento não está casado/a");

        //ex5
        Scanner scan = new Scanner(System.in);

        float preco = 0f;

        System.out.println("Qual é o preço do seu produto?");
        preco = Float.parseFloat(scan.nextLine());

        System.out.println("O preço sem IVA fica por " + preco +"\nO preço com IVA fica por "+ (preco * 1.23f));
        */
        //ex6
        /*
        float num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        System.out.printf("Escreva 5 valores para fazer a media deles\n");
        num1 = Float.parseFloat(scan.nextLine());
        num2 = Float.parseFloat(scan.nextLine());
        num3 = Float.parseFloat(scan.nextLine());
        num4 = Float.parseFloat(scan.nextLine());
        num5 = Float.parseFloat(scan.nextLine());

        System.out.println("A media dos valores inseridos é: " + ((num1 + num2 + num3 + num4 + num5) / 5));

        //outra versao

        float[] num = {0,0,0,0,0};
        float soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva o " + (i + 1) + " valor");
            num[i] = Float.parseFloat(scan.nextLine());
            soma += num[i];
        }
        System.out.println("A media dos valores inseridos é: " + (soma / 5));


        //ficha2

        //Ex1
        float peso = 0f;
        float altura = 0f;

        System.out.printf("digite o seu peso em Kg: ");
        peso = Float.parseFloat(scan.nextLine());

        System.out.printf("digite a sua altura em metros: ");
        altura = Float.parseFloat(scan.nextLine());

        System.out.printf("O seu Índice de massa corporal é: "+(peso / (altura*altura)));

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

        System.out.println("A área do quadrado é: " + (lado*lado) + "\nO perimetro do quadrado é: " + 4*lado );

        //Ex4
        float preco = 0f;

        System.out.println("Qual é o preço do seu produto?");
        preco = Float.parseFloat(scan.nextLine());

        System.out.println("O preço sem Desconto de 10% fica por " + preco +"\nO preço com Desconto de 10% fica por "+ (preco * 0.90f));

        //Ex5
        int idade = 0;
        int ano = Year.now().getValue();

        System.out.printf("Digite a sua idade: ");
        idade = Integer.parseInt(scan.nextLine());

        System.out.printf("Voce nasceu em: " + (ano-idade));


        //ExerIF

        String pais = "";

        System.out.println("Escreva um dos seguinte paises para saber qual a cor da bandeira:\nAlemanha\nDinamarca\nEstónia\nÁustria\n");
        pais = scan.nextLine().toLowerCase();

        if (pais.equals("alemanha"))
            System.out.println("A bandeira tem as seguintes cores: Preto, Vermelho e Amarelo");
        else if (pais.equals("estónia"))
            System.out.println("A bandeira tem as seguintes cores: Azul, Preto e Branco");
        else if (pais.equals("dinamarca") || pais.equals("áustria"))
            System.out.println("A bandeira tem as seguintes cores: Vermelho e Branco");
        else
            System.out.println("Cores desconhecidas");


        //Ficha3

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

        float num = 0f;

        System.out.println("Escreva 1 numero");
        num = Float.parseFloat(scan.nextLine());

        if (num > 0)
            System.out.printf("O dobro é " + (num*2));
        else if (num < 0)
            System.out.printf("O quadruplo é " + (num*4));
        else
            System.out.printf("numero invalido");

        //exerc9

        float salario = 0F;

        System.out.print("Digite o seu salario\n");
        salario = Float.parseFloat(scan.nextLine());

        if (salario < 600F)
            System.out.print("O seu salario é menor que o salario minimo por " + (600 - salario) + " euros");
        else if (salario > 600F)
            System.out.print("O seu salario é maior que o salario minimo por " + (salario - 600) + " euros");
        else
            System.out.println("O seu salario é igual ao salario minimo");


        //exerc

        int numMes = 0;

        System.out.println("insira o numero do mes");
        numMes = Integer.parseInt(scan.nextLine());

        switch (numMes) {

            case 1:
            case 2:
            case 3:
                System.out.println("1º trimestre");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2º trimestre");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3º trimestre");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4º trimestre");
                break;
            default:
                System.out.println("mes errado");


        for (int i = 100; i >= 20; i--)
            System.out.println(i);


        int pin = 0;

        while (true)
        {
            System.out.println("digite o pin");
            pin = Integer.parseInt(scan.nextLine());

            if (pin == 1234)
                break;

            System.out.println("repita o pin");
        }

        System.out.println("seja bem vindo");


        //ficha 4

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

        //aula
        //exerc5
        boolean continua = true;
        int voltas = 0;

        System.out.println("Seja bem-vindo ao carrosel do Java!\nPrimeira volta é de graça mas cada volta após custa 1 euro");

        do{
            voltas++;
            System.out.println("WOW");
            System.out.println("Deu " + voltas + " volta/s");
            System.out.println("Quer dár mais uma volta?");
            continua = Boolean.parseBoolean(scan.nextLine());
        }
        while (continua);

        System.out.println("Tem que pagar " + (voltas - 1) + "euros\nTenha um bom dia!");


        //Arrays
        //exerc1

        String[] marcas = new String[10];

        marcas[0] = "Mercedes";
        marcas[1] = "Ford";
        marcas[2] = "Toyota";
        marcas[3] = "Jeep";
        marcas[4] = "Fiat";
        marcas[5] = "Audi";

        for (int i = 0; i <= 4; i++) {
            System.out.println(marcas[i] + ".");
        }


        //exerc3
        String[] marcas = new String[10];

        marcas[0] = "Mercedes";
        marcas[1] = "Ford";
        marcas[2] = "Toyota";
        marcas[3] = "Jeep";
        marcas[4] = "Fiat";
        marcas[5] = "Audi";

        for (String marca : marcas) {
            if (marca == null)
                break;

            System.out.println(marca);
        }

        //exerc4
        float[][][] pressaoArterial = new float[3][5][2];

        pressaoArterial[0][0][0] = 14f;
        pressaoArterial[0][0][1] = 9f;

        pressaoArterial[1][3][0] = 11.5f;
        pressaoArterial[1][3][1] = 7.5f;

        pressaoArterial[2][0][0] = 16f;
        pressaoArterial[2][0][1] = 9f;

        pressaoArterial[2][3][0] = 13.5f;
        pressaoArterial[2][3][1] = 8.5f;


        //exerc5

        String[] convidados = {"hitler","stalin","genghis","vlad","mussolini"};

        String nome = "";
        boolean existe = false;

        System.out.println("Escreva um nome para verificar se está na lista");
        nome = scan.nextLine().toLowerCase();

        for (String convidado : convidados) {
            if (nome.equals(convidado)) {
                existe = true;
                System.out.println("O convidado está na lista ");
                break;
            }
        }
        if (!existe)
            System.out.println("O convidado não está na lista ");


        //EXEMPLO

        String[][] logins = {
            {"Pedro","admin"},
            {"Ana","asd"},
            {"André","123"},
            {"Tiago","444"},
            {"Maria","asd123"},
        };

        System.out.println("Username:");
        String username = scan.nextLine();

        System.out.println("Password:");
        String password = scan.nextLine();

        boolean loginEncontrado = false;

        for (String[] login : logins){
            //System.out.println(login[0] + " " + login[1]);
            if (username.equals(login[0]) && password.equals(login[1])){
                loginEncontrado = true;
                System.out.println("Bem vindo!");
                break;
            }
        }
        if (!loginEncontrado)
            System.out.println("Credenciais erradas!");


        //OBJETOS && CLASSES
        //Exemplo
        Cao meuCao = new Cao("boby","branco",'M',"Golden Retriever");
        Cao minhaCadela = new Cao("Baby","branco",'F',"Golden Retriever");

        meuCao.falar();
        minhaCadela.falar();


        //exerc1
        Pirilampo piri1 = new Pirilampo("Luciferino","verde");//argumentos
        Pirilampo piri2 = new Pirilampo("Vivido","amarelo");

        piri1.falar("");
        piri2.falar("sou o 2º");

        piri1.alterarIntensidadeLuz(-10);
        piri1.alterarCor("preta");

        piri2.alterarIntensidadeLuz(69);
        piri2.alterarCor("verde");
        */

        //exerc Caneta
        /*
        Caneta caneta1 = new Caneta("Uni-ball","preto");
        Caneta caneta2 = new Caneta("BIC","azul");

        System.out.println(caneta1.getCor() + " " + caneta1.getMarca());
        System.out.println(caneta2.getCor() + " " + caneta2.getMarca());

        caneta1.setCor("amarelo");
        caneta2.setCor("vermelho");

        System.out.println(caneta1.getCor() + " " + caneta1.getMarca());
        System.out.println(caneta2.getCor() + " " + caneta2.getMarca());
        */

        //exerc Exception
        Bola bola1 = null;

        try {
            bola1 = new Bola(100, 0, 50);
        }
        catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        for (int i = 0; i < 1; i++) {
            try {
                bola1.saltar();
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        for (int i = 0; i < 1; i++) {
            try {
                bola1.encher();

            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }





    }
}