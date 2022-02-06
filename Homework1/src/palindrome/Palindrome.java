package palindrome;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Palindrome {


    public static String reverse(String number) {
        return new StringBuilder(number).reverse().toString();
    }


    public static boolean isPalindrome(String number) {
        return number.equals(reverse(number));
    }


    public static void printChain(BigInteger temp, BigInteger sum) {

        System.out.println(temp + "+" + reverse(temp.toString()) + "=" + sum);

    }


    public static int maxNumber(HashMap<Integer, Integer> countMap) {

        int maxValueInMap = (Collections.max(countMap.values()));
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                return entry.getKey();
            }

        }
        return 0;
    }


    static HashMap<Integer, Integer> numberOfChains = new HashMap<>();

    public static boolean isPalindromeOfSum(int n) {
        BigInteger temp = BigInteger.valueOf(n);


        for (int i = 1; i < 30; i++) {
            BigInteger sum = temp.add(new BigInteger(reverse(temp.toString())));

            //    System.out.println(temp+"+"+reverse(temp.toString())+"="+sum);

            //printChain(temp, sum);

            temp = temp.add(new BigInteger(reverse(temp.toString())));

            if (isPalindrome(temp.toString())) {

                //         System.out.println("-------------------------------");
                //           System.out.println("Sayı : " + n + "  Zincir Sayısı = " + i);

                numberOfChains.put(n, i);
                return true;

            }

        }
        return false;
    }

    public static void printLongestChain(int n) {
        BigInteger temp = BigInteger.valueOf(n);

        //max iterasyon sayısı=30
        for (int i = 1; i < 30; i++) {
            BigInteger sum = temp.add(new BigInteger(reverse(temp.toString())));

            printChain(temp, sum);

            temp = temp.add(new BigInteger(reverse(temp.toString())));

            if (isPalindrome(temp.toString())) {

                System.out.println("-------------------------------");
                System.out.println("Sayı : " + n + "  Zincir Sayısı = " + i);
                return;

            }

        }

    }

    public void run() {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (isPalindromeOfSum(i))
                count++;
            // System.out.println("**********************************");
        }
        printLongestChain(maxNumber(numberOfChains));
    }


    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        palindrome.run();



    }
}

