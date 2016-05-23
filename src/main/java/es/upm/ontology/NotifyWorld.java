package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: NotifyWorld
* @author ontology bean generator
* @version 2016/05/23, 15:21:15
*/
public class NotifyWorld implements AgentAction {

   /**
* Protege name: roverInitialLocations
   */
   private List roverInitialLocations = new ArrayList();
   public void addRoverInitialLocations(Object elem) { 
     List oldList = this.roverInitialLocations;
     roverInitialLocations.add(elem);
   }
   public boolean removeRoverInitialLocations(Object elem) {
     List oldList = this.roverInitialLocations;
     boolean result = roverInitialLocations.remove(elem);
     return result;
   }
   public void clearAllRoverInitialLocations() {
     List oldList = this.roverInitialLocations;
     roverInitialLocations.clear();
   }
   public Iterator getAllRoverInitialLocations() {return roverInitialLocations.iterator(); }
   public List getRoverInitialLocations() {return roverInitialLocations; }
   public void setRoverInitialLocations(List l) {roverInitialLocations = l; }

}
