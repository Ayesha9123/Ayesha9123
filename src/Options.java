import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    //Account account = new Account();
    Scanner scanner = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");
    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

    public void getLogin() {
        int x = 1;
        do {
            try {
                data.put(12345678, 1212);
                data.put(87654321, 2121);
                System.out.println("Welcome!");
                System.out.println("Enter your Customer Number ");
                setCustomerNumber(scanner.nextInt());
                System.out.println("Enter your pin");
                setPinNumber(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid characters, Enter only Numbers \n");
              //  x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println(" Invalid Customer Number or Pin");
        }while (x == 1) ;

    }

    public void getAccountType(){
        System.out.println("Enter your Choice");
        System.out.println("1.Current Account,  2.Savings Account, 3.Exit");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                getCurrent();
                break;
            case 2:
                getSavings();
                break;
            case 3:
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }

        public void getCurrent() {
            System.out.println("Enter the action to be performed ");
            System.out.println("1.View Balance,  2.Deposite, 3.Withdrawal, 4.Exit");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Current Account Balance :" + moneyFormat.format(getCurrentAccountBalance()));
                    getAccountType();
                    break;
                case 2:
                    getCurrentAccountDeposite();
                    getAccountType();
                    break;
                case 3:
                    getCurrentAccountWithdrawal();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    getCurrent();


            }
        }

        public void getSavings() {
            System.out.println("Enter the action to be performed ");
            System.out.println("1.View Balance,  2.Deposite, 3.Withdrawal, 4.Exit");
            int action1 = scanner.nextInt();
            switch (action1) {
                case 1:
                    System.out.println("Current Account Balance :" + moneyFormat.format(getSavingsAccountBalance()));
                    getAccountType();
                    break;
                case 2:
                    getSavingsAccountDeposite();
                    getAccountType();
                    break;
                case 3:
                    getSavingsAccountWithdrawal();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    getSavings();
                    break;

            }
        }

    }

