/**
 * Online Car Rental System - Enhanced Exception Handling Demonstration
 *
 * This program allows users to interact with a car rental system and demonstrates
 * exception handling by inserting data and managing potential errors.
 */

 import java.io.*;
 import java.sql.*;
 import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class CarRentalSystem {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         while (true) {
             displayMenu();
 
             try {
                 int choice = getUserChoice(scanner);
 
                 switch (choice) {
                     case 1:
                         addCarRentalEntry(scanner);
                         break;
                     case 2:
                         simulateCheckedExceptions();
                         break;
                     case 3:
                         simulateUncheckedExceptions();
                         break;
                     case 4:
                         System.out.println("Exiting the system. Goodbye!");
                         return;
                     default:
                         System.out.println("Invalid choice. Please select a valid option.");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("InputMismatchException caught: Please enter a valid numeric choice.");
                 scanner.nextLine(); // Clear invalid input
             }
         }
     }
 
     private static void displayMenu() {
         System.out.println("\nWelcome to the Online Car Rental System!");
         System.out.println("Please choose an operation:");
         System.out.println("1. Add a car rental entry");
         System.out.println("2. Simulate checked exceptions");
         System.out.println("3. Simulate unchecked exceptions");
         System.out.println("4. Exit");
     }
 
     private static int getUserChoice(Scanner scanner) {
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline
         return choice;
     }
 
     private static void addCarRentalEntry(Scanner scanner) {
         try {
             int carId = getCarId(scanner);
             String carModel = getCarModel(scanner);
             double rentalPrice = getRentalPrice(scanner);
 
             // Simulate database insertion
             displayEntrySuccess(carId, carModel, rentalPrice);
 
         } catch (NumberFormatException e) {
             System.out.println("NumberFormatException caught: Please enter valid numeric values for ID and price.");
         } catch (IllegalArgumentException e) {
             System.out.println("IllegalArgumentException caught: " + e.getMessage());
         } catch (Exception e) {
             System.out.println("An unexpected error occurred: " + e.getMessage());
         } finally {
             System.out.println("Operation completed. Returning to main menu.\n");
         }
     }
 
     private static int getCarId(Scanner scanner) {
         System.out.print("Enter car ID (integer): ");
         return Integer.parseInt(scanner.nextLine());
     }
 
     private static String getCarModel(Scanner scanner) {
         System.out.print("Enter car model: ");
         String carModel = scanner.nextLine();
         if (carModel.isEmpty()) {
             throw new IllegalArgumentException("Car model cannot be empty.");
         }
         return carModel;
     }
 
     private static double getRentalPrice(Scanner scanner) {
         System.out.print("Enter rental price per day: ");
         double rentalPrice = Double.parseDouble(scanner.nextLine());
         if (rentalPrice <= 0) {
             throw new IllegalArgumentException("Rental price must be positive.");
         }
         return rentalPrice;
     }
 
     private static void displayEntrySuccess(int carId, String carModel, double rentalPrice) {
         System.out.println("\nCar rental entry added successfully!");
         System.out.println("Car ID: " + carId);
         System.out.println("Car Model: " + carModel);
         System.out.println("Rental Price: $" + rentalPrice);
     }
 
     private static void simulateCheckedExceptions() {
         try {
             // IOException example
             BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
             reader.readLine();
             reader.close();
         } catch (FileNotFoundException e) {
             System.out.println("FileNotFoundException caught: The specified file does not exist.");
         } catch (EOFException e) {
             System.out.println("EOFException caught: Unexpected end of file reached.");
         } catch (IOException e) {
             System.out.println("IOException caught: An input/output error occurred.");
         }
 
         try {
             // SQLException example
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/non_existent_db", "root", "password");
         } catch (SQLException e) {
             System.out.println("SQLException caught: Database connection error.");
         }
 
         try {
             // ClassNotFoundException example
             Class.forName("com.nonexistent.Driver");
         } catch (ClassNotFoundException e) {
             System.out.println("ClassNotFoundException caught: The specified class could not be found.");
         }
     }
 
     private static void simulateUncheckedExceptions() {
         try {
             // ArithmeticException example
             int result = 10 / 0;
         } catch (ArithmeticException e) {
             System.out.println("ArithmeticException caught: Division by zero is not allowed.");
         }
 
         try {
             // NullPointerException example
             String str = null;
             str.length();
         } catch (NullPointerException e) {
             System.out.println("NullPointerException caught: Attempted to access a null reference.");
         }
 
         try {
             // ArrayIndexOutOfBoundsException example
             int[] array = new int[3];
             int value = array[5];
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index access.");
         }
 
         try {
             // ClassCastException example
             Object obj = new String("Test");
             Integer num = (Integer) obj;
         } catch (ClassCastException e) {
             System.out.println("ClassCastException caught: Invalid type casting.");
         }
 
         try {
             // IllegalArgumentException example
             Thread.sleep(-1000);
         } catch (IllegalArgumentException e) {
             System.out.println("IllegalArgumentException caught: Invalid argument passed.");
         } catch (InterruptedException e) {
             System.out.println("InterruptedException caught: Thread interruption occurred.");
         }
 
         try {
             // NumberFormatException example
             int num = Integer.parseInt("invalid_number");
         } catch (NumberFormatException e) {
             System.out.println("NumberFormatException caught: Invalid number format.");
         }
     }
 }
 