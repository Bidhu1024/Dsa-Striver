class Q11PrintNaturalSum{
    static int numsum(int n){
 
        if(n==0){
            return 0;
        }
        return n + numsum(n-1);
    }

    public static void main(String[] args){
    System.out.println(numsum(4));
    }
}