/*
 * Jiansong He
 * URL: https://github.com/paradox42/COSC311
 * COSC 311
 * HW 09/14
 * FALL 2016
 */
package hw0928;
public class HW0928 
{
    public static void main(String[] args) 
    {
        char[] inputString;
        char[] outputString;
        inputString = "abcd efgh".toCharArray();
        outputString = new char[inputString.length];
        for(int i = inputString.length-1, j = 0; i >= 0 ;i--,j++)
        {
            outputString[j] = inputString[i];
            System.out.printf("%c", outputString[j]);
        }
    }
    
}
