package practice;

import java.util.*;
public class Main 
{
    public static void selectionSort(int[] element) //selectionSort method is static method using static keyword, no return type and array type argument 
    {
        for(int j=0; j<element.length-1;j++)  //for loop start from 0 to 5-1 (element.length will return 5 because of array size) and increment by 1(j++)
        {
           
         int minIndex=j; //store j value in minIndex
         System.out.println(minIndex + "\n\n");
         
         for(int k=j+1; k<element.length;k++) //loop start with k+1 to 5(element.length will return 5 because of array size) and incremented by 1(k++)
         {
           
           if(element[k]<element[minIndex]) //check if element[k] is less than element[minIndex] then
           {
               minIndex=k; //store k in minIndex 
           }
        }
           
         if(j!=minIndex) //check if j value is not equals to minIndex then
         {
             int temp=element[j]; //declare temo and initialize with element[j] value
             element[j]=element[minIndex]; //store element[minIndex] value in element[j]
             element[minIndex]=temp; //store temp value in element[minIndex]
             System.out.println(element[minIndex]); // I added this line for printing element[minIndex] value
         }
        }
        
    }

    public static void main(String[] args) {
        
        int[] arr={5, 10, 2, 1, 12}; //initialize array 
        
        System.out.println("...");
        selectionSort(arr); //call selectionSort using Class Name and passing arr to selectionSort method
    } 
 }