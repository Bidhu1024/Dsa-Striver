class Q19InsertionSort{
//Function to sort the array using insertion sort algorithm.
  public void insertionSort(int a[], int n)
  {
 for(int i = 0;i<n;i++){
     int temp = a[i];
     int j = i-1;
     
     while(j>=0 && a[j]>temp){
         a[j+1] = a[j];
         j--;
     }
     a[j+1] = temp;
 }
  }
}