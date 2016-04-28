package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: RegistrationRequest
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 12:56:39
*/
public class DefaultRegistrationRequest implements RegistrationRequest {

  private static final long serialVersionUID = -2680956990097898606L;

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
