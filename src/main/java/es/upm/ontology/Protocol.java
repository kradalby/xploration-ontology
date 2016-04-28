package es.upm.ontology;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* The common ancestor for all protocols. 
Protocols are not used in any specific way and are included so that they can be used as part of the vocabulary.
* Protege name: Protocol
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 13:52:53
*/
public interface Protocol extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

}
