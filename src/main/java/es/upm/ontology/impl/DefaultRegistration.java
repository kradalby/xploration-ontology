package ontology.impl;


import ontology.*;

/**
* Protege name: Registration
* @author OntologyBeanGenerator v4.1
* @version 2016/04/27, 00:22:56
*/
public class DefaultRegistration implements Registration {

  private static final long serialVersionUID = -9176394525676978982L;

  private String _internalInstanceName = null;

  public DefaultRegistration() {
    this._internalInstanceName = "";
  }

  public DefaultRegistration(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: company
   */
   private String company;
   public void setCompany(String value) { 
    this.company=value;
   }
   public String getCompany() {
     return this.company;
   }

}
