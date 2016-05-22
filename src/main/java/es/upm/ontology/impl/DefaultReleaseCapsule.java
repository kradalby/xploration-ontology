package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: ReleaseCapsule
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:58:52
*/
public class DefaultReleaseCapsule implements ReleaseCapsule {

  private static final long serialVersionUID = -2365801926972587165L;

  private String _internalInstanceName = null;

  public DefaultReleaseCapsule() {
    this._internalInstanceName = "";
  }

  public DefaultReleaseCapsule(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
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
