import org.apache.groovy.parser.antlr4.GroovyParser;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
        int numOne = 7;
        int numTwo = 1;
        int numThree = 7;
        int numFour = 3623622;

       if(numOne < numTwo && numOne < numThree && numOne < numFour){
           System.out.println(numOne);
           }
       else if(numTwo < numThree && numTwo < numFour && numTwo < numOne){
           System.out.println(numTwo);
       }
       else if(numThree < numFour && numThree < numOne && numThree < numTwo){
           System.out.println(numThree);
       }
       else if(numFour < numOne && numFour < numThree && numOne < numTwo){
           System.out.println(numFour);
       }
       else {
           System.out.println("There are same numbers");
       }
       // Вывести на консоль количество максимальных чисел среди этих четырех ??


        //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
         int One = 56;
       int Two = 45;
       int Three = 54;
       int Four = 44;
       int Five = 909;

       ArrayList<Integer>listOfNumbers = new ArrayList<>();
       listOfNumbers.add(One);
       listOfNumbers.add(Two);
       listOfNumbers.add(Three);
       listOfNumbers.add(Four);
       listOfNumbers.add(Five);
       Collections.sort(listOfNumbers);

       for(Integer number : listOfNumbers){
           System.out.println(number);
       }

    // Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = in.nextLine();
        System.out.println("Enter second name");
        String secondName = in.nextLine();

        if(firstName.equals(secondName)){
            System.out.println("teski");
        }
        else {
            System.out.println("These people aren't teski");
        }

        //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        System.out.println("Enter month");
        int month = in.nextInt();
        System.out.println("Enter day");
        int day = in.nextInt();

        if(month <= 12 && month >= 1){
            if(month == 1 || month == 2 || month == 12){
                System.out.println("Winter");
            }
            else if(month >= 3 && month <=5){
                System.out.println("Spring");
            }
            else if(month >=6 && month <=8){
                System.out.println("Summer");
            }
            else if(month >=9 && month <=11){
                System.out.println("Autumn");
            }
        }
        else {
            System.out.println("Incorrect month");
        }
        if(day >= 1 && day <= 31){
            System.out.println("Day of month is correct");
        }
        else{
            System.out.println("Incorrect day");
        }


    }
}
