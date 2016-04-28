package es.upm.ontology.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import es.upm.ontology.*;

/**
* Protege name: Location
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public class DefaultLocation implements Location, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 2506149977661287232L;

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
     pcs.firePropertyChange("y", ""+this.y, ""+value);
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
     pcs.firePropertyChange("x", ""+this.x, ""+value);
    this.x=value;
   }
   public float getX() {
     return this.x;
   }

}
