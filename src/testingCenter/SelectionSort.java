package testingCenter;


/* Name: Antonina Orlanova, Summer 2022 CSC1302
 * Program: The sort method of this class sorts a Coin array, using the selection 
sort algorithm.*/



public class SelectionSort {
/**
   @param a is the Coin array to sort
*/
public static void sort(Coin[] a)
{  
   for (int i = 0; i < a.length - 1; i++)
   {  
      int minPos = minimumPosition(a, i);
      ArrayUtil.swap(a, minPos, i);
   }
}

/**
   Finds the smallest element in a tail range of the array.
   @param Coin a the array to sort
   @param from the first position in a to compare
   @return the position of the smallest element in the
   range a[from] . . . a[a.length - 1]
*/
public static int minimumPosition(Coin[] a, int from)
{  
   int minPos = from;
   for (int i = from + 1; i < a.length; i++)
   {
      if (a[i].returnVal() < a[minPos].returnVal()) { minPos = i; }
   }
   return minPos;
}
}


