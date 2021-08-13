import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMinOrMaxNumber {
    private List<Integer> listOfNums = new ArrayList<>();
    private Map<Integer, Integer> mapOfCounts = new HashMap<>();

    void addNumToList(int number) {
        listOfNums.add(number);
    }

    public int findMinNumbers(int numOne, int numTwo, int numThree, int numFour) throws Exception {
        if (numOne < numTwo && numOne < numThree && numOne < numFour) {
            return numOne;
        } else if (numTwo < numThree && numTwo < numFour && numTwo < numOne) {
            return numTwo;
        } else if (numThree < numFour && numThree < numOne && numThree < numTwo) {
            return numThree;
        } else if (numFour < numOne && numFour < numThree && numOne < numTwo) {
            return numFour;
        } else {
            throw new Exception("There are same numbers");
        }
    }

    public int findMaxNumbers(int numOne, int numTwo, int numThree, int numFour) {
        int firstPair = Math.max(numOne, numTwo);
        int secondPair = Math.max(numThree, numFour);
        int thirdPair = Math.max(firstPair, secondPair);
        return thirdPair;
    }

    public int findMaxNumberArray() {
//        int count = 0;
        int max = listOfNums.get(0);
//        mapOfCounts.put(max, 1);
        for (int i = 1; i < listOfNums.size(); i++) {
            if (listOfNums.get(i) > max) {
                max = listOfNums.get(i);
//                mapOfCounts.put(listOfNums.get(i), 1);
                System.out.println("max is " + max);
            }
        }
        return max;
    }
}