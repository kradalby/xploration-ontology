package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Location
* @author ontology bean generator
* @version 2016/05/31, 12:16:18
*/
public class Location implements Concept {

   /**
* Protege name: Y
   */
   private int y;
   public void setY(int value) { 
    this.y=value;
   }
   public int getY() {
     return this.y;
   }

   /**
* Protege name: X
   */
   private int x;
   public void setX(int value) { 
    this.x=value;
   }
   public int getX() {
     return this.x;
   }

}
