package Calc;
//classe
public class Pacotes {
    public double x;
    public double y;

    //construtor  
    public Pacotes(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //funçoes
    public double Mult() {
        return x * y;
    }

    public double Div () {
        return x / y;
    }

    public double Adi () {
        return x + y;
    }

    public double Sub () {
        return x - y;
    }

}
