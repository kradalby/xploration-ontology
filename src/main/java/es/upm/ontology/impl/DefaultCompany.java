package es.upm.ontology.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import es.upm.ontology.*;

/**
* Protege name: Company
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public class DefaultCompany implements Company, Serializable {
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

  public DefaultCompany() {
    this._internalInstanceName = "";
  }

  public DefaultCompany(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: company_agent
   */
   private jade.core.AID company_agent;
   public void setCompany_agent(jade.core.AID value) { 
     pcs.firePropertyChange("company_agent", (this.company_agent==null?new jade.core.AID():this.company_agent), value);
    this.company_agent=value;
   }
   public jade.core.AID getCompany_agent() {
     return this.company_agent;
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
   * Protege name: capsule
   */
   private Capsule capsule;
   public void setCapsule(Capsule value) { 
     pcs.firePropertyChange("capsule", (this.capsule==null?new Capsule():this.capsule), value);
    this.capsule=value;
   }
   public Capsule getCapsule() {
     return this.capsule;
   }

}
