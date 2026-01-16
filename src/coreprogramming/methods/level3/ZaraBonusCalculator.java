package coreprogramming.methods.level3;
class ZaraBonusCalculator {

    static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];
        for (int i = 0; i < employees; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    static void displaySummary(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("OldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < oldData.length; i++) {
            System.out.println(oldData[i][0] + "\t\t" +
                    oldData[i][1] + "\t" +
                    newData[i][0] + "\t\t" +
                    newData[i][1]);

            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] newSalaryData = calculateBonus(employeeData);
        displaySummary(employeeData, newSalaryData);
    }
}
