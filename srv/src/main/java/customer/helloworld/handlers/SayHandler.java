package customer.helloworld.handlers;
import cds.gen.say.HelloContext;
import cds.gen.say.Say_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;


import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cds.services.messaging.MessagingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ServiceName(Say_.CDS_NAME)
public class SayHandler implements EventHandler {

    @Autowired
	MessagingService messagingService;
    
@On(event = HelloContext.CDS_NAME)
  public void sayHello(HelloContext context) {
    String name = context.getTo();
  String greeting = "Hello " + name + "!";
  messagingService.emit("sap/taskmanager-events/event-mesh/user-registration-topic", greeting);
  context.setResult(greeting);
  }
}