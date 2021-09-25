import java.util.Locale;

/* PRINCIPAIS MÉTODOS:

*/
public class StringMetodos {

    public static void main(String[] args) {

/* length() : retorna o número de caracteres da String
    int length()
*/
        String string = "animals";
        System.out.println(string.length()); // 7

/* charAt() : para descobrir qual o caractere que está em um determinado índice
    char charAt(int index)
*/
        //String string = "animals";
        System.out.println(string.charAt(0)); //a
        System.out.println(string.charAt(6)); //s
        // System.out.println(string.charAt(7));  IndexOutOfBoundsException pois indice começa em 0

        System.out.println("###############");

/* indexOf() : retorna o índice que se encontra o primeiro valor fornecido. Pode receber um caractere ou uma string
pode começar de uma posição específica
        Assinaturas:
        int indexOf(int ch)
        int indexOf(int ch, int fromIndex)
        int indexOf(String str)
        int indexOf(String str, int fromIndeix)
*/

        //String string = "animals";
        System.out.println(string.indexOf('a')); //0
        System.out.println(string.indexOf("al")); //4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); //-1 pois não encontrou

        System.out.println("##################");

/* substring() : procura caracteres em uma string. Retorna parte da string
O primeiro parâmetro é o índice para começar, o segundo parâmetro é opcional e marca o índice final
    Assinaturas:
    String substring(int beginIndex)
    String substring(int beginIndex, int endIndex)
*/

        // String string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        System.out.println(string.substring(3, 3)); // vazio
        // System.out.println(string.substring(3, 2)); // StringIndexOutOfBoundsException
        // System.out.println(string.substring(3, 8)); // StringIndexOutOfBoundsException

        System.out.println("######################");

/* toLowerCase() e toUpperCase() : fazem conversão de uma string
    String toLowerCase();
    String toUpperCase();
*/

        // String string = "animals";
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println(string.toLowerCase()); // animals
        System.out.println("acb123".toLowerCase()); //abc123

        System.out.println("######################");
/* equals() e equalsIgnoreCase() :
equals() checa se duas strings possuem exatamente os mesmos caracteres na mesma ordem
equalsIgnoreCase() checa se duas strings possuem os mesmos caracteres na mesma ordem não importando se maiúsculos ou minúsculos

boolean equals(Object obj) --> o parâmetro é um objeto pois é um método que se aplica a todos os objetos, retorna falso se não for uma string
boolean equalsIgnoreCase(String str)
*/
        System.out.println("abc".equals("ABC"));; //false
        System.out.println("ABC".equals("ABC")); //true
        System.out.println("abc".equalsIgnoreCase("ABC")); //true

        System.out.println("#######################");

/* startsWith() e endsWith()

boolean startsWith(String prefixo)
boolean endsWith(String sufixo)
*/
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false
        System.out.println("bruno".endsWith("no")); //true
        System.out.println("bruno".startsWith("bru")); //true

        System.out.println("#######################");

/* replace() : faz uma busca na string e faz uma substituição. Existe variação que aceita parâmetros char e CharSequence
String replace(char oldChar, char newChar)
String replace(charSequence target, charSequence replacement)
*/
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

/* contains() : procura correspondências dentro de uma string, essa correspondência pode ser em qualquer lugar da string
boolean contains(charSequence charSeq)
*/
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false
        System.out.println("bruno".contains("ru")); //true

/* trim(), strip(), stripLeading(), stripTrailing() : métodos que removem espaços em branco da string
strip() e trim() removem espaços do início e fim de uma string
stripLeading() remove espaço do início da string
stripTrailing() remove espaço do final da string
strip, stripleading e striptrailing foram adicionados no java11!

String strip()
String stripLeading()
String stripTrailing()
String trim()
*/

        System.out.println("abc".strip()); // abc
        System.out.println("\t  a b c".strip()); // a b c

        String texto = " abc\t ";
        System.out.println(texto.trim().length()); // 3
        System.out.println(texto.strip().length()); // 3
        System.out.println(texto.stripLeading().length()); // 5
        System.out.println(texto.stripTrailing().length()); // 4

        System.out.println("################");

/* intern() : retorna o valor do pool da string se ele estiver lá. Caso contrário, ele adiciona o valor ao pool da string
String intern()
*/

    }
}
