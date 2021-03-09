//10) Resolva a questão 8) sem utilizar operadores de divisão ( / ) e multiplicação ( * ). Você pode utilizar apenas
//soma e subtração.

public class Ex10 {
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