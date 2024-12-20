# 25964_MUGISHA_Godefroid_Sunday_Afternoon
Object Oriented Program course assignment. 

#  Java OOP Exceptions Assignment

## Objective
This assignment demonstrates practical examples of exception handling in Java. The goal is to understand how to simulate, trigger, and handle various checked and unchecked exceptions in Java programming.

## Structure
The program is implemented in a single Java file containing methods that simulate and handle the following exceptions:

### Checked Exceptions
1. **IOException**
   - Simulates an input/output error by attempting to read a non-existent file.
2. **FileNotFoundException**
   - Specifically triggers when trying to open a file that does not exist.
3. **EOFException**
   - Demonstrates reaching the end of a file unexpectedly while reading data.
4. **SQLException**
   - Simulates a database error by querying a non-existent table.
5. **ClassNotFoundException**
   - Demonstrates a scenario where a specified class file is missing at runtime.

### Unchecked Exceptions
6. **ArithmeticException**
   - Simulates a division by zero scenario.
7. **NullPointerException**
   - Accesses a null reference to trigger the exception.
8. **ArrayIndexOutOfBoundsException**
   - Accesses an invalid index in an array.
9. **ClassCastException**
   - Demonstrates an invalid type cast operation.
10. **IllegalArgumentException**
    - Triggers by passing an invalid argument to a method.
11. **NumberFormatException**
    - Simulates converting an invalid string to a number.

## How to Run
1. Copy the Java file into your preferred Java IDE or text editor.
2. Compile the program using the command:
   ```
   javac ExceptionHandlingExamples.java
   ```
3. Run the program using the command:
   ```
   java ExceptionHandlingExamples
   ```
4. Observe the output for each exception scenario and its handling mechanism.

## Explanation
Each exception is handled within a dedicated method that:
- Simulates the exception.
- Uses try-catch blocks (and finally blocks where applicable) to handle the exception.
- Includes comments explaining the purpose of each code block.

## Key Features
- **Readability**: The program is well-documented with comments to clarify each exception scenario.
- **Modularity**: Each exception is handled in a separate method for better organization and ease of understanding.
- **Real-life Simulation**: Examples simulate realistic scenarios to enhance understanding.

## Sample Output
### Checked Exceptions:
- IOException caught: `nonexistentfile.txt (No such file or directory)`
- FileNotFoundException caught: `missingfile.txt (No such file or directory)`
- EOFException caught: `End of file reached`
- SQLException caught: `Table "NONEXISTENTTABLE" not found`
- ClassNotFoundException caught: `nonexistent.ClassName`

### Unchecked Exceptions:
- ArithmeticException caught: `/ by zero`
- NullPointerException caught: `Cannot invoke "String.length()" because "str" is null`
- ArrayIndexOutOfBoundsException caught: `Index 10 out of bounds for length 5`
- ClassCastException caught: `class java.lang.Integer cannot be cast to class java.lang.String`
- IllegalArgumentException caught: `timeout value is negative`
- NumberFormatException caught: `For input string: "abc"`

## Notes
- Make sure to have a database (e.g., H2 Database) configured for the **SQLException** example.
- Files such as `data.dat` will be created and accessed during runtime. Ensure you have the required permissions.

## Conclusion
This program provides a hands-on approach to learning exception handling in Java. By simulating real-world scenarios, it equips you with the skills needed to anticipate and manage exceptions effectively in your programs.

---

**Author:** MUGISHA Godefroid  
**ID:** 25964


