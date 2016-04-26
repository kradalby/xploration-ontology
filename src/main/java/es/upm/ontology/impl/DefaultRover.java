package ontology.impl;


import ontology.*;

/**
* Protege name: Rover
* @author OntologyBeanGenerator v4.1
* @version 2016/04/27, 00:22:56
*/
public class DefaultRover implements Rover {

  private static final long serialVersionUID = -9176394525676978982L;

  private String _internalInstanceName = null;

  public DefaultRover() {
    this._internalInstanceName = "";
  }

  public DefaultRover(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: name
   */
   private String name;
   public void setName(String value) { 
    this.name=value;
   }
   public String getName() {
     return this.name;
   }

   /**
   * Protege name: rover_agent
   */
   private jade.core.AID rover_agent;
   public void setRover_agent(jade.core.AID value) { 
    this.rover_agent=value;
   }
   public jade.core.AID getRover_agent() {
     return this.rover_agent;
   }

}
