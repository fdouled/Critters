/*06/02/2021
CSE142
TA: Nicolas Matthew
Take Home Assignment #8

This class represents a Critter of type Bird. Vultures are hungry at fight and after as well.
Vultures are always displayed as a CYAN "Q.P" or "Q.P".  They move CENTER and alternating 
SOUTH in a cockwise fashion. And switch when "^" (which direction is north)
The husky also has Attack.SCRATCH when opponents equal "V" or "^" 
Attack.POUNCE when opponents equal "<" or ">" or fight with  Attack.ROAR */
import java.util.*;
import java.awt.*;

public class Husky extends Critter {
   // fields / state / data
   // Critter's brain
   private int move; // moves of the Husky
   private Direction direction; //direction of Husky moves

   // Constructs a new Vulture
   public Husky() {
      int move = 0; // total moves is now 0
   }
   
   // Returns Attack.SCRATCH for opponents "V" and "^"
   // Returns Attack.POUNCE for opponents ">" and "<"
   // Returns Attack.ROAR
   // Parameters:
   //     String opponent - the String representation of the opponent Birds
   public Attack fight(String opponent) {
      if (opponent.equals("V") || opponent.equals("^")) {
         return Attack.SCRATCH;
      } else if (opponent.equals(">") || opponent.equals("<")) {
         return Attack.POUNCE;
      } else {
         return Attack.ROAR;
      }
   }
   
   // Returns the color CYAN
   public Color getColor() {
      return Color.CYAN;
   }
   
   //for 6 moves returns direction CENTER
   //for 6 moves returns direction SOUTH
   public Direction getMove() {
      move++;
      if (move % 19 < 6) {
         return Direction.CENTER;
      } else {
         return Direction.SOUTH;
      } 
   }
   
   // Returns "Q.P" when direction is CENTER for 3 moves 
   // Returns "q.p" when direction is SOUTH for 3 moves 
   public String toString() {
      if (move % 19 < 6) {
         return "Q.P";
      } else {
         return "q.p";
      } 
   }
}