// Faça um programa em Java que imprima na tela a tabuada do número 5 no seguinte formato:
// 1 x 5 = 5
// programação 1
// OK


class  Ex3
{
    public static void main(String[] args) 
    {
        int entrada = 5;       
        int multiplicador = 0;

        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
             System.out.println(multiplicador  +" X " + "5" + " = " + resultado );          
            multiplicador++;
        }
    }
}