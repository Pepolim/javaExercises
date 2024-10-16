public class Cao {
    //Propriedades
    String nome;
    int idade;
    String cor;
    float peso;
    char genero;
    String raca;

    //Metodo Construtor
    public Cao(String nome, String cor, char genero, String raca){
        this.nome = nome;
        this.idade = 0;
        this.peso = 10;
        this.cor = cor;
        this.raca = raca;
    }

    //Metodo de Instacia
    public void falar(){
        System.out.println("auauaau");
    }

}
