import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * A classe AboutMe solicita ao usuário informações pessoais (nome, sobrenome, idade e altura)
 * e, em seguida, exibe essas informações na tela.
 * 
 * O código utiliza um bloco try-with-resources para garantir que o Scanner seja fechado automaticamente,
 * mesmo se ocorrer uma exceção durante a execução.
 */
public class AboutMe {
    public static void main(String[] args) {
        
        // Utiliza um bloco try-with-resources para criar e gerenciar o Scanner.
        // O Scanner será fechado automaticamente ao final do bloco, mesmo se ocorrer uma exceção.
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            // Solicita ao usuário que digite seu nome e armazena a entrada na variável nome.
            System.out.println(" Digite seu nome");
            String nome = scanner.next();

            // Solicita ao usuário que digite seu sobrenome e armazena a entrada na variável sobrenome.
            System.out.println(" Digite seu sobrenome");
            String sobrenome = scanner.next();

            // Solicita ao usuário que digite sua idade e armazena a entrada na variável idade.
            System.out.println(" Digite sua idade");
            int idade = scanner.nextInt();

            // Solicita ao usuário que digite sua altura e armazena a entrada na variável altura.
            System.out.println(" Digite sua altura");
            double altura = scanner.nextDouble();

            // Exibe uma saudação personalizada com o nome e sobrenome do usuário.
            System.out.println(" Olá, me chamo " + nome + " " + sobrenome);

            // Exibe a idade do usuário.
            System.out.println(" Tenho " + idade + " anos ");

            // Exibe a altura do usuário.
            System.out.println(" Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e){
            System.err.println(" O campos idade e altura precisam ser numéricos");
        }
    }
}
