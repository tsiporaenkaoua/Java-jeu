

import java.util.Scanner;

public class Jeu {
	
	/**
	 * Point d'entrée du programme
	 * @param args
	 */
	
  public static void main(String[] args) {
    boolean replay=true;
    while(replay) {
    	replay=jeu();
    }
  }

  /**
   * Méthode principale du jeu
   * 
   * @return true si l'utilisateur veut rejouer
   */
	public static boolean jeu(){
	  int counter=0;
	  int numberGame = randomNumber();
	  Scanner sc = new Scanner(System.in);
	  String message="";
	  String[] messageTooHigh = {"Too high!", "The number is lower", "Take another try, it's too high","Decrease your number","Too bad, the number was lower"};
	  String[] messageTooLow = {"Too low!", "The number is higher", "Take another try, it's too low","Increase your number","Too bad, the number was higher"};
	  
	  while(counter<5) {
		System.out.println("Devinez le nombre : ");
	    //penser a gerer l'erreur qd numberGame n'est pas un chiffre************************
		  int numberUser = sc.nextInt();
		  
		  if(numberGame==numberUser){
		    message= "Félicitation! Vous avez trouvé le nombre !";
		    System.out.println(message);
		    return askForReplay(sc);
		  }else {
			  counter++;
			  if(numberGame<numberUser){
				 message = messageTooHigh[counter-1];
			  }else{
		    	 message = messageTooLow[counter-1]; 
			  }
			  System.out.println(message);
		  }  
	  }
	  System.out.println("Désolé, vous n'avez pas trouvé le nombre. La réponse était : "+ numberGame);
	  return askForReplay(sc);
	}
   
  
	/**
	 * Demande à l'utilisateur s'il veut rejouer
	 * @param sc Le scanner pour la saisie de l'utilisateur
	 * @return true si l'utilisatuer veur rejouer, false sinon.
	 */
	public static boolean askForReplay(Scanner sc) {
		 System.out.println("Voulez vous rejouer? oui=0 / non=1");
		  int game = sc.nextInt();
		  return (game==0);
	}

   //Génération d'un nombre entre 1 et 100 aléatoirement
  public static int randomNumber(){
     return (int)(Math.random()*100);
  }

   
  } 