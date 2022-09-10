/*Fardowsa Douled
06/02/2021
CSE142
TA: Nicolas Matthew
Take Home Assignment #8

This class represents a Critter of type Bird. Birds are never eats.
Ants are always displayed as a blue '%'. They move north, east
south, west in a cockwise fashion. And switch when "^" (which direction is north)
">" (which direction is east), ">" (which direction is south), 
"<" when (which direction is west).  Ants also always ROAR at Ants and pounces
otherwise. */
import java.util.*;
import java.awt.*;

public class Bird extends Critter {
   // fields / state / data
   // Critter's brain
   private int move; 
   
   // Constructs a new Bird
   public Bird() {
      move = -1;
   }
   
   // Returns the attack 'ROAR'(Attack.ROAR) at string "%"(Ants)
   // Returns POUNCE (Attack.POUNCE)
   // Parameters:
   //     String opponent - the String representation of the opponent Critter
   public Attack fight(String opponent) {
      if (opponent.equals("%")) {
         return Attack.ROAR;
      } else {
         return Attack.POUNCE;
      }
   }
   
   // Returns the color BLUE
   public Color getColor() {
      return Color.BLUE;
   }
   
   //for 3 moves returns direction NORTH
   //for 3 moves returns direction EAST
   //for 3 moves returns direction SOUTH
   //for 3 moves returns direction WEST
   public Direction getMove() {
      move++;
      if (move % 12 < 3) {
         return Direction.NORTH;
      } else if (move % 12 < 6) {
         return Direction.EAST;
      } else if (move % 12 < 9) {
         return Direction.SOUTH;
      } else {
         return Direction.WEST;
      } 
   }

   // Returns "^" when direction is north for 3 moves 
   // Returns ">" when direction is east for 3 moves 
   // Returns "V" when direction is south for 3 moves 
   // Returns "<" when direction is west for 3 moves 
   public String toString() {
      if (move % 12 < 3) {
         return "^";
      } else if (move % 12 < 6) {
         return ">";
      } else if (move % 12 < 9) {
         return "V";
      } else {
         return "<";
      } 
   }
}  
    

   

