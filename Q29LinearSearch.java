public class Q29LinearSearch {
    static int searchInSorted(int arr[], int n, int k)
    {
        
    if(n<1) return -1;
    

    
    for(int i = 0;i<n;i++){
        if(arr[i]==k){
            
            return 1;
        }
    }
    
        return -1;  
    }
}
