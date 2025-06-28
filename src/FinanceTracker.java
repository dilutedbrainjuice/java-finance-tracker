import java.util.Scanner;
import java.time.*;

public class FinanceTracker {

    public class Account {
        private int amount;
        private String name;

        //constructor
        public Account(int amount, String name){
            this.amount = amount;
            this.name = name;
        }

        //getters
        public int getAmount(){
            return amount;
        }

        public String getName(){
            return name;
        }
        
        //setters
        public void setAmount(int amount){
            this.amount = amount;
        }

        public void setName(String name){
            this.name = name;
        }


    }

    public class Transaction {
        private int amount;
        private String description;
        private LocalDateTime dateTime;


        //constructor
        public Transaction(int amount, String description, LocalDateTime dateTime){
            this.amount = amount;
            this.description = description;
            this.dateTime = dateTime;
        }

        //getters
        public int getAmount(){
            return amount;
        }

        public String getDescription() {
            return description;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        //setters
        public void setAmount(int amount) {
            this.amount = amount;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDateTime (LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        public void processTransaction (int accountAmount, int amount) {
            accountAmount = accountAmount + amount;
            System.out.println("amount has been updated: " + accountAmount);
        }

    }

    public class IncomeTransaction extends Transaction {

        private int taxPercentage;



        public IncomeTransaction(int amount, String description, LocalDateTime dateTime, int taxPercentage){
            super(amount, description, dateTime);
            this.taxPercentage = taxPercentage;
        }

        public double getTax(){
            return taxPercentage;
        }

        public void setTax(int taxPercentage){
            this.taxPercentage = taxPercentage;
        }

        public int calculateNet (int amount, int taxPercentage){
            int tax = amount * (taxPercentage / 100);
            amount = amount - tax;

            return amount;

        }


        @Override
        public void processTransaction (int accountAmount, int amount) {
            int netAmount = calculateNet(amount, taxPercentage);

            accountAmount = accountAmount + netAmount;
            System.out.println("Income has been added to account: " + accountAmount);
        }
    }

    public class ExpenseTransaction extends Transaction {

        public ExpenseTransaction(int amount, String description, LocalDateTime dateTime){
            super(amount, description, dateTime);
        }

        @Override
        public void processTransaction (int accountAmount, int amount) {

            //check if amount > accountAmount, if yes declined
            if (amount > accountAmount){
                System.out.println("Insufficient amount! Your account only has"+accountAmount+" while you need "+amount+"!");
            } else{
                accountAmount = accountAmount - amount;
                System.out.println("Transaction successful!");
            }
        }
    }

    




    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("");
            System.out.println("===== Personal Finance Manager =====");
            System.out.println("Please select an option:");
            System.out.println("1. Input Monthly Salary");
            System.out.println("2. Input Monthly Commitment");
            System.out.println("3. Input Monthly Investments");
            System.out.println("4. Input Monthly Savings");
            System.out.println("5. Daily Expenses");
            System.out.println("6. Generate Report for Total Investments and Savings");
            System.out.println("7. Generate Report for Daily Expenses");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-7): ");

            choice = scanner.nextInt();

            switch (choice) {
                case value:
                    
                    break;
            
                default:
                    break;
            }

        }
    }
}
