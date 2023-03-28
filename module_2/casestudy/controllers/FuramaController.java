package casestudy.controllers;

import casestudy.services.EmployeeServiceImpl;

import java.util.Scanner;

public abstract class FuramaController {
    public static Scanner sc = new Scanner(System.in);
    public static int choose;

    public static void main(String[] args) {


        do {
            System.out.println("===MENU===");
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    EmployeeManagement();
                    break;
                case 2:
                    CustomerManagement();
                    break;
                case 3:
                    FacilityManagement();
                    break;
                case 4:
                    BookingManagerment();
                    break;
                case 5:
                    PromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        } while (true);
    }

    public static void EmployeeManagement() {
        do {
            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Delete employee\n" +
                    "4 Edit employee" +
                    "4 Return main menu");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choose = sc.nextInt();
            System.out.println();
            System.out.println("===============================");

            switch (choose) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.delete();
                    break;
                case 4:

                    break;
            }
        } while (choose != 5);
    }

    public static void CustomerManagement() {
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Delete customer\n" +
                "4. Return main menu");
        System.out.print("Nhập vào lựa chọn của bạn: ");

        choose = sc.nextInt();

    }

    public static void FacilityManagement() {

        System.out.println("1 Display list facility\n" +
                "2 Add new facility\n" +
                "3 Display list facility maintenance\n" +
                "4 Return main menu");
        System.out.print("Nhập vào lựa chọn của bạn: ");
        choose = sc.nextInt();

    }

    public static void BookingManagerment() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new constracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
        System.out.print("Nhập vào lựa chọn của bạn: ");

        choose = sc.nextInt();


    }

    public static void PromotionManagement() {
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
        System.out.print("Nhập vào lựa chọn của bạn: ");

        choose = sc.nextInt();

    }
}
