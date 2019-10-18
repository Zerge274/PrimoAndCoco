package pack1;

public class Main_Numero{
	
	//static Main_Numero numPrimo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Numero miNumero=new Numero();
		
		miNumero.lector1();
		miNumero.determinar_si_es_Par();
		miNumero.determinar_Primo();
		
		miNumero.mostrar_todo();
		
		
		Numero otroNumero = new Numero();
		otroNumero.lector2();
		otroNumero.determinar_si_es_Par();
		otroNumero.determinar_Primo();
		
		otroNumero.mostrar_todo();
		

	}

}
