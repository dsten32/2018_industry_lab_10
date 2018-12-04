package ictgradschool.industry.recursion.ex04;

/**
 * Created by anhyd on 27/03/2017.
 */
public class ExerciseFour {

    /**
     * Returns the sum of all positive integers between 1 and num (inclusive).
     */
    public int getSum(int num) {

        // TODOne Implement a recursive solution to this method.
        if(num>1){
            return num + getSum(num-1);
        }
        return 1;

    }


    /**
     * Returns the smallest value in the given array, between the given first (inclusive) and second (exclusive) indices
     *
     * @param nums the array
     * @param firstIndex the inclusive lower index
     * @param secondIndex the exclusive upper index
     */
    public int getSmallest(int[] nums, int firstIndex, int secondIndex) {

        // TODOne Implement a recursive solution to this method.
        if(firstIndex<secondIndex-1){
            return Math.min(nums[firstIndex],getSmallest(nums,firstIndex+1,secondIndex));
        }
        return Math.min(nums[firstIndex],nums[secondIndex-1]);
    }

    /**
     * Prints all ints from n down to 1.
     */
    public void printNums1(int n) {

        // TODOne Implement a recursive solution to this method.
        if(n>0){
            System.out.println(String.valueOf(n));
            printNums1(n-1);
        }
    }

    /**
     * Prints all ints from 1 up to n.
     */
    public void printNums2(int n) {

        // TODO Implement a recursive solution to this method.
        if(n>0){
            System.out.println(String.valueOf(n));
            printNums2(n-1);
        }
    }

    /**
     * Returns the number of 'e' and 'E' characters in the given String.
     *
     * @param input the string to check
     */
    public int countEs(String input) {

        // TODOne Implement a recursive solution to this method.
        if(input.length()!=0){
            if(input.charAt(0)=='e' || input.charAt(0)=='E'){
                return 1 + countEs(input.substring(1));
            } else if (input.charAt(0)!='e' && input.charAt(0)!='E') {
                return countEs(input.substring(1));
            }
        }
        return 0;
    }

    /**
     * Returns the nth number in the fibonacci sequence.
     */
    public int fibonacci(int n) {

        // TODOne Implement a recursive solution to this method.
        if (n>1){
            return fibonacci(n-1)+fibonacci(n-2);
//            fibonacci(n-1);
        }


        return n;
    }

    /**
     * Returns true if the given input String is a palindrome, false otherwise.
     *
     * @param input the String to check
     */
    public boolean isPalindrome(String input) {

        // TODOne Implement a recursive solution to this method.
        if (input.length() <= 1) {
            return true;
        } else if (input.charAt(0) != input.charAt(input.length()-1)) {
            return false;
        } else {
            return isPalindrome(input.substring(1, input.length() - 1));
        }
    }

}
