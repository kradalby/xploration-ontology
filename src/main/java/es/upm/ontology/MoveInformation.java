package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: MoveInformation
* @author ontology bean generator
* @version 2016/05/23, 15:21:15
*/
public class MoveInformation implements AgentAction {

   /**
* Protege name: RoverLocation
   */
   private Location roverLocation;
   public void setRoverLocation(Location value) { 
    this.roverLocation=value;
   }
   public Location getRoverLocation() {
     return this.roverLocation;
   }

   /**
* Protege name: aid
   */
   private AID aid;
   public void setAid(AID value) { 
    this.aid=value;
   }
   public AID getAid() {
     return this.aid;
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
