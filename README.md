# 25964_MUGISHA_Godefroid_Sunday_Afternoon
Object Oriented Program course assignment. 
---  

## Java OOP Exceptions and Car Rental System Assignment  

### Objective  
This assignment demonstrates practical examples of exception handling in Java while integrating a Car Rental System. The goal is to understand how to simulate, trigger, and handle various checked and unchecked exceptions in Java programming, as well as to manage a basic car rental system with user interaction.

---

## Structure  
The program is implemented in a single Java file and includes:  
1. Methods that simulate and handle different exceptions (both checked and unchecked).  
2. A car rental management system with features to add rental entries while handling potential user input errors.

---

## Car Rental System Features  
The Car Rental System allows users to:  
1. Add car rental entries, including car ID, model, and daily rental price.  
2. Handle invalid inputs, such as non-numeric IDs or empty car model names, using exception handling mechanisms.  
3. Use a menu-driven interface for ease of navigation.  

---

## Exception Handling Demonstration  

### Checked Exceptions:  
1. **IOException**:  
   - Simulates an input/output error by attempting to read a non-existent file.  
2. **FileNotFoundException**:  
   - Specifically triggers when trying to open a file that does not exist.  
3. **EOFException**:  
   - Demonstrates reaching the end of a file unexpectedly while reading data.  
4. **SQLException**:  
   - Simulates a database error by querying a non-existent table.  
5. **ClassNotFoundException**:  
   - Demonstrates a scenario where a specified class file is missing at runtime.  

### Unchecked Exceptions:  
6. **ArithmeticException**:  
   - Simulates a division by zero scenario.  
7. **NullPointerException**:  
   - Accesses a null reference to trigger the exception.  
8. **ArrayIndexOutOfBoundsException**:  
   - Accesses an invalid index in an array.  
9. **ClassCastException**:  
   - Demonstrates an invalid type cast operation.  
10. **IllegalArgumentException**:  
    - Triggers by passing an invalid argument to a method.  
11. **NumberFormatException**:  
    - Simulates converting an invalid string to a number.  

---

## How to Run  
1. Copy the Java file into your preferred Java IDE or text editor.  
2. Compile the program using the command:  
   ```
   javac CarRentalSystem.java
   ```  
3. Run the program using the command:  
   ```
   java CarRentalSystem
   ```  
4. Use the menu to select different operations (add car rental entry, simulate checked/unchecked exceptions, or exit).  

---

## Key Features  
- **Readability**: The program is well-documented with comments explaining each exception scenario and car rental system operation.  
- **Modularity**: Separate methods are used for exception handling and the car rental system for better organization.  
- **Interactive Design**: A menu-driven approach enhances usability for users.  
- **Real-life Simulation**: Exception scenarios mimic realistic situations for effective learning.  

---

## Sample Output  

### Car Rental System:  
- Input for car ID, model, and price successfully added:  
   ```
   Car rental entry added successfully!
   Car ID: 101
   Car Model: Toyota Corolla
   Rental Price: $50.0
   ```  
- Invalid input example:  
   ```
   IllegalArgumentException caught: Car model cannot be empty.
   ```  

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

---

## Conclusion  
This program combines the demonstration of Java exception handling with a basic Car Rental System, providing both practical and real-world examples of handling errors gracefully. It equips learners with the skills needed to anticipate and manage exceptions effectively in software applications.

---

**Author:** MUGISHA Godefroid  
**ID:** 25964  

--- 


