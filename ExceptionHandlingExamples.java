

import java.io.*;
import java.sql.*;

public class ExceptionHandlingExamples {

    // Checked Exceptions

    //  IOException Example
    public static void handleIOException() {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    //  FileNotFoundException Example
    public static void handleFileNotFoundException() {
        try {
            FileReader reader = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    //  EOFException Example
    public static void handleEOFException() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            outputStream.writeObject("Test Data");
        } catch (IOException e) {
            System.out.println("Error while creating file: " + e.getMessage());
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.dat"))) {
            while (true) {
                inputStream.readObject();
            }
        } catch (EOFException e) {
            System.out.println("EOFException caught: End of file reached");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    //  SQLException Example
    public static void handleSQLException() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM nonexistenttable");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }

    //  ClassNotFoundException Example
    public static void handleClassNotFoundException() {
        try {
            Class.forName("nonexistent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }

    // Unchecked Exceptions

    //  ArithmeticException Example
    public static void handleArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    //  NullPointerException Example
    public static void handleNullPointerException() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    //  ArrayIndexOutOfBoundsException Example
    public static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] array = new int[5];
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    //  ClassCastException Example
    public static void handleClassCastException() {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }

    //  IllegalArgumentException Example
    public static void handleIllegalArgumentException() {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }

    //  NumberFormatException Example
    public static void handleNumberFormatException() {
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }

    // Main method to call all examples
    public static void main(String[] args) {
        System.out.println("Checked Exceptions:");
        handleIOException();
        handleFileNotFoundException();
        handleEOFException();
        handleSQLException();
        handleClassNotFoundException();

        System.out.println("\nUnchecked Exceptions:");
        handleArithmeticException();
        handleNullPointerException();
        handleArrayIndexOutOfBoundsException();
        handleClassCastException();
        handleIllegalArgumentException();
        handleNumberFormatException();
    }
}
