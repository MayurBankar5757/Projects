package Interview;
public class TCS_Sol2 {
    public static void main(String[] args) {
        int milk = 0;
      //  int bottle = 0; There is no used of bottle variable
        int sum = 10;
        int r1 = 11;
        int r2 = 9;
        int r3 = 8;

        while (sum > 0) {  
        	
            if (sum >= r1) {
                sum -= r1;
                milk++;
               // bottle++;
            } else if (sum >= r2) {
                sum -= r2;
                milk++;
               // bottle++;
            } else if (sum ==1 ||sum >= r2|| sum >= r1) {
                sum += r3;
              
               // bottle--;
            } 
            else {
            	break;
            }
        }
        System.out.print(milk);
    }
}
