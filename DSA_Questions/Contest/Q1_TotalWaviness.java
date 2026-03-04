// calculate total Waviness 
// You are given two integers num1 and num2 representing an inclusive range [num1, num2].

// The waviness of a number is defined as the total count of its peaks and valleys:

// A digit is a peak if it is strictly greater than both of its immediate neighbors.
// A digit is a valley if it is strictly less than both of its immediate neighbors.
// The first and last digits of a number cannot be peaks or valleys.
// Any number with fewer than 3 digits has a waviness of 0.
// Return the total sum of waviness for all numbers in the range [num1, num2].©leetcode


public class Q1_TotalWaviness{

    public static int totalWaviness(int num1, int num2) {

        int total = 0;

        for (int n = num1; n <= num2; n++){
            String s = String.valueOf(n);

            if (s.length() < 3) continue;

            for(int i=1; i<s.length()-1; i++){

                char prev = s.charAt(i-1);
                char curr = s.charAt(i);
                char next = s.charAt(i+1);

                if((curr > prev && curr > next )|| (curr < prev && curr < next)){
                    total++;
                }
            }
        }

        return total;
    }
    

    public static void main(String[] args) {
        
        int num1 = 198;
        int num2 = 202;

        System.out.println("Total waviness: "+totalWaviness(num1, num2));
    }
}