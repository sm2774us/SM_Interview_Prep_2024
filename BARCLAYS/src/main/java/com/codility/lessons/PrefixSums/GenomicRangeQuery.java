package com.codility.lessons.PrefixSums;

public class GenomicRangeQuery {

    private void populatePrefixArr(String S, int[] prefixA, int[] prefixC, int[] prefixG) {
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            
            if(c == 'A') { prefixA[i+1]++; }
            else if(c == 'C') { prefixC[i+1]++; }
            else if(c == 'G') { prefixG[i+1]++; }
            
            prefixA[i+1] += prefixA[i];
            prefixC[i+1] += prefixC[i];
            prefixG[i+1] += prefixG[i];
            
        }
    }
    
    private int[] calculateMinImpact(int[] P, int[] Q, int[] prefixA, int[] prefixC, int[] prefixG) {
        int[] minImpactArr = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int start = P[i];
            // +1 since q is inclusive
            int end = Q[i] + 1;

            if (prefixA[end] - prefixA[start] > 0) {
                minImpactArr[i] = 1;
            } else if (prefixC[end] - prefixC[start] > 0) {
                minImpactArr[i] = 2;
            } else if (prefixG[end] - prefixG[start] > 0) {
                minImpactArr[i] = 3;
            } else {
                minImpactArr[i] = 4;
            }
        }

        return minImpactArr;
    }
    
    public int[] solution1(String S, int[] P, int[] Q) {
        // ACGT 1234 
        // prefix sums for A C G 
        // .. no need for T, since it is default case if others are 0
        
        int len = S.length();
        // 1-indexing for easy calculations
        int[] prefixA = new int[len+1];
        int[] prefixC = new int[len+1];
        int[] prefixG = new int[len+1];
        
        populatePrefixArr(S, prefixA, prefixC, prefixG);
        
        return calculateMinImpact(P, Q, prefixA, prefixC, prefixG);
    }

    public int[] solution2(String S, int[] P, int[] Q) {
        // result: the minimal impact of each query
        int[] result = new int[P.length];

        // to count "A"、"C"、"G"、"T"
        // A[i] means: num of 'a' from 0 to i-1
        int A[] = new int[S.length()+1];
        int C[] = new int[S.length()+1];
        int G[] = new int[S.length()+1];
        int T[] = new int[S.length()+1];
        // note: we use "S.length()+1" 
        // which will let A[0]=0, C[0]=0, G[0]=0, T[0]=0
        // becasue we will compute number of 'a' by "A[Q+1] - A[P]"
        // we actually shift to right by one, and assume the biginning is a dummy '0' 

        // counting ( note: A[0]=0, C[0]=0, G[0]=0, T[0]=0 )
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'A')
            {
                A[i+1] = A[i]+1;
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i];
            }
            else if(S.charAt(i) == 'C')
            {
                A[i+1] = A[i];
                C[i+1] = C[i]+1;
                G[i+1] = G[i];
                T[i+1] = T[i];
            }
            else if(S.charAt(i) == 'G')
            {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i]+1;
                T[i+1] = T[i];
            }
            else if(S.charAt(i) == 'T')
            {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i]+1;
            }
        }

        // to handle the queries
        int num_of_query = P.length; // or Q.length
        for (int i = 0; i < num_of_query; i++) {
            int a = A[ Q[i] + 1] - A[ P[i] ]; // num of 'a' between P and Q
            int c = C[ Q[i] + 1] - C[ P[i] ]; // num of 'c' between P and Q
            int g = G[ Q[i] + 1] - G[ P[i] ]; // num of 'g' between P and Q
            
            if(a > 0){ // there is 'a'
                result[i] = 1;
            }
            else if(c > 0){ // there is 'c'
                result[i] = 2;
            }
            else if(g > 0){ // there is 'g'
                result[i] =3;
            }
            else{ // there is only 'T'
                result[i] =4;
            }
        }

        return result;
    }

}
