# Interview Prep 2024

## Table Of Contents <a name="top"></a>

1. [BARCLAYS](#barclays)  
 - 1.1   [Lesson 1: Iterations](#lesson-1-iterations)
   - 1.1.1   [Binary Gap](#binary-gap)
 - 1.2   [Lesson 2: Arrays](#lesson-2-arrays)
   - 1.2.1   [Cyclic Rotation](#cyclic-rotation)
   - 1.2.2   [Odd Occurrences In Arrays](#odd-occurrences-in-arrays)
 - 1.3   [Lesson 3: Time Complexity](#lesson-3-time-complexity)
   - 1.3.1   [Frog Jump](#frog-jump)
   - 1.3.2   [Perm Missing Element](#perm-missing-element)
   - 1.3.3   [Tape  Equilibrium](#tape-equilibrium)
 - 1.4   [Lesson 4: Counting Elements](#lesson-4-counting-elements)
   - 1.4.1   [Frog River One](#frog-river-one)
   - 1.4.2   [Permutation Check](#permutation-check)
   - 1.4.3   [Max Counters](#max-counters)
   - 1.4.4   [Missing Integer](#missing-integer)
 - 1.5   [Lesson 5: Prefix Sums](#lesson-5-prefix-sums)
   - 1.5.1   [Passing Cars](#passing-cars)
   - 1.5.2   [Count Divisible](#count-divisible)
   - 1.5.3   [Genomic Range Query](#genomic-range-query)
   - 1.5.4   [Minimal Average Two Slice](#minimal-average-two-slice)
 - 1.6   [Lesson 6: Sorting](#lesson-6-sorting)
   - 1.6.1   [Distinct](#distinct)
   - 1.6.2   [Max Product Of Three](#max-product-of-three)
   - 1.6.3   [Triangle](#triangle)
   - 1.6.4   [Number Of Disc Intersections](#number-of-disc-intersections)
 - 1.7   [Lesson 7: Stacks and Queues](#lesson-7-stacks-and-queues)
   - 1.7.1   [Distinct](#distinct)
   - 1.7.2   [Fish](#fish)
   - 1.7.3   [Nesting](#nesting)
   - 1.7.4   [StoneWall](#stonewall)
 - 1.8   [Lesson 8: Leader](#lesson-8-leader)
   - 1.8.1   [Dominator](#dominator)
   - 1.8.2   [Equi Leader](#equi-leader)
 - 1.9   [Lesson 9: Maximum Slice Problem](#maximum-slice-problem)
 - 1.10   [Lesson 10: Prime and Composite Numbers](#prime-and-composite-numbers)
 - 1.11   [Lesson 11: Sieve of Eratosthenes](#sieve-of-eratosthenes)
 - 1.12   [Lesson 12: Euclidean Algorithm](#euclidean-algorithm)
 - 1.13   [Lesson 13: Fibonacci Numbers](#fibonacci-numbers)
 - 1.14   [Lesson 14: Binary Search Algorithm](#binary-search-algorithm)
 - 1.15   [Lesson 15: Caterpillar Method](#caterpillar-method)
 - 1.16   [Lesson 16: Greedy Algorithms](#greedy-algorithms)
 - 1.17   [Lesson 17: Dynamic Programming](#dynamic-programming)

#### [Lesson 1: Iterations](./src/main/java/com/codility/lessons/BinaryGap)

##### [Binary Gap](./src/main/java/com/codility/lessons/BinaryGap/BinaryGap.java)

Find longest sequence of zeros in binary representation of an integer.

A binary gap within a positive integer N is any maximal sequence of
consecutive zeros that is surrounded by ones at both ends in the binary
representation of N.

For example, number 9 has binary representation 1001 and contains a
binary gap of length 2. The number 529 has binary representation
1000010001 and contains two binary gaps: one of length 4 and one of
length 3. The number 20 has binary representation 10100 and contains one
binary gap of length 1. The number 15 has binary representation 1111 and
has no binary gaps.

``` java
Write a function:

class Solution { public int solution(int N); }
```

that, given a positive integer N, returns the length of its longest
binary gap. The function should return 0 if N doesn’t contain a binary
gap.

For example, given N = 1041 the function should return 5, because N has
binary representation 10000010001 and so its longest binary gap is of
length 5.

Assume that  
N is an integer within the range \[1..2,147,483,647\].

Complexity: expected worst-case time complexity is O(log(N)); expected
worst-case space complexity is O(1).

```java
// Bit-Wise Solution

class BinaryGap {
    public static int solution(int n) {
        // get rid of right-hand zeros
        while (n != 0 && (n & 1) == 0) {
            System.out.println("n--->" + n);
            System.out.println("n in Binary--->" + Integer.toBinaryString(n));
            n >>>= 1;
        }
        System.out.println("Got rid of all the right-hand zeros");
        System.out.println("n--->" + n);
        System.out.println("n in Binary--->" + Integer.toBinaryString(n));

        int max = 0;
        int gap = 0;
        while (n != 0) {
            System.out.println("n--->" + n);
            System.out.println("n in Binary--->" + Integer.toBinaryString(n));
            System.out.println("n&1--->" + (n & 1));
            if ((n & 1) == 0) {
                System.out.println("n--->" + n);
                System.out.println("n in Binary--->" + Integer.toBinaryString(n));
                gap++;
                max = Math.max(gap, max);
            } else {
                gap = 0;
            }
            n >>>= 1;
        }
        return max;
    }

    public static void main(String[] args) throws java.lang.Exception {
        //int n = 1041;
        int n = 1040;
        System.out.println("n--->" + n);
        System.out.println("n in Binary--->" + Integer.toBinaryString(n));
        int sol = solution(n);
        System.out.println("max gap--->" + sol);
    }
}
```

```bash
# Output

n--->1040
n in Binary--->10000010000
n--->1040
n in Binary--->10000010000
n--->520
n in Binary--->1000001000
n--->260
n in Binary--->100000100
n--->130
n in Binary--->10000010
Got rid of all the right-hand zeros
n--->65
n in Binary--->1000001
n--->65
n in Binary--->1000001
n&1--->1
n--->32
n in Binary--->100000
n&1--->0
n--->32
n in Binary--->100000
n--->16
n in Binary--->10000
n&1--->0
n--->16
n in Binary--->10000
n--->8
n in Binary--->1000
n&1--->0
n--->8
n in Binary--->1000
n--->4
n in Binary--->100
n&1--->0
n--->4
n in Binary--->100
n--->2
n in Binary--->10
n&1--->0
n--->2
n in Binary--->10
n--->1
n in Binary--->1
n&1--->1
max gap--->5
```

```java
class BinaryGap {
    public static int solution(int n) {
		    System.out.println("n--->"+n);
		    System.out.println("n in Binary--->"+Integer.toBinaryString(n));

        int maxGap = 0, currGap = 0;
        boolean isInGap = false;
        
        while(n > 0) {
		        System.out.println("n--->"+n);
		        System.out.println("n in Binary--->"+Integer.toBinaryString(n));
            if(isOne(n)) {
		            System.out.println("n--->"+n);
		            System.out.println("n in Binary--->"+Integer.toBinaryString(n));
                maxGap = maxGap < currGap ? currGap : maxGap;
                currGap = 0;
                isInGap = true;
            } else if(isInGap){ currGap++; }
            n /= 2;
        }
        
        return maxGap;
    }
    
    private static boolean isOne(int n) {
        return N%2 == 1 || N == 1 ;
    }

    public static void main (String[] args) throws java.lang.Exception {
		    //int n = 1041;
		    int n = 1040;
		    System.out.println("n--->"+n);
		    System.out.println("n in Binary--->"+Integer.toBinaryString(n));
		    int sol = solution(n);
		    System.out.println("max gap--->"+sol);
    }
}
```

```bash
# Output

n--->1040
n in Binary--->10000010000
n--->1040
n in Binary--->10000010000
n--->1040
n in Binary--->10000010000
n--->520
n in Binary--->1000001000
n--->260
n in Binary--->100000100
n--->130
n in Binary--->10000010
n--->65
n in Binary--->1000001
n--->65
n in Binary--->1000001
n--->32
n in Binary--->100000
n--->16
n in Binary--->10000
n--->8
n in Binary--->1000
n--->4
n in Binary--->100
n--->2
n in Binary--->10
n--->1
n in Binary--->1
n--->1
n in Binary--->1
max gap--->5
```

#### [Lesson 2: Arrays](./src/main/java/com/codility/lessons/Arrays)

##### [Cyclic Rotation](./src/main/java/com/codility/lessons/Arrays/CyclicRotation.java)

Rotate an array to the right by a given number of steps. A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = \[3, 8, 9, 7, 6\] is \[6, 3, 8, 9, 7\] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will
be shifted to the right K times.

Write a function:

``` java
class Solution { public int[] solution(int[] A, int K); }
```

that, given a zero-indexed array A consisting of N integers and an
integer K, returns the array A rotated K times.

For example, given

``` java
    A = [3, 8, 9, 7, 6]
    K = 3
```

the function should return \[9, 7, 6, 3, 8\]. Three rotations were made:

``` java
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
```

``` java
For another example, given
    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]
```

Given:

``` java
    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]
```

Assume that  
N and K are integers within the range \[0..100\]; each element of array
A is an integer within the range \[−1,000..1,000\]. In your solution,
focus on correctness. The performance of your solution will not be the
focus of the assessment.

```java
package com.codility.lessons.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**

 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = {
            -3,
            8,
            9,
            -7,
            6
        };
        int K = 3;

        int[] sol1 = solution1(A, K);
        System.out.println("sol1-->" + Arrays.toString(sol1));

        int[] sol2 = solution2(A, K);
        System.out.println("sol2-->" + Arrays.toString(sol2));
    }

    /**
     * Java solution using the concept of "mod" (to make it cyclic)
     */
    public static int[] solution1(int[] A, int K) {
        // Using the concept of "mod" (to make it cyclic)
        
        int[] new_array = new int[A.length]; // a new array
        
        for(int i=0; i< A.length; i++){
            int new_position = (i + K) % A.length; // using "mod" to do Cyclic Rotation           
            new_array[new_position] = A[i]; // put A[i] to the new position
        }
        
        return new_array; // return new array
    }

    /**
     *  Java8 Stream Solution
     */
    public static int[] solution2(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }

        final LinkedList<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        while (K > 0) {
            list.addFirst(list.getLast());
            list.removeLast();
            K--;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
```

```bash
# Output

sol1-->[9, -7, 6, -3, 8]
sol2-->[9, -7, 6, -3, 8]
```

##### [Odd Occurrences In Array](./src/main/java/com/codility/lessons/Arrays/OddOccurrencesInArray.java)

Find value that occurs in odd number of elements.

A non-empty zero-indexed array A consisting of N integers is given. The
array contains an odd number of elements, and each element of the array
can be paired with another element that has the same value, except for
one element that is left unpaired.

For example, in array A such that:

``` java
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
```

the elements at indexes 0 and 2 have value 9, the elements at indexes 1
and 3 have value 3, the elements at indexes 4 and 6 have value 9, the
element at index 5 has value 7 and is unpaired. Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given an array A consisting of N integers fulfilling the above
conditions, returns the value of the unpaired element.

For example, given array A such that:

``` java
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
```

the function should return 7, as explained in the example above.

Assume that  
N is an odd integer within the range \[1..1,000,000\]; each element of
array A is an integer within the range \[1..1,000,000,000\]; all but one
of the values in A occur an even number of times. Complexity:

expected worst-case time complexity is O(N); expected worst-case space
complexity is O(1), beyond input storage (not counting the storage
required for input arguments).

#### [Lesson 3: Time Complexity](./src/com/codility/lessons/TimeComplexity)

##### [Frog Jump](./src/main/java/com/codility/lessons/TimeComplexity/FrogJmp.java)

Count minimal number of jumps from position X to Y. A small frog wants
to get to the other side of the road. The frog is currently located at
position X and wants to get to a position greater than or equal to Y.
The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to
reach its target.

Write a function:

``` java
class Solution { public int solution(int X, int Y, int D); }
```

that, given three integers X, Y and D, returns the minimal number of
jumps from position X to a position equal to or greater than Y.

For example, given:

``` java
  X = 10
  Y = 85
  D = 30
```

the function should return 3, because the frog will be positioned as
follows:

after the first jump, at position 10 + 30 = 40 after the second jump, at
position 10 + 30 + 30 = 70 after the third jump, at position 10 + 30 +
30 + 30 = 100 Assume that::

X, Y and D are integers within the range \[1..1,000,000,000\]; X ≤ Y.

Complexity:

expected worst-case time complexity is O(1); expected worst-case space
complexity is O(1).

##### [Perm Missing Element](./src/main/java/com/codility/lessons/TimeComplexity/PermMissingElem.java)

Find the missing element in a given permutation. A zero-indexed array `A` consisting of `N` different integers is given. The array contains integers in the range \[1..(N + 1)\], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given a zero-indexed array A, returns the value of the missing
element.

For example, given array A such that:

``` java
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
```

the function should return 4, as it is the missing element.

Assume that  
N is an integer within the range \[0..100,000\]; the elements of A are
all distinct; each element of array A is an integer within the range
\[1..(N + 1)\]. Complexity:

expected worst-case time complexity is O(N); expected worst-case space
complexity is O(1), beyond input storage (not counting the storage
required for input arguments).

##### [Tape  Equilibrium](./src/main/java/com/codility/lessons/TimeComplexity/TapeEquilibrium.java)

Minimize the value \|(A\[0\] + … + A\[P-1\]) - (A\[P\] + … + A\[N-1\])\|.

A non-empty zero-indexed array A consisting of N integers is given.
Array A represents numbers on a tape.

Any integer P, such that 0 \< P \< N, splits this tape into two
non-empty parts: A\[0\], A\[1\], …, A\[P − 1\] and A\[P\], A\[P + 1\],
…, A\[N − 1\].

The difference between the two parts is the value of: \|(A\[0\] +
A\[1\] + … + A\[P − 1\]) − (A\[P\] + A\[P + 1\] + … + A\[N − 1\])\|

In other words, it is the absolute difference between the sum of the
first part and the sum of the second part.

For example, consider array A such that:

``` java
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
```

We can split this tape in four places:

``` java
P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
```

Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given a non-empty zero-indexed array A of N integers, returns the
minimal difference that can be achieved.

For example, given:

``` java
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
```

the function should return 1, as explained above.

Assume that  
N is an integer within the range \[2..100,000\]; each element of array A
is an integer within the range \[−1,000..1,000\]. Complexity:

expected worst-case time complexity is O(N); expected worst-case space
complexity is O(N), beyond input storage (not counting the storage
required for input arguments).

#### [Lesson 4: Counting Elements](./src/com/codility/lessons/CountingElements)

##### [Frog River One](./src/main/java/com/codility/lessons/CountingElements/FrogRiverOne.java)

A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from `1` to `X` (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer `X = 5` and array `A` such that:

``` java
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
```

In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

```java
class Solution { public int solution(int X, int[] A); }
```

that, given a non-empty array `A` consisting of `N` integers and integer `X`, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given `X = 5` and array `A` such that:

``` java
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
````
the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

- `N` and `X` are integers within the range `[1..100,000]`;
- each element of array `A` is an integer within the range `[1..X]`.

##### [Permutation Check](./src/main/java/com/codility/lessons/CountingElements/PermutationCheck.java)

Check whether array A is a permutation.

A non-empty zero-indexed array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once,
and only once.

For example, array A such that:

``` java
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
```

is a permutation, but array A such that:

``` java
    A[0] = 4
    A[1] = 1
    A[2] = 3
```

is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given a zero-indexed array A, returns 1 if array A is a
permutation and 0 if it is not.

For example, given array A such that:

``` java
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
```

the function should return 1.

Given array A such that:

``` java
    A[0] = 4
    A[1] = 1
    A[2] = 3
```

the function should return 0.

Assume that  
- `N` is an integer within the range \[1..100,000\]; each element of array `A`
- is an integer within the range \[1..1,000,000,000\].

Complexity:

- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

##### [Max Counters](./src/main/java/com/codility/lessons/CountingElements/MaxCounters.java)

You are given `N` counters, initially set to 0, and you have two possible operations on them:

- `increase(X) −` counter X is increased by 1,
- `max counter −` all counters are set to the maximum value of any counter.

A non-empty array A of M integers is given. This array represents consecutive operations:

- if `A[K] = X`, such that `1 ≤ X ≤ N`, then operation `K` is `increase(X)`,
- if `A[K] = N + 1` then operation `K` is max counter.

For example, given integer `N = 5` and array `A` such that:

```java
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
```

the values of the counters after each consecutive operation will be:

```java
    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
```

The goal is to calculate the value of every counter after all operations.

Write a function:

```java
class Solution { public int[] solution(int N, int[] A); }
```

that, given an integer `N` and a non-empty array `A` consisting of `M` integers, returns a sequence of integers representing the values of the counters.

Result array should be returned as an array of integers.

For example, given:

```java
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
```

the function should return `[3, 2, 2, 4, 2]`, as explained above.

Write an efficient algorithm for the following assumptions:

- `N` and `M` are integers within the range `[1..100,000]`;
- each element of array `A` is an integer within the range `[1..N + 1]`.

##### [Missing Integer](./src/main/java/com/codility/lessons/CountingElements/MissingInteger.java)

This is a demo task.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given an array `A` of `N` integers, returns the smallest positive integer (greater than 0) that does not occur in `A`.

For example, given `A = [1, 3, 6, 4, 1, 2]`, the function should return `5`.

Given `A = [1, 2, 3]`, the function should return `4`.

Given `A = [−1, −3]`, the function should return `1`.

Write an efficient algorithm for the following assumptions:

- `N` is an integer within the range `[1..100,000]`;
- each element of array `A` is an integer within the range `[−1,000,000..1,000,000]`.

#### [Lesson 5: Prefix Sums](./src/main/java/com/codility/lessons/PrefixSums)

##### [Passing Cars](./src/main/java/com/codility/lessons/PrefixSums/PassingCars.java)

A non-empty array `A` consisting of `N` integers is given. The consecutive elements of array A represent consecutive cars on a road.

Array `A` contains only 0s and/or 1s:

- 0 represents a car traveling east,
- 1 represents a car traveling west.

The goal is to count passing cars. We say that a pair of cars `(P, Q)`, where `0 ≤ P < Q < N`, is passing when `P` is traveling to the east and `Q` is traveling to the west.

For example, consider array `A` such that:

```java
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
```

We have five pairs of passing cars: `(0, 1), (0, 3), (0, 4), (2, 3), (2, 4)`.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array `A` of `N` integers, returns the number of pairs of passing cars.

The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

For example, given:

```java
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
```

the function should return 5, as explained above.

Write an *efficient* algorithm for the following assumptions:

- `N` is an integer within the range `[1..100,000]`;
- each element of array `A` is an integer that can have one of the following values: `0, 1`.

##### [Count Divisible](./src/main/java/com/codility/lessons/PrefixSums/CountDiv.java)

Write a function:

```java
class Solution { public int solution(int A, int B, int K); }
```

that, given three integers `A`, `B` and `K`, returns the number of integers within the range `[A..B]` that are divisible by `K`, i.e.:

`{ i : A ≤ i ≤ B, i mod K = 0 }`

For example, for `A = 6`, `B = 11` and `K = 2`, your function should return 3, because there are three numbers divisible by 2 within the range `[6..11]`, namely 6, 8 and 10.

Write an *efficient* algorithm for the following assumptions:

- `A` and `B` are integers within the range `[0..2,000,000,000]`;
- `K` is an integer within the range `[1..2,000,000,000]`;
- `A ≤ B`.

##### [Genomic Range Query](./src/main/java/com/codility/lessons/PrefixSums/GenomicRangeQuery.java)

A DNA sequence can be represented as a string consisting of the letters `A`, `C`, `G` and `T`, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types `A`, `C`, `G` and `T` have impact factors of `1`, `2`, `3` and `4`, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

The DNA sequence is given as a non-empty string `S = S[0]S[1]...S[N-1]` consisting of `N` characters. There are `M` queries, which are given in non-empty arrays P and Q, each consisting of `M` integers. The `K-th` query `(0 ≤ K < M)` requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions `P[K]` and `Q[K]` (inclusive).

For example, consider string `S = CAGCCTA` and arrays `P`, `Q` such that:

```java
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
```

The answers to these `M = 3` queries are as follows:

- The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
- The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
- The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.

Write a function:

```java
class Solution { public int[] solution(String S, int[] P, int[] Q); }
```

that, given a non-empty string `S` consisting of `N` characters and two non-empty arrays P and `Q` consisting of `M` integers, returns an array consisting of `M` integers specifying the consecutive answers to all queries.

Result array should be returned as an array of integers.

For example, given the string S = CAGCCTA and arrays P, Q such that:

```java
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
```

the function should return the values `[2, 4, 1]`, as explained above.

Write an efficient algorithm for the following assumptions:

- `N` is an integer within the range `[1..100,000]`;
- `M` is an integer within the range `[1..50,000]`;
- each element of arrays `P` and `Q` is an integer within the range `[0..N - 1]`;
- `P[K] ≤ Q[K]`, where `0 ≤ K < M`;
- string `S` consists only of upper-case English letters `A, C, G, T`.

##### [Minimal Average Two Slice](./src/main/java/com/codility/lessons/PrefixSums/MinAvgTwoSlice.java)

A non-empty array `A` consisting of `N` integers is given. A pair of integers `(P, Q)`, such that `0 ≤ P < Q < N`, is called a slice of array `A` (notice that the slice contains at least two elements). The average of a slice `(P, Q)` is the sum of `A[P] + A[P + 1] + ... + A[Q]` divided by the length of the slice. To be precise, the average equals `(A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1)`.

For example, array `A` such that:

```java
    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
```

contains the following example slices:

- slice (1, 2), whose average is `(2 + 2) / 2 = 2`;
- slice (3, 4), whose average is `(5 + 1) / 2 = 3`;
- slice (1, 4), whose average is `(2 + 2 + 5 + 1) / 4 = 2.5`.

The goal is to find the starting position of a slice whose average is minimal.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array `A` consisting of `N` integers, returns the starting position of the slice with the minimal average. If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.

For example, given array `A` such that:

```java
    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
```

the function should return 1, as explained above.

Write an *efficient* algorithm for the following assumptions:

- `N` is an integer within the range `[2..100,000]`;
- each element of array `A` is an integer within the range `[−10,000..10,000]`.

#### [Lesson 6: Sorting](./src/main/java/com/codility/lessons/Sorting)

##### [Distinct](./src/main/java/com/codility/lessons/Sorting/Distinct.java)

Compute number of distinct values in an array.

Write a function

``` java
class Solution { public int solution(int[] A); }
```

that, given a zero-indexed array A consisting of N integers, returns the
number of distinct values in array A.

Assume that  
N is an integer within the range \[0..100,000\]; each element of array A
is an integer within the range \[−1,000,000..1,000,000\]. For example,
given array A consisting of six elements such that:

``` java
 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
```

the function should return 3, because there are 3 distinct values
appearing in array A, namely 1, 2 and 3.

Complexity:

expected worst-case time complexity is O(N\*log(N)); expected worst-case
space complexity is O(N), beyond input storage (not counting the storage
required for input arguments).

##### [Max Product Of Three](./src/main/java/com/codility/lessons/Sorting/MaxProductOfThree.java)

Maximize A\[P\] \* A\[Q\] \* A\[R\] for any triplet (P, Q, R).

A non-empty zero-indexed array A consisting of N integers is given. The
product of triplet (P, Q, R) equates to A\[P\] \* A\[Q\] \* A\[R\] (0 ≤
P \< Q \< R \< N).

For example, array A such that:

``` java
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
```

contains the following example triplets:

``` java
(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
```

Your goal is to find the maximal product of any triplet.

Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given a non-empty zero-indexed array A, returns the value of the
maximal product of any triplet.

For example, given array A such that:

``` java
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
```

the function should return 60, as the product of triplet (2, 4, 5) is
maximal.

Assume that  
N is an integer within the range \[3..100,000\]; each element of array A
is an integer within the range \[−1,000..1,000\]. Complexity:

expected worst-case time complexity is O(N\*log(N)); expected worst-case
space complexity is O(1), beyond input storage (not counting the storage
required for input arguments).

##### [Triangle](./src/main/java/com/codility/lessons/Sorting/Triangle.java)

Determine whether a triangle can be built from a given set of edges.

A zero-indexed array A consisting of N integers is given. A triplet (P,
Q, R) is triangular if 0 ≤ P \< Q \< R \< N and:

``` java
A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
```

For example, consider array A such that:

``` java
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
```

Triplet (0, 2, 4) is triangular.

Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given a zero-indexed array A consisting of N integers, returns 1
if there exists a triangular triplet for this array and returns 0
otherwise.

For example, given array A such that:

``` java
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
```

the function should return 1, as explained above. Given array A such
that:

``` java
  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
```

the function should return 0.

Assume that  
N is an integer within the range \[0..100,000\]; each element of array A
is an integer within the range \[−2,147,483,648..2,147,483,647\].
Complexity:

expected worst-case time complexity is O(N\*log(N)); expected worst-case
space complexity is O(N), beyond input storage (not counting the storage
required for input arguments).

##### [Number Of Disc Intersections](./src/main/java/com/codility/lessons/Sorting/NumberOfDiscIntersections.java)

Compute the number of intersections in a sequence of discs.

We draw N discs on a plane. The discs are numbered from 0 to N − 1. A
zero-indexed array A of N non-negative integers, specifying the radiuses
of the discs, is given. The J-th disc is drawn with its center at (J, 0)
and radius A\[J\].

We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th
and K-th discs have at least one common point (assuming that the discs
contain their borders).

The figure below shows discs drawn for N = 6 and A as follows:

``` java
  A[0] = 1
  A[1] = 5
  A[2] = 2
  A[3] = 1
  A[4] = 4
  A[5] = 0
```

There are eleven (unordered) pairs of discs that intersect, namely:

discs 1 and 4 intersect, and both intersect with all the other discs;
disc 2 also intersects with discs 0 and 3. Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that, given an array A describing N discs as explained above, returns
the number of (unordered) pairs of intersecting discs. The function
should return −1 if the number of intersecting pairs exceeds 10,000,000.

Given array A shown above, the function should return 11, as explained
above.

Assume that  
N is an integer within the range \[0..100,000\]; each element of array A
is an integer within the range \[0..2,147,483,647\]. Complexity:

expected worst-case time complexity is O(N\*log(N)); expected worst-case
space complexity is O(N), beyond input storage (not counting the storage
required for input arguments).

#### [Lesson 7: Stacks and Queues](./src/main/java/com/codility/lessons/StacksQueues)

##### [Brackets](./src/main/java/com/codility/lessons/StacksQueues/Brackets.java)

Determine whether a given string of parentheses (multiple types) is properly nested.

A string S consisting of N characters is considered to be properly
nested if any of the following conditions is true:

S is empty; S has the form "VW" where V and W are properly nested
strings. For example, the string "{\[()()\]}" is properly nested but
"(\[)()\]" is not.

Write a function:

``` java
class Solution { public int solution(String S); }
```

that, given a string S consisting of N characters, returns 1 if S is
properly nested and 0 otherwise.

For example, given S = "{\[()()\]}", the function should return 1 and
given S = "(\[)()\]", the function should return 0, as explained above.

Assume that  
N is an integer within the range \[0..200,000\]; string S consists only
of the following characters: "(", "{", "\[", "\]", "}" and/or ")".

Complexity  
expected worst-case time complexity is O(N); expected worst-case space
complexity is O(N) (not counting the storage required for input
arguments).

##### [Fish](./src/main/java/com/codility/lessons/StacksQueues/Fish.java)

You are given two non-empty arrays `A` and `B` consisting of `N` integers. Arrays `A` and `B` represent `N` voracious fish in a river, ordered downstream along the flow of the river.

The fish are numbered from `0 to N − 1`. If `P` and `Q` are two fish and `P < Q`, then fish `P` is initially upstream of fish `Q`. Initially, each fish has a unique position.

Fish number `P` is represented by `A[P]` and `B[P]`. Array `A` contains the sizes of the fish. All its elements are unique. Array `B` contains the directions of the fish. It contains only `0s` and/or `1s`, where:

- 0 represents a fish flowing upstream,
- 1 represents a fish flowing downstream.

If two fish move in opposite directions and there are no other (living) fish between them, they will eventually meet each other. Then only one fish can stay alive − the larger fish eats the smaller one. More precisely, we say that two fish `P` and `Q` meet each other when `P < Q`, `B[P] = 1` and `B[Q] = 0`, and there are no living fish between them. After they meet:

- If `A[P] > A[Q]` then `P` eats `Q`, and `P` will still be flowing downstream,
- If `A[Q] > A[P]` then `Q` eats `P`, and `Q` will still be flowing upstream.

We assume that all the fish are flowing at the same speed. That is, fish moving in the same direction never meet. The goal is to calculate the number of fish that will stay alive.

For example, consider arrays `A` and `B` such that:

```java
  A[0] = 4    B[0] = 0
  A[1] = 3    B[1] = 1
  A[2] = 2    B[2] = 0
  A[3] = 1    B[3] = 0
  A[4] = 5    B[4] = 0
```
Initially all the fish are alive and all except fish number 1 are moving upstream. Fish number 1 meets fish number 2 and eats it, then it meets fish number 3 and eats it too. Finally, it meets fish number 4 and is eaten by it. The remaining two fish, number 0 and 4, never meet and therefore stay alive.

Write a function:

```java
class Solution { public int solution(int[] A, int[] B); }
```

that, given two non-empty arrays `A` and `B` consisting of N integers, returns the number of fish that will stay alive.

For example, given the arrays shown above, the function should return 2, as explained above.

Write an *efficient* algorithm for the following assumptions:

- `N` is an integer within the range `[1..100,000]`;
- each element of array `A` is an integer within the range `[0..1,000,000,000]`;
- each element of array `B` is an integer that can have one of the following values: `0, 1`;
- the elements of `A` are all distinct.

##### [Nesting](./src/main/java/com/codility/lessons/StacksQueues/Nesting.java)

Determine whether a given string of parentheses (single type) is properly nested.

A string S consisting of N characters is called properly nested if:

S is empty; S has the form "(U)" where U is a properly nested string; S
has the form "VW" where V and W are properly nested strings. For
example, string "<span class="indexterm"></span>)((())" is properly
nested but string "())" isn’t.

Write a function:

``` java
class Solution { public int solution(String S); }
```

that, given a string S consisting of N characters, returns 1 if string S
is properly nested and 0 otherwise.

For example, given S = "<span class="indexterm"></span>)((())", the
function should return 1 and given S = "())", the function should return
0, as explained above.

Assume that  
N is an integer within the range \[0..1,000,000\]; string S consists
only of the characters "(" and/or ")".

Complexity  
expected worst-case time complexity is O(N); expected worst-case space
complexity is O(1) (not counting the storage required for input
arguments).

##### [StoneWall](./src/main/java/com/codility/lessons/StacksQueues/StoneWall.java)

Cover "Manhattan skyline" using the minimum number of rectangles.

You are going to build a stone wall. The wall should be straight and N
meters long, and its thickness should be constant; however, it should
have different heights in different places. The height of the wall is
specified by an array H of N positive integers. H\[I\] is the height of
the wall from I to I+1 meters to the right of its left end. In
particular, H\[0\] is the height of the wall’s left end and H\[N−1\] is
the height of the wall’s right end.

The wall should be built of cuboid stone blocks (that is, all sides of
such blocks are rectangular). Your task is to compute the minimum number
of blocks needed to build the wall.

Write a function:

``` java
class Solution { public int solution(int[] H); }
```

that, given an array H of N positive integers specifying the height of
the wall, returns the minimum number of blocks needed to build it.

For example, given array H containing N = 9 integers:

``` java
  H[0] = 8    H[1] = 8    H[2] = 5
  H[3] = 7    H[4] = 9    H[5] = 8
  H[6] = 7    H[7] = 4    H[8] = 8
```

the function should return 7. The figure shows one possible arrangement
of seven blocks.

Assume that  
N is an integer within the range \[1..100,000\]; each element of array H
is an integer within the range \[1..1,000,000,000\].

Complexity  
expected worst-case time complexity is O(N); expected worst-case space
complexity is O(N), beyond input storage (not counting the storage
required for input arguments).

#### [Lesson 8: Leader](./src/main/java/com/codility/lessons/Leader)

##### [Dominator](./src/main/java/com/codility/lessons/Leader/Dominator.java)

An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.

For example, consider array A such that

```java
 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
```

The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

Write a function

```java
class Solution { public int solution(int[] A); }
```

that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.

For example, given array A such that

```java
 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
```

the function may return 0, 2, 4, 6 or 7, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [0..100,000];
- each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

##### [Equi Leader](./src/main/java/com/codility/lessons/Leader/EquiLeader.java)

A non-empty array A consisting of N integers is given.

The leader of this array is the value that occurs in more than half of the elements of A.

An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.

For example, given array A such that:

```java
    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
```

we can find two equi leaders:

- 0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
- 2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.

The goal is to count the number of equi leaders.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A consisting of N integers, returns the number of equi leaders.

For example, given:

```java
    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
```

the function should return 2, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [1..100,000];
- each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].

#### [Lesson 9: Maximum Slice Problem](./src/main/java/com/codility/lessons/MaximumSliceProblem)

##### [Max Profit](./src/main/java/com/codility/lessons/MaximumSliceProblem/MaxProfit.java)

##### [Max Slice Sum](./src/main/java/com/codility/lessons/MaximumSliceProblem/MaxSliceSum.java)

##### [Max Double Slice Sum](./src/main/java/com/codility/lessons/MaximumSliceProblem/MaxDoubleSliceSum.java)

#### [Lesson 10: Prime and Composite Numbers](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers)

##### [Count Factors](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/CountFactors.java)

##### [Min Perimeter Rectangle](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/MinPerimeterRectangle.java)

##### [Flags](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/Flags.java)

##### [Peaks](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/Peaks.java)

#### [Lesson 11: Sieve Of Eratosthenes](./src/main/java/com/codility/lessons/SieveOfEratosthenes)

##### [Count Non Divisible](./src/main/java/com/codility/lessons/SieveOfEratosthenes/CountNonDivisible.java)

##### [Count Semiprimes](./src/main/java/com/codility/lessons/SieveOfEratosthenes/CountSemiprimes.java)

#### [Lesson 12: Euclidean Algorithm](./src/main/java/com/codility/lessons/EuclideanAlgorithm)

##### [Chocolates By Numbers](./src/main/java/com/codility/lessons/EuclideanAlgorithm/ChocolatesByNumbers.java)

##### [Common Prime Divisors](./src/main/java/com/codility/lessons/EuclideanAlgorithm/CommonPrimeDivisors.java)

#### [Lesson 13: Fibonacci Numbers](./src/main/java/com/codility/lessons/FibonacciNumbers)

##### [Fibonacci Frog](./src/main/java/com/codility/lessons/FibonacciNumbers/FibFrog.java)

##### [Ladder](./src/main/java/com/codility/lessons/FibonacciNumbers/Ladder.java)

#### [Lesson 14: Binary Search Algorithm](./src/main/java/com/codility/lessons/BinarySearchAlgorithm)

##### [Min Max Division](./src/main/java/com/codility/lessons/BinarySearchAlgorithm/MinMaxDivision.java)

##### [Nailing Planks](./src/main/java/com/codility/lessons/BinarySearchAlgorithm/NailingPlanks.java)

#### [Lesson 15: Caterpillar Method](./src/main/java/com/codility/lessons/CaterpillarMethod)
 
##### [Absolute Distinct](./src/main/java/com/codility/lessons/CaterpillarMethod/AbsDistinct.java)

##### [Count Distinct Slices](./src/main/java/com/codility/lessons/CaterpillarMethod/CountDistinctSlices.java)

##### [Count Triangles](./src/main/java/com/codility/lessons/CaterpillarMethod/CountTriangles.java)

##### [Min Absolute Sum Of Two](./src/main/java/com/codility/lessons/CaterpillarMethod/MinAbsSumOfTwo.java)

#### [Lesson 16: Greedy Algorithms](./src/main/java/com/codility/lessons/GreedyAlgorithms)

##### [Max Nonoverlapping Segments](./src/main/java/com/codility/lessons/GreedyAlgorithms/MaxNonoverlappingSegments.java)

##### [Tie Ropes](./src/main/java/com/codility/lessons/GreedyAlgorithms/TieRopes.java)

#### [Lesson 17: Dynamic Programming](./src/main/java/com/codility/lessons/DynamicProgramming)

##### [Number Solitaire](./src/main/java/com/codility/lessons/DynamicProgramming/NumberSolitaire.java)

##### [Min Absolute Sum](./src/main/java/com/codility/lessons/DynamicProgramming/MinAbsSum.java)
