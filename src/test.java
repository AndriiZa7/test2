import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        FindMinOrMaxNumber findMinOrMaxNumber = new FindMinOrMaxNumber();

        Scanner in = new Scanner(System.in);
        //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
        System.out.println("Enter number one");
        int numOne = in.nextInt();
        findMinOrMaxNumber.addNumToList(numOne);

        System.out.println("Enter number two");
        int numTwo = in.nextInt();
        findMinOrMaxNumber.addNumToList(numTwo);

        System.out.println("Enter number three");
        int numThree = in.nextInt();
        findMinOrMaxNumber.addNumToList(numThree);

        System.out.println("Enter number four");
        int numFour = in.nextInt();
        findMinOrMaxNumber.addNumToList(numFour);

        System.out.println("Enter number five");
        int numFive = in.nextInt();
        int resultFirstSubTask = 0;
        try {
            resultFirstSubTask = findMinOrMaxNumber.findMinNumbers(numOne, numTwo, numThree, numFour);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Min number is " + resultFirstSubTask);

        // Вывести на консоль максимальное из этих чисел и их количество. Непонятно как получить количество мах числел?
        int resultSecondSubTask = findMinOrMaxNumber.findMaxNumberArray();
        System.out.println("Max number is " + resultSecondSubTask);

        //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел
        ArrayList<Integer> resultSecondTask = FindMaxAndMinNumbers.findMaxAndMinNumbers(numOne, numTwo, numThree, numFour, numFive);
        System.out.println(resultSecondTask);
//
//        //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками
//        System.out.println("Enter first name");
//        String firstName = in.nextLine();
//        System.out.println("Enter second name");
//        String secondName = in.nextLine();
//        String resultThirdSubTask = ThirdTask.ThirdSubTask(firstName, secondName);
//        System.out.println(resultThirdSubTask);
//
//        //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
////        System.out.println("Enter mounth");
////        int month = in.nextInt();
////        System.out.println("Enter day");
////        int day = in.nextInt();
////        String resultFourthTaskMonth = FourthTask.FourthSubTaskMonth(month);
////        System.out.println(resultFourthTaskMonth);
////        String resultFourthTaskDay = FourthTask.FourthSubTaskDay(day);
////        System.out.println(resultFourthTaskDay);
    }

//
//
//
//    public class ThirdTask {
//        public static String ThirdSubTask(String firstName, String secondName) {
//            if (firstName.equals(secondName)) {
//                return "teski";
//            } else {
//                return "These people aren't teski";
//            }
//        }
//    }
//    public class FourthTask{
//        public static String FourthSubTaskMonth(int month) {
//            if (month <= 12 && month >= 1) {
//                if (month == 1 || month == 2 || month == 12) {
//                    return "Winter";
//                } else if (month >= 3 && month <= 5) {
//                    return "Spring";
//                } else if (month >= 6 && month <= 8) {
//                    return "Summer";
//                } else if (month >= 9 && month <= 11) {
//                    return "Autumn";
//                }
//            } else {
//                return "Incorrect month";
//            }

//        public static String FourthSubTaskDay(int day){
//                if(day >= 1 && day <= 31){
//                    return "Day of month is correct";
//                }
//                else{
//                    return "Incorrect day";
//                }
//            }

}

