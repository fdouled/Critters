/*Fardowsa Douled
06/02/2021
CSE142
TA: Nicolas Matthew
Take Home Assignment #8

This class represents a Critter of type Ant. Ants are always eat.
Ants are always displayed as a red '%'. They move north and east
when walkSouth is true and when its not they move either east and 
south. Ants also always scratch.
*/

import java.util.*;
import java.awt.*;

public class Ant extends Critter {
   // fields / state / data
   // Critter's brain
   private boolean southOrNorth; // if the Ant walks north or south
   private Direction direction; // what direction the Ant moves in


   // Constructs a new Ant
   // Parameters:
   //     boolean walkSouth - when Ant is walking South or not
   public Ant(boolean walkSouth) {
      if (walkSouth) {
         direction = Direction.SOUTH;        
      } else { 
         direction = Direction.NORTH;
      }
   }

   // Ants eating always returns true 
   public boolean eat() {
      return true;
   }

   // Returns the attack 'SCRATCH'
   // Parameters:
   //     String opponent - the String representation of the opponent Critter   
   public Attack fight (String opponent){
      return Attack.SCRATCH;
   }
   
   // Returns the color RED
   public Color getColor() {
      return Color.RED;
   }
   
   // Returns direction the Ant moves in (either north or south)
   // Returns EAST if direction is southOrNorth or not equal southOrNorth 
   public Direction getMove() {
      southOrNorth = !southOrNorth;
      if (southOrNorth) {
         return direction;
      } else {
         return Direction.EAST;  
      } 
   }

   // Always returns % for the Ant
   public String toString() {
      return "%";
   }
}
