/*Depois de seis filhas, o sétimo filho será um lobisomem... Assim diz a lenda. Dada uma família com meninas representadas por A
 e meninos representados por B
, na ordem de nascimento, imprima "Sim" (sem as aspas) se houver um lobisomem na família e "Nao" (sem as aspas) se não houver um lobisomem na família. Só haverá um lobisomem se a sétima criança a nascer for um menino e todas as seis crianças anteriores forem meninas.

Input
Na primeira linha, há um inteiro n
 (1 ≤
 n
 ≤
 1000
) representando o número de famílias. Cada uma das n
 linhas seguintes conterá uma string s
 de tamanho m (1 ≤
 m
 ≤
 100
), composta somente por caracteres A
 ou B
 maiúsculos, representando as crianças da família na ordem de nascimento.

Output
Para cada família, imprima "Sim" (sem as aspas) se houver um lobisomem na família e "Nao" (sem as aspas) se não houver um lobisomem na família.

Examples
input
3
BAAAABBBBAAAA
AAAAAAB
AAAAAABAAAA
output
Nao
Sim
Sim
input
1
A
output
Nao
 */
package IICompeticaoFemininaUNB;
import java.util.Scanner;

public class SetimoFilho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Número de famílias

        // Array para armazenar os resultados
        String[] results = new String[n];

        // Loop para processar cada família
        for (int i = 0; i < n; i++) {
            String s = scanner.next(); // String que representa a família

            // Verifica se a sétima criança é um menino (B) e se as seis anteriores são meninas (A)
            if (s.length() >= 7 && s.substring(s.length() - 7).equals("AAAAAAB")) {
                results[i] = "Sim";
            } else {
                results[i] = "Nao";
            }
        }

        // Imprime os resultados após ler todas as entradas
        for (String result : results) {
            System.out.println(result);
        }
    }
}
