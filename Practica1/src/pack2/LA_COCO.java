package pack2;

public class LA_COCO implements Monstruo{
		// Definicion de atributos
		boolean nariz;
		String color;
		String dientes;
		String cuernos;
			// boolean hambriento;
			// Definicion de los metodos

	public LA_COCO(String j, String k, String l, boolean m) {
		// TODO Auto-generated constructor stub
		color = j;
		dientes = k;
		cuernos = l;
		nariz = m;
	}
	
	void mostrar_Color(){
		System.out.println("Soy una coco de color " +color);
		//System.out.println("y soy bien machote >:D!");
		//System.out.println("---------------------");
	}
	
	public void colmillos() {
		System.out.println("con pequeños colmillos "+dientes);
		
	}
	public void cuernos() {
		System.out.println("cuernos "+cuernos);
		
	}
	public void nariz() {
		if (nariz == true)
		System.out.println("y mi nariz es pequeña uwu");
		else System.out.println("y mi nariz es grande y fea :'c ");
		System.out.println("---------------------");
	}

}
