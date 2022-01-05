
public class Deposit extends CheckBalance
{
  public  void Deposit()
  {
    System.out.println("Please enter the amount you would wish to deposit: ");
 
    deposit = input.nextInt();
    amount = amount + deposit;
    System.out.println("Your money has been seccessfully deposited "+amount);
  } 
  public void other()
  {
      int other;
      System.out.println("would you like to check your total amount :");
      System.out.println("1.YES\n2.NO:");
      other=input.nextInt();
      switch(other)
      {
          case 1:
          {
              Check_balance();
              break;
          }
          case 2:
          {
              break;
          }
      }
  }
}
