/*Fardowsa Douled
06/02/2021
CSE142
TA: Nicolas Matthew
Take Home Assignment #8

This class represents a Critter of type Bird. Vultures are hungry at fight 
and after as well. Vultures are always displayed as a BLACK '%'. 
They move north, east south, west in a cockwise fashion. And switch when "^"
(which direction is north) ">" (which direction is east), ">" (which direction is south), 
"<" when (which direction is west).  Ants also always ROAR at Ants and pounces
otherwise. */
import java.util.*;
import java.awt.*;

public class Vulture extends Bird {
   // fields / state / data
   // Birds's brain
   private boolean hungry; // hungry level of vulture

   // Constructs a new Vulture
   public Vulture() {
      hungry = true;
   }

   // Returns hungry level as ture 
   // Returns hungry level as false 
   public boolean eat() {
      if (hungry) {
         hungry = false;
         return true;
      } else {
         return false;
      }
   }
   
   // Returns move/direction based of Birds class
   // Parameters:
   //     String opponent - the String representation of the opponent Birds
   public Attack fight(String opponent) {
      hungry = true;
      return super.fight(opponent);
   }
   
   // Returns the color BLACK
   public Color getColor() {
      return Color.BLACK;
   } 
}





