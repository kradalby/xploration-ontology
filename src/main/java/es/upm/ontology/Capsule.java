package es.upm.ontology;



/**
* Protege name: Capsule
* @author OntologyBeanGenerator v4.1
* @version 2016/05/22, 13:06:44
*/
public interface Capsule extends jade.content.Concept {

   /**
   * Protege name: rover
   */
   public void setRover(Rover value);
   public Rover getRover();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: capsule_agent
   */
   public void setCapsule_agent(jade.core.AID value);
   public jade.core.AID getCapsule_agent();

}
