package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: RegistrationRequest
* @author ontology bean generator
* @version 2016/05/17, 20:24:51
*/
public class RegistrationRequest implements AgentAction {

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
