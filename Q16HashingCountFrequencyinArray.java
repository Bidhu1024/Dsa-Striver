import java.util.HashMap;

public class Q16HashingCountFrequencyinArray {

    public static void main(String[] args){
        int[] arr = new int[]{12,12,45,34,56,43,43,12,45};
        int n = arr.length;

        countFreq(arr,n);
    }


    static void countFreq(int arr[], int n){

        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(result.containsKey(arr[i])){
                result.put(arr[i],result.get(arr[i]+1));
            }else{
                result.put(arr[i],1);
            }
        }


        for(map.Entries<Integer,Integer> i:result.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
    
}
