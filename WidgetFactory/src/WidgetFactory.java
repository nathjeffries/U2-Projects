import javax.swing.JOptionPane;
public class WidgetFactory {


static double numWidgets;
static double numDays;
static double costProduction;
static double costWidgets;
static double profit;




    public static void main(String[] args) {
        numWidgets = Double.parseDouble(JOptionPane.showInputDialog("How many Widgets were made each hour?"));
        numDays = Double.parseDouble(JOptionPane.showInputDialog("How many days has it been?"));

        calculate();
    }
    public static void calculate() {
costProduction = numDays * 5 * 16 * 16.5;
costWidgets = numWidgets * 16 * numDays * 10;
profit = costWidgets - costProduction;
        JOptionPane.showMessageDialog(null,"Total number of Widgets: " + (numWidgets * numDays * 16) + "\n"+" Total number of days: " + numDays +"\n"+ " Cost of Widgets: $" + costWidgets + "\n"+ " Cost of production: $" + costProduction +"\n"+ " Total profit: $" + profit);


    }




    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget, and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */
}
