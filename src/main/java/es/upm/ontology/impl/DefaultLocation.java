package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: Location
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 12:56:39
*/
public class DefaultLocation implements Location {

  private static final long serialVersionUID = -2680956990097898606L;

  private String _internalInstanceName = null;

  public DefaultLocation() {
    this._internalInstanceName = "";
  }

  public DefaultLocation(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: Y
   */
   private float y;
   public void setY(float value) { 
    this.y=value;
   }
   public float getY() {
     return this.y;
   }

   /**
   * Protege name: X
   */
   private float x;
   public void setX(float value) { 
    this.x=value;
   }
   public float getX() {
     return this.x;
   }

}
