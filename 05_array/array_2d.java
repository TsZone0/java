import java.util.*;

public class array_2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // input 
        System.out.println("Enter Your Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Your Colmn :");
        int colmn = sc.nextInt();
        int[][] arrayname = new int[rows][colmn];

        //for rows
        for(int i=0; i<rows; i++){
            for(int j =0; j<colmn; j++){
                arrayname[i][j] = sc.nextInt();
            }
        }

        //output
                for(int i=0; i<rows; i++){
            for(int j =0; j<colmn; j++){
                System.out.print(arrayname[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("witch number want to find ? ");
        int fnum = sc.nextInt();
                for(int i=0; i<rows; i++){
            for(int j =0; j<colmn; j++){
                if(arrayname[i][j]==fnum){
                    System.out.println("location is = "+ i +j);
                }
            }
        }

    }
}
