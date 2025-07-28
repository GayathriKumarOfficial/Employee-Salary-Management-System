package projects;
//in eclipe got to Project1-WPIRO->properties->
//->run as ->congure->click project1->arguments->
//->type the command line arguments in program argument box
public class Project1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an employee ID.");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        // Employee Data Arrays
        int[] empNos = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] names = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDates = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] designationCodes = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] departments = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basics = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hras = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] its = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        // Designation + DA
        String designation = "";
        int da = 0;

        boolean found = false;

        for (int i = 0; i < empNos.length; i++) {
            if (empNos[i] == empId) {
                found = true;

                // Switch for Designation and DA
                switch (designationCodes[i]) {
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                        da = 0;
                        break;
                }

                // Salary Calculation
                int salary = basics[i] + hras[i] + da - its[i];

                // Output
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empNos[i] + "\t" + names[i] + "\t\t" + departments[i] + "\t\t" + designation + "\t\t" + salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}

