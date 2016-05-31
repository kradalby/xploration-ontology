package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Finding
* @author ontology bean generator
* @version 2016/05/31, 12:16:18
*/
public class Finding implements Concept {

   /**
   * The mineral result of cell.
* Protege name: mineral
   */
   private Mineral mineral;
   public void setMineral(Mineral value) { 
    this.mineral=value;
   }
   public Mineral getMineral() {
     return this.mineral;
   }

   /**
* Protege name: location
   */
   private Location location;
   public void setLocation(Location value) { 
    this.location=value;
   }
   public Location getLocation() {
     return this.location;
   }

}
