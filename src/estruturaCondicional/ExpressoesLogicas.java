package estruturaCondicional;

public class ExpressoesLogicas {
    public static void main(String[] args) {
        /*
        Tabela Verdade para && (E lógico)
         A	     B	   A && B
        true	true	true
        true	false	false
        false	true	false
        false	false	false

        Tabela Verdade para || (OU lógico)
         A	     B	   A || B
        true	true	true
        true	false	true
        false	true	true
        false	false	false

        Tabela Verdade para ! (NÃO lógico)
         A	     !A
        true	false
        false	true
        */

        int idade = 25;
        boolean temCarteira = true;

        // Verifica se a idade é maior ou igual a 18 E se tem carteira de motorista
        if (idade >= 18 && temCarteira) {
            System.out.println("Você pode dirigir.");
        }

        // Verifica se a idade é menor que 18 OU se não tem carteira de motorista
        if (idade < 18 || !temCarteira) {
            System.out.println("Você não pode dirigir.");
        }

        // Verifica se a idade não é maior ou igual a 18
        if (!(idade >= 18)) {
            System.out.println("Você é menor de idade.");
        }

    }
}
