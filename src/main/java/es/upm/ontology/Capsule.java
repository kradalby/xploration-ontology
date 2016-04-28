package es.upm.ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Capsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public interface Capsule extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: rover
   */
   public void setRover(Rover value);
   public Rover getRover();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: capsule_agent
   */
   public void setCapsule_agent(jade.core.AID value);
   public jade.core.AID getCapsule_agent();

}
