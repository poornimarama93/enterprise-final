package cds.gen.say;

import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.String;

@EventName("hello")
public interface HelloContext extends EventContext {
  String TO = "to";

  String CDS_NAME = "hello";

  String getTo();

  void setTo(String to);

  void setResult(String result);

  String getResult();

  static HelloContext create() {
    return EventContext.create(HelloContext.class, null);
  }
}
