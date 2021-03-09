// Um número primo é aquele que é divisível apenas por 1 e por ele mesmo. Nesse caso, ser divisível é ter o resto
// da divisão inteira resultando em zero, ou seja, dividir um número sem gerar vírgula. Por exemplo, o número 5 pode
// ser dividido apenas por 1 e por ele mesmo: 5 / 1 = 5, resto 0;Por exemplo, o número 5 pode
// ser dividido apenas por 1 e por ele mesmo: 5 / 1 = 5, resto 0; e 5 / 5 = 1, resto 0. Faça um programa em Java que
// imprima na tela os 15 primeiros números primos existentes.
//ok


public class Ex7 {
    public static void main(String[] args) {
        int  primo=0;
        int contador = 1;
    
        for (int i=1; contador<=15; i++) {

            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println(contador + ")"  +" " + i);
                contador++;

            }

            primo = 0;
        }
        System.out.println(" fim ");
        
    }
}