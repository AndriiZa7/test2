import java.util.ArrayList;
import java.util.Collections;

public class FindMaxAndMinNumbers {
        public static ArrayList<Integer> findMaxAndMinNumbers(int numOne, int numTwo, int numThree, int numFour, int numFive) {
            ArrayList<Integer> listOfNumbers = new ArrayList<>();
            listOfNumbers.add(numOne);
            listOfNumbers.add(numTwo);
            listOfNumbers.add(numThree);
            listOfNumbers.add(numFour);
            listOfNumbers.add(numFive);
            Collections.sort(listOfNumbers);
            return listOfNumbers;
        }

}
