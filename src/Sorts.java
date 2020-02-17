
/**
 *
 * @author Juan Marroquin
 */
import java.util.*;
public class Sorts {
    /**
     * sacado de internet
     * @param a 
     * @return  
     */
  public Comparable[] Selectionsort(Comparable[] a) { 
   
    int N = a.length;
   
    for (int i = 0; i < N; i++) { 
 
        int minIndex = i;
        for (int j = i + 1; j < N; j++)
        if ( a[j].compareTo(a[minIndex])<0 )
             minIndex = j;
 
        if (minIndex != i) {
            Comparable temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        
    }
    return a;
    
  }
  /**
   * sacado de internet
   * @param a 
     * @return  
   */
  public Comparable [ ] mergeSort(Comparable [ ] a){
      Comparable[] tmp = new Comparable[a.length];
      mergeSort(a, tmp,  0,  a.length - 1);
      return a;
  }
  /**
   * sacado de internet
   * ayuda al metodo mergeSort
   * @param a
   * @param tmp
   * @param left
   * @param right 
   */
  private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right){
      if( left < right ){
          int center = (left + right) / 2;
          mergeSort(a, tmp, left, center);
          mergeSort(a, tmp, center + 1, right);
          merge(a, tmp, left, center + 1, right);
      }
  }
  /**
   * sacado de internet
   * ayuada al mergeSorte
   * @param a
   * @param tmp
   * @param left
   * @param right
   * @param rightEnd 
   */
  private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd ){
      int leftEnd = right - 1;
      int k = left;
      int num = rightEnd - left + 1;
      while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
  /**
   * sacado de internet
   * @param a 
     * @return  a
   */
  public Comparable[] quickSort(Comparable[] a) {
            quicksort(a, 0, a.length-1);
            return a;
        }
        /**
         * sacado de internet ayuda al quick sort
         * @param a
         * @param lo
         * @param hi 
         */
        private static void quicksort(Comparable[] a, int lo, int hi) {
            if(lo >= hi) return;
            int pi = partition(a, lo, hi);
            quicksort(a, lo, pi-1);
            quicksort(a, pi+1, hi);
        }
        /**
         * sacado de internet
         * ayuda al quick sort
         * @param a
         * @param lo
         * @param hi
         * @return 
         */
        private static int partition(Comparable[] a, int lo, int hi) {
            int i = lo + 1;
            int j = hi;

            while(i <= j) {
                if(a[i].compareTo(a[lo]) <= 0) { 
                    i++; 
                }
                else if(a[j].compareTo(a[lo]) > 0) { 
                    j--;
                }
                else if(j < i) {
                    break;
                }
                else
                    exchange(a, i, j);
            }
            exchange(a, lo, j);
            return j;
        }
        /**
         * sacad de internet 
         * ayuda al quick sort
         * @param a
         * @param i
         * @param j 
         */
        private static void exchange(Object[] a, int i, int j) {
            Object tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        /**
         * 
         * @param x
         * @return x
         */
       public  Comparable[] Bubblesort(Comparable[] x){
           for (int i= x.length; i>1; i--){
               for (int j = 1; j<i; j++){
                   if (x[j-1].compareTo(x[j]) > 0){
                       swap(x,j-1,j);
                   }
               }
           }
           return x;
    }
      public static void swap(Comparable data[], int i, int j)
        // pre: 0 <= i,j < data.length
        // post: data[i] and data[j] are exchanged
        {
        Comparable temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        } 
      
}