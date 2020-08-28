package com.go.hashing;
public class FirstNonRepeatativeCharacter {
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    /* calculate count of characters
       in the passed string */
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
           System.out.println(str.charAt(i)+ " "+count[str.charAt(i)] );
        }

        for (char element: count) {
            System.out.println(element);
        }
    }
    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating
       then returns -1 */
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
    // Driver method
    public static void main(String[] args)
    {
        char ch = 'A';
        char ch2 = 'Z';
        int num = ch;
        int num2 = ch2;
        System.out.println("ASCII value of char "+ch+ " is: "+num);
        System.out.println("ASCII value of char "+ch2+ " is: "+num2);
        String str = "CChhutitya";
        int index = firstNonRepeating(str);
        System.out.println(
                index == -1
                        ? "Either all characters are repeating or string "
                        + "is empty"
                        : "First non-repeating character is "
                        + str.charAt(index));
    }
}
