public class Bola {
    private int pressaoMax;
    private int pressaoMin;
    private int pressaoAtual;

    public Bola(int pressaoMax,int pressaoMin, int pressaoAtual) throws Exception {
        if(pressaoMax < pressaoMin)
            throw new Exception("A pressao maxima nao pode ser menor que a minima");

        if (pressaoAtual < pressaoMin || pressaoAtual > pressaoMax)
            throw new Exception("A pressao atual nao pode sair dos limites maximos e minimos");

        this.pressaoMax = pressaoMax;
        this.pressaoMin = pressaoMin;
        this.pressaoAtual = pressaoAtual;
    }

    public void saltar() throws Exception {
        pressaoAtual -= 10;

        if(this.pressaoAtual < this.pressaoMin)
            throw new Exception("A bola nao tem pressao para saltar");
        else
            throw new Exception("boing");
    }

    public void encher() throws Exception {
        pressaoAtual += 10;

        if(this.pressaoAtual > this.pressaoMax)
            throw new Exception("A bola explodiu");
        else
            throw new Exception("A encher");
    }

}
