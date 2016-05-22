package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: RequestRoverMovement
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:58:52
*/
public class DefaultRequestRoverMovement implements RequestRoverMovement {

  private static final long serialVersionUID = -2365801926972587165L;

  private String _internalInstanceName = null;

  public DefaultRequestRoverMovement() {
    this._internalInstanceName = "";
  }

  public DefaultRequestRoverMovement(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * The direction of the rover movement
   * Protege name: direction
   */
   private Direction direction;
   public void setDirection(Direction value) { 
    this.direction=value;
   }
   public Direction getDirection() {
     return this.direction;
   }

}
