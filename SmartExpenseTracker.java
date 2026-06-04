
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class SmartExpenseTracker extends JFrame implements ActionListener {

    JLabel title, amountLabel, categoryLabel, totalLabel;

    JTextField amountField;

    String categories[] = {
            "Food", "Travel", "Shopping", "Bills", "Entertainment", "Other"
    };

    JComboBox<String> categoryBox;

    JButton addButton, deleteButton, clearButton;

    JTable table;
    DefaultTableModel model;

    double totalExpense = 0;

    SmartExpenseTracker() {

        // Frame
        setTitle("Smart Expense Tracker");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(245, 245, 245));

        // Title
        title = new JLabel("💰 Smart Expense Tracker", SwingConstants.CENTER);
        title.setBounds(180, 20, 400, 40);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        add(title);

        // Amount Label
        amountLabel = new JLabel("Enter Amount:");
        amountLabel.setBounds(80, 100, 150, 30);
        amountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(amountLabel);

        // Amount Field
        amountField = new JTextField();
        amountField.setBounds(220, 100, 180, 35);
        amountField.setFont(new Font("Arial", Font.PLAIN, 16));
        add(amountField);

        // Category Label
        categoryLabel = new JLabel("Category:");
        categoryLabel.setBounds(430, 100, 100, 30);
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(categoryLabel);

        // Combo Box
        categoryBox = new JComboBox<>(categories);
        categoryBox.setBounds(530, 100, 150, 35);
        categoryBox.setFont(new Font("Arial", Font.PLAIN, 15));
        add(categoryBox);

        // Buttons
        addButton = new JButton("Add Expense");
        addButton.setBounds(120, 170, 160, 40);
        addButton.setFont(new Font("Arial", Font.BOLD, 15));
        add(addButton);

        deleteButton = new JButton("Delete Selected");
        deleteButton.setBounds(320, 170, 180, 40);
        deleteButton.setFont(new Font("Arial", Font.BOLD, 15));
        add(deleteButton);

        clearButton = new JButton("Clear All");
        clearButton.setBounds(540, 170, 150, 40);
        clearButton.setFont(new Font("Arial", Font.BOLD, 15));
        add(clearButton);

        // Action Listeners
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Table
        model = new DefaultTableModel();

        model.addColumn("Amount");
        model.addColumn("Category");

        table = new JTable(model);
        table.setFont(new Font("Arial", Font.PLAIN, 15));
        table.setRowHeight(25);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(80, 250, 620, 220);
        add(pane);

        // Total Label
        totalLabel = new JLabel("Total Expense: ₹0");
        totalLabel.setBounds(260, 500, 300, 40);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 24));
        totalLabel.setForeground(Color.BLUE);
        add(totalLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Add Expense
        if (e.getSource() == addButton) {

            try {
                double amount = Double.parseDouble(amountField.getText());

                String category = categoryBox.getSelectedItem().toString();

                model.addRow(new Object[]{amount, category});

                totalExpense += amount;

                if (totalExpense == (int) totalExpense) {
                    totalLabel.setText("Total Expense: ₹" + (int) totalExpense);
                } else {
                    totalLabel.setText("Total Expense: ₹" + totalExpense);
                }

                amountField.setText("");

                JOptionPane.showMessageDialog(this,
                        "Expense Added Successfully!");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Please Enter Valid Amount!");
            }
        }

        // Delete Selected Row
        if (e.getSource() == deleteButton) {

            int row = table.getSelectedRow();

            if (row != -1) {

                double value = Double.parseDouble(
                        model.getValueAt(row, 0).toString());

                totalExpense -= value;

                if (totalExpense == (int) totalExpense) {
                    totalLabel.setText("Total Expense: ₹" + (int) totalExpense);
                } else {
                    totalLabel.setText("Total Expense: ₹" + totalExpense);
                }

                model.removeRow(row);

                JOptionPane.showMessageDialog(this,
                        "Expense Deleted!");

            } else {

                JOptionPane.showMessageDialog(this,
                        "Select a Row First!");
            }
        }

        // Clear All Data
        if (e.getSource() == clearButton) {

            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to clear all expenses?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {

                model.setRowCount(0);

                totalExpense = 0;

                totalLabel.setText("Total Expense: ₹0");

                JOptionPane.showMessageDialog(this,
                        "All Expenses Cleared!");
            }
        }
    }

    public static void main(String[] args) {

        new SmartExpenseTracker();
    }
}