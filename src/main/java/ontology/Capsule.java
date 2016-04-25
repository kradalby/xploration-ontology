package ontology;



/**
* Protege name: Capsule
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 13:16:08
*/
public interface Capsule extends jade.content.Concept {

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

   /**
   * Protege name: rover
   */
   public void setRover(Rover value);
   public Rover getRover();

}
