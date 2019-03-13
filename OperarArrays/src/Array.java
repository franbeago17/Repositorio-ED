
public class Array {

	public static void main(String[] args) {
	}
	
	public static void rellenaArray() {
		int array[] = new int[10];
		
		
		for (int i = 0; i < array.length; i++) {
			int numAleat = (int) Math.round(Math.random()*20);
			array[i] = numAleat;
			System.out.print(array[i]+"  ");
		}
	}
	
public static void nuevoMetodo2() {
		System.out.println("Nuevo Metodo 2");
}
	public static void nuevoMetodo1() {
		System.out.println("Nuevo metodo 1");

	}

}
