package IICompeticaoFemininaUNB;

import java.util.Scanner;

/*O rei quer identificar os lobisomens nos seus domínios a fim de proteger seus súditos. Sabe-se que em cada cidade há, no máximo, um lobisomem, que lobisomens sempre mentem e que os súditos sempre falam a verdade. Em cada cidade do reino, um emissário entrevista cada um das n
 pessoas que lá residem. A resposta é sempre de uma das seguinte maneiras:

1
 x
 - a pessoa entrevistada acusa a pessoa de índice x
 de sempre falar a verdade
2
 x
 - a pessoa entrevistada acusa a pessoa de índice x
 de sempre mentir
Dados o número de habitantes de uma cidade e as respostas de cada entrevistado, encontre quem é o lobisomem ou identifique que não há lobisomens na cidade. Sempre será possível identificar se há ou não lobisomem e, havendo, quem ele é. Ou seja, nunca haverá um caso de teste em que duas pessoas acusam uma à outra sem alguma forma de desempate ou em que somente um dos entrevistados acusa alguém de mentir. Se não há evidências de que há um lobisomem na cidade, é porque não há nenhum lobisomem. Veja as notas para mais detalhes.

Input
A primeira linha de entrada contém um inteiro n
 (1≤n≤105)
 representando a quantidade de pessoas de uma determinada cidade. As próximas n
 linhas contém 2 inteiros q
 e x
, separados por espaço, representando, respectivamente, a maneira que o súdito vai responder à pergunta (q=1
 ou q=2
) e o índice do habitante sobre o qual ele está falando (1≤x≤n)
.

Output
Apresente o índice do habitante que é um lobisomem, se houver, ou -1 caso contrário.

Examples
input
4
1 1
1 2
2 1
2 1
output
1
input
3
1 1
1 1
1 1
output
-1
Note
No primeiro exemplo, 1 diz que 1 (ele mesmo) fala a verdade, 2 diz que 2 (ele mesmo) fala a verdade e 3 e 4 dizem que 1 mente. Assim, o lobisomem é a pessoa 1 (1 disse que ele mesmo fala a verdade, mas, como ele é o lobisomem, essa afirmação é uma mentira, ou seja, 1 mente).

No segundo exemplo, todos afirmam que 1 fala a verdade. Como não há nenhuma evidência de lobisomem, conclui-se que não há nenhum lobisomem nessa cidade.

Alguns casos de teste que nunca vão existir:

Duas pessoas acusando uma à outra de mentir (não tem como saber qual fala a verdade porque não tem ninguém para desempatar):
2

2 2

2 1

Somente uma pessoa acusando alguém de mentir:
2

1 1

2 1

Duas possibilidades:

Se o 2 fala a verdade, então o 1 mente
Se o 1 mente, então o 1 mente

Se o 2 mente, então o 1 fala a verdade
Se o 1 fala a verdade, então o 1 fala a verdade

É possível que 1 seja o lobisomem, mas também é possível que 2 seja o lobisomem. Como é ambíguo quem é o lobisomem, casos assim nunca vão ser dados como input.
Mais de um lobisomem ou contradição
3

2 3

1 2

2 2

Duas possibilidades:

Se o 1 mente, então o 3 fala a verdade
Se o 3 fala a verdade, então o 2 mente

Se o 2 mente, então o 2 fala a verdade (contradição)

Se o 1 fala a verdade, então o 3 mente
Se o 3 mente, então o 2 mente

Se o 2 mente, então o 2 mente (mais de um lobisomem)

Alguém acusando a si mesmo de mentir:
1

2 1

 */
public class Lobisomens {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(); // Número de habitantes da cidade
        int[] falandoAVerdade = new int[n + 1]; // Array para acompanhar quem fala a verdade
        
        for (int i = 1; i <= n; i++) {
            int q = input.nextInt(); // Tipo de resposta (1 ou 2)
            int x = input.nextInt(); // Índice da pessoa mencionada
            
            if (q == 1) {
                falandoAVerdade[i] = x; // Pessoa i diz que a pessoa x fala a verdade
            }
        }
        
        int lobisomem = -1; // Inicialmente não sabemos quem é o lobisomem
        
        for (int i = 1; i <= n; i++) {
            if (falandoAVerdade[i] != 0) {
                int acusado = falandoAVerdade[i]; // Quem a pessoa i acusa de falar a verdade
                
                if (falandoAVerdade[acusado] != 0 && falandoAVerdade[acusado] != i) {
                    // Pessoa acusada acusa outra pessoa de falar a verdade, o que é uma contradição
                    lobisomem = -1; // Não podemos identificar o lobisomem
                    break;
                }
            }
        }
        
        if (lobisomem != -1) {
            // Verifica se a pessoa que pode ser o lobisomem não acusa ninguém de falar a verdade
            int acusacao = 0;
            for (int i = 1; i <= n; i++) {
                if (falandoAVerdade[i] == lobisomem) {
                    acusacao = i;
                    break;
                }
            }
            if (acusacao == 0) {
                System.out.println(lobisomem);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }
}
