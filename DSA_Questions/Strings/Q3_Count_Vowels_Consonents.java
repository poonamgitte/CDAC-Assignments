// Count vowels and consonents in string

public class Q3_Count_Vowels_Consonents {

    static void countVowelsAndConsonents(String s){

        int vowel =0;
        int consonent = 0;

        for(char c: s.toCharArray()){
            c = Character.toLowerCase(c);

            if(Character.isLetter(c)){

                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowel++;
                } 
                else{
                    consonent++;
                }
            }
            
        }
        
        System.out.println("Vowels count:"+vowel);
        System.out.println("Consonent count:"+consonent);


    }
    public static void main(String[] args) {
        String str = "Entert  ainment";

        System.out.println("String:"+str);

        countVowelsAndConsonents(str);
      
    }
}
