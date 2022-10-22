package matematica;

public class Aluno {
    
    String nome, curso;
    Avaliacao notas;

    public Aluno(String nome, String curso, Avaliacao notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    void info(){

        System.out.printf("Nome: %s \n" , nome);
        System.out.printf("Curso: %s\n", curso);
        System.out.printf("Media A: %.2f\n", notas.mediaAritimetica());
        System.out.printf("Media P: %.2f\n", notas.mediaPonderada());

    }


}
