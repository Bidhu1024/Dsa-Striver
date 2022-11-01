public class Q3Pallindrome {
    
        public boolean isPalindrome(int n) {
            int reverse = 0;
            int temp = n;
            if(n<0){
                return false;
            }
            while(temp!=0){
                reverse = (reverse*10)+(temp%10);
                temp /=10;
            }
            return (reverse==n);
        }
    }

