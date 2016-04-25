package ontology.impl;


import ontology.*;

/**
* Protege name: Capsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 12:47:48
*/
public class DefaultCapsule implements Capsule {

  private static final long serialVersionUID = -2471660582568548082L;

  private String _internalInstanceName = null;

  public DefaultCapsule() {
    this._internalInstanceName = "";
  }

  public DefaultCapsule(String instance_name) {
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
   * Protege name: capsule_agent
   */
   private jade.core.AID capsule_agent;
   public void setCapsule_agent(jade.core.AID value) { 
    this.capsule_agent=value;
   }
   public jade.core.AID getCapsule_agent() {
     return this.capsule_agent;
   }

}
