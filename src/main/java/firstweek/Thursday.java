package firstweek;

/*
-------- 1
Task
Write a function that accepts two arguments and generates a sequence containing the integers from the first argument to the second inclusive.

Input
Pair of integers greater than or equal to 0. The second argument will always be greater than or equal to the first.

Example
generate_integers(2, 5) # --> [2, 3, 4, 5]

--------- 2
Definition
Balanced number is the number that * The sum of all digits to the left of the middle digit(s)
and the sum of all digits to the right of the middle digit(s) are equal*.

Task
Given a number, Find if it is Balanced or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
If the number has an odd number of digits then there is only one middle digit, e.g.
92645 has middle digit 6; otherwise, there are two middle digits , e.g. 1301 has middle digits 3 and 0

The middle digit(s) should not be considered when determining whether a number is balanced or not,
e.g 413023 is a balanced number because the left sum and right sum are both 5.

Number passed is always Positive .

Return the result as String

Input >> Output Examples
(balanced-num 7) ==> return "Balanced"
Explanation:
Since , The sum of all digits to the left of the middle digit (0)

and the sum of all digits to the right of the middle digit (0) are equal , then It's Balanced

(balanced-num 295591) ==> return "Not Balanced"
Explanation:
Since , The sum of all digits to the left of the middle digits (11)

and the sum of all digits to the right of the middle digits (10) are Not equal , then It's Not Balanced

Note : The middle digit(s) are 55 .

(balanced-num 959) ==> return "Balanced"

------ 3
A square of squares
You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.

Task
Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

The tests will always use some integral number, so don't worry about that in dynamic typed languages.

Examples
-1  =>  false
 0  =>  true
 3  =>  false
 4  =>  true
25  =>  true
26  =>  false

------ 4
The odd and even numbers are fighting against each other!

You are given a list of positive integers. The odd numbers from the list will fight using their
1 bits from their binary representation, while the even numbers will fight using their 0 bits. If present
in the list, number 0 will be neutral, hence not fight for either side.

You should return:

odds win if number of 1s from odd numbers is larger than 0s from even numbers
evens win if number of 1s from odd numbers is smaller than 0s from even numbers
tie if equal, including if list is empty
Please note that any prefix that might appear in the binary representation, e.g. 0b, should not be
counted towards the battle.

Example:
For an input list of [5, 3, 14]:

odds: 5 and 3 => 101 and 11 => four 1s
evens: 14 => 1110 => one 0
Result: odds win the battle with 4-1

------ 5
Challenge:

Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
 */

public class Thursday {

/*
------- 1
    public static int[] generateIntegers(final int m, final int n) {
        int size = n-m+1;
        int [] numbers = new int[size];
        System.out.println(numbers.length);
        ArrayList<Integer> num = new ArrayList<>();
        int firstNum = m;
        for (int i =0; i < size; i++){
            num.add(firstNum++);
        }
        System.out.println(num);
        for (int i=0; i<numbers.length; i++){
            numbers[i] = num.get(i);
        }
        return numbers;
    }

------ 2
    public static String balancedNum(long number) {
        String result = null;
        String longNumber = Long.toString(number);
        System.out.println(longNumber);
        int length = longNumber.length();
        String firstSide = null;
        String secondSide = null;
        int firstCount = 0;
        int secondCount = 0;
        if (length < 3){
            return "Balanced";
        }

        if (length > 2 && length%2 ==0){
            firstSide = longNumber.substring(0,(length/2 - 1));
            secondSide = longNumber.substring((length/2 +1), length);
            for (int i =0; i<firstSide.length(); i++){
                firstCount += Integer.parseInt(String.valueOf(firstSide.charAt(i)));
            }
            for (int i =0; i< secondSide.length(); i++){
                secondCount += Integer.parseInt(String.valueOf(secondSide.charAt(i)));
            }
            if (firstCount == secondCount){
                result = "Balanced";
            } else {
               result ="Not Balanced";
            }
        }

        if (length > 2 && length%2 == 1){
            firstSide = longNumber.substring(0,(length/2));
            secondSide = longNumber.substring((length/2 +1), length);
            for (int i =0; i<firstSide.length(); i++){
                firstCount += Integer.parseInt(String.valueOf(firstSide.charAt(i)));
            }
            for (int i =0; i< secondSide.length(); i++){
                secondCount += Integer.parseInt(String.valueOf(secondSide.charAt(i)));
            }
            if (firstCount == secondCount){
                result ="Balanced";
            } else {
                result ="Not Balanced";
            }
        }
        return result;
    }

----- 3
public static boolean isSquare(int n) {
    boolean b = (Math.sqrt(n) - Math.floor(Math.sqrt(n))) == 0;
        return b;
}

------ 4
static String bitsBattle(int[] numbers) {
        StringBuilder oddBinary = new StringBuilder();
        StringBuilder evenBinary = new StringBuilder();
        for (int number : numbers) {
            if (number > 0 && number % 2 == 0) {
                evenBinary.append(Integer.toBinaryString(number));
            } else
                oddBinary.append(Integer.toBinaryString(number));
        }
        int countOne = 0;
        int countTwo = 0;
        for (int i=0; i< oddBinary.length(); i++) {
            if (oddBinary.charAt(i) == '1') {
                countOne++;
            }
        }

        for (int i=0; i<evenBinary.length(); i++){
            if (evenBinary.charAt(i) == '0') {
                countTwo++;
            }
        }
        System.out.println(countOne);
        System.out.println(countTwo);
        if (countOne > countTwo) {
            return "odds win";
        } else if (countTwo > countOne) {
            return "evens win";
        } else
            return "tie";
    }static String bitsBattle(int[] numbers) {
        StringBuilder oddBinary = new StringBuilder();
        StringBuilder evenBinary = new StringBuilder();
        for (int number : numbers) {
            if (number > 0 && number % 2 == 0) {
                evenBinary.append(Integer.toBinaryString(number));
            } else
                oddBinary.append(Integer.toBinaryString(number));
        }
        int countOne = 0;
        int countTwo = 0;
        for (int i=0; i< oddBinary.length(); i++) {
            if (oddBinary.charAt(i) == '1') {
                countOne++;
            }
        }

        for (int i=0; i<evenBinary.length(); i++){
            if (evenBinary.charAt(i) == '0') {
                countTwo++;
            }
        }
        System.out.println(countOne);
        System.out.println(countTwo);
        if (countOne > countTwo) {
            return "odds win";
        } else if (countTwo > countOne) {
            return "evens win";
        } else
            return "tie";
    }

 ------- 5
 public static int[] flattenAndSort(int[][] array) {
        int size = 0;
        for (int[] value : array) {
            for (int j : value) {
                size++;
            }
        }
        System.out.println(size);
        System.out.println(array.length);
        int count = 0;
        int [] newArr = new int[size];
        for (int[] ints : array) {
            for (int j : ints) {
                newArr[count] = j;
                count++;
            }
        }
            Arrays.sort(newArr);
        return newArr;
    }
 */

    public static void main(String[] args) {

    }

}

