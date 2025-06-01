// =================== 1. Hello World Program ===================
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// =================== 2. Simple Calculator ===================
import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operation!"); return;
        }
        System.out.println("Result: " + result);
    }
}

// =================== 3. Even or Odd Checker ===================
import java.util.Scanner;
class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is even.");
        else
            System.out.println(n + " is odd.");
    }
}

// =================== 4. Leap Year Checker ===================
import java.util.Scanner;
class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
    }
}

// =================== 5. Multiplication Table ===================
import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

// =================== 6. Data Type Demonstration ===================
class DataTypeDemo {
    public static void main(String[] args) {
        int a = 42;
        float b = 3.14f;
        double c = 2.71828;
        char d = 'J';
        boolean e = true;
        System.out.println("int: " + a);
        System.out.println("float: " + b);
        System.out.println("double: " + c);
        System.out.println("char: " + d);
        System.out.println("boolean: " + e);
    }
}

// =================== 7. Type Casting Example ===================
class TypeCasting {
    public static void main(String[] args) {
        double d = 9.99;
        int i = (int) d;
        System.out.println("Double to int: " + i);
        int x = 10;
        double y = (double) x;
        System.out.println("Int to double: " + y);
    }
}

// =================== 8. Operator Precedence ===================
class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result);
        // Multiplication is done before addition, so 5*2=10, then 10+10=20
    }
}

// =================== 9. Grade Calculator ===================
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}

// =================== 10. Number Guessing Game ===================
import java.util.Scanner;
class NumberGuessingGame {
    public static void main(String[] args) {
        int number = 1 + (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess < number)
                System.out.println("Too low!");
            else if (guess > number)
                System.out.println("Too high!");
            else
                System.out.println("Correct!");
        } while (guess != number);
    }
}

// =================== 11. Factorial Calculator ===================
import java.util.Scanner;
class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);
    }
}

// =================== 12. Method Overloading ===================
class MethodOverloading {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }
    public static void main(String[] args) {
        System.out.println("add(2,3): " + add(2,3));
        System.out.println("add(2.5,3.6): " + add(2.5,3.6));
        System.out.println("add(1,2,3): " + add(1,2,3));
    }
}

// =================== 13. Recursive Fibonacci ===================
import java.util.Scanner;
class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci: " + fibonacci(n));
    }
}

// =================== 14. Array Sum and Average ===================
import java.util.Scanner;
class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/(double)n));
    }
}

// =================== 15. String Reversal ===================
import java.util.Scanner;
class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: " + sb.reverse());
    }
}

// =================== 16. Palindrome Checker ===================
import java.util.Scanner;
class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

// =================== 17. Class and Object Creation ===================
class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make; this.model = model; this.year = year;
    }
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 2022);
        Car c2 = new Car("Honda", "Civic", 2021);
        c1.displayDetails();
        c2.displayDetails();
    }
}

// =================== 18. Inheritance Example ===================
class Animal {
    void makeSound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    void makeSound() { System.out.println("Bark"); }
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}

// =================== 19. Interface Implementation ===================
interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() { System.out.println("Strumming Guitar"); }
}
class Piano implements Playable {
    public void play() { System.out.println("Playing Piano"); }
}
class PlayTest {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play(); p.play();
    }
}

// =================== 20. Try-Catch Example ===================
import java.util.Scanner;
class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        try {
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

// =================== 21. Custom Exception ===================
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
import java.util.Scanner;
class CustomExceptionTest {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be at least 18.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
            System.out.println("Valid age");
        } catch (InvalidAgeException ex) {
            System.out.println("Invalid: " + ex.getMessage());
        }
    }
}

// =================== 22. File Writing ===================
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String data = sc.nextLine();
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(data);
            System.out.println("Written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }
    }
}

// =================== 23. File Reading ===================
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class FileReading {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}

// =================== 24. ArrayList Example ===================
import java.util.ArrayList;
import java.util.Scanner;
class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter name (or 'exit'): ");
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("exit")) students.add(input);
        } while (!input.equalsIgnoreCase("exit"));
        System.out.println("Students: " + students);
    }
}

// =================== 25. HashMap Example ===================
import java.util.HashMap;
import java.util.Scanner;
class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            map.put(id, name);
        }
        System.out.print("Enter ID to search: ");
        int sid = sc.nextInt();
        System.out.println("Name: " + map.getOrDefault(sid, "Not found"));
    }
}

// =================== 26. Thread Creation ===================
class MyThread extends Thread {
    String name;
    MyThread(String name) { this.name = name; }
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(name + " running: " + i);
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start(); t2.start();
    }
}

// =================== 27. Lambda Expressions ===================
import java.util.*;
class LambdaSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        Collections.sort(list, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted: " + list);
    }
}

// =================== 28. Stream API ===================
import java.util.*;
import java.util.stream.Collectors;
class StreamEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,8,9,10,13,16);
        List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}

