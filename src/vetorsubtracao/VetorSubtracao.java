
package vetorsubtracao;

import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class VetorSubtracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vetorA[] = new int[2];
        int vetorB[] = new int[2];
        int posicao=1,posicao1=1,posicaofinal=2,contFor=0;    
        
        Scanner lerNumero = new Scanner(System.in);
        
        System.out.println("Vetor A\n");
            for(int contador=0;contador < 2;contador++){
        
            System.out.println("Digite o "+posicao+" numero: ");
            vetorA[contador] = lerNumero.nextInt();
            posicao++;
    }
         System.out.println("Vetor B\n");
             for(int contador=0;contador < 2;contador++){
        
            System.out.println("Digite o "+posicao1+" numero: ");
            vetorB[contador] = lerNumero.nextInt();
            posicao++;
                 //System.out.println(vetorB.length);
        }
             
             for(int contadorFor=0;contadorFor < 2;contadorFor++){
                 double valorSubtracao = vetorA[contadorFor] - vetorB[posicaofinal-1];
                 System.out.println("VetorA "+vetorA[contadorFor]+" - "+vetorB[posicaofinal-1]+" = "+valorSubtracao);
             }
    }
    
}
