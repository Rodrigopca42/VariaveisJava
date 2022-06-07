import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

       System.out.format("A nota do %s é %.2f \n ", nome, nota);
    }
}
