/*Vinícius adora apostar e convenceu seu amigo Guilherme a apostar também. Porém, Vinícius já tem muita experiência, enquanto Guilherme está começando agora. Guilherme quer apostar contra o Vinícius, mas precisa da sua ajuda para saber se vai ganhar ou não.

Vinícius pensou em um número A
 e Guilherme pensou em um número B
. Guilherme ganhará a aposta somente se o seu número for estritamente maior que o do Vinícius. Ajude Guilherme a determinar se irá ganhar ou não.

Input
A entrada consiste de dois inteiros separados por um espaço A
 e B
 (1<=A,B<=100)
, indicando os números pensados por Vinícius e Guilherme, respectivamente.

Output
Imprima "YES" (sem aspas duplas) caso Guilherme ganhe a aposta ou "NO" (sem aspas duplas) caso contrário.

Examples
input
10 15
output
YES
input
30 30
output
NO
input
8 2
output
NO */
package IICompeticaoFemininaUNB;

import java.util.Scanner;

public class Aposta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (b > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
