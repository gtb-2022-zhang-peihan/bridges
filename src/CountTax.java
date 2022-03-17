public class CountTax {
    public static void main(String[]args){
    Income[] incomes = new Income[]{
            new Salary(13000),
            new Remuneration(20000)
    };
    System.out.println(totalTax(incomes));
    System.out.println(totalIncome(incomes));
}

    public static double totalIncome(Income... incomes){
        double total=0;
        for (Income income:incomes){
            total=total+income.getIncome();
        }
        return total;
    }

    public static double totalTax(Income... incomes){
        double total=0;
        for (Income income: incomes){
            total = total + income.getTax();
        }
        return total;
    }
}


class Income {
    protected double income;

    public Income(double income) {
        this.income=income;
    }

    public double getIncome(){
        return this.income;
    }

    public double getTax(){
        return income*0.1;
    }
}

class Salary extends Income {
    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}

class Remuneration extends Income {
    public Remuneration(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if(income<=800){
            return 0;
        }
        else if(income<=4000){
            return (income-800)*0.7*0.2;
        }
        return income*0.8*0.7*0.2;
    }
}
