public class Camaleao {
    int idade;
    String cor;
    int tamanho;
    boolean vivo;


    public Camaleao(String cor) {
        this.idade = 0;
        this.cor = cor;
        this.tamanho = 0;
        this.vivo = true;
    }
    public void crescer(){
        if (!this.vivo) {
            System.out.println("o camaleao está morto");
            return;
        }
        if (idade > 6){
            System.out.println("o camaleao nao vive mais que 6 anos");
            return;
        }
        this.tamanho++;
        this.idade++;
        System.out.println("o camaleao cresceu e agora tem " + this.tamanho + " cm de comprimento e " + this.idade + " ano/s");
    }

    public void mudarCor(String cor) {
        if (!this.vivo) {
            System.out.println("o camaleao está morto");
            return;
        }

        System.out.println("o camaleao era "+ this.cor + " e agora é " + cor);
        this.cor = cor;
    }
}