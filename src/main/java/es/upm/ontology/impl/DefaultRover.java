package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: Rover
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 23:39:14
*/
public class DefaultRover implements Rover {

  private static final long serialVersionUID = -5031586688954743472L;

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