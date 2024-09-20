public class FormatadorCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep(" 23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(" O CEP não corresponde a empresa.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        // Verifica se o CEP tem 8 dígitos
        if (cep.length() != 8)
            // Se não tiver 8 dígitos, lança uma exceção CepInvalidoException
            throw new CepInvalidoException();

        // Simulando a formatação do CEP
        return " 23.765-064";
    }
}
