package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: ReleaseCapsule
* @author ontology bean generator
* @version 2016/05/30, 16:51:40
*/
public class ReleaseCapsule implements AgentAction {

   /**
* Protege name: sizeX
   */
   private int sizeX;
   public void setSizeX(int value) { 
    this.sizeX=value;
   }
   public int getSizeX() {
     return this.sizeX;
   }

   /**
* Protege name: sizeY
   */
   private int sizeY;
   public void setSizeY(int value) { 
    this.sizeY=value;
   }
   public int getSizeY() {
     return this.sizeY;
   }

   /**
* Protege name: location
   */
   private Location location;
   public void setLocation(Location value) { 
    this.location=value;
   }
   public Location getLocation() {
     return this.location;
   }

}
