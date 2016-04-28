package es.upm.ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Rover
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public interface Rover extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: rover_agent
   */
   public void setRover_agent(jade.core.AID value);
   public jade.core.AID getRover_agent();

}
