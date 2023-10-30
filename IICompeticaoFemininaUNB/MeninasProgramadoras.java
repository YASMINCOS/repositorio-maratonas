package IICompeticaoFemininaUNB;
/*As meninas super programadoras estão a todo vapor! Laryssa, Vanessa e Priscila estão treinando todos os dias na plataforma bodegorces (é um juíz online novo), e elas estão fervendo!

Visando criar novas dinâmicas entre o time e potencializar o desempenho, Priscila inventou uma competição interna entre Laryssa e Vanessa.

Começando do rating zero, Vanessa e Laryssa farão exercícios iguais ao mesmo tempo.

se Vanessa terminar o exercício antes de Laryssa, o rating de Vanessa a
 será acrescido de k
 unidades, enquanto o rating de Laryssa b
 será decrescido de k
 unidades;
se Laryssa terminar o exercício antes de Vanessa, o rating de Laryssa b
 será acrescido de k
 unidades, enquanto o rating de Vanessa a
 será decrescido de k
 unidades;
se ambas terminarem o exercício ao mesmo tempo, o rating de Vanessa a
 e o rating de Laryssa b
 será acrescido de k
 unidades.
Note que os ratings a
 e b
 podem alcançar valores negativos.

Sabendo que Vanessa quer chegar no rating c
 e Laryssa quer chegar no rating d
 (os ratings c
 e d
 dão uma corzinha nova na handle delas!), e que cada questão gera um k
 diferente para se somar ou subtrair, defina a menor quantidade de exercícios que Laryssa e Vanessa terão que fazer para que seus ratings sejam os desejáveis.

Input
Cada teste contém t
 casos de teste (1≤t≤104
)

Cada caso de teste contém dois inteiros c
 e d
 (0≤c,d≤109)
, indicando quais são os ratings que Vanessa e Laryssa querem alcançar, respectivamente.

Output
Para cada caso de teste, imprima um único inteiro, que indica qual é o menor número de exercícios que Vanessa e Laryssa terão que fazer para alcançar os ratings que desejam. Caso não seja possível, imprima −1
 (vamos ajudar elas a resolverem outros exercícios depois)

Example
inputCopy
6
1 2
3 5
5 3
6 6
8 0
0 0
outputCopy
-1
2
2
1
2
0
Note
No segundo caso de teste (c=3
 e d=5
), uma solução possível é

O primeiro exercício foi finalizado por Vanessa e Laryssa ao mesmo tempo. Neste exercício, o juíz online somou k=1
 no rating de cada uma, então o rating de Vanessa é c=1
 e o rating de Laryssa é d=1
;
O segundo exercício foi finalizado por Laryssa primeiro, então Laryssa ganhou k=8
 unidades de rating, e Vanessa perdeu k=8
 unidades de rating, deixando c=−7
 e d=9
;
O terceiro exercício foi finalizado por Vanessa primeiro, então Vanessa ganhou k=7
 unidades de rating, e Laryssa perdeu k=7
 unidades de rating, deixando c=0
 e d=2
;
O quarto exercício foi finalizado por Vanessa e Laryssa ao mesmo tempo, então Vanessa e Laryssa ganharam k=3
 unidades de rating cada, deixando c=3
 e d=5
;
 */
import java.util.Scanner;

public class MeninasProgramadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Número de casos de teste

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt(); // Rating desejado de Vanessa
            int d = sc.nextInt(); // Rating desejado de Laryssa
            int result = minimumExercisesToReachRatings(c, d);
            System.out.println(result);
        }
        sc.close();
    }

    static int minimumExercisesToReachRatings(int c, int d) {
        if (c == d) {
            return c == 0 ? 0 : 1; // Ambos querem o mesmo rating, se c==0, eles não precisam fazer nada, senão precisam de 1 exercício.
        }
        
        int diff = Math.abs(c - d);
        if (diff % 2 == 0) {
            return 2; // Eles podem chegar a seus ratings desejados em 2 exercícios
        } else {
            return -1; // Não é possível alcançar os ratings desejados
        }
    }
}
