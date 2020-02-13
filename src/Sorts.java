
/**
 *
 * @author Juan Marroquin
 */
import java.util.*;
public class Sorts {
    /**
     * codigo sacado del libro de texto
     * @param data
     * @param n 
     */
   public void selectionSort(int data[], int n){
       int numUnsorted = n;
       int index;
       int max=-1;
       while (numUnsorted>0){
           for(index = 1;index < numUnsorted;index++){
               if(data[max]< data[index]){
                   max = index;
               }
           }
           swap(data,max,numUnsorted-1);
           numUnsorted--;
       }
   }
   /**
    * ejemplo tomado del libro de texto
    * @param data
    * @param n 
    */
 public static void mergeSort(int data[], int n){
     mergeSortRecursive(data,new int[n],0,n-1);
 }
 /**
  * ejemplo tomado del libro
  * @param data
  * @param temp
  * @param low
  * @param high 
  */
 private static void mergeSortRecursive(int data[],int temp[],int low, int high){
     // pre: 0 <= low <= high < data.length
     // post: values in data[low..high] are in ascending order
     int n = high-low+1;
     int middle = low + n/2;
     int i;
     if (n < 2) return;
     // move lower half of data into temporary storage
     for (i = low; i < middle; i++)
     {
         temp[i] = data[i];
     }
// sort lower half of array
     mergeSortRecursive(temp,data,low,middle-1);
// sort upper half of array
     mergeSortRecursive(data,temp,middle,high);
// merge halves together
     merge(data,temp,low,middle,high);
 }
 /**
  * ejemplo tomado del libro
  * @param data
  * @param temp
  * @param low
  * @param middle
  * @param high 
  */
 private static void merge(int data[], int temp[],int low, int middle, int high){
     int ri = low;
// result index
     int ti = low; // temp index
     int di = middle; // destination index
// while two lists are not empty merge smaller value
     while (ti < middle && di <= high){
         if (data[di] < temp[ti]) {
             data[ri++] = data[di++];
         } // smaller is in high data
         else{
             data[ri++] = temp[ti++]; // smaller is in tem
         }
     }
 }
 /**
  * ejemplo tomado del libro
  * @param data
  * @param n 
  */
 public static void quickSort(int data[], int n){
     quickSortRecursive(data,0,n-1);
}
 /**
  * ejemplo tomado del libro
  * @param data
  * @param left
  * @param right 
  */
private static void quickSortRecursive(int data[],int left,int right){
    int pivot; // the final location of the leftmost value
    if (left >= right) return;
    pivot = partition(data,left,right); /* 1 - place pivot */
    quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
    quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
    /* done! */
}
/**
 * ejemplo tomado del libro
 * @param data
 * @param left
 * @param right
 * @return 
 */
private static int partition(int data[], int left, int right){
    while (true){
// move right "pointer" toward left
        while (left < right && data[left] < data[right]) right--;
        if (left < right) swap(data,left++,right);
                else return left;
// move left pointer toward right
        while (left < right && data[left] < data[right]) left++;
        if (left < right) swap(data,left,right--);
        else return right;
    }
}
public static void radixsort(int data[], int n) { 
// Find the maximum number to know number of digits 
    int m = getMax(data, n);
// Do counting sort for every digit. Note that instead
// of passing digit number, exp is passed. exp is 10^i 
// where i is current digit number 
    for (int exp = 1; m/exp > 0; exp *= 10){
        countSort(data, n, exp);
    }    
} 
/**
 * ejemplo sacado de internet
 * @param data
 * @param n
 * @return 
 */
public static int getMax(int data[], int n){ 
    int mx = data[0]; 
    for (int i = 1; i < n; i++) 
        if (data[i] > mx) 
            mx = data[i]; 
    return mx; 
    } 
/**
 * ejemplo sacado de internet
 * @param arr
 * @param n
 * @param exp 
 */
public static void countSort(int arr[], int n, int exp){ 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--){ 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to curent digit 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    }
/**
 * ejemplo tomado del libro
 * @param data
 * @param i
 * @param j 
 */
public static void swap(int data[], int i, int j){
    // pre: 0 <= i,j < data.length
// post: data[i] and data[j] are exchanged
    int temp;
    temp = data[i];
    data[i] = data[j];
    data[j] = temp;
    }
}