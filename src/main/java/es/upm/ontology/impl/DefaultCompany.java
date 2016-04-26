package ontology.impl;


import ontology.*;

/**
* Protege name: Company
* @author OntologyBeanGenerator v4.1
* @version 2016/04/27, 00:22:56
*/
public class DefaultCompany implements Company {

  private static final long serialVersionUID = -9176394525676978982L;

  private String _internalInstanceName = null;

  public DefaultCompany() {
    this._internalInstanceName = "";
  }

  public DefaultCompany(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: company_agent
   */
   private jade.core.AID company_agent;
   public void setCompany_agent(jade.core.AID value) { 
    this.company_agent=value;
   }
   public jade.core.AID getCompany_agent() {
     return this.company_agent;
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
   * Protege name: capsule
   */
   private Capsule capsule;
   public void setCapsule(Capsule value) { 
    this.capsule=value;
   }
   public Capsule getCapsule() {
     return this.capsule;
   }

}
