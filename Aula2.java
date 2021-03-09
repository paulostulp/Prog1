// aula 02 programação 1
// inserir uma classe, declarar uma classe

class Retangulo {
    int base;
    int altura;

    int calculaArea(){
        return base * altura;

    }

    void imprimeDimensoes() {
        System.out.println("base:" + base);
        System.out.println("altura:" + altura);


    }
}


public class Aula2 {

    public static void main(String args[]) {

        Retangulo r = new Retangulo();
        R.base = 3;
        R.altura = 5;

        int area = r.calculaArea();
        System.out.println("Area:" + Area);
        r.imprimeDimensoes();


       

        System.out.println("fim");
       
    }
    
}
