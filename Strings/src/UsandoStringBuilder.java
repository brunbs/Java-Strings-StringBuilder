/* StringBuilder
  cria uma string mutável
  ao ser utilizada ela não cria cópias dos objetos, como ocorre quando trabalhamos com String
  então fazer encadeamento de métodos não cria vários novos objetos, e sim a StringBuilder muda e retorna uma referência dela mesma
*/

public class UsandoStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"

// Construindo StringBuilders

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10); //este monta com uma capacidade

// MÉTODOS

/* charAt(), indexOf(), length(), substring()
Funcionam exatamente como na classe String
*/

        StringBuilder sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb.indexOf("a"), sb4.indexOf("al")); // anim
        int len = sb4.length(); // 7
        char ch = sb4.charAt(6); // s
        System.out.println(sub + " " + len + " " + ch); // "anim 7 s"

/* append() : adiciona o parâmetro para o stringBuilder e retorna uma referencia a esse stringbuilder
        StringBuilder append(String str)

   insert() : adiciona caracteres aos StringBuilder no índice fornecido e retorna uma referência do próprio StringBuilder
        StringBuilder insert(int offset, String str)
        Offset é o indice em que queremos inserir o parâmetro
*/

        StringBuilder sb5 = new StringBuilder("animals");
        sb5.insert(7, "-"); // animals-
        sb5.insert(0, "-"); // -animals-
        sb5.insert(4, "-"); // -ani-mals-
        System.out.println(sb5);

        System.out.println("#################");


/* delete() e deleteCharAt() :
delete() remove caracteres da sequência fornecida (índice de inicio e de fim) e retorna referencia ao próprio StringBuilder
deleteCharAt() para deletar apenas um caractere
    StringBuilder delete(int startIndex, int endIndex)
    StringBuilder deleteCharAt(int index)
*/
        StringBuilder sb6 = new StringBuilder("abcdef");
        sb6.delete(1,3); // sb6 = adef   // delete a partir do indice de inicio e termina LOGO ANTES do indice de termino, ou seja, ele não é incluído
        System.out.println(sb6.toString());
        // sb6.deleteCharAt(5); // StringIndexOutOfBoundsException

/* replace()
    StringBuilder replace(int startIndex, int endIndex, String newString)

*/
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty

        StringBuilder builder2 = new StringBuilder("pigeon dirty");
        builder2.replace(3, 100, "");
        System.out.println(builder2); // pig

/*  reverse() : inverte a sequência de caracteres e retorna uma referência para o próprio StringBuilder
    StringBuilder reverse()
*/
        StringBuilder sb7 = new StringBuilder("ABC");
        sb7.reverse();
        System.out.println(sb7); // CBA

/* toString() : converte uma StringBuilder em uma String
    String toString()
*/

        StringBuilder sb8 = new StringBuilder();
        String s = sb8.toString();

    }
}
