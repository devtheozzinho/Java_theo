import java.util.Locale;

public class functionStringss {

    public static void main(String[] args){

        String original = "  abcde FHDKD abc DESF  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(5);
        String s05 = original.replace('a', 'x');
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String texto = "Java;Python;C++";

        System.out.println(s01); // Aqui deixa tudo minusculo

        System.out.println(original);  //Aqui deixa as letras como estão declaradas

        System.out.println(s02); // Aqui deixa tudo maiusculo

        System.out.println(s03); // Aqui retira os espaços em branco que tem no começo e no fim

        System.out.println(s04); // Aqui serve para extrair uma parte de uma String com base em posições

        System.out.println(s05); // Aqui serve para substituir partes de uma string pelas letras ou palavras escolhidas

        System.out.println(i); // Serve para descobrir a posição da primeira ocorrencia de um caractere

        System.out.println(j); // Serve para descobrir a posição da ultima ocorrencia de um caractere

        String[] linguiagens = texto.split(";");

        System.out.println(linguiagens[0]);
        System.out.println(linguiagens[1]);
        System.out.println(linguiagens[2]);








    }

}
