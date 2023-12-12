package main;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
         
            
            arr.add(arrRowItems);
        }
        bufferedReader.close();
    
        
        for (List<Integer> row : arr) {
            for (Integer item : row) {
                System.out.print(item + " ");
            }
            System.out.println();  
        }
        
      
       System.out.println(sumatoria(arr));
        
    }    
    
    static int sumatoria(List<List<Integer>> matriz) {
        int maxSum = Integer.MIN_VALUE;//7

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = sum3x3(matriz, i, j);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
        
        static int sum3x3(List<List<Integer>> matriz, int row, int col) {
        	int suma = 0;
        	for(int i = row ; i < row + 3 ; i++) {
        		for (int j = col; j < col + 3 ; j++){	
        			
        			
       //para no sumar como reloj los string de la segunda fila y 1ra y 3ra columna 
	        		if((i == row + 1 && j == col)|| (i == row + 1 && j == col + 2)) {
	        			suma += 0;
	        		}else {
	            			suma +=matriz.get(i).get(j);	
	        		}
        		}
        	}
        return suma;
      }
       
        
        
        
        
    
        
    
    
    
}
