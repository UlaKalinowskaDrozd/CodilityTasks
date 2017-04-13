/**
 * Created by Urszula Kalinowska-Drozd on 13.04.17.
 */
public class BinaryGap {
    public int Solution(int N){
        int longestBinary = 0;
        int counter = 0;
        while(N%2 == 0) {
            N = N / 2;
        }
        while (N != 0){
            if(N%2 == 0) {
                counter++;
                N=N/2;
            }
            else{
                if(counter > longestBinary) longestBinary = counter;
                counter = 0;
                N = (N-1)/2;
            }
        }
        return longestBinary;
    }
}
