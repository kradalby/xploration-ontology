package es.upm.ontology.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import es.upm.ontology.*;

/**
* The common ancestor for all protocols. 
Protocols are not used in any specific way and are included so that they can be used as part of the vocabulary.
* Protege name: Protocol
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public class DefaultProtocol implements Protocol, Serializable {
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

  public DefaultProtocol() {
    this._internalInstanceName = "";
  }

  public DefaultProtocol(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

}
