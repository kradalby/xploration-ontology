package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: Mineral
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:06:44
*/
public class DefaultMineral implements Mineral {

  private static final long serialVersionUID = -6264111747675361798L;

  private String _internalInstanceName = null;

  public DefaultMineral() {
    this._internalInstanceName = "";
  }

  public DefaultMineral(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * The mineral result type of the cell.
   * Protege name: type
   */
   private String type;
   public void setType(String value) { 
    this.type=value;
   }
   public String getType() {
     return this.type;
   }

}
