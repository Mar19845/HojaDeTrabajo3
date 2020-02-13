
/**
 *
 * @author Juan Marroquin
 */
import java.util.*;
public class Sorts {
    /**
     * sacado de internet
     * @param a 
     */
  public void Selectionsort(Comparable[] a) { 
   
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
        System.out.println(a[i]);
    }
   
  }
  /**
   * sacado de internet
   * @param a 
   */
  public void mergeSort(Comparable [ ] a){
      Comparable[] tmp = new Comparable[a.length];
      mergeSort(a, tmp,  0,  a.length - 1);
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
      }
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
}