package cds.gen.toadslop.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("toadslop.bookshop.User")
public interface User extends CdsData {
  String NAME = "name";

  String getName();

  void setName(String name);

  User_ ref();

  static User create() {
    return Struct.create(User.class);
  }
}
