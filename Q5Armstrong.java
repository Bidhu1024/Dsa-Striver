public class Q5Armstrong {
    
        static String armstrongNumber(int n){
            int givenNum = n;
            int finalNum = 0;
            int lastDig;
            
            while(givenNum!=0){
                lastDig = givenNum%10;
                finalNum = finalNum + (int)Math.pow(lastDig,3);
                givenNum = givenNum/10;
            }
            
            return (finalNum==n)?"Yes":"No";
        }
    
}
