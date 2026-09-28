package Class2_P2;

public class Student {
    String nome, curso;
    int matricula, idade;

    public double media (double nota1, double nota2){
        return (nota1 + nota2)/2;
    }

    public void exibirDados(){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("matricula: " + matricula);
        System.out.println("curso: " + curso);
    }

    public void situacaoAluno (double media) {
        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
