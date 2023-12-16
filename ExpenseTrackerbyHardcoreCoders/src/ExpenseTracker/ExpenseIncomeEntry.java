package ExpenseTracker;

/**
 Project Name : Expense Tracker

 Student Name's:
 Rishabh Vinay Bhagat (C0892204)            Aatman Rajyaguru (C0895289)
 Karamveer Singh (C0893963)                 Hyder Ali(C0893786)
 */

public class ExpenseIncomeEntry {

    private String date;
    private String description;
    private double amount;
    private String type;


    public ExpenseIncomeEntry(String date, String description, double amount, String type)
    {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    public String getDate()
    {
        return date;
    }
    public String getDescription()
    {
        return description;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getType(){
        return type;
    }
}

