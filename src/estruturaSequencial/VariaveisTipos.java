package estruturaSequencial;

public class VariaveisTipos {
    public static void main(String[] args) {
        // Tipos de Dados Primitivos
        // Java possui oito tipos de dados primitivos:

        // 1. byte: 8 bits, armazena valores de -128 a 127. Valor padrão: 0
        byte idade = 25;
        System.out.println("Idade: " + idade);

        // 2. short: 16 bits, armazena valores de -32768 a 32767. Valor padrão: 0
        short ano = 2023;
        System.out.println("Ano: " + ano);

        // 3. int: 32 bits, armazena valores de -2147483648 a 2147483647. Valor padrão: 0
        int populacaoMundial = 780000000;
        System.out.println("População Mundial: " + populacaoMundial);

        // 4. long: 64 bits, armazena valores de -9223372036854770000 a 9223372036854770000. Valor padrão: 0L
        long distanciaEstrela = 9223372036854770000L;
        System.out.println("Distância até a estrela: " + distanciaEstrela);

        // 5. float: 32 bits, armazena valores de -1,4024E-37 a 3,4028E+38. Valor padrão: 0.0f
        float altura = 1.80F;
        System.out.println("Altura: " + altura);

        // 6. double: 64 bits, armazena valores de -4,94E-307 a 1,79E+308. Valor padrão: 0.0
        double peso = 83.75;
        System.out.println("Peso: " + peso);

        // 7. char: 16 bits, armazena caracteres Unicode de '\u0000' a '\uFFFF'. Valor padrão: '\u0000'
        char genero = 'M';
        System.out.println("Gênero: " + genero);

        // 8. boolean: 1 bit, armazena valores true ou false. Valor padrão: false
        boolean ativo = true;
        System.out.println("Ativo: " + ativo);

        // Declaração de Variáveis
        // Para declarar uma variável, usamos a seguinte sintaxe:
        // <tipo> <nome> = <valor inicial (opcional)>;

        String nome = "John Doe"; // String não é um tipo primitivo, mas uma classe
        System.out.println("Nome: " + nome);

        // Variáveis finais (constantes)
        // Variáveis finais não podem ser alteradas após a inicialização.
        final String nascimento = "05/11/1996";
        System.out.println("Data de Nascimento: " + nascimento);

        // Regras para Nomes de Variáveis
        // 1. Não pode começar com um dígito (0-9).
        // 2. Não pode conter espaços em branco.
        // 3. Não use acentos ou til.
        // 4. Use o padrão camelCase, onde a primeira palavra começa com minúscula e as subsequentes com maiúscula.

        // Exemplos de Nomes de Variáveis Válidos
        int minutos5 = 5; // Começa com uma letra e não um dígito
        int salario = 2000; // Não contém espaços em branco
        int salarioDoFuncionario = 2500; // Usa camelCase

        // Exemplos de Nomes de Variáveis Inválidos
        // int 5minutos; // Começa com um dígito
        // int salario funcionario; // Contém espaço em branco
        // int salário; // Usa acento

        // Vamos imprimir os valores das variáveis válidas
        System.out.println("minutos5: " + minutos5);
        System.out.println("salario: " + salario);
        System.out.println("salarioDoFuncionario: " + salarioDoFuncionario);
    }
}