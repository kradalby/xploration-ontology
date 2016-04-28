package es.upm.ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Location
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public interface Location extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: Y
   */
   public void setY(float value);
   public float getY();

   /**
   * Protege name: X
   */
   public void setX(float value);
   public float getX();

}
