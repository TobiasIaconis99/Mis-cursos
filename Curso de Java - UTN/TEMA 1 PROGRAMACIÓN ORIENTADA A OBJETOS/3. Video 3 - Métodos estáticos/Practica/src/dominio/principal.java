package dominio;

public class principal {

	public static void main(String[] args) {
		
		//articulo articulo = new articulo();
		//articulo articulo1 = new articulo("Coca");
		//System.out.println(articulo1.toString());
		
		//articulo articulo2 = new articulo("Papas");
		//System.out.println(articulo2.toString());
		
		//articulo articulo3 = new articulo("Alfajores");
		//System.out.println(articulo3.toString());
		
		//articulo articulo4 = new articulo("Gomitas");
		//System.out.println(articulo4.toString());
		
		//articulo articulo5 = new articulo("Caramelos");
		//System.out.println(articulo5.toString());
		
		
		articulo [] vArt = new articulo[5];
		vArt[0] = new articulo("Coca");
		vArt[1] = new articulo("Papas");
		vArt[2] = new articulo("Alfajores");
		vArt[3] = new articulo("Gomitas");
		vArt[4] = new articulo("Caramelos");
		
		for (articulo art : vArt) {
			System.out.println(art.toString());
		}
		System.out.println(articulo.devolverProximoId());
		

	}

}
