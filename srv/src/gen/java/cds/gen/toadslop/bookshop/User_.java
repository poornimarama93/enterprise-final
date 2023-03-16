package cds.gen.toadslop.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("toadslop.bookshop.User")
public interface User_ extends StructuredType<User_> {
  String CDS_NAME = "toadslop.bookshop.User";

  ElementRef<String> name();
}
