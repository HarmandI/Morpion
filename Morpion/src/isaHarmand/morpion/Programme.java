package isaHarmand.morpion;

import java.util.Random;
import java.util.Scanner;

public class Programme {

	public void montrerLaGrille(char[]grid) {
		System.out.println("["+ grid[0]+'|'+grid[1]+'|'+grid[2]+']');
		System.out.println("["+ grid[3]+'|'+grid[4]+'|'+grid[5]+']');
		System.out.println("["+ grid[6]+'|'+grid[7]+'|'+grid[8]+']');
	}
	
	public void gagnant(char[]grid,char joueurActuel) {
		montrerLaGrille(grid);
		 System.out.println("Le joueur qui a les "+joueurActuel+"a gagné!");
	}
	
	Scanner scan=new Scanner(System.in);
	char joueurActuel;

	String joueur1;
	String joueur2;
	Boolean gagnant= false;
	char cases;
	char X;
	char O;

	//Dessiner une grille
	char[]grid= 
	{'1','2','3',
	'4','5','6',
	'7','8','9',
	};

	//Saisir les noms des 2 joueurs
	public Programme() {
		joueur1= joueur();
		joueur2=joueur();
	
					
 // début du jeu
		
		public String joueur(){
		System.out.println("Quel est ton pseudo?");
		Scanner scanner=new Scanner(System.in);
		return scanner.next();
		System.out.println("Bonjour "+joueur1 +" et "+ joueur2+"!");
		
// tirer au hazard quel joueur commence
	String nom[]= {joueur1,joueur2};
	Random tirage=new Random();
	int n=tirage.nextInt(nom.length);
	joueur1=nom[n];
	joueurActuel=X;
	
	System.out.println("Le joueur qui commence est "+nom[n]);
	System.out.println("Tu joues avec les X");
	System.out.println("Choisis une case libre entre 1 et 9");
		
		//imprimer la grille
		
	montrerLaGrille(grid);
			// le joueur 1 choisit une case : entre 1 et 9 et non cochée.
				// si caractere incorrect reposer la question	 
		
			
			while (true) {
				System.out.print(joueurActuel+ " choisis un numéro de case libre entre 1 et 9");
				String cocher=scan.nextLine();
				try {
					cases =(char) Integer.parseInt(cocher);
					if ((1<=cases) 
					&& (cases<=9) 
					&& (grid[cases-1]!=X) 
					&& (grid[cases-1]!=O));
					break;
				}catch (Exception cases) {
				}
				
			}
			//Mettre le bon caractere dans la case choisie
			grid[cases-1]=joueurActuel;
			
			//Vérifier s'il y a 3 elements alignés en vertical horizontal ou diagonale
				//On verifie les lignes
					for(int i=0;i<3;++i){
	                if (grid[i*3+0]==joueurActuel
	                && grid[i*3+1]==joueurActuel
	                && grid[i*3+2]==joueurActuel)
	                gagnant=true;
	            }
				 if (gagnant){
					 gagnant(grid, joueurActuel);
					 break;
				 }
		           
		            //on verifie les colonnes
	             	for(int i=0;i<3;++i){
	                if (grid[i]==joueurActuel
	                && grid[i+3]==joueurActuel
	                && grid[i+6]==joueurActuel)
	                gagnant=true;
	            }
	            if (gagnant){
	            	 gagnant(grid, joueurActuel);
	            	 break;
	            }
	           
	            //on verifie 1ere diagonale
	            	for(int i=0;i<3;++i){
	                if (grid[0]==joueurActuel
	                && grid[4]==joueurActuel
	                && grid[8]==joueurActuel) {
	                gagnant(grid, joueurActuel);
		            break;
		 }
				
				//on verifie 2eme diagonale
	                for(int j=0;j<3;++j){
	                if (grid[2]==joueurActuel
	                && grid[4]==joueurActuel
	                && grid[6]==joueurActuel) {
	                gagnant(grid, joueurActuel);
		            break;
        }
	             // si toutes les cases sont pleines et qu'iln'y a pas 3 pions d'alligné match nul
					for (int k=0;k<9;++k){
						if (grid[k]==X || grid[k]==O)
						System.out.println("Match nul!!");
					break;		}	
				
        

			  }
					// si non demander à l'autre joueur de choisir une case libre
	                if(joueurActuel==X)
	                    joueurActuel=O;
	               else 
	               {joueurActuel=X;
	               }
	             
					
					
			// veux tu rejouer?
					//si oui on redemarre une partie
					//si non Au revoir 
	                scanner.close();
	            	}	}}
		/**
	 * Main
	 */
public static void main(String[] args) {
	/**TODO Auto-generated method stub*/
			Programme morpion=new Programme();
		}	
	

	
}

		
	
		
	
	

	
	


