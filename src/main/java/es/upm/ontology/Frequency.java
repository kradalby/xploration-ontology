package es.upm.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Frequency
* @author ontology bean generator
* @version 2016/05/31, 12:16:18
*/
public class Frequency implements Concept {

   /**
* Protege name: channel
   */
   private int channel;
   public void setChannel(int value) { 
    this.channel=value;
   }
   public int getChannel() {
     return this.channel;
   }

}
