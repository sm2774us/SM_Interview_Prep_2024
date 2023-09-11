# Interview Prep 2024

## Table Of Contents <a name="top"></a>

1. [BARCLAYS](#barclays)
 - 1.0   [Build Instructions](#build-instructions)
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
   - 1.9.1   [Max Profit](#max-profit)
   - 1.9.2   [Max Slice Sum](#max-slice-sum)
   - 1.9.3   [Max Double Slice Sum](#max-double-slice-sum)
 - 1.10   [Lesson 10: Prime and Composite Numbers](#prime-and-composite-numbers)
   - 1.10.1   [Count Factors](#count-factors)
   - 1.10.2   [Min Perimeter Rectangle](#min-perimeter-rectangle)
   - 1.10.3   [Flags](#flags)
   - 1.10.4   [Peaks](#peaks)
 - 1.11   [Lesson 11: Sieve of Eratosthenes](#sieve-of-eratosthenes)
   - 1.11.1   [Count Non Divisible](#count-non-divisible)
   - 1.11.2   [Count Semiprimes](#count-semiprimes)
 - 1.12   [Lesson 12: Euclidean Algorithm](#euclidean-algorithm)
   - 1.12.1   [Chocolates By Numbers](#chocolates-by-numbers)
   - 1.12.2   [Common Prime Divisors](#common-prime-divisors)
 - 1.13   [Lesson 13: Fibonacci Numbers](#fibonacci-numbers)
   - 1.13.1   [Fibonacci Frog](#fibonacci-frog)
   - 1.13.2   [Ladder](#ladder)
 - 1.14   [Lesson 14: Binary Search Algorithm](#binary-search-algorithm)
   - 1.14.1   [Min Max Division](#min-max-division)
   - 1.14.2   [Nailing Planks](#nailing-planks)
 - 1.15   [Lesson 15: Caterpillar Method](#caterpillar-method)
   - 1.15.1   [Absolute Distinct](#absolute-distinct)
   - 1.15.2   [Count Distinct Slices](#count-distinct-slices)
   - 1.15.3   [Count Triangles](#count-triangles)
   - 1.15.4   [Min Absolute Sum Of Two](#min-absolute-sum-of-two)
 - 1.16   [Lesson 16: Greedy Algorithms](#greedy-algorithms)
   - 1.16.1   [Max Nonoverlapping Segments](#max-nonoverlapping-segments)
   - 1.16.2   [Tie Ropes](#tie-ropes)
 - 1.17   [Lesson 17: Dynamic Programming](#dynamic-programming)
   - 1.17.1   [Number Solitaire](#number-solitaire)
   - 1.17.2   [Min Absolute Sum](#min-absolute-sum)

2. [BARCLAYS INTERVIEW QUESTIONS 2015](#barclays-interview-questions-2015)
 - 2.1   [Single Swap Increasing Order Array](#single-swap-increasing-order-array)
 - 2.2   [Longest Increasing Sequence Diff](#longest-increasing-sequence-diff)
 - 2.3   [Heads Tails Adjacency](#heads-tails-adjacency)

3. [BARCLAYS INTERVIEW QUESTIONS 2023](#barclays-interview-questions-2023)
 - 3.1   [Slope Of A Number](#slope-of-a-number)
 - 3.2   [Move All Zeros To End Of Array](#move-all-zeros-to-end-of-array)

#### Build Instructions

##### Pre-requisites
- Must have JDK8 pre-installed.
- pom.xml uses the environment variable `JAVA_1_8_HOME` for resolving the JDK8 parent directory

##### How to compile and run the test
```bash
mvn -B clean test
```

##### How to view the test report
```bash
mvn surefire-report:report-only
```

#### [Lesson 1: Iterations](./src/main/java/com/codility/lessons/BinaryGap)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

Write a function:

``` java
class Solution { public int solution(int N); }
```

that, given a positive integer N, returns the length of its longest
binary gap. The function should return 0 if N doesn’t contain a binary
gap.

For example, given N = 1041 the function should return 5, because N has
binary representation 10000010001 and so its longest binary gap is of
length 5.

Assume that:
- N is an integer within the range \[1..2,147,483,647\].

Complexity:
- expected worst-case time complexity is O(log(N));
- expected worst-case space complexity is O(1).

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 2: Arrays](./src/main/java/com/codility/lessons/Arrays)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

Assume that:
- N and K are integers within the range \[0..100\]; each element of array
- A is an integer within the range \[−1,000..1,000\].

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

```java
package com.codility.lessons.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

Assume that:
- N is an odd integer within the range \[1..1,000,000\];
- each element of array A is an integer within the range \[1..1,000,000,000\];
- all but one of the values in A occur an even number of times

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 3: Time Complexity](./src/com/codility/lessons/TimeComplexity)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

after the first jump, at position 10 + 30 = 40 after the second jump, at position 10 + 30 + 30 = 70 after the third jump, at position 10 + 30 + 30 + 30 = 100

Assume that:
- X, Y and D are integers within the range \[1..1,000,000,000\];
- X ≤ Y.

Complexity:
- expected worst-case time complexity is O(1);
- expected worst-case space complexity is O(1).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

Assume that:
- N is an integer within the range \[0..100,000\];
- the elements of A are all distinct;
- each element of array A is an integer within the range \[1..(N + 1)\].

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

Assume that:
- N is an integer within the range \[2..100,000\];
- each element of array A is an integer within the range \[−1,000..1,000\].

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 4: Counting Elements](./src/com/codility/lessons/CountingElements)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 5: Prefix Sums](./src/main/java/com/codility/lessons/PrefixSums)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 6: Sorting](./src/main/java/com/codility/lessons/Sorting)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Distinct](./src/main/java/com/codility/lessons/Sorting/Distinct.java)

Compute number of distinct values in an array.

Write a function

``` java
class Solution { public int solution(int[] A); }
```

that, given a zero-indexed array A consisting of N integers, returns the
number of distinct values in array A.

Assume that  
- N is an integer within the range \[0..100,000\];
- each element of array A is an integer within the range \[−1,000,000..1,000,000\].

For example,
given array A consisting of six elements such that:

``` java
 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
```

the function should return 3, because there are 3 distinct values
appearing in array A, namely 1, 2 and 3.

Complexity:

- expected worst-case time complexity is O(N\*log(N));
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Assume that:
- N is an integer within the range \[3..100,000\];
- each element of array A is an integer within the range \[−1,000..1,000\].

Complexity:
- expected worst-case time complexity is O(N\*log(N));
- expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Triangle](./src/main/java/com/codility/lessons/Sorting/Triangle.java)

Determine whether a triangle can be built from a given set of edges.

A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P \< Q \< R \< N and:

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

that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:

``` java
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
```

the function should return 1, as explained above. Given array A such that:

``` java
  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
```

the function should return 0.

Assume that:
- N is an integer within the range \[0..100,000\];
- each element of array A is an integer within the range \[−2,147,483,648..2,147,483,647\].

Complexity:
- expected worst-case time complexity is O(N\*log(N));
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

Given array A shown above, the function should return 11, as explained above.

Assume that:
- N is an integer within the range \[0..100,000\];
- each element of array A is an integer within the range \[0..2,147,483,647\].

Complexity:
- expected worst-case time complexity is O(N\*log(N));
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 7: Stacks and Queues](./src/main/java/com/codility/lessons/StacksQueues)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{\[()()\]}", the function should return 1 and given S = "(\[)()\]", the function should return 0, as explained above.

Assume that:
- N is an integer within the range \[0..200,000\];
- string S consists only of the following characters: "(", "{", "\[", "\]", "}" and/or ")".

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "<span class="indexterm"></span>)((())", the function should return 1 and given S = "())", the function should return 0, as explained above.

Assume that:
- N is an integer within the range \[0..1,000,000\];
- string S consists only of the characters "(" and/or ")".

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(1) (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

the function should return 7. The figure shows one possible arrangement of seven blocks.

Assume that:  
- N is an integer within the range \[1..100,000\];
- each element of array H is an integer within the range \[1..1,000,000,000\].

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 8: Leader](./src/main/java/com/codility/lessons/Leader)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

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

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 9: Maximum Slice Problem](./src/main/java/com/codility/lessons/MaximumSliceProblem)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Max Profit](./src/main/java/com/codility/lessons/MaximumSliceProblem/MaxProfit.java)

An array A consisting of N integers is given. It contains daily prices of a stock share for a period of N consecutive days. If a single share was bought on day P and sold on day Q, where 0 ≤ P ≤ Q < N, then the profit of such transaction is equal to A[Q] − A[P], provided that A[Q] ≥ A[P]. Otherwise, the transaction brings loss of A[P] − A[Q].

For example, consider the following array A consisting of six elements such that:

```java
  A[0] = 23171
  A[1] = 21011
  A[2] = 21123
  A[3] = 21366
  A[4] = 21013
  A[5] = 21367
```

If a share was bought on day 0 and sold on day 2, a loss of 2048 would occur because A[2] − A[0] = 21123 − 23171 = −2048. If a share was bought on day 4 and sold on day 5, a profit of 354 would occur because A[5] − A[4] = 21367 − 21013 = 354. Maximum possible profit was 356. It would occur if a share was bought on day 1 and sold on day 5.

Write a function,

```java
class Solution { public int solution(int[] A); }
```

that, given an array A consisting of N integers containing daily prices of a stock share for a period of N consecutive days, returns the maximum possible profit from one transaction during this period. The function should return 0 if it was impossible to gain any profit.

For example, given array A consisting of six elements such that:

```java
  A[0] = 23171
  A[1] = 21011
  A[2] = 21123
  A[3] = 21366
  A[4] = 21013
  A[5] = 21367
```

the function should return 356, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [0..400,000];
- each element of array A is an integer within the range [0..200,000].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Max Slice Sum](./src/main/java/com/codility/lessons/MaximumSliceProblem/MaxSliceSum.java)

A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given an array A consisting of N integers, returns the maximum sum of any slice of A.

For example, given array A such that:

```java
A[0] = 3  A[1] = 2  A[2] = -6
A[3] = 4  A[4] = 0
```

the function should return 5 because:

- (3, 4) is a slice of A that has sum 4,
- (2, 2) is a slice of A that has sum −6,
- (0, 1) is a slice of A that has sum 5,
- no other slice of A has sum greater than (0, 1).

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [1..1,000,000];
- each element of array A is an integer within the range [−1,000,000..1,000,000];
- the result will be an integer within the range [−2,147,483,648..2,147,483,647].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Max Double Slice Sum](./src/main/java/com/codility/lessons/MaximumSliceProblem/MaxDoubleSliceSum.java)

A non-empty array A consisting of N integers is given.

A triplet (X, Y, Z), such that 0 ≤ X < Y < Z < N, is called a double slice.

The sum of double slice (X, Y, Z) is the total of A[X + 1] + A[X + 2] + ... + A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].

For example, array A such that:

```java
    A[0] = 3
    A[1] = 2
    A[2] = 6
    A[3] = -1
    A[4] = 4
    A[5] = 5
    A[6] = -1
    A[7] = 2
```

contains the following example double slices:

- double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
- double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
- double slice (3, 4, 5), sum is 0.

The goal is to find the maximal sum of any double slice.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A consisting of N integers, returns the maximal sum of any double slice.

For example, given:

```java
    A[0] = 3
    A[1] = 2
    A[2] = 6
    A[3] = -1
    A[4] = 4
    A[5] = 5
    A[6] = -1
    A[7] = 2
```

the function should return 17, because no double slice of array A has a sum of greater than 17.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [3..100,000];
- each element of array A is an integer within the range [−10,000..10,000].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 10: Prime and Composite Numbers](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Count Factors](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/CountFactors.java)

A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

Write a function:

```java
class Solution { public int solution(int N); }
```

that, given a positive integer N, returns the number of its factors.

For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

Write an efficient algorithm for the following assumptions:

- N is an integer within the range [1..2,147,483,647].

Complexity:

- expected worst-case time complexity is O(sqrt(N));
- expected worst-case space complexity is O(1).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Min Perimeter Rectangle](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/MinPerimeterRectangle.java)

An integer N is given, representing the area of some rectangle.

The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).

The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.

For example, given integer N = 30, rectangles of area 30 are:

- (1, 30), with a perimeter of 62,
- (2, 15), with a perimeter of 34,
- (3, 10), with a perimeter of 26,
- (5, 6), with a perimeter of 22.

Write a function:

```java
class Solution { public int solution(int N); }
```

that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.

For example, given an integer N = 30, the function should return 22, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [1..1,000,000,000].

Complexity:

- expected worst-case time complexity is O(sqrt(N));
- expected worst-case space complexity is O(1).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Flags](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/Flags.java)

A non-empty array A consisting of N integers is given.

A peak is an array element which is larger than its neighbours. More precisely, it is an index P such that 0 < P < N − 1 and A[P − 1] < A[P] > A[P + 1].

For example, the following array A:

```java
    A[0] = 1
    A[1] = 5
    A[2] = 3
    A[3] = 4
    A[4] = 3
    A[5] = 4
    A[6] = 1
    A[7] = 2
    A[8] = 3
    A[9] = 4
    A[10] = 6
    A[11] = 2
```

has exactly four peaks: elements 1, 3, 5 and 10.

You are going on a trip to a range of mountains whose relative heights are represented by array A, as shown in a figure below. You have to choose how many flags you should take with you. The goal is to set the maximum number of flags on the peaks, according to certain rules.

![Flags Visualization](./images/Lesson_10_PrimeAndCompositeNumbers_Flags_Problem_Image_1.png)

Flags can only be set on peaks. What's more, if you take K flags, then the distance between any two flags should be greater than or equal to K. The distance between indices P and Q is the absolute value |P − Q|.

For example, given the mountain range represented by array A, above, with N = 12, if you take:

- two flags, you can set them on peaks 1 and 5;
- three flags, you can set them on peaks 1, 5 and 10;
- four flags, you can set only three flags, on peaks 1, 5 and 10.
- You can therefore set a maximum of three flags in this case.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A of N integers, returns the maximum number of flags that can be set on the peaks of the array.

For example, the following array A:

```java
    A[0] = 1
    A[1] = 5
    A[2] = 3
    A[3] = 4
    A[4] = 3
    A[5] = 4
    A[6] = 1
    A[7] = 2
    A[8] = 3
    A[9] = 4
    A[10] = 6
    A[11] = 2
```

the function should return 3, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [1..400,000];
- each element of array A is an integer within the range [0..1,000,000,000].

Complexity:

- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Peaks](./src/main/java/com/codility/lessons/PrimeAndCompositeNumbers/Peaks.java)

A non-empty array A consisting of N integers is given.

A peak is an array element which is larger than its neighbors. More precisely, it is an index P such that 0 < P < N − 1,  A[P − 1] < A[P] and A[P] > A[P + 1].

For example, the following array A:

```java
    A[0] = 1
    A[1] = 2
    A[2] = 3
    A[3] = 4
    A[4] = 3
    A[5] = 4
    A[6] = 1
    A[7] = 2
    A[8] = 3
    A[9] = 4
    A[10] = 6
    A[11] = 2
```

has exactly three peaks: 3, 5, 10.

We want to divide this array into blocks containing the same number of elements. More precisely, we want to choose a number K that will yield the following blocks:

```java
A[0], A[1], ..., A[K − 1],
A[K], A[K + 1], ..., A[2K − 1],
...
A[N − K], A[N − K + 1], ..., A[N − 1].
```

What's more, every block should contain at least one peak. Notice that extreme elements of the blocks (for example A[K − 1] or A[K]) can also be peaks, but only if they have both neighbors (including one in an adjacent blocks).

The goal is to find the maximum number of blocks into which the array A can be divided.

Array A can be divided into blocks as follows:

- one block (1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2). This block contains three peaks.
- two blocks (1, 2, 3, 4, 3, 4) and (1, 2, 3, 4, 6, 2). Every block has a peak.
- three blocks (1, 2, 3, 4), (3, 4, 1, 2), (3, 4, 6, 2). Every block has a peak. Notice in particular that the first block (1, 2, 3, 4) has a peak at A[3], because A[2] < A[3] > A[4], even though A[4] is in the adjacent block.

However, array A cannot be divided into four blocks, (1, 2, 3), (4, 3, 4), (1, 2, 3) and (4, 6, 2), because the (1, 2, 3) blocks do not contain a peak. Notice in particular that the (4, 3, 4) block contains two peaks: A[3] and A[5].

The maximum number of blocks that array A can be divided into is three.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A consisting of N integers, returns the maximum number of blocks into which A can be divided.

If A cannot be divided into some number of blocks, the function should return 0.

For example, given:

```java
    A[0] = 1
    A[1] = 2
    A[2] = 3
    A[3] = 4
    A[4] = 3
    A[5] = 4
    A[6] = 1
    A[7] = 2
    A[8] = 3
    A[9] = 4
    A[10] = 6
    A[11] = 2
```

the function should return 3, as explained above.

Write an efficient algorithm for the following assumptions:

- N is an integer within the range [1..100,000];
- each element of array A is an integer within the range [0..1,000,000,000].

Complexity:

- expected worst-case time complexity is O(N*log(log(N)));
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).Elements of input arrays can be modified.

[What would cause an algorithm to have O(log log n) complexity?](https://stackoverflow.com/questions/16472012/what-would-cause-an-algorithm-to-have-olog-log-n-complexity)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 11: Sieve Of Eratosthenes](./src/main/java/com/codility/lessons/SieveOfEratosthenes)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Count Non Divisible](./src/main/java/com/codility/lessons/SieveOfEratosthenes/CountNonDivisible.java)

You are given an array A consisting of N integers.

For each number A[i] such that 0 ≤ i < N, we want to count the number of elements of the array that are not the divisors of A[i]. We say that these elements are non-divisors.

For example, consider integer N = 5 and array A such that:

```java
    A[0] = 3
    A[1] = 1
    A[2] = 2
    A[3] = 3
    A[4] = 6
```

For the following elements:

- A[0] = 3, the non-divisors are: 2, 6,
- A[1] = 1, the non-divisors are: 3, 2, 3, 6,
- A[2] = 2, the non-divisors are: 3, 3, 6,
- A[3] = 3, the non-divisors are: 2, 6,
- A[4] = 6, there aren't any non-divisors.

Write a function:

```java
class Solution { public int[] solution(int[] A); }
```

that, given an array A consisting of N integers, returns a sequence of integers representing the amount of non-divisors.

Result array should be returned as an array of integers.

For example, given:

```java
    A[0] = 3
    A[1] = 1
    A[2] = 2
    A[3] = 3
    A[4] = 6
```

the function should return [2, 4, 3, 2, 0], as explained above.

Write an efficient algorithm for the following assumptions:
- N is an integer within the range [1..50,000];
- each element of array A is an integer within the range [1..2 * N].

Complexity:
- expected worst-case time complexity is O(N*log(N));
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments). Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Count Semiprimes](./src/main/java/com/codility/lessons/SieveOfEratosthenes/CountSemiprimes.java)

A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.

Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.

For example, consider an integer N = 26 and arrays P, Q such that:

```java
    P[0] = 1    Q[0] = 26
    P[1] = 4    Q[1] = 10
    P[2] = 16   Q[2] = 20
```

The number of semiprimes within each of these ranges is as follows:

- (1, 26) is 10,
- (4, 10) is 4,
- (16, 20) is 0.

Write a function:

```java
class Solution { public int[] solution(int N, int[] P, int[] Q); }
```

that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.

For example, given an integer N = 26 and arrays P, Q such that:

```java
    P[0] = 1    Q[0] = 26
    P[1] = 4    Q[1] = 10
    P[2] = 16   Q[2] = 20
```

the function should return the values [10, 4, 0], as explained above.

Write an efficient algorithm for the following assumptions:

- N is an integer within the range [1..50,000];
- M is an integer within the range [1..30,000];
- each element of arrays P and Q is an integer within the range [1..N];
- P[i] ≤ Q[i].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 12: Euclidean Algorithm](./src/main/java/com/codility/lessons/EuclideanAlgorithm)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Chocolates By Numbers](./src/main/java/com/codility/lessons/EuclideanAlgorithm/ChocolatesByNumbers.java)

Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.

You start to eat the chocolates. After eating a chocolate you leave only a wrapper.

You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle, and eat the following one.

More precisely, if you ate chocolate number X, then you will next eat the chocolate with number (X + M) modulo N (remainder of division).

You stop eating when you encounter an empty wrapper.

For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.

The goal is to count the number of chocolates that you will eat, following the above rules.

Write a function:

```java
class Solution { public int solution(int N, int M); }
```

that, given two positive integers N and M, returns the number of chocolates that you will eat.

For example, given integers N = 10 and M = 4. the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:
- N and M are integers within the range [1..1,000,000,000].

Complexity:
- expected worst-case time complexity is O(log(N+M));
- expected worst-case space complexity is O(log(N+M)).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Common Prime Divisors](./src/main/java/com/codility/lessons/EuclideanAlgorithm/CommonPrimeDivisors.java)

A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.

You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.

For example, given:

- N = 15 and M = 75, the prime divisors are the same: {3, 5};
- N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
- N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.

Write a function:

```java
class Solution { public int solution(int[] A, int[] B); }
```

that, given two non-empty arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.

For example, given:

```java
    A[0] = 15   B[0] = 75
    A[1] = 10   B[1] = 30
    A[2] = 3    B[2] = 5
```

the function should return 1, because only one pair (15, 75) has the same set of prime divisors.

Write an *efficient* algorithm for the following assumptions:
- Z is an integer within the range [1..6,000];
- each element of arrays A and B is an integer within the range [1..2,147,483,647].

Complexity:
- expected worst-case time complexity is O(Z*log(max(A)+max(B))2);
- expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments). Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 13: Fibonacci Numbers](./src/main/java/com/codility/lessons/FibonacciNumbers)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Fibonacci Frog](./src/main/java/com/codility/lessons/FibonacciNumbers/FibFrog.java)

The Fibonacci sequence is defined using the following recursive formula:

```java
    F(0) = 0
    F(1) = 1
    F(M) = F(M - 1) + F(M - 2) if M >= 2
```

A small frog wants to get to the other side of a river. The frog is initially located at one bank of the river (position −1) and wants to get to the other bank (position N). The frog can jump over any distance F(K), where F(K) is the K-th Fibonacci number. Luckily, there are many leaves on the river, and the frog can jump between the leaves, but only in the direction of the bank at position N.

The leaves on the river are represented in an array A consisting of N integers. Consecutive elements of array A represent consecutive positions from 0 to N − 1 on the river. Array A contains only 0s and/or 1s:

- 0 represents a position without a leaf;
- 1 represents a position containing a leaf.

The goal is to count the minimum number of jumps in which the frog can get to the other side of the river (from position −1 to position N). The frog can jump between positions −1 and N (the banks of the river) and every position containing a leaf.

For example, consider array A such that:

```java
    A[0] = 0
    A[1] = 0
    A[2] = 0
    A[3] = 1
    A[4] = 1
    A[5] = 0
    A[6] = 1
    A[7] = 0
    A[8] = 0
    A[9] = 0
    A[10] = 0
```

The frog can make three jumps of length F(5) = 5, F(3) = 2 and F(5) = 5.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given an array A consisting of N integers, returns the minimum number of jumps by which the frog can get to the other side of the river. If the frog cannot reach the other side of the river, the function should return −1.

For example, given:

```java
    A[0] = 0
    A[1] = 0
    A[2] = 0
    A[3] = 1
    A[4] = 1
    A[5] = 0
    A[6] = 1
    A[7] = 0
    A[8] = 0
    A[9] = 0
    A[10] = 0
```

the function should return 3, as explained above.

Write an *efficient* algorithm for the following assumptions:
- N is an integer within the range [0..100,000];
- each element of array A is an integer that can have one of the following values: 0, 1.

Complexity:
- expected worst-case time complexity is O(N*log(N));
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
- Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Ladder](./src/main/java/com/codility/lessons/FibonacciNumbers/Ladder.java)

You have to climb up a ladder. The ladder has exactly N rungs, numbered from 1 to N. With each step, you can ascend by one or two rungs. More precisely:

- with your first step you can stand on rung 1 or 2,
- if you are on rung K, you can move to rungs K + 1 or K + 2,
- finally you have to stand on rung N.

Your task is to count the number of different ways of climbing to the top of the ladder.

For example, given N = 4, you have five different ways of climbing, ascending by:

- 1, 1, 1 and 1 rung,
- 1, 1 and 2 rungs,
- 1, 2 and 1 rung,
- 2, 1 and 1 rungs, and
- 2 and 2 rungs.

Given N = 5, you have eight different ways of climbing, ascending by:

- 1, 1, 1, 1 and 1 rung,
- 1, 1, 1 and 2 rungs,
- 1, 1, 2 and 1 rung,
- 1, 2, 1 and 1 rung,
- 1, 2 and 2 rungs,
- 2, 1, 1 and 1 rungs,
- 2, 1 and 2 rungs, and
- 2, 2 and 1 rung.

The number of different ways can be very large, so it is sufficient to return the result modulo 2P, for a given integer P.

Write a function:

```java
class Solution { public int[] solution(int[] A, int[] B); }
```

that, given two non-empty arrays A and B of L integers, returns an array consisting of L integers specifying the consecutive answers; position I should contain the number of different ways of climbing the ladder with A[I] rungs modulo 2B[I].

For example, given L = 5 and:

```java
    A[0] = 4   B[0] = 3
    A[1] = 4   B[1] = 2
    A[2] = 5   B[2] = 4
    A[3] = 5   B[3] = 3
    A[4] = 1   B[4] = 1
```

the function should return the sequence [5, 1, 8, 0, 1], as explained above.

Write an *efficient* algorithm for the following assumptions:
- L is an integer within the range [1..50,000];
- each element of array A is an integer within the range [1..L];
- each element of array B is an integer within the range [1..30].

Complexity:
- expected worst-case time complexity is O(L);
- expected worst-case space complexity is O(L), beyond input storage (not counting the storage required for input arguments).
- Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 14: Binary Search Algorithm](./src/main/java/com/codility/lessons/BinarySearchAlgorithm)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Min Max Division](./src/main/java/com/codility/lessons/BinarySearchAlgorithm/MinMaxDivision.java)

You are given integers K, M and a non-empty array A consisting of N integers. Every element of the array is not greater than M.

You should divide this array into K blocks of consecutive elements. The size of the block is any integer between 0 and N. Every element of the array should belong to some block.

The sum of the block from X to Y equals A[X] + A[X + 1] + ... + A[Y]. The sum of empty block equals 0.

The `large sum` is the maximal sum of any block.

For example, you are given integers K = 3, M = 5 and array A such that:

```java
  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
```

The array can be divided, for example, into the following blocks:
- [2, 1, 5, 1, 2, 2, 2], [], [] with a large sum of 15;
- [2], [1, 5, 1, 2], [2, 2] with a large sum of 9;
- [2, 1, 5], [], [1, 2, 2, 2] with a large sum of 8;
- [2, 1], [5, 1], [2, 2, 2] with a large sum of 6.

The goal is to minimize the large sum. In the above example, 6 is the minimal large sum.

Write a function:

class Solution { public int solution(int K, int M, int[] A); }

that, given integers K, M and a non-empty array A consisting of N integers, returns the minimal large sum.

For example, given K = 3, M = 5 and array A such that:

```java
  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
```

the function should return 6, as explained above.

Write an *efficient* algorithm for the following assumptions:
- N and K are integers within the range [1..100,000];
- M is an integer within the range [0..10,000];
- each element of array A is an integer within the range [0..M].

Complexity:
- expected worst-case time complexity is O(N*log(N+M));
- expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Nailing Planks](./src/main/java/com/codility/lessons/BinarySearchAlgorithm/NailingPlanks.java)

You are given two non-empty arrays A and B consisting of N integers. These arrays represent N planks. More precisely, A[K] is the start and B[K] the end of the K−th plank.

Next, you are given a non-empty array C consisting of M integers. This array represents M nails. More precisely, C[I] is the position where you can hammer in the I−th nail.

We say that a plank (A[K], B[K]) is nailed if there exists a nail C[I] such that A[K] ≤ C[I] ≤ B[K].

The goal is to find the minimum number of nails that must be used until all the planks are nailed. In other words, you should find a value J such that all planks will be nailed after using only the first J nails. More precisely, for every plank (A[K], B[K]) such that 0 ≤ K < N, there should exist a nail C[I] such that I < J and A[K] ≤ C[I] ≤ B[K].

For example, given arrays A, B such that:

```java
    A[0] = 1    B[0] = 4
    A[1] = 4    B[1] = 5
    A[2] = 5    B[2] = 9
    A[3] = 8    B[3] = 10
```

four planks are represented: [1, 4], [4, 5], [5, 9] and [8, 10].

Given array C such that:

```java
    C[0] = 4
    C[1] = 6
    C[2] = 7
    C[3] = 10
    C[4] = 2
```

if we use the following nails:

- 0, then planks [1, 4] and [4, 5] will both be nailed.
- 0, 1, then planks [1, 4], [4, 5] and [5, 9] will be nailed.
- 0, 1, 2, then planks [1, 4], [4, 5] and [5, 9] will be nailed.
- 0, 1, 2, 3, then all the planks will be nailed.

Thus, four is the minimum number of nails that, used sequentially, allow all the planks to be nailed.

Write a function:

```java
class Solution { public int solution(int[] A, int[] B, int[] C); }
```

that, given two non-empty arrays A and B consisting of N integers and a non-empty array C consisting of M integers, returns the minimum number of nails that, used sequentially, allow all the planks to be nailed.

If it is not possible to nail all the planks, the function should return −1.

For example, given arrays A, B, C such that:

```java
    A[0] = 1    B[0] = 4
    A[1] = 4    B[1] = 5
    A[2] = 5    B[2] = 9
    A[3] = 8    B[3] = 10

    C[0] = 4
    C[1] = 6
    C[2] = 7
    C[3] = 10
    C[4] = 2
```

the function should return 4, as explained above.

Write an *efficient* algorithm for the following assumptions:
- N and M are integers within the range [1..30,000];
- each element of arrays A, B and C is an integer within the range [1..2*M];
- A[K] ≤ B[K].

Complexity:
- expected worst-case time complexity is O((N+M)*log(M));
- expected worst-case space complexity is O(M), beyond input storage (not counting the storage required for input arguments).
- Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 15: Caterpillar Method](./src/main/java/com/codility/lessons/CaterpillarMethod)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Absolute Distinct](./src/main/java/com/codility/lessons/CaterpillarMethod/AbsDistinct.java)

A non-empty array A consisting of N numbers is given. The array is sorted in non-decreasing order. The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.

For example, consider array A such that:

```java
  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
```

The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of this array, namely 0, 1, 3, 5 and 6.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A consisting of N numbers, returns absolute distinct count of array A.

For example, given array A such that:

```java
  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
```

the function should return 5, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [1..100,000];
- each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
- array A is sorted in non-decreasing order.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Count Distinct Slices](./src/main/java/com/codility/lessons/CaterpillarMethod/CountDistinctSlices.java)

An integer M and a non-empty array A consisting of N non-negative integers are given. All integers in array A are less than or equal to M.

A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The slice consists of the elements A[P], A[P + 1], ..., A[Q]. A distinct slice is a slice consisting of only unique numbers. That is, no individual number occurs more than once in the slice.

For example, consider integer M = 6 and array A such that:

```java
    A[0] = 3
    A[1] = 4
    A[2] = 5
    A[3] = 5
    A[4] = 2
```

There are exactly nine distinct slices: (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2), (3, 3), (3, 4) and (4, 4).

The goal is to calculate the number of distinct slices.

Write a function:

```java
class Solution { public int solution(int M, int[] A); }
```

that, given an integer M and a non-empty array A consisting of N integers, returns the number of distinct slices.

If the number of distinct slices is greater than 1,000,000,000, the function should return 1,000,000,000.

For example, given integer M = 6 and array A such that:

```java
    A[0] = 3
    A[1] = 4
    A[2] = 5
    A[3] = 5
    A[4] = 2
```

the function should return 9, as explained above.

Write an *efficient* algorithm for the following assumptions:
- N is an integer within the range [1..100,000];
- M is an integer within the range [0..100,000];
- each element of array A is an integer within the range [0..M].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Count Triangles](./src/main/java/com/codility/lessons/CaterpillarMethod/CountTriangles.java)

An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if it is possible to build a triangle with sides of lengths A[P], A[Q] and A[R]. In other words, triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

- A[P] + A[Q] > A[R],
- A[Q] + A[R] > A[P],
- A[R] + A[P] > A[Q].

For example, consider array A such that:

```java
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 12
```

There are four triangular triplets that can be constructed from elements of this array, namely (0, 2, 4), (0, 2, 5), (0, 4, 5), and (2, 4, 5).

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given an array A consisting of N integers, returns the number of triangular triplets in this array.

For example, given array A such that:

```java
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 12
```

the function should return 4, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [0..1,000];
- each element of array A is an integer within the range [1..1,000,000,000].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Min Absolute Sum Of Two](./src/main/java/com/codility/lessons/CaterpillarMethod/MinAbsSumOfTwo.java)

Let A be a non-empty array consisting of N integers.

The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.

For example, the following array A:

```java
  A[0] =  1
  A[1] =  4
  A[2] = -3
```

- has pairs of indices (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2).
- The abs sum of two for the pair (0, 0) is A[0] + A[0] = |1 + 1| = 2.
- The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4| = 5.
- The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2.
- The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8.
- The abs sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1.
- The abs sum of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A consisting of N integers, returns the minimal abs sum of two for any pair of indices in this array.

For example, given the following array A:

```java
  A[0] =  1
  A[1] =  4
  A[2] = -3
```

the function should return 1, as explained above.

Given array A:

```java
  A[0] = -8
  A[1] =  4
  A[2] =  5
  A[3] =-10
  A[4] =  3
```

the function should return |(−8) + 5| = 3.

Write an *efficient* algorithm for the following assumptions:
- N is an integer within the range [1..100,000];
- each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 16: Greedy Algorithms](./src/main/java/com/codility/lessons/GreedyAlgorithms)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Max Nonoverlapping Segments](./src/main/java/com/codility/lessons/GreedyAlgorithms/MaxNonoverlappingSegments.java)

Located on a line are N segments, numbered from 0 to N − 1, whose positions are given in arrays A and B. For each I (0 ≤ I < N) the position of segment I is from A[I] to B[I] (inclusive). The segments are sorted by their ends, which means that B[K] ≤ B[K + 1] for K such that 0 ≤ K < N − 1.

Two segments I and J, such that I ≠ J, are overlapping if they share at least one common point. In other words, A[I] ≤ A[J] ≤ B[I] or A[J] ≤ A[I] ≤ B[J].

We say that the set of segments is non-overlapping if it contains no two overlapping segments. The goal is to find the size of a non-overlapping set containing the maximal number of segments.

For example, consider arrays A, B such that:

```java
    A[0] = 1    B[0] = 5
    A[1] = 3    B[1] = 6
    A[2] = 7    B[2] = 8
    A[3] = 9    B[3] = 9
    A[4] = 9    B[4] = 10
```

The segments are shown in the figure below.

![Max Nonoverlapping Segments Visualization](./images/Lesson_16_GreedyAlgorithms_Max_Nonoverlapping_Segments_Problem_Image_1.png)

The size of a non-overlapping set containing a maximal number of segments is 3. For example, possible sets are {0, 2, 3}, {0, 2, 4}, {1, 2, 3} or {1, 2, 4}. There is no non-overlapping set with four segments.

Write a function:

```java
class Solution { public int solution(int[] A, int[] B); }
```

that, given two arrays A and B consisting of N integers, returns the size of a non-overlapping set containing a maximal number of segments.

For example, given arrays A, B shown above, the function should return 3, as explained above.

Write an *efficient* algorithm for the following assumptions:
- N is an integer within the range [0..30,000];
- each element of arrays A and B is an integer within the range [0..1,000,000,000];
- A[I] ≤ B[I], for each I (0 ≤ I < N);
- B[K] ≤ B[K + 1], for each K (0 ≤ K < N − 1).

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
- Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Tie Ropes](./src/main/java/com/codility/lessons/GreedyAlgorithms/TieRopes.java)

There are N ropes numbered from 0 to N − 1, whose lengths are given in an array A, lying on the floor in a line. For each I (0 ≤ I < N), the length of rope I on the line is A[I].

We say that two ropes I and I + 1 are adjacent. Two adjacent ropes can be tied together with a knot, and the length of the tied rope is the sum of lengths of both ropes. The resulting new rope can then be tied again.

For a given integer K, the goal is to tie the ropes in such a way that the number of ropes whose length is greater than or equal to K is maximal.

For example, consider K = 4 and array A such that:

```java
    A[0] = 1
    A[1] = 2
    A[2] = 3
    A[3] = 4
    A[4] = 1
    A[5] = 1
    A[6] = 3
```

The ropes are shown in the figure below.

![Tie Ropes Visualization](./images/Lesson_16_GreedyAlgorithms_Tie_Ropes_Problem_Image_1.png)

We can tie:

rope 1 with rope 2 to produce a rope of length A[1] + A[2] = 5;
rope 4 with rope 5 with rope 6 to produce a rope of length A[4] + A[5] + A[6] = 5.
After that, there will be three ropes whose lengths are greater than or equal to K = 4. It is not possible to produce four such ropes.

Write a function:

```java
class Solution { public int solution(int K, int[] A); }
```

that, given an integer K and a non-empty array A of N integers, returns the maximum number of ropes of length greater than or equal to K that can be created.

For example, given K = 4 and array A such that:

```java
    A[0] = 1
    A[1] = 2
    A[2] = 3
    A[3] = 4
    A[4] = 1
    A[5] = 1
    A[6] = 3
```

the function should return 3, as explained above.

Write an *efficient* algorithm for the following assumptions:
- N is an integer within the range [1..100,000];
- K is an integer within the range [1..1,000,000,000];
- each element of array A is an integer within the range [1..1,000,000,000].

Complexity:
- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
- Elements of input arrays can be modified.

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### [Lesson 17: Dynamic Programming](./src/main/java/com/codility/lessons/DynamicProgramming)

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Number Solitaire](./src/main/java/com/codility/lessons/DynamicProgramming/NumberSolitaire.java)

A game for one player is played on a board consisting of N consecutive squares, numbered from 0 to N − 1. There is a number written on each square. A non-empty array A of N integers contains the numbers written on the squares. Moreover, some squares can be marked during the game.

At the beginning of the game, there is a pebble on square number 0 and this is the only square on the board which is marked. The goal of the game is to move the pebble to square number N − 1.

During each turn we throw a six-sided die, with numbers from 1 to 6 on its faces, and consider the number K, which shows on the upper face after the die comes to rest. Then we move the pebble standing on square number I to square number I + K, providing that square number I + K exists. If square number I + K does not exist, we throw the die again until we obtain a valid move. Finally, we mark square number I + K.

After the game finishes (when the pebble is standing on square number N − 1), we calculate the result. The result of the game is the sum of the numbers written on all marked squares.

For example, given the following array:

```java
    A[0] = 1
    A[1] = -2
    A[2] = 0
    A[3] = 9
    A[4] = -1
    A[5] = -2
```

one possible game could be as follows:

- the pebble is on square number 0, which is marked;
- we throw 3; the pebble moves from square number 0 to square number 3; we mark square number 3;
- we throw 5; the pebble does not move, since there is no square number 8 on the board;
- we throw 2; the pebble moves to square number 5; we mark this square and the game ends.
- The marked squares are 0, 3 and 5, so the result of the game is 1 + 9 + (−2) = 8. This is the maximal possible result that can be achieved on this board.

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given a non-empty array A of N integers, returns the maximal result that can be achieved on the board represented by array A.

For example, given the array

```java
    A[0] = 1
    A[1] = -2
    A[2] = 0
    A[3] = 9
    A[4] = -1
    A[5] = -2
```

the function should return 8, as explained above.

Write an *efficient* algorithm for the following assumptions:

- N is an integer within the range [2..100,000];
- each element of array A is an integer within the range [−10,000..10,000].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Min Absolute Sum](./src/main/java/com/codility/lessons/DynamicProgramming/MinAbsSum.java)

For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:

val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|

(Assume that the sum of zero elements equals zero.)

For a given array A, we are looking for such a sequence S that minimizes val(A,S).

Write a function:

```java
class Solution { public int solution(int[] A); }
```

that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.

For example, given array:

```java
  A[0] =  1
  A[1] =  5
  A[2] =  2
  A[3] = -2
```

your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.

Write an efficient algorithm for the following assumptions:
- N is an integer within the range [0..20,000];
- each element of array A is an integer within the range [−100..100].

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

#### BARCLAYS INTERVIEW QUESTIONS 2015

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Min Absolute Sum](./src/main/java/com/codility/lessons/DynamicProgramming/MinAbsSum.java)

##### [Single Swap Increasing Order Array](./src/main/java/com/codility/lessons/Barclays2015/SingleSwapIncreasingOrderArray.java)

You have given an array. You have to find out if we can make this array in increasing order by making one swap or not.

[1,2,5,4,6,7] == true

[2,4,5,7,8,6,5] == false

##### [Longest Increasing Sequence Diff](./src/main/java/com/codility/lessons/Barclays2015/LongestIncreasingSequenceDiff.java)

You have given an array and you have to find out maximum sub sequence where difference of largest number and smallest number should not be greater than 1.

[6,8,6,7,9] == [6,6,7]

##### [Heads Tails Adjacency](./src/main/java/com/codility/lessons/Barclays2015/HeadsTailsAdjacency.java)

We have certain coins in an array which are either 1 or 0.Adjacency means how many pairs have similar number.

[1,1,1] == Here it’s 2 as three pair can be formed [index0,index1] [index1,index2]

[1,1,0,0,0] == here it’s 3 [1,1] [0,0] [0,0]

In this we can do at most one reverse. So we have to calculate maximum adjacency after that reversal.

[1,1,0,1] == so here if we make 0 -> 1 adjacency will be 3.

#### BARCLAYS INTERVIEW QUESTIONS 2023

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Slope Of A Number](./src/main/java/com/codility/lessons/Barclays2023/SlopeOfANumber.java)

Slope of a number is the count of the minimaand maxima digits in it. A digit is called a minima if the digit is lesser than the digitbefore and after it. Similarly a digit is called a maxima if the digit is greater than thedigit before and after it.

Examples:
 
Input  : 1213321
Output : 2

1*21*3321- The highlighted digit '2' is a maxima and highlighted digit '1' is a minima.

Input  : 273299302236131
Output : 6

Approach:

 Traverse the digits of the given number from the 2nd digit up to the 2nd lastdigit. For each digit check whether the digit is greater or smaller than digits before andafter it. Get the count of such digits.
 
<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>

##### [Move All Zeros To End Of Array](./src/main/java/com/codility/lessons/Barclays2023/MoveAllZerosToEndOfArray.java)

Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

Example:

```
Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
```

<div align="right"><a href="#top" target="_blacnk"><img src="https://img.shields.io/badge/Back to up-orange?style=for-the-badge&logo=expo&logoColor=white" /></a></div>