// =================== 29. Records ===================
// Requires Java 16+
record Person(String name, int age) {}
import java.util.*;
import java.util.stream.Collectors;
class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice",22),
            new Person("Bob",17),
            new Person("Carol",30)
        );
        people.forEach(System.out::println);
        List<Person> adults = people.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());
        System.out.println("Adults: " + adults);
    }
}

// =================== 30. Pattern Matching for switch (Java 21) ===================
class PatternSwitch {
    static void checkType(Object obj) {
        String msg = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            case null -> "It's null";
            default -> "Unknown type";
        };
        System.out.println(msg);
    }
    public static void main(String[] args) {
        checkType(10);
        checkType("Hello");
        checkType(3.14);
        checkType(null);
    }
}

// =================== 31. Basic JDBC Connection ===================
/*
import java.sql.*;
class JdbcSelect {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","user","pass");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        con.close();
    }
}
*/

// =================== 32. Insert and Update Operations in JDBC ===================
/*
import java.sql.*;
class StudentDAO {
    Connection con;
    StudentDAO() throws Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","user","pass");
    }
    void insert(int id, String name) throws Exception {
        PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?,?)");
        ps.setInt(1, id); ps.setString(2, name);
        ps.executeUpdate();
    }
    void update(int id, String name) throws Exception {
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name); ps.setInt(2, id);
        ps.executeUpdate();
    }
}
*/

// =================== 33. Transaction Handling in JDBC ===================
/*
import java.sql.*;
class TransactionDemo {
    public static void transfer(Connection con, int from, int to, int amt) throws Exception {
        try {
            con.setAutoCommit(false);
            PreparedStatement ps1 = con.prepareStatement("UPDATE accounts SET balance=balance-? WHERE id=?");
            ps1.setInt(1, amt); ps1.setInt(2, from); ps1.executeUpdate();
            PreparedStatement ps2 = con.prepareStatement("UPDATE accounts SET balance=balance+? WHERE id=?");
            ps2.setInt(1, amt); ps2.setInt(2, to); ps2.executeUpdate();
            con.commit();
            System.out.println("Transfer successful.");
        } catch (Exception ex) {
            con.rollback();
            System.out.println("Transfer failed, rolled back.");
        }
    }
}
*/

// =================== 34. Create and Use Java Modules ===================
/*
// -- com.utils/Util.java --
package com.utils;
public class Util {
    public static void print(String msg) { System.out.println(msg); }
}
// -- com.utils/module-info.java --
module com.utils {
    exports com.utils;
}
// -- com.greetings/Main.java --
package com.greetings;
import com.utils.Util;
public class Main {
    public static void main(String[] args) {
        Util.print("Hello from modules!");
    }
}
// -- com.greetings/module-info.java --
module com.greetings {
    requires com.utils;
}
*/

// =================== 35. TCP Client-Server Chat ===================
/*
// -- Server --
import java.net.*;
import java.io.*;
class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Client: " + line);
            out.println("Echo: " + line);
            // To send: out.println(sysin.readLine());
        }
        s.close(); ss.close();
    }
}
// -- Client --
import java.net.*;
import java.io.*;
class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = sysin.readLine()) != null) {
            out.println(line);
            System.out.println("Server: " + in.readLine());
        }
        s.close();
    }
}
*/

// =================== 36. HTTP Client API (Java 11+) ===================
/*
import java.net.http.*;
import java.net.URI;
public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create("https://api.github.com")).build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + resp.statusCode());
        System.out.println("Body: " + resp.body());
    }
}
*/

// =================== 37. Using javap to Inspect Bytecode ===================
/*
// -- ExampleClass.java --
class ExampleClass {
    void hello() { System.out.println("Hello"); }
}
// Compile: javac ExampleClass.java
// Inspect: javap -c ExampleClass
*/

// =================== 38. Decompile a Class File ===================
/*
// Compile any class, e.g. HelloWorld.java
// Use JD-GUI or CFR: open HelloWorld.class in the tool to view the decompiled source code.
*/

// =================== 39. Reflection in Java ===================
import java.lang.reflect.*;
class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Car");
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods)
            System.out.println(m.getName() + " Params: " + m.getParameterCount());
        Object car = c.getConstructor(String.class, String.class, int.class).newInstance("Ford","Focus",2022);
        Method disp = c.getDeclaredMethod("displayDetails");
        disp.invoke(car);
    }
}

// =================== 40. Virtual Threads (Java 21) ===================
/*
public class VirtualThreadsDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread!"));
        }
        long end = System.currentTimeMillis();
        System.out.println("Elapsed: " + (end-start) + "ms");
    }
}
*/

// =================== 41. Executor Service and Callable ===================
import java.util.concurrent.*;
import java.util.*;
class ExecutorCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
            () -> "Task 1 result",
            () -> "Task 2 result",
            () -> "Task 3 result"
        );
        List<Future<String>> results = ex.invokeAll(tasks);
        for (Future<String> f : results)
            System.out.println(f.get());
        ex.shutdown();
    }
}