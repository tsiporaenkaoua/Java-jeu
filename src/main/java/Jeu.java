

import java.util.Scanner;

public class Jeu {
	
  public static void main(String[] args) {
    jeu();
    replay();
  }

  
	public static void jeu(){
		int counter=0;
	// Création de la saisie de l'utilisateur	
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
		    break;
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
    
	}
   
  
	//Demande à l'utilisateur s'il veur rejouer
	public static void replay() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Voulez vous rejouer? oui=0 / non=1");
		  int game = sc.nextInt();
		  if(game==0) {
			  jeu();
		  }else {
			  System.out.println("Au plaisir de vous revoir!");
		  }
	}

   //Génération d'un nombre entre 1 et 100 aléatoirement
  public static int randomNumber(){
     int random = (int)(Math.random()*100);
    return random;
  }

   
  } 