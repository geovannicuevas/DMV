import java.util.*;
public class Driver {

    public static void menu(ArrayList<Customer> customerArrayList) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        String userName,userDOB,userState,userViolation;
        do {

            System.out.print("1. Take test for new license\n" +
                    "2. Renew existing license\n" +
                    "3. Move from out of state\n" +
                    "4. Answer citation/suspended license\n" +
                    "5. See current queue\n" +
                    "6. Quit\n");
            userChoice = sc.nextInt();
            switch(userChoice) {
                case 1:
                    System.out.println("What is your name?");
                    userName = sc.next();
                    System.out.println("What is your date of birth?");
                    userDOB = sc.next();
                    Customer newCustomer = new NewTest(userName,userDOB);
                    customerArrayList.add(newCustomer);
                    break;
                case 2:
                    System.out.println("What is your name?");
                    userName = sc.next();
                    Customer customerRenew = new Renew(userName);
                    customerArrayList.add(customerRenew);
                    break;
                case 3:
                    System.out.println("What is your name?");
                    userName = sc.next();
                    System.out.println("What state did you move from?");
                    userState = sc.next();
                    Customer customerStateMoved = new Move(userName, userState);
                    customerArrayList.add(customerStateMoved);
                    break;
                case 4:
                    System.out.println("What is your name?");
                    userName = sc.next();
                    System.out.println("What violation did you commit?");
                    userViolation = sc.next();
                    Customer newViolation = new Suspended(userName,userViolation);
                    customerArrayList.add(newViolation);
                    break;
                case 5:
                    for (Customer x:customerArrayList) {
                        System.out.println(x.getCustomerInfo());
                    }
                    break;
            }
        }
        while(userChoice != 6);
    }
    public static void main(String[] args) {
        ArrayList<Customer> arrayList = new ArrayList<Customer>();
        menu(arrayList);
    } }