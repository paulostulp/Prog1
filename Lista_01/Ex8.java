//8) Seguindo o enunciado da questão 7), faça um programa em Java que imprima na tela os números primos
//existentes entre os números 100 e 200.

public class Ex8 {
    public static void main(String[] args) {
        int  primo=0;
        int contador = 0;
              
    
        for (int i=100; i<=200; i++) {

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