// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class checkOddSeries {
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,1,1};
        int len =0;
        for(int i=0; i<arr.length-1; i++){
            len = (arr[i] % 2 != 0) ? len + 1 : 0;
             if(len==3){
            System.out.println("odd series"+ arr.length);
        }
            
        }
       
    }
}