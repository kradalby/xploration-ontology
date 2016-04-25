package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: Registration
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 23:39:14
*/
public class DefaultRegistration implements Registration {

  private static final long serialVersionUID = -5031586688954743472L;

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
   private Company company;
   public void setCompany(Company value) { 
    this.company=value;
   }
   public Company getCompany() {
     return this.company;
   }

}
