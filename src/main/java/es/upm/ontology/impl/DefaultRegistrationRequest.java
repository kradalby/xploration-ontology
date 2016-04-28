package es.upm.ontology.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import es.upm.ontology.*;

/**
* Protege name: RegistrationRequest
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public class DefaultRegistrationRequest implements RegistrationRequest, Serializable {
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

  public DefaultRegistrationRequest() {
    this._internalInstanceName = "";
  }

  public DefaultRegistrationRequest(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: company
   */
   private String company;
   public void setCompany(String value) { 
     pcs.firePropertyChange("company", (this.company==null?new String():this.company), value);
    this.company=value;
   }
   public String getCompany() {
     return this.company;
   }

}
