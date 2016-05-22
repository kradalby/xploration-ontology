package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: MoveInformation
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:58:52
*/
public class DefaultMoveInformation implements MoveInformation {

  private static final long serialVersionUID = -2365801926972587165L;

  private String _internalInstanceName = null;

  public DefaultMoveInformation() {
    this._internalInstanceName = "";
  }

  public DefaultMoveInformation(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

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
