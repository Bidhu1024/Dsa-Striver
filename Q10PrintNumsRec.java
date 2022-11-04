public class Q10PrintNumsRec {
    int printNos(int N) {
        if(N==0){
            return 1;
        }
        
        System.out.print(N+" ");
        printNos(N-1);
        return N;
    }
}

