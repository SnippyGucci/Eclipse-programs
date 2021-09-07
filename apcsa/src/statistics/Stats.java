package statistics;
import java.util.*;

public class Stats {

    public static void main(String[] args) {

        int stat[] = new int [1000];
        int numberN1 = 0;
        int numberN2 = 0;
        int numberN3 = 0;        

        for(int i = 0; i < stat.length; i++){

            numberN1 = (int)(Math.random() * 6) + 1;
            numberN2 = (int)(Math.random() * 6) + 1;
            numberN3 = (int)(Math.random() * 6) + 1;

            stat[i] = numberN1 + numberN2 + numberN3;
        }

        for(int i = 0; i < stat.length; i++){
            System.out.print(stat[i] + " , ");
        }

    calcAvg(stat);    
    getMin(stat);
    getMax(stat);
    calcStdDev(stat);
    displayHistogram(stat);
    
    }

    public static double calcAvg (int[] p) {

        int sum = 0;

        for(int i = 0; i < p.length; i++){

            sum+= p[i];

        }


        double avg = sum/p.length;
        System.out.println( "Avg is: " + avg);

        return 0;

    }

    public static int getMin( int [] p) {

        int min = p[0];


        for(int i = 0; i < p.length; i++)

        {

            if(min > p[i])

            {

                min = p[i];

            }

        }

        

        System.out.println("Min is: " + min);

        return 0;

    }

    public static int getMax( int [] p) {

        int max = p[0];

        for(int i = 0; i < p.length; i++) {

            if(max < p[i]) {

                max = p[i];

            }

        }

        System.out.println("Max is: " + max);

        return 0;

    }

    

    public static double calcStdDev(int [] p) {

        int sum = 0;

        for(int i = 0; i < p.length; i++)

        {

            sum+= p[i];

        }

        

        int avg = sum/p.length;

        

        int diff = 0;

        int sqDiff = 0;

        int sqSum = 0;

        double sqAvg = 0;

        for(int i = 0; i < p.length; i++)

        {

            diff = avg - p[i];

            sqDiff = (int) Math.pow(diff, 2);

            sqSum += sqDiff; 

            

        }

        

        sqAvg = (double) Math.sqrt(sqSum/p.length);

        System.out.println("StdDev is: " + sqAvg);

        

        return 0;

    }


    public static void displayHistogram(int [] p) 

    {

        int nums[] = new int [16]; 

        

        for(int i = 0; i < nums.length; i++ )

        {

            

        }

        

        for(int i = 0; i < p.length; i++)

        {

            if(p[i] == 3)

            {

                nums[0]++;

            }

            if(p[i] == 4)

            {

                nums[1]++;

            }

            if(p[i] == 5)

            {

                nums[2]++;

            }

            if(p[i] == 6)

            {

                nums[3]++;

            }

            if(p[i] == 7)

            {

                nums[4]++;

            }

            if(p[i] == 8)

            {

                nums[5]++;

            }

            if(p[i] == 9)

            {

                nums[6]++;

            }

            if(p[i] == 10)

            {

                nums[7]++;

            }

            if(p[i] == 11)

            {

                nums[8]++;

            }

            if(p[i] == 12)

            {

                nums[9]++;

            }

            if(p[i] == 13)

            {

                nums[10]++;

            }

            if(p[i] == 14)

            {

                nums[11]++;

            }

            if(p[i] == 15)

            {

                nums[12]++;

            }

            if(p[i] == 16)

            {

                nums[13]++;

            }

            if(p[i] == 17)

            {

                nums[4]++;

            }

            if(p[i] == 18)

            {

                nums[15]++;

            }


        }

        

    System.out.print("3  |");

    for(int f = 0; f < nums[0]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("4  |");

    for(int f = 0; f < nums[1]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("5  |");

    for(int f = 0; f < nums[2]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("6  |");

    for(int f = 0; f < nums[3]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("7  |");

    for(int f = 0; f < nums[4]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("8  |");

    for(int f = 0; f < nums[5]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("9  |");

    for(int f = 0; f < nums[6]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("10 |");

    for(int f = 0; f < nums[7]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("11 |");

    for(int f = 0; f < nums[8]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("12 |");

    for(int f = 0; f < nums[9]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("13 |");

    for(int f = 0; f < nums[10]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("14 |");

    for(int f = 0; f < nums[11]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("15 |");

    for(int f = 0; f < nums[12]; f++)

    {

        System.out.print(" * ");

    }

    System.out.println("");

    

    System.out.print("16 |");

    for(int f = 0; f < nums[13]; f++)

    {

        System.out.print(" * ");

    }    


    System.out.println(" ");    

        

    }
 

}