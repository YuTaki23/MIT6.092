public class FooCooperation {
    public static void salary(double basePay, int hoursWorked){
        double endSalary, moreSalary;
        int moreHors;

        if(basePay <= 8 || hoursWorked >= 60){
            System.out.println("Error!");
        }
        else {
            if (hoursWorked <= 40) {
                endSalary = basePay * hoursWorked;
                System.out.println(endSalary);
            }
            else {
                endSalary = basePay * 40;
                moreSalary = (hoursWorked - 40) * 1.5 * basePay;
                endSalary += moreSalary;
                System.out.println(endSalary);
            }
        }
    }

    public static void main(String[] args){
        System.out.print("Employee 1:");
        salary(7.50, 35);
        System.out.print("\n");

        System.out.print("Employee 2:");
        salary(8.20, 47);
        System.out.print("\n");

        System.out.print("Employee 3:");
        salary(10.00, 73);
        System.out.print("\n");
    }
}
