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

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        dateField = new JTextField(10);
        descriptionField = new JTextField(20);
        amountField = new JTextField(10);
        typeCombobox = new JComboBox<>(new String[]{"Expense","Income"});

        addButton = new JButton("Add");
        addButton.addActionListener(e -> addEntry());
        balanceLabel = new JLabel("Balance : $" + balance);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Date :"));
        inputPanel.add(dateField);

        inputPanel.add(new JLabel("Description :"));
        inputPanel.add(descriptionField);

        inputPanel.add(new JLabel("Amount :"));
        inputPanel.add(amountField);

        inputPanel.add(new JLabel("Type :"));
        inputPanel.add(typeCombobox);

        inputPanel.add(addButton);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(balanceLabel);
        setLayout(new BorderLayout());

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setTitle("Expenses Tracker by Hardcore Coders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}


