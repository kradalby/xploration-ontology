package ontology;



/**
* Protege name: Company
* @author OntologyBeanGenerator v4.1
* @version 2016/04/25, 13:16:08
*/
public interface Company extends jade.content.Concept {

   /**
   * Protege name: company_agent
   */
   public void setCompany_agent(jade.core.AID value);
   public jade.core.AID getCompany_agent();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: capsule
   */
   public void setCapsule(Capsule value);
   public Capsule getCapsule();

}
