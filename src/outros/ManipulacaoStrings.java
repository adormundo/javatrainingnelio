package outros;

public class ManipulacaoStrings {
    public static void main(String[] args) {
        // Exemplo de string inicial
        String str = "   Hello World!   ";

        // Formatar: toLowerCase(), toUpperCase(), trim()
        String lowerCaseStr = str.toLowerCase(); // Converte todos os caracteres para minúsculas
        String upperCaseStr = str.toUpperCase(); // Converte todos os caracteres para maiúsculas
        String trimmedStr = str.trim(); // Remove espaços em branco no início e no fim
        System.out.println("toLowerCase(): " + lowerCaseStr);
        System.out.println("toUpperCase(): " + upperCaseStr);
        System.out.println("trim(): " + trimmedStr);



        // Recortar: substring(inicio), substring(inicio, fim)
        String sub1 = trimmedStr.substring(6); // Retorna a substring a partir do índice 6
        String sub2 = trimmedStr.substring(0, 5); // Retorna a substring do índice 0 ao 4
        System.out.println("substring(6): " + sub1);
        System.out.println("substring(0, 5): " + sub2);



        // Substituir: replace(char, char), replace(string, string)
        String replacedChar = trimmedStr.replace('o', 'a'); // Substitui todas as ocorrências de 'o' por 'a'
        String replacedStr = trimmedStr.replace("World", "Java"); // Substitui "World" por "Java"
        System.out.println("replace('o', 'a'): " + replacedChar);
        System.out.println("replace(\"World\", \"Java\"): " + replacedStr);




        // Buscar: indexOf(char), lastIndexOf(char)
        int index1 = trimmedStr.indexOf('o'); // Retorna o índice da primeira ocorrência de 'o'
        int index2 = trimmedStr.lastIndexOf('o'); // Retorna o índice da última ocorrência de 'o'
        System.out.println("indexOf('o'): " + index1);
        System.out.println("lastIndexOf('o'): " + index2);

        // Dividir: split(regex)
        String strToSplit = "Hello,World,Java";
        String[] parts = strToSplit.split(","); // Divide a string em um array de substrings com base na vírgula
        System.out.println("split(\",\"):");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}