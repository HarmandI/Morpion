package isaHarmand.morpion;

import java.util.Random;
import java.util.Scanner;

public class Programme {

	
	Boolean gagnant = false;
	int cases;
	char X = 'X';
	char O = 'O';
	Scanner scan = new Scanner(System.in);
	char joueurActuel;
	String saisir;
	// Dessiner une grille
	char[] grid = { '1', '2', '3', '4', '5', '6', '7', '8', '9', };

	public void montrerLaGrille(char[] grid) {
		System.out.println("[" + grid[0] + '|' + grid[1] + '|' + grid[2] + ']');
		System.out.println("[" + grid[3] + '|' + grid[4] + '|' + grid[5] + ']');
		System.out.println("[" + grid[6] + '|' + grid[7] + '|' + grid[8] + ']');
		System.out.println("");
	}

	public void gagnant(char[] grid, char joueurActuel) {
		montrerLaGrille(grid);
		System.out.println("Le joueur qui a les " + joueurActuel + " a gagné!");

	}

	public void isGagnant() {
		
		// Vérifier s'il y a 3 elements alignés en vertical horizontal ou diagonale
		// On verifie les lignes
		for (int i = 0; i < 3; ++i) {
			if (grid[i * 3 + 0] == joueurActuel && grid[i * 3 + 1] == joueurActuel && grid[i * 3 + 2] == joueurActuel)
				gagnant = true;
				gagnant(grid, joueurActuel);
				break;
		}

		// on verifie les colonnes
		for (int i = 0; i < 3; i++) {
			if (grid[i] == joueurActuel && grid[i + 3] == joueurActuel && grid[i + 6] == joueurActuel)
				gagnant = true;
				gagnant(grid, joueurActuel);
				break;
		}

		// on verifie 1ere diagonale
		for (int i = 0; i < 3; ++i) {
			if (grid[0] == joueurActuel && grid[4] == joueurActuel && grid[8] == joueurActuel)
				gagnant = true;
				gagnant(grid, joueurActuel);
				break;
		}

		// on verifie 2eme diagonale
		for (int j = 0; j < 3; ++j) {
			if (grid[2] == joueurActuel && grid[4] == joueurActuel && grid[6] == joueurActuel)
				gagnant = true;
				gagnant(grid, joueurActuel);
				break;
		}

		// si toutes les cases sont pleines et qu'iln'y a pas 3 pions d'alligné match
		// nul
		for (int k = 0; k < 8; ++k) {
			if (grid[k] == X || grid[k] == O)
				gagnant = true;
				System.out.println("Match nul!!");
				break;
		}

		
	}
		
	

	public Programme() {

		// début du jeu

// tirer au hazard quel joueur commence
		char nom[] = { this.O, this.X };
		Random tirage = new Random();
		int n = tirage.nextInt(nom.length);
		joueurActuel = nom[n];
		System.out.println("Le joueur qui joue est " + nom[n]);

		// imprimer la grille

	do {	montrerLaGrille(grid);
		// le joueur 1 choisit une case : entre 1 et 9 et non cochée.
		// si caractere incorrect reposer la question
		while (true) {
			System.out.print(joueurActuel + " choisis un numéro de case libre entre 1 et 9");
			saisir = scan.nextLine();
			try {
				cases = Integer.parseInt(saisir);
				if (cases >= 1 && cases <= 9 && grid[cases - 1] != X && grid[cases - 1] != O)
					break;
			} catch (Exception e) {

			}
		}
		// Mettre le bon caractere dans la case choisie
		grid[cases - 1] = joueurActuel;

		isGagnant();
	}

	while(gagnant == false); // si non demander à l'autre joueur de choisir une case libre
			if (joueurActuel == X)
				joueurActuel = O;
			else
				joueurActuel = X;
		
	}	

	/**
	 * Main
	 */
	public static void main(String[] args) {
		/** TODO Auto-generated method stub */	/**TODO Auto-generated method stub*/
			Programme programme = new Programme();
		}}	

		
	
		
	
	

	
	


