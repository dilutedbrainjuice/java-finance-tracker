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
