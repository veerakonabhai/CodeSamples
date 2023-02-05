package Java_CS;

import java.util.Arrays;

public class kArrayStrings {
    int[] A;
    public kArrayStrings(int n){
        A = new int[n]; 
    }
    //K-array strings
    //using backtracking time complexity = O(k^n)
    public void base_K_strings(int n, int k) {
        //process all k-ary strings of length n
        if(n <= 0){
            System.out.println(Arrays.toString(A));
        }else{
            for(int j = 0; j<k; j++){
                A[n-1] = j;
                base_K_strings(n-1, k);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        kArrayStrings i = new kArrayStrings(n);
        i.base_K_strings(n, 3);
    }   
}