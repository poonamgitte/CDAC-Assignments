public class Missing_element {
     public static void main(String[] args) {
         int arr[] = {1,2,3,5,6};
        
       int n = 6;

        int ogSum = n*(n+1)/2;
        int newSum=0;
        
        for(int num: arr){
            newSum += num;
        }

        System.out.println("Missing element:"+(ogSum-newSum));
    
    
    }
}
