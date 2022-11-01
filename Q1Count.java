
class Solution{
    static int evenlyDivides(int n){
        int temp = n, count =0;
        while(temp!=0){
            int d = temp%10;
            temp = temp/10;
            
            if(d>0 && n%d==0)
            count++;
        }
        return count;
        
        
    }
    
    
    public static void main(String[] args){
        int n = 123456;
        System.out.println(evenlyDivides(n));
    }
}