package IICompeticaoFemininaUNB;
/*Pietra está se mudando para São Carlos, e infelizmente deixará seus amigos maratonistas de Brasília para se tornar uma uspiana. Sabendo disso, seus pais decidiram sediar um evento em seu condomínio, para que os amigos de Pietra pudessem se divertir, lanchar e pintar Pietra com as letras USP, até que ela esteja toda suja!

Estela se prepara para pegar o elevador do condomínio, já que a festa será dada no salão de eventos que se encontra no andar k
 (esse condomínio é meio maluco). Atualmente no andar 1
, e se deparando com dois elevadores, Estela sabe que

o primeiro elevador está no andar a
 (ninguém fez um pedido de mobilidade, então ele está parado),
o segundo elevador está no andar b
, e está indo para o andar c
 (b≠c
)  — é importante ressaltar que, se este elevador estiver inicialmente no andar 1
 (b=1
), Estela não conseguirá pegá-lo, pois ele já terá saído do andar quando Estela conseguir alcançá-lo
Se você chamar o primeiro elevador, ele começará a se deslocar ao andar 1
. Contudo, ao chamar pelo segundo elevador, ele passará primeiro pelo andar c
, e só então irá para o andar 1
, levando |x−y|
 segundos para se deslocar de um andar x
 para um andar y
.

Estela recebeu um zap de Pietra, dizendo que a pizza de pera com gorgonzola está acabando (o Quirino gostou muito da pizza)! Ajude Estela a escolher o elevador que virá mais rápido, para que ela não fique sem pizza.

Input
A primeira linha da entrada contém um inteiro t
 (1≤t≤104
) — o número de casos de teste

As t
 linhas seguintes são compostas de três inteiros a
, b
 e c
 (1≤a,b,c≤108
, b≠c
) — o número dos andares descritos no enunciado.

Output
Imprima t
 números, sendo cada saída dada por:

1
, se é melhor chamar o primeiro elevador;
2
, se é melhor chamar o segundo elevador;
3
, se ambos elevadores chegam ao mesmo tempo quando chamados.
Example
inputCopy
3
1 2 3
3 1 2
3 2 1
outputCopy
1
3
2
Note
No primeiro caso de teste, o primeiro elevador já está no andar 1
No segundo caso de teste, os elevadores se movem da seguinte maneira:

Quando Estela chamou os elevadores, o primeiro elevador estava no andar 3
, e o segundo elevador estava no andar 1
, mas Estela não conseguiu alcançá-lo;
1
 segundo após ser chamado, o primeiro elevador estará no andar 2
, e o segundo elevador também estará no andar 2
, podendo, então, descer para o andar 1
;
em 2
 segundos, os dois elevadores estarão no andar 1
No terceiro caso de teste, o primeiro elevador chegará ao andar 1
 em 2
 segundos, enquanto o segundo chegará em 1
 segundo

 */

import java.util.Scanner;

public class Pera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Número de casos de teste

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(); // Andar do primeiro elevador
            int b = sc.nextInt(); // Andar do segundo elevador
            int c = sc.nextInt(); // Andar para onde o segundo elevador está indo

            int result = chooseElevator(a, b, c);
            System.out.println(result);
        }
        sc.close();
    }

    static int chooseElevator(int a, int b, int c) {
        int timeToFirstElevator = Math.abs(a - 1); // Tempo para o primeiro elevador chegar ao andar 1
        int timeToSecondElevator = Math.abs(b - c) + Math.abs(c - 1); // Tempo para o segundo elevador chegar ao andar 1

        if (timeToFirstElevator < timeToSecondElevator) {
            return 1; // Chamar o primeiro elevador
        } else if (timeToFirstElevator > timeToSecondElevator) {
            return 2; // Chamar o segundo elevador
        } else {
            return 3; // Ambos elevadores chegam ao mesmo tempo
        }
    }
}
