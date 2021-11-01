package firstweek;

/*
1.  Given a set of numbers, return the additive inverse of each. Each positive becomes
negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []

-------------------------------------------------------------------------

2.  You get an array of numbers, return the sum of all the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

-------------------------------------------------------------------------

3. Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples:

number(Arrays.asList()) # => []
number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]

-------------------------------------------------------------------------

4. In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

-------------------------------------------------------------------------

5. Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuesday {


/*
----- 1
    public static int[] invert(int[] array) {
        List<Integer> arrList = new ArrayList<>();
        for (int j : array) {
            arrList.add(j * -1);
        }
        int [] latestArr = new int[arrList.size()];
        int index = 0;
        for (Integer integer : arrList) {
            latestArr[index++] = integer;
        }
        return latestArr;
    }

------ 2
public static int sum(int[] arr) {

    int addition = 0;

    for (int j : arr) {
        if (j >= 0) {
            System.out.println(j);
            addition += j;
        }
        else
            addition += 0;
    }
        return addition;
        10 5 5
    }

------ 3
    public static List<String> number(List<String> lines) {
        List <String> finalList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++){
            finalList.add((i + 1) + ": " + lines.get(i));
        }
        return finalList;
    }

------ 4a
    public static String highAndLow(String numbers) {
        String[] s = numbers.split(" ");
        System.out.println(Arrays.toString(s));
        List<Integer> integers = new ArrayList<>();
        for (String string : s) {
            integers.add(Integer.parseInt(string));
        }
        Integer [] intArr = integers.toArray(new Integer[0]);
        System.out.println("--------" + integers);
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(new String[]{"----" + Arrays.toString(intArr)}));
        String min = String.valueOf(intArr[0]);
        String max = String.valueOf(intArr[intArr.length-1]);
        return max + " " + min;

------ 4b
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);
        String[] nums = numbers.split(" ");

        for(String s: nums) {
            int num = Integer.parseInt(s);

            max = Math.max(max, num);
            System.out.println("max" + max);
            min = Math.min(min, num);
            System.out.println(min);
        }

        return max + " " + min;
    }

--------- 5

    public static int findShort(String s) {
        String[] s1 = s.split(" ");
        List<Integer> integers = new ArrayList<>();
        System.out.println(Arrays.toString(s1));
        for (int i = 0; i < s1.length; i++){
           integers.add(s1[i].length());
        }
        System.out.println(integers);
        Integer [] finalInt = integers.toArray(new Integer[0]);
        Arrays.sort(finalInt);

        return finalInt[0];
    }

    public static void main(String[] args) {
        String str = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(str));
    }

    */
}
