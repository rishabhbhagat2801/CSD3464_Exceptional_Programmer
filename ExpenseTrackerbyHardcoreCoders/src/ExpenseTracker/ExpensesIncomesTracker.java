package ExpenseTracker;

/**
 Project Name : Expense Tracker

 Student Name's:
 Rishabh Vinay Bhagat (C0892204)            Aatman Rajyaguru (C0895289)
 Karamveer Singh (C0893963)                 Hyder Ali(C0893786)
 */

import javax.swing.*;
import java.awt.*;

public class ExpensesIncomesTracker extends JFrame {

    private final ExpenseTrackerTableModel tableModel;
    private final JTable table;
    private final JTextField dateField;
    private final JTextField descriptionField;
    private final JTextField amountField;
    private final JComboBox<String> typeCombobox;
    private final JButton addButton;
    private final JLabel balanceLabel;
    private double balance;
    public ExpensesIncomesTracker(){

        UIManager.put("TextField.foreground", Color.BLACK);
        UIManager.put("TextField.background", Color.WHITE);
        UIManager.put("TextField.caretForeground", Color.RED);

        UIManager.put("ComboBox.foreground", Color.BLUE);
        UIManager.put("ComboBox.selectionForeground", Color.WHITE);
        UIManager.put("ComboBox.selectionBackground", Color.BLACK);

        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.background", Color.ORANGE);

        UIManager.put("Label.foreground", Color.BLACK);

        Font customFont = new Font("Arial", Font.BOLD, 20);
        UIManager.put("Label.font", customFont);
        UIManager.put("TextField.font", customFont);
        UIManager.put("ComboBox.font", customFont);
        UIManager.put("Button.font", customFont);

        balance = 0.0;
        tableModel = new ExpenseTrackerTableModel();

    }

}


