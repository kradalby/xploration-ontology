package ontology.impl;


import ontology.*;

/**
* Protege name: RegistrationRequest
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 12:47:48
*/
public class DefaultRegistrationRequest implements RegistrationRequest {

  private static final long serialVersionUID = -2471660582568548082L;

  private String _internalInstanceName = null;

  public DefaultRegistrationRequest() {
    this._internalInstanceName = "";
  }

  public DefaultRegistrationRequest(String instance_name) {
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
