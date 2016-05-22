package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: ReleaseCapsule
* @author ontology bean generator
* @version 2016/05/22, 14:17:54
*/
public class ReleaseCapsule implements AgentAction {

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

   /**
* Protege name: MoveDirection
   */
   private Direction moveDirection;
   public void setMoveDirection(Direction value) { 
    this.moveDirection=value;
   }
   public Direction getMoveDirection() {
     return this.moveDirection;
   }

}
