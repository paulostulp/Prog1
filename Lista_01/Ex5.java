package Lista_01;
// Faça um programa em Java que imprima na tela a seguinte frase:
// 100 Java atrapalham atrapalham ... atrapalham atrapalham muita gente
//2 Java atrapalham atrapalham muita gente
//ok


class  Ex5
{
    public static void main(String[] args) 
    {
        int soma = 1, imprime = 1;      
              
        
        while(soma <= 100)
        {
            System.out.print(soma +"  Java");

                 for (imprime=0;imprime < soma;imprime++)
                {
                    if(soma == 1){
                        System.out.print(" atrapalha ");
                    }
                    else{
                     System.out.print(" atrapalham ");
                    }
                }
            
            System.out.print("muita gente");

            soma++;
            System.out.println("");
        }
    }
}