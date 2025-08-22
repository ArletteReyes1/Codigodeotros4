import java.util.Scanner;

public class CodigoDeOtros4 {
	public static void main (String[] args){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s1.nextLine();
		
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		Scanner s2 = new Scanner(System.in);
		String j2 = s2.nextLine();
		
		if(j1 == j2) {
			System.out.println("Empate");
		} else {
			int ganador = 2;
			switch(j1) {
			case "piedra":
				if(j2 == "tijeras") {
					ganador =1;
				}//if
			case "papel":
				if(j2 == "piedra") {
					ganador = 1;
				}
			case "tijeras":
				if(j2 == "papel") {
					ganador =1;
				}
				break;
				default:
					ganador = 2;
			}//switch
			System.out.println("Gana el jugador: " +ganador);
		}//else
		
		
	    
	}//main

}//Class CodigodeOtros

