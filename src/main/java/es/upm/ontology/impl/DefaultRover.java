package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: Rover
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 12:56:39
*/
public class DefaultRover implements Rover {

  private static final long serialVersionUID = -2680956990097898606L;

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
