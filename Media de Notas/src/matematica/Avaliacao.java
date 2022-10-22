package matematica;

public class Avaliacao {
    
    double n1,n2,n3;

 

    public Avaliacao(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double mediaAritimetica(){

        return (n1 + n2 + n3) / 3;
    }

    public double mediaPonderada(){

        return (n1 * 2 + n2 *3 + n3 * 4) / 9;

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    
}
