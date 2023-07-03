package exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) {
		
		int min = generateRandomNum(99);
        int max = generateRandomNum(9999);

        for(int i=min; i<500; i++) {
            int rNum = (int) (Math.random()*(max-min)) + min;
        	System.out.println(rNum);
        	
        }
        
        System.out.println("Smallest Number:" + min);
	}
	
	public static int generateRandomNum(int bounderyNum) {
		Random rnd = new Random();
		return rnd.nextInt(bounderyNum);
}}