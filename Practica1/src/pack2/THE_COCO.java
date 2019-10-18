package pack2;
// ========= El Coco ======

public class THE_COCO implements Monstruo{
		// Definicion de atributos
	boolean nariz;
	String color;
	String dientes;
	String cuernos;
		// boolean hambriento;
		// Definicion de los metodos
	
	
	THE_COCO (String w, String x, String y, boolean z){
		
		color = w;
		dientes = x;
		cuernos = y;
		nariz = z;
	}   //se llama igual 	que la clase por que es metodo constructor
	
	void mostrar_Color(){
		System.out.println("Soy un coco de color " +color);
		//System.out.println("y soy bien machote >:D!");
		//System.out.println("---------------------");
	}
	
	public void colmillos() {
		System.out.println("con grandes colmillos "+dientes);
		
	}
	public void cuernos() {
		System.out.println("cuernos "+cuernos);
		
	}
	public void nariz() {
		if (nariz == true)
		System.out.println("y mi nariz es grande >:D!");
		else System.out.println("pero mi nariz es chica :'c ");
		System.out.println("---------------------");
	}
	
	
	
	
	

}
