public class Q9PrintGFG_N_times {
   

        static int printGfg(int N) {
        
        if(N==0){
            return 1;
        }
        System.out.print("GFG"+" " );
        printGfg(N-1);
        return N;
        
         }
     }

