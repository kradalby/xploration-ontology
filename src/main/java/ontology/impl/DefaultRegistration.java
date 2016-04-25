package ontology.impl;


import ontology.*;

/**
* Protege name: Registration
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 16:17:22
*/
public class DefaultRegistration implements Registration {

  private static final long serialVersionUID = 7137990424718032192L;

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
