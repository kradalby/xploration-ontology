package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Direction
* @author ontology bean generator
* @version 2016/05/23, 15:30:33
*/
public class Direction implements Concept {

   /**
   * Represtents direction the value ranges from 1 to 6
* Protege name: x
   */
   private int x;
   public void setX(int value) { 
    this.x=value;
   }
   public int getX() {
     return this.x;
   }

}
