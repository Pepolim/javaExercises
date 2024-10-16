public class Retangulo {
    float altura;
    float base;

    public Retangulo(float altura, float base){
        this.altura = altura;
        this.base = base;
    }

    public void alterar(float altura, float base){
        System.out.println("A altura antiga era " + this.altura + " e agora é " + altura);
        this.altura = altura;
        System.out.println("A base antiga era " + this.base + " e agora é " + base);
        this.base = base;
    }

    public void perimetro() {
        System.out.println("O perimetro é: " + 2 * (this.altura + this.base));
    }
    public void area() {
        System.out.println("A area é: " + this.altura * this.base);
    }
}
