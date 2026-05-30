import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

public class driver {
    private static ArrayList<Customer> customers = new ArrayList<>();
    
    // Feature: Employee Info via Inheritance (Super Class Person)
    public static employee activeStaff = new employee("Abir Hasan", "Senior Branch Teller");

    public static void main(String[] args) {
        JFrame frame = new JFrame("CSE282.6 Java project");
        frame.setSize(950, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(240, 244, 248));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        // --- SECTION 1: DESIGNER HEADER ---
        JPanel header = new JPanel(new BorderLayout());
        header.setPreferredSize(new Dimension(900, 80));
        header.setBackground(new Color(26, 37, 47)); // Corporate Navy
        header.setBorder(new EmptyBorder(10, 25, 10, 25));

        JLabel logo = new JLabel("Southeast Bank");
        logo.setForeground(new Color(241, 196, 15)); // Gold
        logo.setFont(new Font("Segoe UI", Font.BOLD, 24));

        JLabel staffInfo = new JLabel("<html><div style='text-align: right; color: white;'>"
                + "OFFICER: <b>" + activeStaff.employeeName.toUpperCase() + "</b><br/>"
                + "ROLE: " + activeStaff.employeeRole+ "</div></html>");

        header.add(logo, BorderLayout.WEST);
        header.add(staffInfo, BorderLayout.EAST);
        frame.add(header);

        // --- SECTION 2: REGISTRATION (Blue) ---
        JPanel regPanel = createStyledPanel("Registration", new Color(52, 152, 219));
        JTextField nIn = new JTextField(); JTextField aIn = new JTextField(); JTextField bIn = new JTextField();
        JButton addBtn = new JButton("Register Customer");
        styleButton(addBtn, new Color(41, 128, 185));
        regPanel.add(new JLabel("Full Name:")); regPanel.add(nIn);
        regPanel.add(new JLabel("Account Number:")); regPanel.add(aIn);
        regPanel.add(new JLabel("Initial Deposite:")); regPanel.add(bIn);
        regPanel.add(new JLabel("")); regPanel.add(addBtn);

        // --- SECTION 3: MANAGEMENT (Withdraw, Deposit, View) ---
        JPanel mgtPanel = createStyledPanel("Account Management", new Color(46, 204, 113));
        JComboBox<String> userCombo = new JComboBox<>();
        JTextField amtIn = new JTextField();
        JButton depBtn = new JButton("Deposit");
        JButton withBtn = new JButton("Withdraw");
        JButton viewBtn = new JButton("View Details");
        styleButton(depBtn, new Color(39, 174, 96));
        styleButton(withBtn, new Color(192, 57, 43));
        styleButton(viewBtn, new Color(52, 73, 94));
        mgtPanel.add(new JLabel("Select User:")); mgtPanel.add(userCombo);
        mgtPanel.add(new JLabel("Amount ($):")); mgtPanel.add(amtIn);
        mgtPanel.add(depBtn); mgtPanel.add(withBtn);
        mgtPanel.add(new JLabel("Quick View:")); mgtPanel.add(viewBtn);

        // --- SECTION 4: TRANSFER (Orange) ---
        JPanel transPanel = createStyledPanel("Transfer Money", new Color(230, 126, 34));
        JComboBox<String> sCombo = new JComboBox<>();
        JComboBox<String> rCombo = new JComboBox<>();
        JTextField tAmtIn = new JTextField();
        JButton sendBtn = new JButton("Send Money");
        styleButton(sendBtn, new Color(211, 84, 0));
        transPanel.add(new JLabel("Sender:")); transPanel.add(sCombo);
        transPanel.add(new JLabel("Receiver:")); transPanel.add(rCombo);
        transPanel.add(new JLabel("Amount:")); transPanel.add(tAmtIn);
        transPanel.add(new JLabel("")); transPanel.add(sendBtn);

        // --- SECTION 5: LOAN MANAGEMENT ---
        JPanel loanPanel = createStyledPanel("Loan Management", new Color(155, 89, 182));
        JComboBox<String> loanUser = new JComboBox<>();
        JTextField loanAmount = new JTextField();
        JButton applyLoanBtn = new JButton("Apply Loan");
        JButton viewLoanBtn = new JButton("View Loan");
        styleButton(applyLoanBtn, new Color(142, 68, 173));
        styleButton(viewLoanBtn, new Color(123, 31, 162));
        loanPanel.add(new JLabel("Customer:"));
        loanPanel.add(loanUser);

        loanPanel.add(new JLabel("Loan Amount:"));
        loanPanel.add(loanAmount);

        loanPanel.add(applyLoanBtn);
        loanPanel.add(viewLoanBtn);

        // --- SECTION 6: AUDIT LOGS ---
        JTextArea logArea = new JTextArea(12, 80);
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(logArea);
        scroll.setBorder(BorderFactory.createTitledBorder("System Activity Logs"));

        JButton historyBtn = new JButton("Show Transaction Statement History");
        styleButton(historyBtn, new Color(22, 160, 133));

        // --- CORE FUNCTIONALITY LOGIC ---

        // Register Logic
        addBtn.addActionListener(e -> {
            try {
                Customer c = new Customer(Integer.parseInt(aIn.getText()), nIn.getText(), Double.parseDouble(bIn.getText()));
                customers.add(c);
                userCombo.addItem(c.getCustomerName());
                sCombo.addItem(c.getCustomerName());
                rCombo.addItem(c.getCustomerName());
                loanUser.addItem(c.getCustomerName());
                logArea.append("[" + activeStaff.employeeName + "] Registered Customer: " + c.getCustomerName() + "\n");
                nIn.setText(""); aIn.setText(""); bIn.setText("");
            } catch (Exception ex) { JOptionPane.showMessageDialog(frame, "Input Error!"); }
        });

        // Deposit Logic
        depBtn.addActionListener(e -> {
            try {
                Customer s = customers.get(userCombo.getSelectedIndex());
                double val = Double.parseDouble(amtIn.getText());
                s.Deposite(val);
                logArea.append("[" + activeStaff.employeeName + "] DEPOSIT: $" + val + " to " + s.getCustomerName() + "\n");
                amtIn.setText("");
            } catch (Exception ex) { }
        });

        // Withdraw Logic (Fixed)
        withBtn.addActionListener(e -> {
            try {
                Customer s = customers.get(userCombo.getSelectedIndex());
                double val = Double.parseDouble(amtIn.getText());
                s.withdraw(val);
                logArea.append("[" + activeStaff.employeeName + "] WITHDRAW: $" + val + " from " + s.getCustomerName() + "\n");
                amtIn.setText("");
            } catch (Exception ex) { JOptionPane.showMessageDialog(frame, ex.getMessage()); }
        });

        // Transfer Logic
        sendBtn.addActionListener(e -> {
            try {
                Customer sender = customers.get(sCombo.getSelectedIndex());
                Customer receiver = customers.get(rCombo.getSelectedIndex());
                double val = Double.parseDouble(tAmtIn.getText());
                if(sender == receiver) throw new Exception("Same account transfer error!");
                
                sender.withdraw(val); // Logic: Deduct from sender
                receiver.Deposite(val);  // Logic: Add to receiver
                
                logArea.append("[" + activeStaff.employeeName + "] TRANSFER: $" + val + " [" + sender.getCustomerName() + " -> " + receiver.getCustomerName() + "]\n");
                tAmtIn.setText("");
            } catch (Exception ex) { JOptionPane.showMessageDialog(frame, "Failed: " + ex.getMessage()); }
        });

        // View Details Logic
        viewBtn.addActionListener(e -> {
            if(userCombo.getSelectedIndex() == -1) return;
            Customer s = customers.get(userCombo.getSelectedIndex());
            String info = "Name: " + s.getCustomerName() + "\nAcc: " + s.getNumber() + "\nBalance: $" + s.getBalance();
            JOptionPane.showMessageDialog(frame, info, "Account Info", JOptionPane.INFORMATION_MESSAGE);
        });

        // History Logic
        historyBtn.addActionListener(e -> {
            if(userCombo.getSelectedIndex() == -1) return;
            Customer s = customers.get(userCombo.getSelectedIndex());
            String hist = "Audit History for " + s.getCustomerName() + ":\n";
            for(String line : s.getHistory()) hist += line + "\n";
            JOptionPane.showMessageDialog(frame, new JScrollPane(new JTextArea(hist, 15, 35)));
        });
        
        // Apply Loan Logic
        applyLoanBtn.addActionListener(e -> {
            try {
            Customer customer = customers.get(loanUser.getSelectedIndex());
            double amount = Double.parseDouble(loanAmount.getText());
            Loan loan = new Loan((int)(Math.random() * 1000), amount,10.0);
            loan.approveLoan();
            customer.applyLoan(loan);
            customer.Deposite(amount);
            logArea.append( "[" + activeStaff.employeeName + "] LOAN APPROVED:" +amount +" for " +customer.getCustomerName() +"\n");
            loanAmount.setText("");
            JOptionPane.showMessageDialog(frame, "Loan Approved Successfully!");}
            catch(Exception ex) {
            JOptionPane.showMessageDialog(frame,ex.getMessage());}

        });

        // View Loan Logic
        viewLoanBtn.addActionListener(e -> {
            try {Customer customer =customers.get(loanUser.getSelectedIndex());
            if(customer.getLoan() == null) {
            JOptionPane.showMessageDialog(frame,"No Loan Found");
            return;}
            JOptionPane.showMessageDialog(frame,customer.getLoan().getLoanInfo());
            }
            catch(Exception ex) {
            JOptionPane.showMessageDialog(frame,ex.getMessage());
            }
        });

        // Assembly
        frame.add(regPanel); frame.add(mgtPanel); frame.add(transPanel); frame.add(loanPanel);
        frame.add(scroll); frame.add(historyBtn);
        frame.setVisible(true);
    }

    // Design Helpers
    private static JPanel createStyledPanel(String title, Color accent) {
        JPanel p = new JPanel(new GridLayout(4, 2, 8, 8));
        p.setPreferredSize(new Dimension(290, 220));
        p.setBackground(Color.WHITE);
        TitledBorder b = BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(5, 0, 0, 0, accent), title);
        b.setTitleFont(new Font("Segoe UI", Font.BOLD, 14));
        p.setBorder(new CompoundBorder(b, new EmptyBorder(10, 10, 10, 10)));
        return p;
    }

    private static void styleButton(JButton btn, Color bg) {
        btn.setBackground(bg); btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false); btn.setFont(new Font("Segoe UI", Font.BOLD, 11));
    }
}