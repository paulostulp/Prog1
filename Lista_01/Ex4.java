//Faça um programa em Java que imprima na tela a tabuada do número 6 e do número 2, lado a lado, no seguinte formato:
// 1 x 6 = 6 1 x 2 = 2
// 2 x 6 = 12 2 x 2 = 4
//ok


class  Ex4
{
    public static void main(String[] args) 
    {
        int mult1 = 6, mult2 = 2;       
        int multiplicador = 0;

        while(multiplicador <= 10)
        {
            int reslt6 = mult1 * multiplicador;
            int reslt2 = mult2 * multiplicador;
             System.out.println(multiplicador  +" X " + "6" + " = " + reslt6 + "       "  +multiplicador  +" X " + "2" + " = " + reslt2 );          
            multiplicador++;
        }
    }
}