package es.upm.ontology.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import es.upm.ontology.*;

/**
* Protege name: Capsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public class DefaultCapsule implements Capsule, Serializable {
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

  public DefaultCapsule() {
    this._internalInstanceName = "";
  }

  public DefaultCapsule(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: rover
   */
   private Rover rover;
   public void setRover(Rover value) { 
     pcs.firePropertyChange("rover", (this.rover==null?new Rover():this.rover), value);
    this.rover=value;
   }
   public Rover getRover() {
     return this.rover;
   }

   /**
   * Protege name: name
   */
   private String name;
   public void setName(String value) { 
     pcs.firePropertyChange("name", (this.name==null?new String():this.name), value);
    this.name=value;
   }
   public String getName() {
     return this.name;
   }

   /**
   * Protege name: capsule_agent
   */
   private jade.core.AID capsule_agent;
   public void setCapsule_agent(jade.core.AID value) { 
     pcs.firePropertyChange("capsule_agent", (this.capsule_agent==null?new jade.core.AID():this.capsule_agent), value);
    this.capsule_agent=value;
   }
   public jade.core.AID getCapsule_agent() {
     return this.capsule_agent;
   }

}
