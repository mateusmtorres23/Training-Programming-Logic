package Class2_P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        alunoExec();
        System.out.println(" ");
        livroExec();
    }

    // Execuções
    public static void livroExec() {
        Scanner sc = new Scanner(System.in);
        Book livro01 = new Book();

        System.out.print("Título do livro: ");
        livro01.tit = sc.nextLine();

        System.out.print("Autor do livro: ");
        livro01.aut = sc.nextLine();

        System.out.print("Quatidade de paginas: ");
        livro01.quantP = sc.nextInt();
        sc.nextLine();
        if(!livro01.emp) {
            System.out.print("O livro está disponivel quer pegar emprestado?(s/n): ");
            String entradaDisp = sc.nextLine();
            if (entradaDisp == "s"){
                livro01.emprestar();
            }
        }else{
            System.out.print("Quer devolver o livro?(s/n): ");
            String entradaDisp = sc.nextLine();
            if (entradaDisp == "s"){
                livro01.devolver();
            }
        }

        livro01.exibirInfo();
    }
    public static void alunoExec() {
        Student aluno1 = new Student();
        aluno1.nome = "Montalvas";
        aluno1.idade = 69;
        aluno1.matricula = 34353435;
        aluno1.curso = "Letras Pedagogicas";
        double avg = aluno1.media(7.5, 8.0);

        aluno1.exibirDados();
        System.out.println("sua media é: " + avg);
        aluno1.situacaoAluno(avg);
    }
}
