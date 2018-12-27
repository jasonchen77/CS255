//******************************************************************
//Jason Chen
//******************************************************************

public class IDCard extends Card
{
  private String idNumber;
  
public IDCard(String n, String id){  
   super(n);
   idNumber = id;
}

public String format()
{
  super.format();
  return idNumber;
}
}