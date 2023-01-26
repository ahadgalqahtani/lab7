
public class CreditCard{
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        owner = newCardHolder;
        creditLimit = new Money(limit);
        balance = new Money(0);
    }

    public Money getBalance(){
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount){
        Money temp = new Money(balance.add(amount));

        if(temp.compareTo(creditLimit)>0){
            System.out.println("Exceeds credit limit.");
        }
        else{
            balance = temp;
            System.out.println("Charge: " + amount.toString());
        }
    }

    public void payment(Money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}