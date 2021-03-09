import java.util.Locale;
import java.util.Scanner; //include do C, para ler dados.



public class Aula1 {
	public static void main(String args[]){
		int inteiro  = 10; 
		String nomeCompleto;
		//nome = "Geomar";
		Float vetor[]; 
		Scanner scanner;

		vetor = new Float[5];

		vetor[0] = 3.4f;
		vetor[1] = (float) 3.2;


		nomeCompleto = "Geomar Schreiner";

		inteiro = 30;
		System.out.print(" Vetor\n");
		//vetor.length da o tamanho do vetor
		int i = 0;
		while( i < vetor.length){
			System.out.print(" vet["+i+ "]: " + vetor[i]);
			if (i < (vetor.length-1)){
				System.out.print(", ");
			}
			i++;
		}
		System.out.println(); //linha em branco

		int mes =1;
		 switch (mes){
			case 1 : {
				System.out.println("Janeiro");
				break;
			}
			case 2 : {
				System.out.println("Fevereiro");
				break;
			}
		}
		System.out.println();
		System.out.println("inteiro: " + inteiro);
		System.out.println("Nome: " + nomeCompleto);
		
		System.out.println("vetor[0]: " + vetor[0] + "\n \t , vetor[1]: " + vetor[1]);
		
		scanner = new Scanner(System.in); //ler do teclado.
		scanner.useLocale(Locale.US); //padrão de flutuante é .
		
		System.out.println("Digite um valor: ");
		vetor[vetor.length-1] = scanner.nextFloat(); //no C: scanf("%d", &inteiro)
		scanner.nextLine();


		System.out.println("Vc Digitou: " + vetor[vetor.length-1]);
		
		System.out.print("Digite seu nome: ");
		nomeCompleto = scanner.nextLine(); //fgets 

		System.out.println("Seu nome: "+vetor.toString());
		//scanner.close(); frescurinha

		System.out.println("Somando "+(inteiro+1));

	}

}