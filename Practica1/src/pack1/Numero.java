package pack1;
import java.util.Scanner;

public class Numero extends NumeroNoPrimo{
	// Definicion de atributos
	boolean esPar;
	boolean es_un_NumeroPrimo;
	int valor;
	Scanner lector;
	
	
	// Definicion de los metodos
	
	Numero (){
		lector =new Scanner(System.in);		
	}
	
	
	void determinar_si_es_Par(){
		
		if (valor%2==0) {
			esPar=true;
			noParExample = true;
			}
		else {esPar=false; noParExample = false;}
	}
	
	void mostrar_todo(){
		System.out.println("El numero analizado fue: "+valor);
		System.out.println("El numero es Par?: "+esPar);
		System.out.println("El numero es Primo?: "+es_un_NumeroPrimo);	
		System.out.println("----------------------");
		
	}
	
	void determinar_Primo(){
		int res=0;
		int dif=2; 
		es_un_NumeroPrimo=true;
		noPrimoExample=true;
		if (valor>2){
		do{
			res=valor%dif;
			if(res==0){
				es_un_NumeroPrimo=false;
				noPrimoExample=false;
				
				dif=valor;
			}
			else dif++;	
		}while(dif<valor);	
		
		}
		
		if (noPrimoExample == false)
			System.out.println("El numero dado es un ejemplo de numeros no primos :'v");
		else System.out.println("El numero dado es es un ejemplo de numeros primos :v");

	}


	public void lector1() {
		// TODO Auto-generated method stub
		System.out.println("Dame un numero:");
		valor = lector.nextInt();
		
	}
	public void lector2() {
		// TODO Auto-generated method stub
		System.out.println("Dame otro numero:");
		valor = lector.nextInt();
		
	}

}
