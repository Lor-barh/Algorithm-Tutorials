package secondweek;

/*
------- 1
Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string,
the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

------ 2
Definition
Disarium number is the number that The sum of its digits powered with their respective positions is equal to the number itself.

Task
Given a number, Find if it is Disarium or not .

Input >> Output Examples
disariumNumber(89) ==> return "Disarium !!"
Explanation:
Since , 81 + 92 = 89 , thus output is "Disarium !!"
disariumNumber(564) ==> return "Not !!"
Explanation:
Since , 51 + 62 + 43 = 105 != 564 , thus output is "Not !!"

------ 3
Task
Given an array of N integers, you have to find how many times you have to add up the
smallest numbers in the array until their Sum becomes greater or equal to K.

Input >> Output Examples
minimumSteps({1, 10, 12, 9, 2, 3}, 6)  ==>  return (2)
Explanation:
We add two smallest elements (1 + 2), their sum is 3 .

Then we add the next smallest number to it (3 + 3) , so the sum becomes 6 .

Now the result is greater or equal to 6 , Hence the output is (2) i.e (2) operations are required to do this .

minimumSteps({8 , 9, 4, 2}, 23)  ==> return (3)
Explanation:
We add two smallest elements (4 + 2), their sum is 6 .

Then we add the next smallest number to it (6 + 8) , so the sum becomes 14 .

Now we add the next smallest number (14 + 9) , so the sum becomes 23 .

Now the result is greater or equal to 23 , Hence the output is (3) i.e (3) operations are required to do this .

----- 4
You're given a two-dimensional array (a matrix) of distinct integers and a target integer. Each row in the matrix is sorted,
and each column is also sorted; the matrix doesn't necessarily have the same height and width.

Write a function that returns an array of the row and column indices of the target
integer if it's contained in the matrix, otherwise [-1, -1].

Challenge.searchInSortedMatrix(matrix, target)
Parameters
matrix: List<Integer[]> - A matrix of distinct integers

target: Integer - The target integer to find in the matrix

Return Value
Integer[] - The row and column index of the target integer in the matrix.

Given the matrix

[
  [1, 4, 7, 12, 15, 1000],
  [2, 5, 19, 31, 32, 1001],
  [3, 8, 24, 33, 35, 1002],
  [40, 41, 42, 44, 45, 1003],
  [99, 100, 103, 106, 128, 1004],
]
and a target value of 44, your function should return [3, 3]. Meaning, the target
value 44 can be found at row index 3 and column index 3 in the matrix.

If the target value cannot be found in the matrix, you should return [-1, -1]

 */

import java.util.*;

public class Monday {
/*

------ 1
    public static String longest (String s1, String s2) {
        StringBuilder str = new StringBuilder();
        str.append(s1);
        str.append(s2);
        System.out.println(str);
        List<Character> strList = new ArrayList<>();
        for (int i=0; i<str.length(); i++){
            strList.add(str.charAt(i));
        }
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);
        StringBuilder latestStr = new StringBuilder();
       for (int i=0; i < strList.size(); i++){
           if (latestStr.indexOf(String.valueOf(strList.get(i)))==-1)
//               The indexOf() method returns -1 when the substring was not found.
//               System.out.println(latestStr.indexOf(String.valueOf(strList.get(i))));
               latestStr.append(strList.get(i));
       }
        System.out.println(latestStr);
        return latestStr.toString();
    }

----- 2

    public static String disariumNumber(int number) {
        String digit = String.valueOf(number);
        List <Integer> separateDigit = new ArrayList<>();
        for (int i=0; i<digit.length(); i++){
            separateDigit.add(Integer.parseInt(String.valueOf(digit.charAt(i))));
        }
        int pow=0;
        int powerAddition = 0;
        System.out.println(separateDigit);
        for (int i=0; i< separateDigit.size(); i++){
            pow = (int) Math.pow(separateDigit.get(i), i + 1);
            System.out.println(pow);
            powerAddition+=pow;
        }
        System.out.println(powerAddition);
        if (powerAddition == number){
            return "Disarium !!";
        }
        return "Not !!";
    }

------- 3
 public static int minimumSteps(int[] numbers, int k) {
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int count =0;
        int addition = 0;
        for (int number : numbers) {
            if (addition != 0)
                count++;
            addition += number;
            if (addition == k) {
                break;
            }
        }
        System.out.println(addition);
        System.out.println(count);
        return count;
    }

 ------ 4

    public static List<Integer> searchInSortedMatrix(List<List<Integer>> matrix,Integer target) {

        Integer row = 0;
        Integer col = 0;
        List <Integer> answer = new ArrayList<>();
        for (int i=0; i<matrix.size(); i++) {
            for(int j=0; j<matrix.get(i).size(); j++) {
                System.out.println(matrix.size());
                if (Objects.equals(matrix.get(i).get(j), target)){
                    row+=matrix.indexOf(matrix.get(i));
                    col+=matrix.indexOf(matrix.get(j));
                }
            }
        }

        if (row == 0 && col == 0) {
            answer.add(-1);
            answer.add(-1);
        } else {
            System.out.println(row);
            System.out.println(col);
            answer.add(row);
            answer.add(col);
        }

        return answer;
    }
 */
}
