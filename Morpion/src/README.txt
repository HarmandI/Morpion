Morpion:

Règles du jeu :

Pour jouer une partie de morpion, il suffit placer dans une grille de 3 cases*3.
 Le but du jeu est d’aligner avant son adversaire 3 symboles identiques horizontalement, verticalement ou en diagonale.
Chaque joueur a donc son propre symbole:soit X soit O. La partie se termine quand l’un des joueurs à aligner 3 symboles
 ou quand la grille est complétée sans vainqueur. Il y a alors égalité.

Comment gagner une partie de Morpion ?
Le premier joueur a aligner 3 symboles identiques gagne la partie. 
Attention, le joueur qui débute est toujours avantagé pour gagner. 
C'est pour cela que dans ce programme il y a un tirage au sort de celui qui débute la partie.

- description de l’implémentation technique du jeu (algorithmes principaux, modeélisation):

fonctions : 

monterLaGrille => Qui imprime la grille à l'écran
gagnant => qui imprime la grille gagnate et imprime une phrase pour dire qui a gagné 
isGagnant => qui vérifie s'il y a un gagnant qui a aligné 3 symboles à l'horizontal, à la vertical ou en diagonale.

Puis mon programme de jeu : 
* il débute par le tirage au sort du joueur qui commence la partie.
* puis il y a une boucle do / while:
	qui demande au joueur de choisir un numéro de case.
	qui vérifie que la case est libre et la coche avec le symbol en cour (c'est là que mon programme bug la première fois)
	puis vérification que ce tour de jeu soit gagnant, ou qu'il y a match null.
	Si non, le jeu donne la main à l'autre joueur.
	
la notice d’utilisation :

Ce jeu se joue à 2 joueurs.
L'un a les X, l'autre les O.
Puis il faut suivre les indications de l'ordinateur.

- un exemple d’utilisation.

Je n'en ai pas pour le moment car mon code ne fonctionne pas, je dois le debugger et pour l'instant je coince.



		


