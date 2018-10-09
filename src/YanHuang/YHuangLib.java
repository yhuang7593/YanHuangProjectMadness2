package YanHuang;

public class YHuangLib {

    public static String dateStr (String str)
    {
        String firstTwo = str.substring (0,2); //excludes the index containing the dash
        String secondTwo = str.substring (3,5); //takes the substring including the date
        String lastTwo = str.substring (6,10); //takes the substring including the year
        return firstTwo + "-" + secondTwo + "-" + lastTwo; //adds the date month and year together in a different format with dashes in between
    }

    public static boolean isPalindrome (String str)

    {
        int i = 0;
        int r = str.length() - 1;
        while (i<r)
        {
            if (str.charAt(i) != str.charAt(r))  //compares each character of the words to see if they are equal
            {
                return false;
            }
            i++;
            r--;
        }
        return true;
    }

    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int lcm;
        if (num1 > num3) { //the larger number becomes the least common multiple
            lcm = num1;
        } else {
            lcm = num3;
        }
        while ( lcm <= (num1 * num3)){ //repeat until lcm is greater than or equal to the product of num 1 and num 3
            if (lcm % num1 == 0 && lcm % num3 == 0) {
                lcm++;  //if lcm mod num1 and lcm mod num2 equals zero then add one to lcm
                break;  //if divisible, break statement breaks out of the loop; if not the value in the minimum variable is incremented
            }
        }
        int lcm2;
        if (num2 > lcm) { //repeat the same steps to compare num1 and num2
            lcm2 = num2;
        } else {
            lcm2 = lcm;
        }
        while (lcm2 <= (num2 * lcm)){
            if (lcm2 % num2 == 0 && lcm2 % lcm == 0) {
                lcm2++;
                break;
            }
        }
        return lcm2;
    }


    public static boolean isFibonnaci (int num)
    {
        int f = 0;
        int s = 1;
        while (f <= num)
        {
            int sum = f + s;  //adds the two numbers
            f = s;
            if (num != sum) //finds if the number entered is a sum
            {
                return false;
            }
        }
        return true;
    }

    public static int sumUpTo(int num)
    {
        int sum = 0;
        for ( int i = 0; i <= num; i++) //loop terminates when i reaches num+1 to add all consecutive integer before num
        {
            sum = sum + i; // adds integer i to sum repeatedly with integer i incrementing with each loop to get consecutive numbers
        }
        return sum;
    }
}
