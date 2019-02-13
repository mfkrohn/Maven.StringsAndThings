package io.zipcoder;


import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String[] inputArr = input.split(" ");
        Integer count = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].charAt(inputArr[i].length() - 1) == 'y' || inputArr[i].charAt(inputArr[i].length() - 1) == 'z') {
                count++;
            }

        }

        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String[] baseArr = base.split(remove);
        return String.join("", baseArr);
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        char[] inputArr = input.toCharArray();
        int isCount = 0;
        int notCount = 0;
        boolean check = false;
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] == 115 && inputArr[i - 1] == 105) {
                isCount++;
            }
        }
            for (int j = 2; j < inputArr.length; j++) {
                if (inputArr[j] == 116 && inputArr[j - 1] == 111) {
                    notCount++;
                }
            }

        if(isCount == notCount){
            check = true;
        }

        return check;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        boolean happy = false;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
                happy = true;
            }
        }
        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        char[] inputArr = input.toCharArray();
        Integer tripCount = 0;
        for (int i = 2; i < inputArr.length; i++) {
            if (inputArr[i] == inputArr[i-1] && inputArr[i] == inputArr[i-2]) {
                tripCount++;
            }
        }

        return tripCount;
    }
}
