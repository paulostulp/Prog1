//5) Dado o código abaixo, qual a saída do programa na tela? Justifique sua resposta desenhando e explicando a
//representação na memória dos elementos do programa:

class Main {
    public static void main (String[] args) {
    Sprite a = new Sprite(), b = new Sprite();
    a.clona(b);
    b.clona(a);
    b.value = 90 ;
    a.print();
    b.print();
    }
    }
    class Sprite {
    double value;
    int id;
    void print () {
    printPrefix( "Sprite " );
    }
    void printPrefix (String p) {
    System.out.println(p + value + ", " + id);
    }
    void clona (Sprite s) {
    Sprite h = new Sprite();
    h.value = 2 ;
    h.id = 3 ;
    s = h;
    id = h.id;
    h.print();
    }
    }




public class L2_ex5 {
    
}
