package ExpenseTracker;

/**
 Project Name : Expense Tracker

 Student Name's:
 Rishabh Vinay Bhagat (C0892204)            Aatman Rajyaguru (C0895289)
 Karamveer Singh (C0893963)                 Hyder Ali(C0893786)
 */

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
public class ExpenseTrackerTableModel extends AbstractTableModel {
    private final List<ExpenseIncomeEntry> entries;
    private final String[] field_names = {"Date","Description","Amount","Type"};

    public ExpenseTrackerTableModel(){
        entries = new ArrayList<>();
    }

    public void addEntry(ExpenseIncomeEntry entry){
        entries.add(entry);
        fireTableRowsInserted(entries.size()-1, entries.size()-1);
    }


    @Override
    public int getRowCount() { return entries.size(); }

    @Override
    public int getColumnCount() { return field_names.length;}

    @Override
    public String getColumnName(int columnIndex){ return field_names[columnIndex]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        ExpenseIncomeEntry entry = entries.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> entry.getDate();
            case 1 -> entry.getDescription();
            case 2 -> entry.getAmount();
            case 3 -> entry.getType();
            default -> null;
        };
    }
}
