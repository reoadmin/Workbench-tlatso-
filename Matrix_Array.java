/**
Program Name: Matrix_Array.java
Names: Tlatso Tsebe
Student ID: 202004312
Date: 10/02/2022
Time: 12:31 P.M
 */

public class Matrix_Array{
    public static boolean Matrix(Array[][], int x){
        int len = Array.length - 1;
        int temp = 0;
        for(int i = 0; i < len; i+=){
            for(int j = 0; j < len; j++){
                if(Array[i][j] == x){
                    return true;
                }
                else-if (Array[i][j] > Array[i+1][j+1]){
                    temp = Array[i][j];
                    Array[i][j] = Array[i+1][j+1];
                    Array[i+1][j+1] = temp;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int array[][] = new array[5][5];
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length-1; i++){
                System.out.printf("  -2D ARRAY IS BELOW - \n");
                System.out.println(array[i][j]);
            }
        }
        
    }
}
