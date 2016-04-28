package es.upm.ontology.impl;


import es.upm.ontology.*;

/**
* The common ancestor for all protocols. 
Protocols are not used in any specific way and are included so that they can be used as part of the vocabulary.
* Protege name: Protocol
* @author OntologyBeanGenerator v4.1
* @version 2016/04/28, 12:56:39
*/
public class DefaultProtocol implements Protocol {

  private static final long serialVersionUID = -2680956990097898606L;

  private String _internalInstanceName = null;

  public DefaultProtocol() {
    this._internalInstanceName = "";
  }

  public DefaultProtocol(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

}
