import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


class Num_Theory
{
    static BufferedReader buff_reader = new BufferedReader(new InputStreamReader(System.in));

    //Utility Function
    int odd_prime_num(int num)
    {
        //required for Golbach Number

        int val1 , val2 = 0;

        for(val1 = 1; val1 <= num; val1++)
        {
            if(num % val1 == 0)
            {
                val2++;
            }
        }

        if(val2 == 2 && num % 2 == 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }


    /*===============================================
                      Goldbach Number
    ===============================================*/


    boolean Goldbach_Num(int num)throws IOException
    {
        //Definiton
        //Goldbach number is a positive even integer that can be expressed as sum of two odd primes.
        //The pair of the two prime numbers whose sum express the given even number is called the Goldbach partition of the even number.

        System.out.println("\n\n\t\t\tGoldbach Number");
        System.out.println("Definition: \nGoldbach number is a positive even integer that can be expressed as sum of two odd primes. The pair of the two prime numbers whose sum express the given even number is called the Goldbach partition of the even number.");

        //System.out.println("\nEnter positive even number:");

        //int num = Integer.parseInt(buff_reader.readLine());

        int val1, sum = 0;

        if(num % 2 == 1 || num <= 0)
        {
            System.out.println("\nInvalid input: You've either entered a negative or odd number");
            return false;
        }

        else if(num <= 4)
        {
            System.out.println("\n\n"+num + " is not a Goldbach Number. Did not find a prime partition for the given number.");
            return false;
        }

        else
        {
            System.out.println("\nThe Prime Partition for the given number is: ");

            for(val1 = 0;val1 < num/2;val1 ++)
            {
                sum = val1 + (num - val1);

                if(odd_prime_num(val1) == 1 && odd_prime_num(num - val1) == 1 && sum == num)
                {
                    System.out.println(val1 + " and " + (num - val1));
                }
            }

            System.out.println("\n"+num + " is a Goldbach Number with the above Prime Pair partition.");
            return true;
        }
    }


    /*===============================================
                      Hamming Number
    ===============================================*/


    boolean Hamming_Num(int no)throws IOException
    {

        //Definiton

        // Hamming numbers are nums of form: Hamming_Num  =  2^a * 3^b * 5^c
        //where a, b, c greater than equal to 0

        System.out.println("\n\n\t\t\tHamming Number");
        System.out.println("\nDefinition: Hamming numbers are nums of form: Hamming_Num  =  2^a * 3^b * 5^c        where a, b, c greater than equal to 0\n");
        //System.out.println("\nEnter a number:");

        //int no = Integer.parseInt(buff_reader.readLine());
        int num_backup = no;
        boolean flag = true;

        while(no != 1)
        {

            if (no % 2 == 0)
                no /= 2;

            else if (no % 3 == 0)
                no /= 3;

            else if (no % 5 == 0)
                no /= 5;

            else
            {
                System.out.println("\n"+num_backup + " isn't a Hamming Number.\nDid not find numbers a,b,c that obey the form Hamming_Num = 2^a * 3^b * 5^c");
                flag = false;
                return false;
            }
        }


        if(flag = true)
        {
            System.out.println(num_backup + " is a Hamming number. (Also known as Ugly number)");
            return true;
        }
        else
            return false;
    }


    /*===============================================
                      Narcissistic Number
    ===============================================*/


    boolean Narcissistic_Num(int num)throws IOException
    {
        //Definiton

        //Narcissistic number is a number that is the summation of its digits each raised to the power
        //of the number of digits. It is also called Pluperfect Digital Invariant(PPDI).

        System.out.println("\n\n\t\t\tNarcissistic Number");
        System.out.println("\nDefinition: Narcissistic number is a number that is the summation of its digits each raised to the power of the number of digits. It is also called Pluperfect Digital Invariant(PPDI)");
        //System.out.println("\nEnter a number:");

        //int num = Integer.parseInt(buff_reader.readLine());
        int traverse_num = num , sum = 0;

        while(traverse_num != 0)
        {
            sum = sum + (int)(Math.pow(traverse_num % 10 , (String.valueOf(num)).length()));
            traverse_num = traverse_num / 10;
        }

        if(sum == num)
        {
            System.out.println("\n\n"+num + " is a Narcissistic Number");
            return true;
        }

        else
        {
            System.out.println("\n\n"+ num + " is not a Narcissistic Number");
            return false;
        }
    }


    /*===============================================
                      Markov Number
    ===============================================*/

    boolean Markov_Num(int num)throws IOException
    {

        //Definiton

        //Markov number are the positive integers x, y, z that appear in the solution of the Markov Diophantine equation
        //x^2 + y^2 + z^2 = 3xyz

        System.out.println("\n\n\t\t\tMarkov Number");
        System.out.println("\nDefinition: Markov number are the positive integers x, y, z that appear in the solution of the Markov Diophantine equation x^2 + y^2 + z^2 = 3xyz");
        //System.out.println("\nEnter a positive number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        int mar1 , mar2 , mar3 , lhs , rhs , flag = 0;
        for(mar1 = 1; mar1 <= num; mar1++)
        {
            for(mar2 = 1; mar2 <= num; mar2++)
            {
                for(mar3 = 1; mar3 <= num; mar3++)
                {
                    lhs = (mar1 * mar1) + (mar2 * mar2) + (mar3 * mar3);
                    rhs = 3 * mar1 * mar2 * mar3;
                    if(lhs == rhs && (num == mar1 || num == mar2 || num == mar3))
                    {
                        System.out.println("\n\n"+num + " is a Markov Number");
                        System.out.println("First Triplet Containing the Markov Number: " + "[" + mar1 + " , " + mar2 + " , " + mar3 + "]");
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1)
                    break;
            }

            if(flag == 1)
            {
                return true;

            }

        }

        if(flag == 0)
        {
            System.out.println("\n"+num + " is not a Markov Number");
            return false;
        }

        else
            return true;
    }


    /*===============================================
                      Colombian Number
    ===============================================*/



    boolean Colombian_Num(int num)throws IOException
    {

        //Definiton

        //Colombian number is an integer that cannot be written as the summation of any other integer 'num'
        //and the digits of 'num'.

        System.out.println("\n\n\t\t\tColombian Number");
        System.out.println("\nDefinition: Colombian number is an integer that cannot be written as the summation of any other integer 'num' and the digits of 'num'.");

        //System.out.println("\nEnter a positive number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        int flag = 0 , sum , traverse_num;

        for(int a = 1; a <= num; a++)
        {
            sum = 0;
            traverse_num = a;
            sum = sum + traverse_num;
            while(traverse_num != 0)
            {
                sum = sum + (traverse_num % 10);
                traverse_num = traverse_num / 10;
            }

            if(sum == num)
            {
                System.out.println("\n\n"+num + " is not a Colombian Number");
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("\n\n"+num + " is  a Colombian Number");
            return true;
        }
        return false;
    }


    /*===============================================
                      Thabit Number
    ===============================================*/


    boolean Thabit_Num(int num)throws IOException
    {

        //Definiton

        //Thabit Number is an integer of form : 3 * 2^num - 1 , num = non-negative integer

        System.out.println("\n\n\t\t\tThabit Number");
        System.out.println("\nDefinition: Thabit Number is an integer of form : 3 * 2^num - 1 , num = non-negative integer");

        //System.out.println("\nEnter a non-negative number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        if(num >=0)
        {
            int a, eq_val, flag = 0;

            for(a = 1; a <= num; a++)
            {
                eq_val = (3 * ((int)Math.pow(2 , a))) - 1;

                if(eq_val == num)
                {
                    System.out.println("\n\n"+num + " is a Thabit Number");
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
            {
                System.out.println("\n\n"+num + " is not a Thabit Number");
                return false;
            }
            return true;
        }

        else
        {
            System.out.println("\n\nInvalid input: "+num + " is a negative number");
            return false;
        }
    }

    /*===============================================
                      Woodall Number
    ===============================================*/


    boolean Woodall_Num(int num)throws IOException
    {
        //Definiton

        //Woodall number is any natural number 'W_num' that satisfies form W_num = num*(2^num) - 1
        // num = natural number

        System.out.println("\n\n\t\t\tWoodall Number");
        System.out.println("\nDefinition: Woodall number is any natural number 'W_num' that satisfies form W_num = num*(2^num) - 1, num = natural number");

        //System.out.println("\nEnter a natural number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        int cur_num, eq_val, flag = 0;

        if(num > 0)
        {
            for(cur_num = 1; cur_num <= num; cur_num++)
            {
                eq_val = (cur_num * (int)(Math.pow(2 , cur_num))) - 1;
                if(eq_val == num)
                {
                    System.out.println("\n\n"+num  + " is a Woodall Number for num = " + cur_num);
                    flag = 1;
                    return true;
                }
            }
            if(flag == 0)
            {
                System.out.println("\n\n"+num + " is not a Woodall Number");
                return false;
            }
        }

        else
        {
            System.out.println("\n\nInvalid input: "+num + " is not a natural number");
            return false;
        }

        return true;
    }



    /*===============================================
                      Leyland Number
    ===============================================*/


    boolean Leyland_Num(int num)throws IOException
    {
        //Definiton

        //Leyland number 'num' is a number where num = num1^num2 + num2^num1
        // num1, num2 = integers greater than 1

        System.out.println("\n\n\t\t\tLeyland Number");
        System.out.println("\nDefinition: Leyland number 'num' is a number where num = num1^num2 + num2^num1 , num1, num2 = integers greater than 1");

        //System.out.println("\nEnter a number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        int num1, num2, num1_pow_num2, num2_pow_num1,flag = 0;

        if(num > 1)
        {
            for(num1 = 2; num1 < num; num1++)
            {
                for(num2 = 2; num2 < num; num2 ++)
                {
                    num1_pow_num2 = (int)Math.pow(num1 , num2);
                    num2_pow_num1 = (int)Math.pow(num2 , num1);

                    if(num1_pow_num2 + num2_pow_num1 == num || num1_pow_num2 - num2_pow_num1 == num)
                    {
                        flag = 1;
                        break;
                    }
                }
            }

            if(flag == 1)
            {
                System.out.println("\n\n"+ num  + " is a Leyland number");
                return true;
            }

            else
            {
                System.out.println("\n\n"+ num  + " is not a Leyland number");
                return false;
            }
        }

        else
        {
            System.out.println("\n\nInvalid input: "+num + " is not greater than 1");
            return false;
        }
    }

        /*===============================================
                      Sociable Number
        ===============================================*/



    boolean Sociable_Num(int num)throws IOException
    {
        //Definiton
        //Sociable numbers are numbers whose Aliquot sums form a periodic sequence.

        System.out.println("\n\n\t\t\tSociable Number");
        System.out.println("\nDefinition: Sociable numbers are numbers whose Aliquot sums form a periodic sequence.");

        //System.out.println("\nEnter a number:");
        //long num = Long.parseLong(buff_reader.readLine());

        long l, sum = 0, traverse_num = num, cnt = 0, flag = 0;

        while(traverse_num != 1)
        {
            for(l = 1; l < traverse_num; l++)
            {
                if(traverse_num % l == 0)
                {
                    sum = sum + l;
                }
            }

            traverse_num = sum;

            if(traverse_num == num)
            {
                System.out.println("\n\n"+ num + " is a Sociable Number");
                flag = 1;
                return true;
                //break;
            }

            sum = 0;
            cnt++;

            if(cnt > 20)
            {
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("\n\n"+ num  + " is not a Sociable number");
            return false;
        }
        else
         return true;
    }



        /*===============================================
                      Emirp Number
        ===============================================*/



    boolean Emirp_Num(int num)throws IOException
    {
        //Definiton
        //Emirp Number is a prime number that results in another prime number when its digits are reversed.

        System.out.println("\n\n\t\t\tEmirp Number");
        System.out.println("\nDefinition: Emirp Number is a prime number that results in another prime number when its digits are reversed.");
        //System.out.println("\nEnter a number:");

        //int num = Integer.parseInt(buff_reader.readLine());

        StringBuffer str = new StringBuffer(String.valueOf(num));
        int reverse = Integer.parseInt(String.valueOf(str.reverse()));

        int k, count1 = 0, count2 = 0;

        for(k = 1; k <= num; k++)
        {
            if(num % k == 0)
            {
                count1++;
            }
        }

        for(k = 1; k <= reverse; k++)
        {
            if(reverse % k == 0)
            {
                count2 ++;
            }
        }

        if(count1 == 2 && count2 == 2)
        {
            System.out.println("\n"+num + " is an Emirp Number as: "+ num + " is a prime number and its reverse " + reverse + " is also a prime number.");
            return true;
        }

        else if(count1 == 2 && count2 != 2)
        {
            System.out.println("\n"+num + " is not an Emirp number as its reverse is not a prime number. " + num + " itself is a Prime Number.");
            return false;
        }

        else
        {
            System.out.println("\n"+num + " is not a prime number hence cannot be an Emirp number");
            return false;
        }
    }




     /*===============================================
                      Ramanujan Number
        ===============================================*/


    boolean Ramanujan_Num(int num)throws IOException
    {
        //Definition
        //A number that can be expressed as the summation of two positive cubes in atleast two ways is called a Ramanujan Number.

        System.out.println("\n\n\t\t\tRamanujan Number");
        System.out.println("\nDefinition: A number that can be expressed as the summation of two positive cubes in atleast two ways is called a Ramanujan Number.");

        int num1,num2,cubes, cnt = 0;

        //System.out.println("\nEnter a number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        if(num == 1729)
        {
            System.out.println("\n\n" + num + " is the smallest Ramanujan Number");
            return true;
        }

        for(num1 = 1; num1 < num; num1++)
        {
            for(num2 = 1; num2 < num; num2++)
            {
                cubes = (int)(Math.pow(num1 , 3) + Math.pow(num2 , 3));

                if(cubes == num)
                {
                    cnt++;
                }
            }
        }

        if(cnt == 4)
        {
            System.out.println("\n\n" + num + " is a Ramanujan Number");
            return true;
        }

        else
        {
            System.out.println("\n\n" + num + " isn't a Ramanujan Number");
            return false;
        }

    }




     /*===============================================
                      Armstrong Number
        ===============================================*/


    boolean Armstrong_Num(int num)throws IOException
    {
        // Armstrong no. = sum of cubes of the digits of a given number is equal to the number itself

        //System.out.println("\nEnter a number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        System.out.println("\n\n\t\t\tArmstrong Number");
        System.out.println("\nDefinition: Armstrong no. = sum of cubes of the digits of a given number is equal to the number itself");

        int traverse_num = num;
        int rem , sum = 0;
        while(num!=0)
        {
            rem = num%10;
            sum = sum + (rem * rem * rem);
            num = num/10;
        }
        if(sum == traverse_num)
        {

            System.out.println("\n\n"+num+"is an Armstrong Number.");
            return true;
        }
        else
        {

            System.out.println("\n\n"+num+"is not an Armstrong Number.");
            return false;
        }
    }


     /*===============================================
                      Perfect Number
        ===============================================*/


    boolean Perfect_Num(int num)throws IOException
    {
        //The summation of all factors of a given number except itself is
        //equal to the number, then the number is called a Perfect Number.

        //System.out.println("\nEnter a number:");
        //int num = Integer.parseInt(buff_reader.readLine());

        System.out.println("\n\n\t\t\tPerfect Number");
        System.out.println("\nDefinition: The summation of all factors of a given number except itself is equal to the number, then the number is called a Perfect Number.");

        int l , sum = 0;
        for(l = 1; l < num; l++)
        {
            if(num % l == 0)
            {
                sum = sum + l;
            }
        }
        if(sum == num)
        {

            System.out.println("\n\n"+num + " is a Perfect Number");
            return true;
        }
        else
        {

            System.out.println("\n\n"+num + " isn't a Perfect Number");
            return false;
        }
    }



     /*===============================================
                      Strong Number
        ===============================================*/


    boolean Strong_Num(int num)throws IOException
    {
        // A number whose sum of factorials is equal to the number itself, is called a strong number.

        System.out.println("\n\n\t\t\tStrong Number");
        System.out.println("\nDefinition: A number whose sum of factorials is equal to the number itself, is called a strong number.");


        int traverse_num = num , rem , sum = 0 , power = 1;

        while(traverse_num != 0)
        {
            rem = traverse_num % 10;

            for(int i = rem; i >= 1;i --)
            {
                power = power * i;
            }

            sum = sum + power;
            traverse_num = traverse_num / 10;
            power=1;
        }

        if(sum == num)
        {
            System.out.println("\n\n"+num + " is a Strong Number");
            return true;

        }

        else
        {
            System.out.println("\n\n"+num + " is not a Strong Number");
            return false;
        }
    }


     /*===============================================
                      Evil Number
        ===============================================*/


    boolean Evil_Num(int num)throws IOException
    {
        //A positive and whole number which has even number of 1’s in its binary form is called an evil number.

        //System.out.println("Enter a no.");
        //int n = Integer.parseInt(dfs.readLine());


        System.out.println("\n\n\t\t\tEvil Number");
        System.out.println("\nDefinition: A positive and whole number which has even number of 1’s in its binary form is called an evil number.");

        int traverse_num = num;
        String str = "";

        char bin_dig[] = {'0', '1'};
        int a, cnt = 0, rem;

        while(traverse_num > 0)
        {
            rem = traverse_num% 2;
            str = bin_dig[rem] + str;
            traverse_num = traverse_num/2;
        }
        System.out.println(str);

        int l = str.length();
        for(a = 0; a < l; a++)
        {
            char charac = str.charAt(a);
            if(charac == '1')
            {
                cnt ++;
            }
        }

        if(cnt % 2 == 0)
        {
            System.out.println("\n\n"+num + " is an Evil Number");
            return true;
        }
        else
        {
            System.out.println("\n\n"+num + " an Evil Number");
            return false;

        }
    }


    ///////////////////////////////////////
    ///Main Function///
    ///////////////////////////////////////


    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        Num_Theory num_th = new Num_Theory();

        while(true) {
            System.out.println("\n\n\t\t\t================================");
            System.out.println("\t\t\tSpecial Numbers In Number Theory");
            System.out.println("\t\t\t================================");

            System.out.println("1.Goldbach Number\n"

                    + "2.Hamming Number\n"

                    + "3.Narcissitic Number\n"

                    + "4.Markov Number\n"

                    + "5.Colombian Number\n"

                    + "6.Thabit Number\n"

                    + "7.Woodall Number\n"

                    + "8.Leyland Number\n"

                    + "9.Perfect Number\n"

                    + "10.Sociable Number\n"

                    + "11.Emirp Number\n"

                    + "12.Armstrong Number\n"

                    + "13.Ramanujan Number\n"

                    + "14.Strong Number\n"

                    + "15.Evil Number\n"

                    + "16.Exit\n"
            );

            System.out.println("\n\nEnter your number choice:");
            int choice = sc.nextInt();
            int num = 0;

            switch(choice)
            {

                case 1: System.out.println("\nEnter positive even number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Goldbach_Num(num);
                    break;

                case 2: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Hamming_Num(num);
                    break;

                case 3: System.out.println("\nEnter number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Narcissistic_Num(num);
                    break;

                case 4: System.out.println("\nEnter positive number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Markov_Num(num);
                    break;

                case 5: System.out.println("\nEnter positive number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Colombian_Num(num);
                    break;

                case 6: System.out.println("\nEnter non-negative number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Thabit_Num(num);
                    break;

                case 7: System.out.println("\nEnter a natural number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Woodall_Num(num);
                    break;

                case 8: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Leyland_Num(num);
                    break;

                case 9: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Perfect_Num(num);
                    break;

                case 11: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Sociable_Num(num);
                    break;

                case 12: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Emirp_Num(num);
                    break;

                case 13: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Armstrong_Num(num);
                    break;

                case 14: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Ramanujan_Num(num);
                    break;

                case 15: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Strong_Num(num);
                    break;


                case 16: System.out.println("\nEnter a number:");
                    num = Integer.parseInt(buff_reader.readLine());
                    num_th.Evil_Num(num);
                    break;

                case 17: System.exit(0);

                default: System.out.println("Wrong choice!!");

            }
        }
    }
}