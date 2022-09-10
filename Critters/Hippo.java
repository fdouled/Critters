/*Fardowsa Douled
06/02/2021
CSE142
TA: Nicolas Matthew
Take Home Assignment #8

This class represents a Critter of type Hippo. Hippos eats until they are not hungry.
Ants are always displayed as gray while still hungry and white when hungry level reaches 0.
They move north, east south, west for a randomly selected amount of timee. 
Hippos 'SCRATCH' (Attack.SCRATCH) while hungry and POUNCE (Attack.POUNCE) when not hungry. */
import java.util.*;
import java.awt.*;

public class Hippo extends Critter {
   // fields / state / data
   // Critter's brain
   private int hunger;    // hunger level of the Hippo
   private int move;      // moves of the Hippo
   private Random rand;   //random genreator for hippo label (ie: Hippo(8)) 
   private int direction; //direction of Hippo moves


   // Constructs a new Hippo
   // Parameters:
   //     int hunger - hunger level of the Hippo
   public Hippo(int hunger) {
      this.hunger = hunger;  
      rand = new Random(); 
   }

   //Return true
   public boolean eat() {
      if (hunger > 0) {
         hunger--;
         return true;
      } else {
         return false;
      } 
   }
   
   // Returns the attack 'SCRATCH' (Attack.SCRATCH) while still hungry
   // Returns POUNCE (Attack.POUNCE) when not hungry
   // Parameters:
   //     String opponent - the String representation of the opponent Critter
   public Attack fight(String opponent) {
      if (hunger > 0) {
         return Attack.SCRATCH;
      } else {
         return Attack.POUNCE;
      }
   }
   
   // Returns the color GRAY while Hippo is hungry
   // Returns the color WHITE while not hungry
   public Color getColor() {
      if (hunger > 0){
         return Color.GRAY;
      } else {
         return Color.WHITE;
      }
   }

   //for rand moves returns direction NORTH for at least 5 moves
   //for rand moves returns direction EAST for at least 5 moves
   //for rand moves returns direction SOUTH for at least 5 moves
   //for rand moves returns direction WEST for at least 5 moves
   public Direction getMove() {
      move++;
      if (move % 5 == 1) {
         direction = rand.nextInt(4);
      }
      if (direction == 1) {
         return Direction.NORTH;
      } else if (direction == 2) {
         return Direction.SOUTH;
      } else if (direction == 3) {
         return Direction.WEST;
      } else {
         return Direction.EAST;
      }
   }
   
   // returns amount of hunger remaining (string)
   public String toString() {
      return "" + hunger;   
   }
}


