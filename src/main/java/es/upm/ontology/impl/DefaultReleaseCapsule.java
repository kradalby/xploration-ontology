package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: ReleaseCapsule
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:06:44
*/
public class DefaultReleaseCapsule implements ReleaseCapsule {

  private static final long serialVersionUID = -6264111747675361798L;

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
