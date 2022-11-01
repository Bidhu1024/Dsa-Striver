public class Q2ReverseNumber {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int time = 32;
        List <Integer> l = new ArrayList<>();
        while(time>0){
            int t = n & 1;
            l.add(t);
            n = n>>1;
            time--;
        }

        int res = 0;
        for(int i = 0;i<l.size();i++){
            res = res<<1;
            res = res | l.get(i);
            
        }
        return res;
    }
}