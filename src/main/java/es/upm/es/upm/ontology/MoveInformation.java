package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: MoveInformation
* @author ontology bean generator
* @version 2016/05/22, 14:17:54
*/
public class MoveInformation implements AgentAction {

   /**
* Protege name: xploration-ontology_Class10003
   */
   private String xploration_ontology_Class10003;
   public void setXploration_ontology_Class10003(String value) { 
    this.xploration_ontology_Class10003=value;
   }
   public String getXploration_ontology_Class10003() {
     return this.xploration_ontology_Class10003;
   }

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

}
