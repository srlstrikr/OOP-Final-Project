import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // STEP 1: Welcome message
        JOptionPane.showMessageDialog(null,
                "WELCOME TO MOBILE MONEY WALLET SIMULATOR");

        // STEP 2: Get customer's name
        String name = JOptionPane.showInputDialog("Enter your name:");

        // STEP 3: Get customer's PIN
        String pin = JOptionPane.showInputDialog("Enter your PIN:");

        // STEP 4: Create wallet balance
        double balance = 0.0;

        JOptionPane.showMessageDialog(null,
                "Welcome " + name + "! Your account is ready.");

        // STEP 5: Display menu
        int choice = 0;

        do {

            String menu = "MOBILE MONEY WALLET\n\n"
                    + "1. Check Balance\n"
                    + "2. Deposit Money\n"
                    + "3. Send Money\n"
                    + "4. Withdraw Money\n"
                    + "5. Pay Bills\n"
                    + "6. Exit\n\n"
                    + "Enter your choice:";

            choice = Integer.parseInt(
                    JOptionPane.showInputDialog(menu));

            switch (choice) {

                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Your balance is GH₵" + balance);
                    break;

                case 2:
                    double deposit = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Enter amount to deposit:"));

                    if (deposit > 0) {
                        balance = balance + deposit;

                        JOptionPane.showMessageDialog(null,
                                "Deposit successful!\nYour new balance is GH₵"
                                        + balance);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Enter a valid amount.");
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Send Money feature coming soon.");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,
                            "Withdrawal feature coming soon.");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            "Bill Payment feature coming soon.");
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,
                            "Thank you for using our system!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Invalid choice. Try again.");
            }

        } while (choice != 6);

    }
}