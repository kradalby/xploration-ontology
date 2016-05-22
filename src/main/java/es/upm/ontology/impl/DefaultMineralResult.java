package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* Protege name: MineralResult
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:58:52
*/
public class DefaultMineralResult implements MineralResult {

  private static final long serialVersionUID = -2365801926972587165L;

  private String _internalInstanceName = null;

  public DefaultMineralResult() {
    this._internalInstanceName = "";
  }

  public DefaultMineralResult(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * The mineral result of cell.
   * Protege name: mineral
   */
   private Mineral mineral;
   public void setMineral(Mineral value) { 
    this.mineral=value;
   }
   public Mineral getMineral() {
     return this.mineral;
   }

}
