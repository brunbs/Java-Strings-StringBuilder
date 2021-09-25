/* Uma String é uma sequencia de caracteres
A classe String é especial pois ela não precisa do new após o = para criar um objeto do tipo String
    String nome = "Bruno";

    nome é uma variável com uma referência para o objeto criado

    A classe String implementa uma interface chamada de CharSequence

*/


public class CriandoManipulandoStrings {

    public static void main(String[] args) {

/* Concatenação
    Juntar duas strings, por exemplo: "1" + "2" = "12"
*/

        System.out.println(1 + 2); // 3 pois é uma adição de números
        System.out.println("a" + "b"); // ab pois é uma concatenação
        System.out.println("a" + "b" + 3); //ab3
        System.out.println(1 + 2 + "c"); //3c
        System.out.println("c" + 1 + 2); //c12

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //64

        String s = "1";
        s += "2"; // 12
        s += 3; //123
        System.out.println(s); //123

        System.out.println("###################");

/* Imutabilidade
    Assim que um objeto do tipo String é criado, ele não pode mais mudar, ou seja, não pode aumentar, diminuir ou mudar seus carcteres


*/

    }
}
