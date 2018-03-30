package ConversionsCiphersLinkedLists;

import java.util.Scanner;

/**
 * This class converts a Decimal number to a Binary number
 * 
 * @author Unknown
 *
 */
class DecimalToBinary {

    
        
    public static void conventionalConversion(int n) {
        int b = 0, c = 0, d;
        System.out.printf("Conventional conversion.\n\tEnter the decimal number: ");
        while (n != 0) {
            d = n % 2;
            b = b + d * (int) Math.pow(10, c++);
            n /= 2;
        } //converting decimal to binary
        System.out.println("\tBinary number: " + b);
        
    }

    /**
     * This method converts a decimal number 
     * to a binary number using a bitwise
     * algorithm
     */
    public static void bitwiseConversion(int n) {
        int b = 0, c = 0, d;
        System.out.printf("Bitwise conversion.\n\tEnter the decimal number: ");
        
        while (n != 0) {
            d = (n & 1);
            b += d * (int) Math.pow(10, c++);
            n >>= 1;
        }
        System.out.println("\tBinary number: " + b);
        
    }

}
