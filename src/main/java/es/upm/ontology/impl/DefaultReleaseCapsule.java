package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: ReleaseCapsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 12:56:39
*/
public class DefaultReleaseCapsule implements ReleaseCapsule {

  private static final long serialVersionUID = -2680956990097898606L;

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

}
