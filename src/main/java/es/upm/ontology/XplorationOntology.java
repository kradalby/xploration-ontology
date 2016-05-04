// file: XplorationOntology.java generated by ontology bean generator.  DO NOT EDIT, UNLESS YOU ARE REALLY SURE WHAT YOU ARE DOING!
package es.upm.ontology;

import jade.content.onto.*;
import jade.content.schema.*;
import jade.util.leap.HashMap;
import jade.content.lang.Codec;
import jade.core.CaseInsensitiveString;

/** file: XplorationOntology.java
 * @author ontology bean generator
 * @version 2016/05/5, 01:21:05
 */
public class XplorationOntology extends jade.content.onto.Ontology  {
  //NAME
  public static final String ONTOLOGY_NAME = "xploration";
  // The singleton instance of this ontology
  private static ReflectiveIntrospector introspect = new ReflectiveIntrospector();
  private static Ontology theInstance = new XplorationOntology();
  public static Ontology getInstance() {
     return theInstance;
  }


   // VOCABULARY
    public static final String REQUESTROVERMOVEMENT_DIRECTION="direction";
    public static final String REQUESTROVERMOVEMENT="RequestRoverMovement";
    public static final String REGISTRATIONREQUEST_COMPANY="company";
    public static final String REGISTRATIONREQUEST="RegistrationRequest";
    public static final String RELEASECAPSULE_LOCATION="location";
    public static final String RELEASECAPSULE="ReleaseCapsule";
    public static final String PROTOCOL_RELEASE_CAPSULE="PROTOCOL_RELEASE_CAPSULE";
    public static final String DIRECTION_X="x";
    public static final String DIRECTION="Direction";
    public static final String COMPANY_CAPSULE="capsule";
    public static final String COMPANY_NAME="name";
    public static final String COMPANY_COMPANY_AGENT="company_agent";
    public static final String COMPANY="Company";
    public static final String LOCATION_Y="Y";
    public static final String LOCATION_X="X";
    public static final String LOCATION="Location";
    public static final String PROTOCOL_REGISTRATION="PROTOCOL_REGISTRATION";
    public static final String CAPSULE_ROVER="rover";
    public static final String CAPSULE_CAPSULE_AGENT="capsule_agent";
    public static final String CAPSULE_NAME="name";
    public static final String CAPSULE="Capsule";
    public static final String ROVER_ROVER_AGENT="rover_agent";
    public static final String ROVER_NAME="name";
    public static final String ROVER="Rover";
    public static final String PROTOCOL="Protocol";
    public static final String PROTOCOL_REQUEST_ROVER_MOVEMENT="PROTOCOL_REQUEST_ROVER_MOVEMENT";

  /**
   * Constructor
  */
  private XplorationOntology(){ 
    super(ONTOLOGY_NAME, BasicOntology.getInstance());
    try { 

    // adding Concept(s)
    ConceptSchema protocoL_requesT_roveR_movementSchema = new ConceptSchema(PROTOCOL_REQUEST_ROVER_MOVEMENT);
    add(protocoL_requesT_roveR_movementSchema, es.upm.ontology.PROTOCOL_REQUEST_ROVER_MOVEMENT.class);
    ConceptSchema protocolSchema = new ConceptSchema(PROTOCOL);
    add(protocolSchema, es.upm.ontology.Protocol.class);
    ConceptSchema roverSchema = new ConceptSchema(ROVER);
    add(roverSchema, es.upm.ontology.Rover.class);
    ConceptSchema capsuleSchema = new ConceptSchema(CAPSULE);
    add(capsuleSchema, es.upm.ontology.Capsule.class);
    ConceptSchema protocoL_registrationSchema = new ConceptSchema(PROTOCOL_REGISTRATION);
    add(protocoL_registrationSchema, es.upm.ontology.PROTOCOL_REGISTRATION.class);
    ConceptSchema locationSchema = new ConceptSchema(LOCATION);
    add(locationSchema, es.upm.ontology.Location.class);
    ConceptSchema companySchema = new ConceptSchema(COMPANY);
    add(companySchema, es.upm.ontology.Company.class);
    ConceptSchema directionSchema = new ConceptSchema(DIRECTION);
    add(directionSchema, es.upm.ontology.Direction.class);
    ConceptSchema protocoL_releasE_capsuleSchema = new ConceptSchema(PROTOCOL_RELEASE_CAPSULE);
    add(protocoL_releasE_capsuleSchema, es.upm.ontology.PROTOCOL_RELEASE_CAPSULE.class);

    // adding AgentAction(s)
    AgentActionSchema releaseCapsuleSchema = new AgentActionSchema(RELEASECAPSULE);
    add(releaseCapsuleSchema, es.upm.ontology.ReleaseCapsule.class);
    AgentActionSchema registrationRequestSchema = new AgentActionSchema(REGISTRATIONREQUEST);
    add(registrationRequestSchema, es.upm.ontology.RegistrationRequest.class);
    AgentActionSchema requestRoverMovementSchema = new AgentActionSchema(REQUESTROVERMOVEMENT);
    add(requestRoverMovementSchema, es.upm.ontology.RequestRoverMovement.class);

    // adding AID(s)

    // adding Predicate(s)


    // adding fields
    roverSchema.add(ROVER_NAME, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    roverSchema.add(ROVER_ROVER_AGENT, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.OPTIONAL);
    capsuleSchema.add(CAPSULE_NAME, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    capsuleSchema.add(CAPSULE_CAPSULE_AGENT, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.OPTIONAL);
    capsuleSchema.add(CAPSULE_ROVER, roverSchema, ObjectSchema.OPTIONAL);
    locationSchema.add(LOCATION_X, (TermSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.OPTIONAL);
    locationSchema.add(LOCATION_Y, (TermSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.OPTIONAL);
    companySchema.add(COMPANY_COMPANY_AGENT, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.OPTIONAL);
    companySchema.add(COMPANY_NAME, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    companySchema.add(COMPANY_CAPSULE, capsuleSchema, ObjectSchema.OPTIONAL);
    directionSchema.add(DIRECTION_X, (TermSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.MANDATORY);
    releaseCapsuleSchema.add(RELEASECAPSULE_LOCATION, locationSchema, ObjectSchema.OPTIONAL);
    registrationRequestSchema.add(REGISTRATIONREQUEST_COMPANY, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.OPTIONAL);
    requestRoverMovementSchema.add(REQUESTROVERMOVEMENT_DIRECTION, directionSchema, ObjectSchema.MANDATORY);

    // adding name mappings

    // adding inheritance
    protocoL_requesT_roveR_movementSchema.addSuperSchema(protocolSchema);
    protocoL_registrationSchema.addSuperSchema(protocolSchema);
    protocoL_releasE_capsuleSchema.addSuperSchema(protocolSchema);

   }catch (java.lang.Exception e) {e.printStackTrace();}
  }
  }
