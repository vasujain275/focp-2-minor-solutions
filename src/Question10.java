// Declare a class Account to represent a bank account. Include the following members:
// Data members: Name of the depositor, Account number, Type of account, Balance amount in the account.
// This class also contains the following member functions:
// To assign data members
// To deposit money
// To withdraw money after checking the balance (minimum balance is < 1000)
// To display the data members
// getter and setter for all the data members

class Account {
  private String name;
  private int accountNumber;
  private String accountType;
  private double balance;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (balance - amount < 1000) {
      System.out.println("Insufficient balance");
    } else {
      balance -= amount;
    }
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Type: " + accountType);
    System.out.println("Balance: " + balance);
  }
}

public class Question10 {
    public static void main(String[] args) {
      Account account = new Account();
      account.setName("John Doe");
      account.setAccountNumber(123456789);
      account.setAccountType("Savings");
      account.setBalance(1000);
      account.deposit(1000);
      account.withdraw(500);
      account.withdraw(1000);
      account.display();
    }
}
