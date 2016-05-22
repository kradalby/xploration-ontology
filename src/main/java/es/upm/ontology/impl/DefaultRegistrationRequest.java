package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: RegistrationRequest
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:58:52
*/
public class DefaultRegistrationRequest implements RegistrationRequest {

  private static final long serialVersionUID = -2365801926972587165L;

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
   private String company;
   public void setCompany(String value) { 
    this.company=value;
   }
   public String getCompany() {
     return this.company;
   }

}
