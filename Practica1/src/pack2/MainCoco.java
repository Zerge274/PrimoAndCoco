package pack2;

public class MainCoco {

	public MainCoco() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THE_COCO miMonstruo = new THE_COCO("verde", "amarillos", "chuecos", true);
		miMonstruo.mostrar_Color();
		miMonstruo.colmillos();
		miMonstruo.cuernos();
		miMonstruo.nariz();
		
		
		LA_COCO tuMonstruo = new LA_COCO ("morado", "blancos", "chicos", true);
		tuMonstruo.mostrar_Color();
		tuMonstruo.colmillos();
		tuMonstruo.cuernos();
		tuMonstruo.nariz();
		
		

	}

}
