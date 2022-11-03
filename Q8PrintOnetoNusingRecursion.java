public class Q8PrintOnetoNusingRecursion {

    
  public int printNos(int N)
    {
        if(N==0){
            return 1;
            
        }
        
        printNos(N-1);
        System.out.print(N+ " ");
        return N;
    }
    
}
