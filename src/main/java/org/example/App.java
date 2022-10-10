package org.example;

public class App {

  // step1 define a main method
  public static void main(String[] args){
    // statement for printing the data
    System.out.println("Hello World!");

    int age= 32;
    System.out.println("Age: " + age);

    double salary = 30000.00;

    // sout + tab
    System.out.println("Salary: " + salary);

    boolean studentStatus = true;
    boolean accountStatus = false;

    char a= 'a';

    double test;
    test = 12.22;

    int number1 = 20;
    int number2 = 10;
    // arithmetic operators ( + - / * )
    int result = number1 + number2;
    System.out.println("Result:" + result);

    int number = 0;
    //System.out.println(number++);
    System.out.println(++number);


    // comparison operators ( ==, !=, <, >, <=, >= )
    int num1 = 10;
    int num2 = 20;
    boolean isEqual = num1 != num2;
    System.out.println(isEqual);


    // selections
    /*
    int testAge = 10;
    if(testAge >= 18){
      System.out.println("You can have a beer");
    } else {
      System.out.println("You are too young to drink beer!");
    }
    */

    /*
    // if() else if() statement
    int testAge = 17;
    //if(){}
    if(testAge >= 18){
      System.out.println("You can have a beer");
    } else if (testAge < 18 && testAge >= 15){
      System.out.println("You can drive a moped but not drink beer");
    } else {
      System.out.println("You are too young to drive a moped and drink beer");
    }
     */

    double n1 = 5, n2 = 7, res = 0;
    char operator = '*';
    switch (operator){
      case '+':
        res = n1 + n2;
        break;
      case '-':
        res = n1 - n2;
        break;
      case '*':
        res = n1 * n2;
        break;
      default:
        System.out.println("operator is not valid!");
    }
    System.out.println(res);


  }

}
