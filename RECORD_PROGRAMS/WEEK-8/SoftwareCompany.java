package inheritance;

import java.util.Scanner;

// Interface for all company categories.
interface Employee {
    void salaryDetails();
}

// Regular employees get Basic Pay, HRA and T.A.
class RegularEmployee implements Employee {
    @Override
    public void salaryDetails() {
        int basicPay = 25000;
        int hra = 15000;
        int ta = 5000;
        int totalAmount = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + totalAmount);
    }
}

// Contract employees get Basic Pay and T.A. There is no HRA.
class ContractEmployee implements Employee {
    @Override
    public void salaryDetails() {
        int basicPay = 12000;
        int ta = 3000;
        int totalAmount = basicPay + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: 0");
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + totalAmount);
    }
}

// Vendors do not have a monthly employee salary.
class Vendor implements Employee {
    @Override
    public void salaryDetails() {
        System.out.println("Vendor has no monthly salary details.");
    }
}

public class SoftwareCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String employeeId = scanner.nextLine().toUpperCase();

        Employee employee;

        switch (employeeId.charAt(0)) {
            case 'R':
                employee = new RegularEmployee();
                break;
            case 'C':
                employee = new ContractEmployee();
                break;
            case 'V':
                employee = new Vendor();
                break;
            default:
                System.out.println("Invalid Employee Id.");
                scanner.close();
                return;
        }

        employee.salaryDetails();
        scanner.close();
    }

}
