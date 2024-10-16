public class Main {
    public static void main(String[] args) {

    Camaleao cam1 = new Camaleao("verde");

    cam1.crescer();
    cam1.mudarCor("vermelho");

    Retangulo ret1 = new Retangulo(15,10);
    ret1.alterar(13.5f,6.5f);
    ret1.perimetro();
    ret1.area();

    }
}