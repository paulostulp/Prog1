package Lista_01;
// 9) Resolva a questão 7) sem utilizar operadores de divisão ( / ) e multiplicação ( * ). Você pode utilizar apenas soma
//  e subtração.
//
public class Ex9 {

    public static void main(String[] args) {
        int  primo=0;
        int contador = 1;
        int soma = 1;
        int num=1;
        int j;
    
        for (int i=1; contador<=15; i++) {  //contagem dos numeros primos

            for (j=1; j<=i; j++) {      // i = numero que esta sendo testado para ver se é primo
                 
                while (soma < 10) {
                    
                    soma = soma + num;
                    System.out.println("primo" +soma);                    
                }               
            }
            if (soma == 10 ) {
                System.out.println(contador + ")"  +" " + i);
                contador++;

            }

            primo = 0;
        }
        System.out.println(" fim ");
        
    }
}