package matematica;

public class Principal {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno("Matt", "Tecnologia", new Avaliacao(9,10,3));
        
        a1.info();

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite suas notas!");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        
        Avaliacao ava = new Avaliacao();

        ava.n1 = nota1;
        ava.n2 = nota2;
        ava.n3 = nota3;

        System.out.printf("Sua média aritimética é: %.2f",ava.mediaAritimetica());
        System.out.printf("Sua média ponderada é: %.2f", ava.mediaPonderada());
        
        teclado.close();
    
    }
}
