public class Blackjack{
	public static void main(String[] args){
		
		Double playerOneBalance = 0.00;
		Double playerTwoBalance = 0.00;
		Double playerThreeBalance = 0.00;
		Double playerFourBalance = 0.00;
		Double playerFiveBalance = 0.00;
		Double playerSixBalance = 0.00;
		
		Double playerOneWager = 0.00;
		Double playerTwoWager = 0.00;
		Double playerThreeWager = 0.00;
		Double playerFourWager = 0.00;
		Double playerFiveWager = 0.00;
		Double playerSixWager = 0.00;
		
		//Determine number of players.
		
		System.out.println("Welcome to Blackjack. How many players?");
		int numberOfPlayers = IO.readInt();
			
		while (numberOfPlayers < 1){
			System.out.println();
			System.out.println("Please enter a positive number of players.");
			numberOfPlayers = IO.readInt();
		}
		
		//Retrieve initial balances.
			
		for (int balances = 1; balances <= numberOfPlayers; balances++){
			
			System.out.println();
			System.out.println("Player " + balances + ", please enter your balance.");
				
			if (balances == 1){
				playerOneBalance = IO.readDouble();
					
				if (playerOneBalance < 0){
					System.out.println();
					System.out.println("Please enter a positive balance.");
					playerOneBalance = IO.readDouble();
				}
			}
				
			if (balances == 2){
				playerTwoBalance = IO.readDouble();
					
				if (playerTwoBalance < 0){
					System.out.println();
					System.out.println("Please enter a positive balance.");
					playerTwoBalance = IO.readDouble();
				}
			}
				
			if (balances == 3){
				playerThreeBalance = IO.readDouble();
					
				if (playerThreeBalance < 0){
					System.out.println();
					System.out.println("Please enter a positive balance.");
					playerThreeBalance = IO.readDouble();
				}
			}
				
			if (balances == 4){
				playerFourBalance = IO.readDouble();
					
				if (playerFourBalance < 0){
					System.out.println();
					System.out.println("Please enter a positive balance.");
					playerFourBalance = IO.readDouble();
				}
			}
				
			if (balances == 5){
				playerFiveBalance = IO.readDouble();
					
				if (playerFiveBalance < 0){
					System.out.println();
					System.out.println("Please enter a positive balance.");
					playerFiveBalance = IO.readDouble();
				}
			}
				
			if (balances == 6){
				playerSixBalance = IO.readDouble();
					
				if (playerSixBalance < 0){
					System.out.println();
					System.out.println("Please enter a positive balance.");
					playerSixBalance = IO.readDouble();
				}
			}
		}
		
		// Begin game-play loop.
		
		int dealerValue = 0;
		int playerOneValue = 0;
		int playerTwoValue = 0;
		int playerThreeValue = 0;
		int playerFourValue = 0;
		int playerFiveValue = 0;
		int playerSixValue = 0;
	
		boolean dealerBust = false;
		boolean playerOneBust = false;
		boolean playerTwoBust = false;
		boolean playerThreeBust = false;
		boolean playerFourBust = false;
		boolean playerFiveBust = false;
		boolean playerSixBust = false;
		
		int dealerAces = 0;
		int playerOneAces = 0;
		int playerTwoAces = 0;
		int playerThreeAces = 0;
		int playerFourAces = 0;
		int playerFiveAces = 0;
		int playerSixAces = 0;
		
		double playerOneInsurance = 0.00;
		double playerTwoInsurance = 0.00;
		double playerThreeInsurance = 0.00;
		double playerFourInsurance = 0.00;
		double playerFiveInsurance = 0.00;
		double playerSixInsurance = 0.00;
		
		boolean dealerBlackjack = false;
		boolean playerOneBlackjack = false;
		boolean playerTwoBlackjack = false;
		boolean playerThreeBlackjack = false;
		boolean playerFourBlackjack = false;
		boolean playerFiveBlackjack = false;
		boolean playerSixBlackjack = false;
		
		Card playerOneFirst = new Card(0,0);
		Card playerTwoFirst = new Card(0,0);
		Card playerThreeFirst = new Card(0,0);
		Card playerFourFirst = new Card(0,0);
		Card playerFiveFirst = new Card(0,0);
		Card playerSixFirst = new Card(0,0);
		
		Card playerOneSecond = new Card(0,0);
		Card playerTwoSecond = new Card(0,0);
		Card playerThreeSecond = new Card(0,0);
		Card playerFourSecond = new Card(0,0);
		Card playerFiveSecond = new Card(0,0);
		Card playerSixSecond = new Card(0,0);
		
		boolean playerOneAdvice = false;
		boolean playerTwoAdvice = false;
		boolean playerThreeAdvice = false;
		boolean playerFourAdvice = false;
		boolean playerFiveAdvice = false;
		boolean playerSixAdvice = false;
		
		while (numberOfPlayers != 0){
			
				// Take wagers.
				
				for (int wagers = 1; wagers <= numberOfPlayers; wagers++){
					System.out.println();
					System.out.println("Player " + wagers + ", please enter your wager.");
					
					if (wagers == 1){
						playerOneWager = IO.readDouble();
						
						if (playerOneWager < 0 || playerOneWager > playerOneBalance){
							System.out.println();
							System.out.println("Please enter a positive wager that is less than or equal to your balance.");
							playerOneWager = IO.readDouble();
						}	
					
						playerOneBalance -= playerOneWager;
					}
					
					if (wagers == 2){
						playerTwoWager = IO.readDouble();
						
						if (playerTwoWager < 0 || playerTwoWager > playerTwoBalance){
							System.out.println();
							System.out.println("Please enter a positive wager that is less than or equal to your balance.");
							playerTwoWager = IO.readDouble();
						}
					
						playerTwoBalance -= playerTwoWager;
					}
					
					if (wagers == 3){
						playerThreeWager = IO.readDouble();
						
						if (playerThreeWager < 0 || playerThreeWager > playerThreeBalance){
							System.out.println();
							System.out.println("Please enter a positive wager that is less than or equal to your balance.");
							playerThreeWager = IO.readDouble();
						}
					
						playerThreeBalance -= playerThreeWager;
					}
					
					if (wagers == 4){
						playerFourWager = IO.readDouble();
						
						if (playerFourWager < 0 || playerFourWager > playerFourBalance){
							System.out.println();
							System.out.println("Please enter a positive wager that is less than or equal to your balance.");
							playerFourWager = IO.readDouble();
						}
					
						playerFourBalance -= playerFourWager;
					}
					
					if (wagers == 5){
						playerFiveWager = IO.readDouble();
						
						if (playerFiveWager < 0 || playerFiveWager > playerFiveBalance){
							System.out.println();
							System.out.println("Please enter a positive wager that is less than or equal to your balance.");
							playerFiveWager = IO.readDouble();
						}
					
						playerFiveBalance -= playerFiveWager;
					}
					
					if (wagers == 6){
						playerSixWager = IO.readDouble();
						
						if (playerSixWager < 0 || playerSixWager > playerSixBalance){
							System.out.println();
							System.out.println("Please enter a positive wager that is less than or equal to your balance.");
							playerSixWager = IO.readDouble();
						}
					
						playerSixBalance -= playerSixWager;
					}
				}
			
				Deck deck = new Deck();
				deck.shuffle();
			
				// Deal cards (two face up to each player, and one up one down for dealer).
				
				for(int player = 1; player <= numberOfPlayers; player ++){
				
					Card one = deck.deal();
					Card two = deck.deal();
					
					if (player == 1){
						playerOneFirst = one;
						playerOneSecond = two;
					}
					
					if (player == 2){
						playerTwoFirst = one;
						playerTwoSecond = two;
					}
					
					if (player == 3){
						playerThreeFirst = one;
						playerThreeSecond = two;
					}
					
					if (player == 4){
						playerFourFirst = one;
						playerFourSecond = two;
					}
					
					if (player == 5){
						playerFiveFirst = one;
						playerFiveSecond = two;
					}
					
					if (player == 6){
						playerSixFirst = one;
						playerSixSecond = two;
					}
			
					String cardOne = one.toString(one);
					String cardTwo = two.toString(two);
				
					System.out.println();
					System.out.println("Player " + player + "'s first card is the: " + cardOne + ".");
					System.out.println("Player " + player + "'s second card is the: " + cardTwo + ".");
				
					if (player == 1){
						
						if (one.getValue() == 1)
							playerOneAces += 1;
					
						if (two.getValue() == 1)
							playerOneAces += 1;
						
						playerOneValue = one.getValue() + two.getValue(); 
						
						if (playerOneValue - 1 + 11 == 21 && playerOneAces > 0){
							playerOneValue = 21;
							playerOneBlackjack = true;
							System.out.println();
							System.out.println("Player " + player + " has Blackjack!");
						}
					}
						
					if (player == 2){
					
						if (one.getValue() == 1)
							playerTwoAces += 1;
				
						if (two.getValue() == 1)
							playerTwoAces += 1;
						
						playerTwoValue = one.getValue() + two.getValue();
						
						if (playerTwoValue - 1 + 11 == 21 && playerTwoAces > 0){
							playerTwoValue = 21;
							playerTwoBlackjack = true;
							System.out.println();
							System.out.println("Player " + player + " has Blackjack!");
						}
					}
				
					if (player == 3){
						
						if (one.getValue() == 1)
							playerThreeAces += 1;
				
						if (two.getValue() == 1)
							playerThreeAces += 1;
						
						playerThreeValue = one.getValue() + two.getValue();
						
						if (playerThreeValue - 1 + 11 == 21 && playerThreeAces > 0){
							playerThreeValue = 21;
							playerThreeBlackjack = true;
							System.out.println();
							System.out.println("Player " + player + " has Blackjack!");
						}
					}
				
					if (player == 4){
						
						if (one.getValue() == 1)
							playerFourAces += 1;
				
						if (two.getValue() == 1)
							playerFourAces += 1;
						
						playerFourValue = one.getValue() + two.getValue();
						
						if (playerFourValue - 1 + 11 == 21 && playerFourAces > 0){
							playerFourValue = 21;
							playerFourBlackjack = true;
							System.out.println();
							System.out.println("Player " + player + " has Blackjack!");
						}
					}
				
					if (player == 5){
						
						if (one.getValue() == 1)
							playerFiveAces += 1;
				
						if (two.getValue() == 1)
							playerFiveAces += 1;
						
						playerFiveValue = one.getValue() + two.getValue();
						
						if (playerFiveValue - 1 + 11 == 21 && playerFiveAces > 0){
							playerFiveValue = 21;
							playerFiveBlackjack = true;
							System.out.println();
							System.out.println("Player " + player + " has Blackjack!");
						}
					}
				
					if (player == 6){
						
						if (one.getValue() == 1)
							playerSixAces += 1;
				
						if (two.getValue() == 1)
							playerSixAces += 1;
						
						playerSixValue = one.getValue() + two.getValue();
						
						if (playerSixValue - 1 + 11 == 21 && playerSixAces > 0){
							playerSixValue = 21;
							playerSixBlackjack = true;
							System.out.println();
							System.out.println("Player " + player + " has Blackjack!");
						}
					}
				}
				
				Card dealerOne = deck.deal();
				Card dealerTwo = deck.deal();
				
				if (dealerOne.getValue() == 1)
					dealerAces += 1;
		
				if (dealerTwo.getValue() == 1)
					dealerAces += 1;
				
				dealerValue = dealerOne.getValue() + dealerTwo.getValue();
				
				if (dealerValue - 1 + 11 == 21 && dealerAces > 0){
					dealerValue = 21;
					dealerBlackjack = true;
				}
				
				if (dealerValue - 1 + 11 < 21 && dealerValue - 1 + 11 > 16 && dealerAces > 0)
					dealerValue += 10;
					
				String dealerCardOne = dealerOne.toString(dealerOne);
				String dealerCardTwo = dealerTwo.toString(dealerTwo);
				
				System.out.println();
				System.out.println("The dealer's first card is the: " + dealerCardOne + ".");
				System.out.println("The dealer's second card is face down.");
				
				// Take Insurance.
				
				if (dealerOne.getValue() == 1){
					
					for (int player = 1; player <= numberOfPlayers; player ++){
							
						if (player == 1 && playerOneBalance == 0)
							continue;
						
						if (player == 2 && playerTwoBalance == 0)
							continue;
						
						if (player == 3 && playerThreeBalance == 0)
							continue;
						
						if (player == 4 && playerFourBalance == 0)
							continue;
						
						if (player == 5 && playerFiveBalance == 0)
							continue;
						
						if (player == 6 && playerSixBalance == 0)
							continue;
						
						System.out.println();
						System.out.println("The dealer has an Ace. Player " + player + ", would you like to take ");
						System.out.println("insurance? Insurance pays 2 to 1. (If yes, enter \"true,\" If no, enter "
								+ "\"false\").");
							
						boolean insurance = IO.readBoolean();
							
						while(insurance != true && insurance != false){
							System.out.println();
							System.out.println("Please enter \"true\" or \"false\"");
							insurance = IO.readBoolean();
						}
							
						if (insurance == true && player == 1){
								
							System.out.println();
							System.out.println("Player " + player + ", please enter your insurance amount ");
							System.out.println("(maximum of half your original bet).");
								
							playerOneInsurance = IO.readDouble();
								
							if (playerOneInsurance > playerOneWager / 2 || playerOneInsurance <= 0
									|| playerOneInsurance > playerOneBalance){
									
								while (playerOneInsurance > playerOneWager / 2 || playerOneInsurance <= 0
										|| playerOneInsurance > playerOneBalance){
									System.out.println();
									System.out.println("Please enter a positive value that is less than your ");
									System.out.println("remaining balance, and also less than or equal to half of ");
									System.out.println("your original wager. (Your current balance is $" 
											+ playerOneBalance + ").");
									
									playerOneInsurance = IO.readDouble();
								}
							}
								
							playerOneBalance -= playerOneInsurance;
						}
							
						if (insurance == true && player == 2){
								
							System.out.println();
							System.out.println("Player " + player + ", please enter your insurance amount ");
							System.out.println("(maximum of half your original bet).");
								
							playerTwoInsurance = IO.readDouble();
								
							if (playerTwoInsurance > playerTwoWager / 2 || playerTwoInsurance <= 0
									|| playerTwoInsurance > playerTwoBalance){
									
								while (playerTwoInsurance > playerTwoWager / 2 || playerTwoInsurance <= 0
										|| playerTwoInsurance > playerTwoBalance){
									System.out.println();
									System.out.println("Please enter a positive value that is less than your ");
									System.out.println("remaining balance, and also less than or equal to half of ");
									System.out.println("your original wager. (Your current balance is $" 
											+ playerTwoBalance + ").");
									
									playerTwoInsurance = IO.readDouble();
								}
							}
								
							playerTwoBalance -= playerTwoInsurance;
						}
							
						if (insurance == true && player == 3){
								
							System.out.println();
							System.out.println("Player " + player + ", please enter your insurance amount ");
							System.out.println("(maximum of half your original bet).");
							
							playerThreeInsurance = IO.readDouble();
								
							if (playerThreeInsurance > playerThreeWager / 2 || playerThreeInsurance <= 0
									|| playerThreeInsurance > playerThreeBalance){
									
								while (playerThreeInsurance > playerThreeWager / 2 || playerThreeInsurance <= 0
										|| playerThreeInsurance > playerThreeBalance){
									System.out.println();
									System.out.println("Please enter a positive value that is less than your ");
									System.out.println("remaining balance, and also less than or equal to half of ");
									System.out.println("your original wager. (Your current balance is $" 
											+ playerThreeBalance + ").");
								
									playerThreeInsurance = IO.readDouble();
								}
							}
								
							playerThreeBalance -= playerThreeInsurance;
						}
							
						if (insurance == true && player == 4){
								
							System.out.println();
							System.out.println("Player " + player + ", please enter your insurance amount ");
							System.out.println("(maximum of half your original bet).");
								
							playerFourInsurance = IO.readDouble();
								
							if (playerFourInsurance > playerFourWager / 2 || playerFourInsurance <= 0
									|| playerFourInsurance > playerFourBalance){
									
								while (playerFourInsurance > playerFourWager / 2 || playerFourInsurance <= 0
										|| playerFourInsurance > playerFourBalance){
									System.out.println();
									System.out.println("Please enter a positive value that is less than your ");
									System.out.println("remaining balance, and also less than or equal to half of ");
									System.out.println("your original wager. (Your current balance is $" 
											+ playerFourBalance + ").");
									
									playerFourInsurance = IO.readDouble();
								}
							}
								
							playerFourBalance -= playerFourInsurance;
						}
							
						if (insurance == true && player == 5){
								
							System.out.println();
							System.out.println("Player " + player + ", please enter your insurance amount ");
							System.out.println("(maximum of half your original bet).");
							
							playerFiveInsurance = IO.readDouble();
								
							if (playerFiveInsurance > playerFiveWager / 2 || playerFiveInsurance <= 0
									|| playerFiveInsurance > playerFiveBalance){
									
								while (playerFiveInsurance > playerFiveWager / 2 || playerFiveInsurance <= 0
										|| playerFiveInsurance > playerFiveBalance){
									System.out.println();
									System.out.println("Please enter a positive value that is less than your ");
									System.out.println("remaining balance, and also less than or equal to half of ");
									System.out.println("your original wager. (Your current balance is $" 
											+ playerFiveBalance + ").");
									
									playerFiveInsurance = IO.readDouble();
								}
							}
								
							playerFiveBalance -= playerFiveInsurance;
						}
							
						if (insurance == true && player == 6){
								
							System.out.println();
							System.out.println("Player " + player + ", please enter your insurance amount ");
							System.out.println("(maximum of half your original bet).");
								
							playerSixInsurance = IO.readDouble();
								
							if (playerSixInsurance > playerSixWager / 2 || playerSixInsurance <= 0
									|| playerSixInsurance > playerSixBalance){
									
								while (playerSixInsurance > playerSixWager / 2 || playerSixInsurance <= 0
										|| playerSixInsurance > playerSixBalance){
									System.out.println();
									System.out.println("Please enter a positive value that is less than your ");
									System.out.println("remaining balance, and also less than or equal to half of ");
									System.out.println("your original wager. (Your current balance is $" 
											+ playerSixBalance + ").");
									
									playerSixInsurance = IO.readDouble();
								}
							}
								
							playerSixBalance -= playerSixInsurance;
						}
							
						else
							continue;
					}
				}
			
				// Take each player (excluding the dealer) to their respective hit/stand/double down/bust conclusion.
					// NOTE: I have excluded splits from my version.
				
				for (int player = 1; player <= numberOfPlayers; player++){
					boolean bust = false;
					boolean doubleDown = false;
					
					while(bust != true && doubleDown != true){
						
						if (player == 1 && playerOneValue == 21)
							break;
						
						if (player == 2 && playerTwoValue == 21)
							break;
						
						if (player == 3 && playerThreeValue == 21)
							break;
						
						if (player == 4 && playerFourValue == 21)
							break;
						
						if (player == 5 && playerFiveValue == 21)
							break;
						
						if (player == 6 && playerSixValue == 21)
							break;
						
						System.out.println();
						System.out.println("Player " +player + ", would you like to Hit, Stand, or Double Down?");
						
						// Provide advice based on Decision Table (excludes split).
						
						if (player == 1 && playerOneAdvice == false && advice(playerOneFirst, 
								playerOneSecond, dealerOne) != null){
							
							System.out.println("If you can, we think you should: " + advice(playerOneFirst, 
									playerOneSecond, dealerOne));
							
							playerOneAdvice = true;
						}
					
						if (player == 2 && playerTwoAdvice == false && advice(playerTwoFirst, 
								playerTwoSecond, dealerOne) != null){
							
							System.out.println("If you can, we think you should: " + advice(playerTwoFirst, 
									playerTwoSecond, dealerOne));
							
							playerTwoAdvice = true;
						}
					
						if (player == 3 && playerThreeAdvice == false && advice(playerThreeFirst, 
								playerThreeSecond, dealerOne) != null){
							
							System.out.println("If you can, we think you should: " + advice(playerThreeFirst, 
									playerThreeSecond, dealerOne));
							
							playerThreeAdvice = true;
						}
			
						if (player == 4 && playerFourAdvice == false && advice(playerFourFirst, 
								playerFourSecond, dealerOne) != null){
							
							System.out.println("If you can, we think you should: " + advice(playerFourFirst, 
									playerFourSecond, dealerOne));
							
							playerFourAdvice = true;
						}
	
						if (player == 5 && playerFiveAdvice == false && advice(playerFiveFirst, 
								playerFiveSecond, dealerOne) != null){
							
							System.out.println("If you can, we think you should: " + advice(playerFiveFirst, 
									playerFiveSecond, dealerOne));
							
							playerFiveAdvice = true;
						}

						if (player == 6 && playerSixAdvice == false && advice(playerSixFirst, 
								playerSixSecond, dealerOne) != null){
							
							System.out.println("If you can, we think you should: " + advice(playerSixFirst, 
									playerSixSecond, dealerOne));
							
							playerSixAdvice = true;
						}
				
						String hitStandOrDouble = IO.readString();
						
						if (player == 1){
						
							while ((hitStandOrDouble.equals("Double Down") || hitStandOrDouble.equals("Double down"))
									&& playerOneBalance < playerOneWager){
								
								System.out.println();
								System.out.println("Player " + player + " does not have enough money to double down. "
										+ "Please enter either \"Hit\" or \"Stand\"");
							}
						}
						
						if (player == 2){
							
							while ((hitStandOrDouble.equals("Double Down") || hitStandOrDouble.equals("Double down"))
									&& playerTwoBalance < playerTwoWager){
								
								System.out.println();
								System.out.println("Player " + player + " does not have enough money to double down. "
										+ "Please enter either \"Hit\" or \"Stand\"");
							}
						}
						
						if (player == 3){
							
							while ((hitStandOrDouble.equals("Double Down") || hitStandOrDouble.equals("Double down"))
									&& playerThreeBalance < playerThreeWager){
								
								System.out.println();
								System.out.println("Player " + player + " does not have enough money to double down. "
										+ "Please enter either \"Hit\" or \"Stand\"");
							}
						}
						
						if (player == 4){
							
							while ((hitStandOrDouble.equals("Double Down") || hitStandOrDouble.equals("Double down"))
									&& playerFourBalance < playerFourWager){
								
								System.out.println();
								System.out.println("Player " + player + " does not have enough money to double down. "
										+ "Please enter either \"Hit\" or \"Stand\"");
							}
						}
						
						if (player == 5){
							
							while ((hitStandOrDouble.equals("Double Down") || hitStandOrDouble.equals("Double down"))
									&& playerFiveBalance < playerFiveWager){
								
								System.out.println();
								System.out.println("Player " + player + " does not have enough money to double down. "
										+ "Please enter either \"Hit\" or \"Stand\"");
							}
						}
						
						if (player == 6){
							
							while ((hitStandOrDouble.equals("Double Down") || hitStandOrDouble.equals("Double down"))
									&& playerSixBalance < playerSixWager){
								
								System.out.println();
								System.out.println("Player " + player + " does not have enough money to double down. "
										+ "Please enter either \"Hit\" or \"Stand\"");
							}
						}
					
						if (!hitStandOrDouble.equals("Hit") && !hitStandOrDouble.equals("hit") 
								&& !hitStandOrDouble.equals("Stand") && !hitStandOrDouble.equals("stand")
								&& !hitStandOrDouble.equals("Double down") && !hitStandOrDouble.equals("double down")){
						
							while (!hitStandOrDouble.equals("Hit") && !hitStandOrDouble.equals("hit") 
									&& !hitStandOrDouble.equals("Stand") && !hitStandOrDouble.equals("stand")
									&& !hitStandOrDouble.equals("Double down") && !hitStandOrDouble.equals("double down")){
								
								System.out.println();
								System.out.println("Please enter \"Hit\" or \"Stand\" or \"Double down\"");
								hitStandOrDouble = IO.readString();
							}
						}
						
						if (hitStandOrDouble.equals("Stand") || hitStandOrDouble.equals("stand")){
							
							if (player == 1){
								
								if (playerOneValue - 1 + 11 < 21 && playerOneAces > 0)
									playerOneValue += 10;
								break;
							}
						
							if (player == 2){
							
								if (playerTwoValue - 1 + 11 < 21 && playerTwoAces > 0)
									playerTwoValue += 10;
								break;
							}
						
							if (player == 3){
							
								if (playerThreeValue - 1 + 11 < 21 && playerThreeAces > 0)
									playerThreeValue += 10;
								break;
							}
						
							if (player == 4){
							
								if (playerFourValue - 1 + 11 < 21 && playerFourAces > 0)
									playerFourValue += 10;
								break;
							}
						
							if (player == 5){
							
								if (playerFiveValue - 1 + 11 < 21 && playerFiveAces > 0)
									playerFiveValue += 10;
								break;
							}
						
							if (player == 6){
							
								if (playerSixValue - 1 + 11 < 21 && playerSixAces > 0)
									playerSixValue += 10;
								break;
							}
						}
						
						if (hitStandOrDouble.equals("Hit") || hitStandOrDouble.equals("hit")){
						
							Card next = deck.deal();
							String cardNext = next.toString(next);
							
							System.out.println();
							System.out.println("Player " + player + "'s next card is the: " + cardNext + ".");
						
							if (player == 1){
								playerOneValue += next.getValue();
								
								if (next.getValue() == 1)
									playerOneAces += 1;
								
								if (playerOneValue - 1 + 11 == 21 && playerOneAces > 0){
									playerOneValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerOneValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerOneValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerOneBust = true;
									bust = true;
									break;
								}									
							}
						
							if (player == 2){
								playerTwoValue += next.getValue();
								
								if (next.getValue() == 1)
									playerTwoAces += 1;
								
								if (playerTwoValue - 1 + 11 == 21 && playerTwoAces > 0){
									playerTwoValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerTwoValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
						
								if (playerTwoValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerTwoBust = true;
									bust = true;
									break;
								}
							}
						
							if (player == 3){
								playerThreeValue += next.getValue();
								
								if (next.getValue() == 1)
									playerThreeAces += 1;
								
								if (playerThreeValue - 1 + 11 == 21 && playerThreeAces > 0){
									playerThreeValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerThreeValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
						
								if (playerThreeValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerThreeBust = true;
									bust = true;
									break;
								}
							}
						
							if (player == 4){
								playerFourValue += next.getValue();
								
								if (next.getValue() == 1)
									playerFourAces += 1;
								
								if (playerFourValue - 1 + 11 == 21 && playerFourAces > 0){
									playerFourValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerFourValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
						
								if (playerFourValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerFourBust = true;
									bust = true;
									break;
								}
							}
						
							if (player == 5){
								playerFiveValue += next.getValue();
								
								if (next.getValue() == 1)
									playerFiveAces += 1;
								
								if (playerFiveValue - 1 + 11 == 21 && playerFiveAces > 0){
									playerFiveValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerFiveValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
						
								if (playerFiveValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerFiveBust = true;
									bust = true;
									break;
								}
							}
						
							if (player == 6){
								playerSixValue += next.getValue();
								
								if (next.getValue() == 1)
									playerSixAces += 1;
								
								if (playerSixValue - 1 + 11 == 21 && playerSixAces > 0){
									playerSixValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
								
								if (playerSixValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
						
								if (playerSixValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerSixBust = true;
									bust = true;
									break;
								}
							}
						}
							
						if (hitStandOrDouble.equals("Double down") || hitStandOrDouble.equals("double down")){
							
							doubleDown = true;
							
							Card last = deck.deal();
							String cardLast = last.toString(last);
								
							System.out.println();
							System.out.println("Player " + player + "'s final card is the: " + cardLast + ".");
							
							if (player == 1){
								
								playerOneBalance -= playerOneWager;
								playerOneWager *= 2;
								playerOneValue += last.getValue();
									
								if (last.getValue() == 1)
									playerOneAces += 1;
									
								if (playerOneValue - 1 + 11 == 21 && playerOneAces > 0){
									playerOneValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerOneValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerOneValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerOneBust = true;
									bust = true;
									break;
								}									
							}
							
							if (player == 2){
								
								playerTwoBalance -= playerTwoWager;
								playerTwoWager *= 2;
								playerTwoValue += last.getValue();
									
								if (last.getValue() == 1)
									playerTwoAces += 1;
									
								if (playerTwoValue - 1 + 11 == 21 && playerTwoAces > 0){
									playerTwoValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerTwoValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerTwoValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerTwoBust = true;
									bust = true;
									break;
								}									
							}
							
							if (player == 3){
								
								playerThreeBalance -= playerThreeWager;
								playerThreeWager *= 2;
								playerThreeValue += last.getValue();
									
								if (last.getValue() == 1)
									playerThreeAces += 1;
									
								if (playerThreeValue - 1 + 11 == 21 && playerThreeAces > 0){
									playerThreeValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerThreeValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerThreeValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerThreeBust = true;
									bust = true;
									break;
								}									
							}
							
							if (player == 4){
								
								playerFourBalance -= playerFourWager;
								playerFourWager *= 2;
								playerFourValue += last.getValue();
									
								if (last.getValue() == 1)
									playerFourAces += 1;
									
								if (playerFourValue - 1 + 11 == 21 && playerFourAces > 0){
									playerFourValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerFourValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerFourValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerFourBust = true;
									bust = true;
									break;
								}									
							}
							
							if (player == 5){
								
								playerFiveBalance -= playerFiveWager;
								playerFiveWager *= 2;
								playerFiveValue += last.getValue();
									
								if (last.getValue() == 1)
									playerFiveAces += 1;
									
								if (playerFiveValue - 1 + 11 == 21 && playerFiveAces > 0){
									playerFiveValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerFiveValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerFiveValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerFiveBust = true;
									bust = true;
									break;
								}									
							}
							
							if (player == 6){
								
								playerSixBalance -= playerSixWager;
								playerSixWager *= 2;
								playerSixValue += last.getValue();
									
								if (last.getValue() == 1)
									playerSixAces += 1;
									
								if (playerSixValue - 1 + 11 == 21 && playerSixAces > 0){
									playerSixValue = 21;
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerSixValue == 21){
									System.out.println();
									System.out.println("Player " + player + " has reached 21!");
									break;
								}
									
								if (playerSixValue > 21){
									System.out.println();
									System.out.println("Player " + player + " has busted.");
									playerSixBust = true;
									bust = true;
									break;
								}									
							}
						}
					}
				}
				
				// Flip down card for dealer. Determine insurances.
				// Take dealer to its respective hit/stand conclusion (17 or higher, stand).
				
				System.out.println();
				System.out.println("Again, the dealer's first card is the: " + dealerCardOne + ".");
				System.out.println("The dealer's second card is the: " + dealerCardTwo + ".");
				
				if (dealerValue == 21){
					dealerBlackjack = true;
					System.out.println();
					System.out.println("The dealer has blackjack.");
				}
			
				if (dealerOne.getValue() == 1 && dealerTwo.getValue() == 10){
					
					for (int player = 1; player <= numberOfPlayers; player ++){
						
						if (player == 1 && playerOneInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer has blackjack, and Player " + player + " took insurance.");
							System.out.println("Therefore, Player " + player + " wins twice his/her insurance!");
							
							playerOneBalance += 3 * playerOneInsurance;
						}
					
						if (player == 2 && playerTwoInsurance > 0){
						
							System.out.println();
							System.out.println("The dealer has blackjack, and Player " + player + " took insurance.");
							System.out.println("Therefore, Player " + player + " wins twice his/her insurance!");
						
							playerTwoBalance += 3 * playerTwoInsurance;
						}
						
						if (player == 3 && playerThreeInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer has blackjack, and Player " + player + " took insurance.");
							System.out.println("Therefore, Player " + player + " wins twice his/her insurance!");
							
							playerThreeBalance += 3 * playerThreeInsurance;
						}
						
						if (player == 4 && playerFourInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer has blackjack, and Player " + player + " took insurance.");
							System.out.println("Therefore, Player " + player + " wins twice his/her insurance!");
							
							playerFourBalance += 3 * playerFourInsurance;
						}
						
						if (player == 5 && playerFiveInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer has blackjack, and Player " + player + " took insurance.");
							System.out.println("Therefore, Player " + player + " wins twice his/her insurance!");
							
							playerFiveBalance += 3 * playerFiveInsurance;
						}
						
						if (player == 6 && playerSixInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer has blackjack, and Player " + player + " took insurance.");
							System.out.println("Therefore, Player " + player + " wins twice his/her insurance!");
							
							playerSixBalance += 3 * playerSixInsurance;
						}
					}
				}
				
				else{
					
					for (int player = 1; player <= numberOfPlayers; player ++){
						
						if (player == 1 && playerOneInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer does not have blackjack, and Player " + player + " took ");
							System.out.println("insurance. Therefore, Player " + player + "lost his/her insurance.");
						}
						
						if (player == 2 && playerTwoInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer does not have blackjack, and Player " + player + " took ");
							System.out.println("insurance. Therefore, Player " + player + "lost his/her insurance.");
						}
						
						if (player == 3 && playerThreeInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer does not have blackjack, and Player " + player + " took ");
							System.out.println("insurance. Therefore, Player " + player + "lost his/her insurance.");
						}

						if (player == 4 && playerFourInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer does not have blackjack, and Player " + player + " took ");
							System.out.println("insurance. Therefore, Player " + player + "lost his/her insurance.");
						}
						
						if (player == 5 && playerFiveInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer does not have blackjack, and Player " + player + " took ");
							System.out.println("insurance. Therefore, Player " + player + "lost his/her insurance.");
						}
					
						if (player == 6 && playerSixInsurance > 0){
							
							System.out.println();
							System.out.println("The dealer does not have blackjack, and Player " + player + " took ");
							System.out.println("insurance. Therefore, Player " + player + "lost his/her insurance.");
						}
					}
				}
				
				while (dealerValue < 17){
				
					Card dealerNext = deck.deal();
					String dealerCardNext = dealerNext.toString(dealerNext);
					dealerValue += dealerNext.getValue();
					
					System.out.println();
					System.out.println("The dealer's next card is the: " + dealerCardNext + ".");
					
					if (dealerNext.getValue() == 1)
						dealerAces += 1;
					
					if (dealerValue - 1 + 11 == 21 && dealerAces > 0){
						dealerValue = 21;
						System.out.println();
						System.out.println("The dealer has reached 21.");
						break;
					}
					
					if (dealerValue - 1 + 11 < 21 && dealerValue - 1 + 11 > 16 && dealerAces > 0){
						dealerValue += 10;
						break;
					}
				
					if (dealerValue > 21){
						System.out.println();
						System.out.println(" The dealer has busted.");
						dealerBust = true;
						break;
					}
				}
			
				// Determine Winners, Losers, and Ties; update and output balances.
				
				for (int player = 1; player <= numberOfPlayers; player++){
			
					if (player == 1){
						
						if (playerOneBust == true){
							System.out.println();
							System.out.println("Player One busted. Therefore Player One loses.");
						}
						
						else if (dealerBust == true){
							System.out.println();
							System.out.println("The dealer busted and Player One did not. Therefore Player One wins!");
							
							playerOneBalance += 2 * playerOneWager;
						}
						
						else if (playerOneBlackjack == true && dealerBlackjack == false){
							System.out.println();
							System.out.println("Player " + player + " has Blackjack, and the dealer does not. Therefore, ");
							System.out.println("Player " + player + " wins one and a half times his/her bet!");
							
							playerOneBalance += 2.5 * playerOneWager;
						}
						
						else if (playerOneBlackjack == true && dealerBlackjack == true){
							System.out.println();
							System.out.println("Both the dealer and Player " + player + " have Blackjack. Therefore, ");
							System.out.println("Player " + player + " ties.");
							
							playerOneBalance += playerOneWager;
						}
						
						else if (playerOneBlackjack == false && dealerBlackjack == true){
							System.out.println();
							System.out.println("Player " + player + " does not have Blackjack, and the dealer does. Therefore, ");
							System.out.println("Player " + player + " loses.");
						}
						
						else if (playerOneValue > dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player One did not bust, and Player One had a higher score ");
							System.out.println("than the dealer. Therefore, Player One wins!");
							
							playerOneBalance += 2 * playerOneWager;
						}
						
						else if (playerOneValue == dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player One did not bust, and Player One had the same score ");
							System.out.println("as the dealer. Therefore, Player One ties.");
							
							playerOneBalance += playerOneWager;
						}
							
						else{
							System.out.println();
							System.out.println("Both the dealer and Player One did not bust, and Player One had a lower score ");
							System.out.println("than the dealer. Therefore, Player One loses.");
						}
						
						System.out.println();
						System.out.println("Player One's new balance is $" + playerOneBalance + ".");
					}
					
					if (player == 2){
						
						if (playerTwoBust == true){
							System.out.println();
							System.out.println("Player Two busted. Therefore Player Two loses.");
						}
							
						else if (dealerBust == true){
							System.out.println();
							System.out.println("The dealer busted and Player Two did not. Therefore Player Two wins!");
							
							playerTwoBalance += 2 * playerTwoWager;
						}
						
						else if (playerTwoBlackjack == true && dealerBlackjack == false){
							System.out.println();
							System.out.println("Player " + player + " has Blackjack, and the dealer does not. Therefore, ");
							System.out.println("Player " + player + " wins one and a half times his/her bet!");
							
							playerTwoBalance += 2.5 * playerTwoWager;
						}
						
						else if (playerTwoBlackjack == true && dealerBlackjack == true){
							System.out.println();
							System.out.println("Both the dealer and Player " + player + " have Blackjack. Therefore, ");
							System.out.println("Player " + player + " ties.");
							
							playerTwoBalance += playerTwoWager;
						}
						
						else if (playerTwoBlackjack == false && dealerBlackjack == true){
							System.out.println();
							System.out.println("Player " + player + " does not have Blackjack, and the dealer does. Therefore, ");
							System.out.println("Player " + player + " loses.");
						}
							
						else if (playerTwoValue > dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Two did not bust, and Player Two had a higher score ");
							System.out.println("than the dealer. Therefore, Player Two wins!");
							
							playerTwoBalance += 2 * playerTwoWager;
						}
						
						else if (playerTwoValue == dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Two did not bust, and Player Two had the same score ");
							System.out.println("as the dealer. Therefore, Player Two ties.");
							
							playerTwoBalance += playerTwoWager;
						}
							
						else{
							System.out.println();
							System.out.println("Both the dealer and Player Two did not bust, and Player Two had a lower score ");
							System.out.println("than the dealer. Therefore, Player Two loses.");
						}
						
						System.out.println();
						System.out.println("Player Two's new balance is $" + playerTwoBalance + ".");
					}
					
					if (player == 3){
						
						if (playerThreeBust == true){
							System.out.println();
							System.out.println("Player Three busted. Therefore Player Three loses.");
						}
						
						else if (dealerBust == true){
							System.out.println();
							System.out.println("The dealer busted and Player Three did not. Therefore Player Three wins!");
							
							playerThreeBalance += 2 * playerThreeWager;
						}
						
						else if (playerThreeBlackjack == true && dealerBlackjack == false){
							System.out.println();
							System.out.println("Player " + player + " has Blackjack, and the dealer does not. Therefore, ");
							System.out.println("Player " + player + " wins one and a half times his/her bet!");
							
							playerThreeBalance += 2.5 * playerThreeWager;
						}
						
						else if (playerThreeBlackjack == true && dealerBlackjack == true){
							System.out.println();
							System.out.println("Both the dealer and Player " + player + " have Blackjack. Therefore, ");
							System.out.println("Player " + player + " ties.");
							
							playerThreeBalance += playerThreeWager;
						}
						
						else if (playerThreeBlackjack == false && dealerBlackjack == true){
							System.out.println();
							System.out.println("Player " + player + " does not have Blackjack, and the dealer does. Therefore, ");
							System.out.println("Player " + player + " loses.");
						}
							
						else if (playerThreeValue > dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Three did not bust, and Player Three had a higher ");
							System.out.println("score than the dealer. Therefore, Player Three wins!");
							
							playerThreeBalance += 2 * playerThreeWager;
						}
							
						else if (playerThreeValue == dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Three did not bust, and Player Three had the same ");
							System.out.println("score as the dealer. Therefore, Player Three ties.");
							
							playerThreeBalance += playerThreeWager;
						}
							
						else{
							System.out.println();
							System.out.println("Both the dealer and Player Three did not bust, and Player Three had a lower ");
							System.out.println("score than the dealer. Therefore, Player Three loses.");
						}
						
						System.out.println();
						System.out.println("Player Three's new balance is $" + playerThreeBalance + ".");
					}
					
					if (player == 4){
						
						if (playerFourBust == true){
							System.out.println();
							System.out.println("Player Four busted. Therefore Player Four loses.");
						}
							
						else if (dealerBust == true){
							System.out.println();
							System.out.println("The dealer busted and Player Four did not. Therefore Player Four wins!");
							
							playerFourBalance += 2 * playerFourWager;
						}
						
						else if (playerFourBlackjack == true && dealerBlackjack == false){
							System.out.println();
							System.out.println("Player " + player + " has Blackjack, and the dealer does not. Therefore, ");
							System.out.println("Player " + player + " wins one and a half times his/her bet!");
							
							playerFourBalance += 2.5 * playerFourWager;
						}
						
						else if (playerFourBlackjack == true && dealerBlackjack == true){
							System.out.println();
							System.out.println("Both the dealer and Player " + player + " have Blackjack. Therefore, ");
							System.out.println("Player " + player + " ties.");
							
							playerFourBalance += playerFourWager;
						}
						
						else if (playerFourBlackjack == false && dealerBlackjack == true){
							System.out.println();
							System.out.println("Player " + player + " does not have Blackjack, and the dealer does. Therefore, ");
							System.out.println("Player " + player + " loses.");
						}
							
						else if (playerFourValue > dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Four did not bust, and Player Four had a higher ");
							System.out.println("score than the dealer. Therefore, Player Four wins!");
							
							playerFourBalance += 2 * playerFourWager;
						}
						
						else if (playerFourValue == dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Four did not bust, and Player Four had the same ");
							System.out.println("score as the dealer. Therefore, Player Four ties.");
							
							playerFourBalance += playerFourWager;
						}
							
						else{
							System.out.println();
							System.out.println("Both the dealer and Player Four did not bust, and Player Four had a lower ");
							System.out.println("score than the dealer. Therefore, Player Four loses.");
						}
						
						System.out.println();
						System.out.println("Player Four's new balance is $" + playerFourBalance + ".");
					}
					
					if (player == 5){
						
						if (playerFiveBust == true){
							System.out.println();
							System.out.println("Player Five busted. Therefore Player Five loses.");
						}
						
						else if (dealerBust == true){
							System.out.println();
							System.out.println("The dealer busted and Player Five did not. Therefore Player Five wins!");
							
							playerFiveBalance += 2 * playerFiveWager;
						}
						
						else if (playerFiveBlackjack == true && dealerBlackjack == false){
							System.out.println();
							System.out.println("Player " + player + " has Blackjack, and the dealer does not. Therefore, ");
							System.out.println("Player " + player + " wins one and a half times his/her bet!");
							
							playerFiveBalance += 2.5 * playerFiveWager;
						}
						
						else if (playerFiveBlackjack == true && dealerBlackjack == true){
							System.out.println();
							System.out.println("Both the dealer and Player " + player + " have Blackjack. Therefore, ");
							System.out.println("Player " + player + " ties.");
							
							playerFiveBalance += playerFiveWager;
						}
						
						else if (playerFiveBlackjack == false && dealerBlackjack == true){
							System.out.println();
							System.out.println("Player " + player + " does not have Blackjack, and the dealer does. Therefore, ");
							System.out.println("Player " + player + " loses.");
						}
						
						else if (playerFiveValue > dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Five did not bust, and Player Five had a higher ");
							System.out.println("score than the dealer. Therefore, Player Five wins!");
							
							playerFiveBalance += 2 * playerFiveWager;
						}
						
						else if (playerFiveValue == dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Five did not bust, and Player Five had the same ");
							System.out.println("score as the dealer. Therefore, Player Five ties.");
							
							playerFiveBalance += playerFiveWager;
						}
						
						else{
							System.out.println();
							System.out.println("Both the dealer and Player Five did not bust, and Player Five had a lower ");
							System.out.println("score than the dealer. Therefore, Player Five loses.");
						}
						
						System.out.println();
						System.out.println("Player Five's new balance is $" + playerFiveBalance + ".");
					}
					
					if (player == 6){
						
						if (playerSixBust == true){
							System.out.println();
							System.out.println("Player Six busted. Therefore Player Six loses.");
						}
						
						else if (dealerBust == true){
							System.out.println();
							System.out.println("The dealer busted and Player Six did not. Therefore Player Six wins!");
							
							playerSixBalance += 2 * playerSixWager;
						}
						
						else if (playerSixBlackjack == true && dealerBlackjack == false){
							System.out.println();
							System.out.println("Player " + player + " has Blackjack, and the dealer does not. Therefore, ");
							System.out.println("Player " + player + " wins one and a half times his/her bet!");
							
							playerSixBalance += 2.5 * playerSixWager;
						}
						
						else if (playerSixBlackjack == true && dealerBlackjack == true){
							System.out.println();
							System.out.println("Both the dealer and Player " + player + " have Blackjack. Therefore, ");
							System.out.println("Player " + player + " ties.");
							
							playerSixBalance += playerSixWager;
						}
						
						else if (playerSixBlackjack == false && dealerBlackjack == true){
							System.out.println();
							System.out.println("Player " + player + " does not have Blackjack, and the dealer does. Therefore, ");
							System.out.println("Player " + player + " loses.");
						}
						
						else if (playerSixValue > dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Six did not bust, and Player Six had a higher score ");
							System.out.println("than the dealer. Therefore, Player Six wins!");
							
							playerSixBalance += 2 * playerSixWager;
						}
						
						else if (playerSixValue == dealerValue){
							System.out.println();
							System.out.println("Both the dealer and Player Six did not bust, and Player Six had the same score ");
							System.out.println("as the dealer. Therefore, Player Six ties.");
							
							playerSixBalance += playerSixWager;
						}
						
						else{
							System.out.println();
							System.out.println("Both the dealer and Player Six did not bust, and Player Six had a lower score ");
							System.out.println("than the dealer. Therefore, Player Six loses.");
						}
						
						System.out.println();
						System.out.println("Player Six's new balance is $" + playerSixBalance + ".");
					}	
				}
				
				// Play again?
			
				System.out.println();
				System.out.println("Would you all like to play again?");
				System.out.println("(If yes, enter \"true.\" If no, enter \"false.\")");
					
				boolean playAgain = IO.readBoolean();
				
				while(playAgain != true && playAgain != false){
					System.out.println();
					System.out.println("Please enter \"true\" or \"false\"");
					playAgain = IO.readBoolean();
				}
				
				if (playAgain == true)
					continue;
				
				else
					System.out.println();
					System.out.println("Thank you for playing!");
					System.exit(0);
		}
	}
	
	// Method to provide advice via Decision Tables (excluding Splits)
	
	public static String advice (Card a, Card b, Card c){
		
		if (a.getValue() == 2 && b.getValue() == 2){
			
			if (c.getValue() < 3 || c.getValue() > 7)
				return "Hit!";
			
			else
				return null;
		}
		
		else if (a.getValue() == 3 && b.getValue() == 3){
			
			if (c.getValue() < 4 || c.getValue() > 7)
				return "Hit!";
			
			else
				return null;
		}
		
		else if (a.getValue() == 4 && b.getValue() == 4){
			
			if (c.getValue() == 5 || c.getValue() == 6)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if (a.getValue() == 5 && b.getValue() == 5){
			
			if (c.getValue() < 10)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if (a.getValue() == 6 && b.getValue() == 6){
			
			if (c.getValue() > 6)
				return "Hit!";
			
			else
				return null;
		}
		
		else if (a.getValue() == 7 && b.getValue() == 7){
				
			if (c.getValue() == 10)
				return "Stand!";
			
			else if (c.getValue() > 7)
				return "Hit!";
			
			else
				return null;
		}
		
		else if (a.getValue() == 8 && b.getValue() == 8)
			return null;
		
		else if (a.getValue() == 9 && b.getValue() == 9){
			
			if (c.getValue() == 7 || c.getValue() > 9)
				return "Stand!";
			
			else
				return null;
		}
		
		else if (a.getValue() == 10 && b.getValue() == 10)
			return "Stand!";
			
		else if (a.getValue() == 1 && b.getValue() == 1)
			return null;
		
		else if ((a.getValue() == 1 && b.getValue() == 2)
				|| (b.getValue() == 1 && a.getValue() == 2)){
			
			if (c.getValue() > 3 || c.getValue() < 7)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 3)
				|| (b.getValue() == 1 && a.getValue() == 3)){
			
			if (c.getValue() > 3 || c.getValue() < 7)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 4)
				|| (b.getValue() == 1 && a.getValue() == 4)){
			
			if (c.getValue() > 3 || c.getValue() < 7)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 5)
				|| (b.getValue() == 1 && a.getValue() == 5)){
			
			if (c.getValue() > 3 || c.getValue() < 7)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 6)
				|| (b.getValue() == 1 && a.getValue() == 6)){
			
			if (c.getValue() < 7)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 7)
				|| (b.getValue() == 1 && a.getValue() == 7)){
			
			if (c.getValue() == 2 || c.getValue() == 7
					|| c.getValue() == 8)
				return "Stand!";
			
			else if (c.getValue() < 7)
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 8)
				|| (b.getValue() == 1 && a.getValue() == 8)){
			
			if (c.getValue() == 6)
				return "Double down!";
			
			else
				return "Stand!";
		}
		
		else if ((a.getValue() == 1 && b.getValue() == 9)
				|| (b.getValue() == 1 && a.getValue() == 9))
			return "Stand!";
			
		else if (a.getValue() + b.getValue() < 8)
			return "Hit!";
		
		else if (a.getValue() + b.getValue() < 9){
			
			if (c.getValue() == 5 || c.getValue() == 6) 
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if (a.getValue() + b.getValue() < 10){
			
			if (c.getValue() < 7) 
				return "Double down!";
			
			else
				return "Hit!";
		}
		
		else if (a.getValue() + b.getValue() < 11){
			
			if (c.getValue() < 10) 
				return "Double down!";
			
			else
				return "Hit!";
		}	
			
		else if (a.getValue() + b.getValue() < 12)
			return "Double down!";
		
		else if (a.getValue() + b.getValue() < 13){
			
			if (c.getValue() > 3 || c.getValue() < 7) 
				return "Stand!";
			
			else
				return "Hit!";
		}
		
		else if (a.getValue() + b.getValue() < 13){
			
			if (c.getValue() > 3 || c.getValue() < 7) 
				return "Stand!";
			
			else
				return "Hit!";
		}
		
		else if (a.getValue() + b.getValue() < 17){
			
			if (c.getValue() < 7) 
				return "Stand!";
			
			else
				return "Hit!";
		}
		
		else
			return "Stand!";
	}
}