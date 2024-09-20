import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Este programa demonstra o tratamento de exceções utilizando um bloco
 * `try-catch`.
 * 
 * O programa tenta converter uma string ("a1.75") em um número utilizando o
 * método `parse()` da classe `NumberFormat`.
 * Como a string contém um caractere inválido ("a"), uma exceção
 * `ParseException` é lançada.
 * O bloco `try` encapsula o código que pode lançar a exceção.
 * O bloco `catch` captura a exceção `ParseException` e imprime a pilha de erros
 * utilizando `e.printStackTrace()`.
 */
public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        // Bloco try que tenta converter a string em um número
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

            // Bloco catch que captura a exceção ParseException
        } catch (ParseException e) {
            // Imprime a pilha de erros da exceção
            e.printStackTrace();
        }
    }
}
