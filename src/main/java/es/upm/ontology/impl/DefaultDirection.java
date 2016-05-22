package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: Direction
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:06:44
*/
public class DefaultDirection implements Direction {

  private static final long serialVersionUID = -6264111747675361798L;

  private String _internalInstanceName = null;

  public DefaultDirection() {
    this._internalInstanceName = "";
  }

  public DefaultDirection(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Represtents direction the value ranges from 1 to 6
   * Protege name: x
   */
   private int x;
   public void setX(int value) { 
    this.x=value;
   }
   public int getX() {
     return this.x;
   }

}
