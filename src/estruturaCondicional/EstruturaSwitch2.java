package estruturaCondicional;

public class EstruturaSwitch2 {
    public static void main(String[] args) {
        String diaDaSemana = "quarta";

        // Nova sintaxe do switch como expressão
        String resultado = switch (diaDaSemana) {
            case "segunda", "terça", "quarta", "quinta", "sexta" -> "Dia útil";
            case "sábado", "domingo" -> "Fim de semana";
            default -> "Dia inválido";
        };
        System.out.println(resultado);  // Saída: Dia útil


        // Usando a nova sintaxe com blocos e yield
        int numero = 2;
        int quadrado = switch (numero) {
            case 1 -> 1;
            case 2 -> {
                yield numero * numero; // yield é usado para retornar um valor de um bloco
            }
            default -> 0;
        };

        System.out.println(quadrado);  // Saída: 4
    }


        /*
            - Arrow syntax (->):
               * Permite uma forma mais concisa de definir casos.
               * Não há necessidade de usar break, pois cada caso é independente.

            - Múltiplos casos em uma única linha:
               * Você pode agrupar múltiplos casos usando vírgulas.

            - yield para retornar valores:
               * Quando você precisa de um bloco de código mais complexo,
                 você pode usar yield para retornar um valor.

            - switch como expressão:
               * O switch pode ser usado como uma expressão que retorna um valor,
                 como mostrado no exemplo acima.
        */
}
