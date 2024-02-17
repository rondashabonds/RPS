import java.util.Scanner;
import java.util.Random; 

public class RockPaperScissors {

	public static void main(String[] args) {
		
		while(true){
            int plSelected = 0;  //declaring variables for player selection
            int totalRound = 0; //declaring variables for total number of rounds
            int totalWins = 0;  //declaring variables for player wins
            int totalLoss = 0;  //declaring variables for player losses 
            
            System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");

            Scanner plInput = new Scanner (System.in); //declaring Scanner object for taking in the selection

            while(totalRound < 3) { //we will play total of 3 rounds only, so loop will run for 0, 1 and 2
                System.out.println("Enter \"Rock\", \"Paper\" or \"Scissors\"");
                Random randSel = new Random();
                int COMSelect = 1 + randSel.nextInt(3); //generating random number b/w 1, 2 and 3
                
                int rock1 = 1; //rock's integer representation is 1
                int paper2 = 2; //paper's integer representation is 2
                int scissors3 = 3; //scissor's integer representation is 3
                
                String UserInput =  plInput.next(); //taking input from Player
                if(UserInput.equalsIgnoreCase("Rock"))  {
                    plSelected = 1; //when player has selected rock, then player is assigned to 1
                }
                else if(UserInput.equalsIgnoreCase("Paper")) {
                    plSelected = 2; //when player has selected paper, then player is assigned to 2
                }
                else if(UserInput.equalsIgnoreCase("Scissors")) {
                    plSelected = 3; //when player has selected scissors, then player is assigned to 3
                }

                //basically this below block implies that if we enter input other than rock, paper, or scissor
                if (plSelected > 3 || plSelected < 1) {
                    totalLoss++; //if so, then it'll be counted as player's loss
                    totalRound++; //and round will be incremented
                    System.out.println("Not a valid input! Computer Wins");
                    System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    
                } 
                
                if(plSelected == COMSelect){ //in case of player and COM tie
                    if(plSelected == scissors3){ //checking if tie is b/w scissors
                        System.out.println("Scissors v Scissors! Tie!");
                        totalRound++;
                    }
                    else if(plSelected == rock1){ //checking if tie is b/w rock
                        System.out.println("Rock v Rock! Tie!");
                        totalRound++;
                    }
                    else if(plSelected == paper2){ //checking if tie is b/w scipaperssors
                        System.out.println("Paper v Paper! Tie!");
                        totalRound++;
                    }
                    System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");

                }
                if(plSelected == COMSelect){ //in case of player and COM tie
                    if(plSelected == scissors3){ //checking if tie is b/w scissors
                        System.out.println("Scissors v Scissors! Tie!");
                        totalRound++; 
                    }
                    else if(plSelected == rock1){ //checking if tie is b/w rock
                        System.out.println("Rock v Rock! Tie!");
                        totalRound++; 
                    }
                    else if(plSelected == paper2){ //checking if tie is b/w scipaperssors
                        System.out.println("Paper v Paper! Tie!");
                        totalRound++;
                    }
                    System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    
                }
                
              //Now for each condition and combinations
                if(plSelected == scissors3) //if player selects scissors
                    if(COMSelect == paper2){ //and COM have paper
                        System.out.println("Scissors v Paper! Player Wins!");
                        totalWins++;
                        totalRound++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }                           
                    else if(COMSelect == rock1){ //and COM have rock
                        System.out.println("Scissors v Rock! Computer Wins!");
                        totalLoss++;
                        totalRound++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                        
                    }
              //if player selects rock
                if(plSelected == rock1) 
                    if(COMSelect == scissors3 ){ //and COM have scissors
                        System.out.println("Rock v Scissors! Player Wins!");
                        totalWins++;
                        totalRound++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }   
                                                //if player selects rock
                    else if (COMSelect == paper2){ //and COM have paper
                        System.out.println("Rock v Paper! Computer Wins!");
                        totalLoss++;
                        totalRound++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
                //if player selects paper
                if(plSelected == paper2)
                    if(COMSelect == rock1){ //and COM have rock
                        System.out.println("Paper v Rock! Player Wins!");
                        totalWins++;
                        totalRound++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
                                                    //if player selects paper
                    else if (COMSelect == scissors3){ //and COM have scissors
                        System.out.println("Paper v Scissors! Computer Wins!");
                        totalLoss++;
                        totalRound++;
                        System.out.println("Player has won " + totalWins + " times and the Computer has won " + totalLoss + " times");
                    }
            }

            //Printing final results
            if(totalWins > totalLoss){ //checking if total wins is greater that total loss
                System.out.println("The Player Wins!"); //if so, print win results
            }
            else if(totalLoss > totalWins){ //checking if total wins is smaller that total loss
                System.out.println("The Computer Wins!"); //if so, print loss results
            }
            
            System.out.println("Play again? \"Yes\" or \"No\""); //Now asking if player wanna play again or not
            Scanner plInput2 = new Scanner(System.in); //scanner for Asking

            String futher = plInput2.next(); //taking input from player

            if(futher.equalsIgnoreCase("yes")) //if yes
            {
                System.out.println("\n");
                main(null); //calling main method to start the program again
            }
            else if(futher.equalsIgnoreCase("no")) //if no
            {
                System.out.println ("Goodbye!"); //print last message
                System.exit(0); //terminating the program
            }
            
        }    
    }

                
          

		// TODO Auto-generated method stub

	}


