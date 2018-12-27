//******************************************************************
//Jason Chen
//******************************************************************

public class DriverLicense extends Card
{
  private String expirationYear;
  
  public DriverLicense(String n, String expiration)
  {
    super(n);
    expirationYear = expiration;
  }
  
  
public String format()
{
  super.format();
  return expirationYear;
}
}