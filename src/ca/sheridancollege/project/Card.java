/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * @author The Fisher
 * @author Adam Shin
 * @author Micah Garnett
 * @author Shubham Malik
 */
public abstract class Card {
    //default modifier for child classes
  //Private variables
  private int suit; 
  private int rank; 
  private String[] cardSuit = {"Clubs", "Spades", "Hearts", "Diamonds"};
  private String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  
  
  public Card(int s, int r) 
  {
      suit = s;
      rank = r;
  }
  
  //Returns the value of the suit of the card.
  public String getSuit(){
      return cardSuit[suit];
  }
  
  //Returns the value of the rank of the card.
  public String getRank(){
      return cardRank[rank];
  }
  
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
