/**
 * 
 */
package model;

import java.util.Scanner;

/**
 * @author Chris
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Choisir nom j1: ");
    	String nom1 = scan.nextLine();
    	System.out.print("Choisir nom j2: ");
    	String nom2 = scan.nextLine();

    	Jeu game = new Jeu(nom1, nom2);
        game.run();
        scan.close();
    }
}
