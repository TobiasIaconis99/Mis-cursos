package dominio;

public class principal {

	public static void main(String[] args) {
		
		//articulo articulo = new articulo();
		articulo articulo = new articulo("Coca");
		System.out.println(articulo.toString());
		
		articulo articulo2 = new articulo("Papas");
		System.out.println(articulo2.toString());
		
		articulo articulo3 = new articulo("Alfajores");
		System.out.println(articulo3.toString());
		
		articulo articulo4 = new articulo("Gomitas");
		System.out.println(articulo4.toString());
		
		articulo articulo5 = new articulo("Caramelos");
		System.out.println(articulo5.toString());

	}

}
