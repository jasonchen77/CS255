//******************************************************************
//Jason Chen
//******************************************************************

public class DebitCard extends Card
{
  private String cardNumber;
  private String pin;
  
  public DebitCard(String n, String cardNum, String pNum)
  {
    super(n);
    cardNumber = cardNum;
    pin = pNum;
  }
  
  public String format()
  {
    super.format();
    return cardNumber;
    
  }
}