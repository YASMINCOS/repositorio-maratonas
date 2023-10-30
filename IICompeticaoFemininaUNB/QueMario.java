package IICompeticaoFemininaUNB;
/*Marco e Polo acabaram de ver o filme novo do Mario e agora ficaram com vontade de zerar o jogo. O jogo do Mario consiste de n
 fases. O problema é que o Marco só consegue passar p
 fases, enquanto o Polo só consegue passar q
 fases. Você recebe os índices das fases que cada um consegue passar. Será que se os dois se juntarem e se ajudarem, eles conseguem zerar juntos o jogo?

Input
A primeira linha contém um único inteiro n
 (1≤n≤100
).

A próxima linha contém um inteiro p
 (0≤p≤n
), seguido de p
 inteiros a1,a2,...,ap(1≤ai≤n)
, que indicam os índices das fases que Marco consegue passar.

A próxima linha contém as fases que Polo consegue passar, no mesmo formato. Considere que as fases são numeradas de 1
 a n
.

Output
Caso Marco e Polo consigam zerar o jogo, imprima em uma única linha "Sou eu, Mario!". Caso eles não consigam zerar o jogo, imprima "Que Mario?" (desconsidere as aspas).

Examples
inputCopy
4
3 1 2 3
2 2 4
outputCopy
Sou eu, Mario!
inputCopy
4
3 1 2 3
2 2 3
outputCopy
Que Mario?
Note
No primeiro exemplo, Marco consegue passar as fases [1 2 3] e Polo consegue passar as fases [2 4], então juntos eles conseguem passar todas as fases.

No segundo exemplo, nenhum dos dois consegue passar a fase 4.

 */
import java.util.Scanner;

public class QueMario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        boolean[] marcoFases = new boolean[n];
        for (int i = 0; i < p; i++) {
            int fase = scanner.nextInt();
            marcoFases[fase - 1] = true;
        }

        int q = scanner.nextInt();
        boolean[] poloFases = new boolean[n];
        for (int i = 0; i < q; i++) {
            int fase = scanner.nextInt();
            poloFases[fase - 1] = true;
        }

        boolean podeZerar = true;
        for (int i = 0; i < n; i++) {
            if (!marcoFases[i] && !poloFases[i]) {
                podeZerar = false;
                break;
            }
        }

        if (podeZerar) {
            System.out.println("Sou eu, Mario!");
        } else {
            System.out.println("Que Mario?");
        }
    }
}

