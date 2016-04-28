package es.upm.ontology.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import es.upm.ontology.*;

/**
* Protege name: ReleaseCapsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public class DefaultReleaseCapsule implements ReleaseCapsule, Serializable {
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
     pcs.firePropertyChange("location", (this.location==null?new Location():this.location), value);
    this.location=value;
   }
   public Location getLocation() {
     return this.location;
   }

}
