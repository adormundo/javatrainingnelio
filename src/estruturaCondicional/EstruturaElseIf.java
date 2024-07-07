package estruturaCondicional;

public class EstruturaElseIf {
    public static void main(String[] args) {
        int idade = 20;

        // Verifica se a idade é menor que 12
        if (idade < 12) {
            System.out.println("Você é uma criança.");
        }
        // Verifica se a idade é menor que 18
        else if (idade < 18) {
            System.out.println("Você é um adolescente.");
        }
        // Se nenhuma das condições anteriores for verdadeira, executa este bloco
        else {
            System.out.println("Você é um adulto.");
        }
    }
}
