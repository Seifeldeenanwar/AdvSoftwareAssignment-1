import java.util.Scanner;

public class Main {
    public static int Validation(int choice) {

        if (choice == 1 || choice == 2 || choice == 3) {
            return choice;
        }
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nInvalid choice , please select again \n-> ");
            choice = TakeInput(input);
            if (choice == 1 || choice == 2 || choice == 3) {
                return choice;
            }
        }

    }

    public static int TakeInput(Scanner input) {
        int orderChoice;
        while (true) {
            if (input.hasNextInt()) {
                orderChoice = input.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter a number only.");
                input.next();
            }
        }
        return orderChoice;
    }

    public static void GUI() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int orderChoice;
            Order order;
            Service Rs = new ResturantService();
            System.out.print("\nChoose order type \n1-Din-in \n2-Takeway \n3-Delivary \n-> ");
            orderChoice = TakeInput(input);
            orderChoice = Validation(orderChoice);
            if (orderChoice == 1) {
                order = new Din_In();
                order.addObserver(new Kitchen());
                order.addObserver(new Waiter());
            } else if (orderChoice == 2) {
                order = new TakeAway();
                order.addObserver(new Kitchen());
            } else {
                order = new Delivary();
                order.addObserver(new Kitchen());
                order.addObserver(new Driver());
            }
            System.out.print("1-Display Vegeterian menu\n2-Display Non Vegeterian menu\n3-Display kids menu \n-> ");
            int choice1 = TakeInput(input);
            choice1 = Validation(choice1);
            Menu menu;
            if (choice1 == 1) {
                menu = new VegMenu();

            } else if (choice1 == 2) {
                menu = new NonVegMenu();
            } else {
                menu = new KidsMenu();
            }
            int choice2 = 1;
            char again;
            do {
                Rs.displayMenu(menu);
                System.out.print("Select items \n-> ");
                choice2 = TakeInput(input);
                choice2 = Validation(choice2);
                Item item;
                if (choice2 == 1) {
                    item = menu.createItalianPizza();
                } else if (choice2 == 2) {
                    item = menu.creatEasternPizza();
                } else {
                    item = menu.createBurger();
                }
                char addoption = '1';
                do {
                    System.out.print("Do you want to add extras ?\n0)No \nAny key) Yes \n-> ");
                    addoption = input.next().charAt(0);
                    if (addoption == '0') {
                        break;
                    }
                    System.out.print("Select\n1-Extra cheese \n2-Extra onion \n3-Extra Topping \n-> ");
                    int extrachoice = TakeInput(input);
                    extrachoice = Validation(extrachoice);
                    if (extrachoice == 1) {
                        item = new ExtraCheese((item));
                    } else if (extrachoice == 2) {
                        item = new ExtraOnion(item);
                    } else {
                        item = new ExtraTopping(item);
                    }
                    System.out.print("Do you want to add extras ?\n0)No \nAny key) Yes \n-> ");
                    addoption = input.next().charAt(0);
                } while (addoption != '0');
                order.setItem(item);
                System.out.print("Do you want to add another item ? 0-end , other add more \n-> ");
                again = input.next().charAt(0);
            } while (again != '0');
            Payment p;
            int payemntchoice;
            System.out
                    .println("\nSelect your approrate payment method \n1-Credit card \n2-Mobile wallet \n3-Cash \n-> ");
            payemntchoice = TakeInput(input);
            payemntchoice = Validation(payemntchoice);
            if (payemntchoice == 1) {
                p = new CreditCard();
            } else if (payemntchoice == 2) {
                p = new MobileWallet();
            } else {
                p = new CashPay();
            }
            Rs.setPaymentmethod(p);
            Rs.setOrder(order);
            Rs.generateFinalReceipt();
            break;
        }

    }

    public static void main(String args[]) {
        GUI();

    }
}
