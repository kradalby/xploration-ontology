package es.upm.ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: ReleaseCapsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public interface ReleaseCapsule extends jade.content.AgentAction, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: location
   */
   public void setLocation(Location value);
   public Location getLocation();

}
