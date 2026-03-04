// String inbuilt functions

public class A_StringFunctions {

    public static void main(String[] args) {
        
        String str = "hello";
    
        // Length of string
        System.out.println("Length:"+str.length());

        // To get character at specific position
        System.out.println("Character:"+str.charAt(2));

        // Extract Substring
        System.out.println("Substring:"+str.substring(2));
        System.out.println("Substring:"+str.substring(1,4));

        // Comparing strings 
        if(str.equals("Hello")){
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
        }

        // Comparing ignoring case

        if(str.equalsIgnoreCase("hellO")){
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
        }

        // Comparison give result integer 
        // +ve - > first string greater than argument
        // -ve - > first string smaller than argument
        // 0 - > Strings equal

        System.out.println("String Compare:"+"hello".compareTo("dear")); // hello > dear = +ve
        System.out.println("String Compare:"+"dear".compareTo("hello")); // dear  < hello = -ve
        System.out.println("String Compare:"+"dear".compareTo("dear")); // dear == dear = 0

        // index of subctrng in string
        System.out.println("Index of String:"+ "banana".indexOf("na")); // first occurance

        System.out.println("Index of String:"+ "banana".lastIndexOf("na")); // Last occurance


        // Upper and lower case conversion

        System.out.println("Lowercase:"+"JAVA".toUpperCase());
        System.out.println("Lowercase:"+"java".toLowerCase());

        // Trim extra space 
        System.out.println("Trim extra space:*"+"     java      ".trim()+"*");

        // Replace character and string
        System.out.println("Replace p with q:"+ "apple".replace('p','q'));

        System.out.println("Replace Hello with Hi:"+ "Hello World".replace("Hello","Hi"));

        // split-> break string into array

        String str2 = "Hi Hello Greeting";

        String [] arr = str2.split(" ");

        for(String s : arr ){
            System.out.println(s);
        }


        // true if contains else false
        System.out.println("Contains:"+"apple".contains("app"));

    }
    }
