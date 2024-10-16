public class Pirilampo {
    //Propriedades
    private String nome;
    private int idade;
    private float tamanho;
    private String cor;
    private int intensidade;

    //Metodo Construtor
    public Pirilampo(String nome,String cor){//parametros
        this.nome = nome;
        this.idade = 0;
        this.tamanho = 0;
        this.cor = cor;
        this.intensidade = 0;
    }

    //Metodo de Instacia
    public void falar(String fala){//parametros
        if (fala.isEmpty())
            System.out.println("não tenho nada a dizer");
        else
            System.out.println("Eu chamo-me " + this.nome + " e tenho a dizer " + fala);

    }

    public void alterarIntensidadeLuz(int valor){
        if (valor < 0 || valor > 100) {
            System.out.println("O valor " + valor + " é invalido");
            return;
        }

        System.out.println("Antes tinha a intensidade de " + this.intensidade + "%" + " e agora estou na intensidade " + valor + "%");
        this.intensidade = valor;
    }

    public void alterarCor(String cor){
        if (!cor.equals("amarelo")  && !cor.equals("verde")  && !cor.equals("vermelho")) {
            System.out.println("A Cor " + cor + " é invalida");
            return;
        }

        System.out.println("Antes tinha a cor " + this.cor + " e agora tenho a cor " + cor);
        this.cor = cor;



    }
}
