// 73 if there is element 0 then set the row and column of matrix as zero

public class Q23_Set_Matrix_Zero {
    public static void main(String[] args) {
        
        int [][]arr ={{0,1,1,0},{1,1,1,1},{1,1,1,1}};
        int row = arr.length;
        int col = arr[0].length;

        // HashSet<Integer>rowSet= new HashSet<>();
        // HashSet<Integer>colSet= new HashSet<>();



        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){

        //         System.out.print(arr[i][j]);

        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){

        //         if(arr[i][j] == 0){
        //             rowSet.add(i);
        //             colSet.add(j);
        //         }

        //     }
        // }

        //  for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){

        //         if(rowSet.contains(i) || colSet.contains(j)){
        //             arr[i][j] =0;
        //         }

        //     }
        // }

        // System.out.println("++++++++++++++++++");

        //  for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){

        //         System.out.print(arr[i][j]);

        //     }
        //     System.out.println();
        // }

        

        // Another method in O(Mx N) and space is O(1)

        boolean rowFirst = false;
        boolean colFirst = false;


        // Check for first row contain zero 

        for(int j=0; j<col; j++){

            if(arr[0][j] == 0){
                rowFirst = true;
                break;
            }
        }

        // Check if first column contain zero

        for(int i=0; i<row; i++){

            if(arr[i][0] == 0){
                colFirst = true;
                break;
            }
        }

        // Check for intermediate row and column

        for(int i=1;i<row;i++){
            for(int j=1; j<col;j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0]=0;
                }
            }
        }

        //set row and column zero

        for(int i=1; i<row;i++){
            for(int j=1; j<col;j++){

                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        // Check for first row

        if(rowFirst){

            for(int j=0; j<col ;j++){
                
                arr[0][j] = 0;
                
            }
        }

        //Check for first column

        if(colFirst){

            for(int i=0; i<row;i++){

                arr[i][0] = 0;
            }
        }
        
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }
}
