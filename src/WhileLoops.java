public class WhileLoops {
    
    public void count(){

        int i = 1;

        while (i < 21) 
        {
            System.out.println(i);
            i++;
        }
    }

    public void countEven(){

        int i = 1;

        while (i < 21) 
        {
            if (i % 2 == 0) 
            {
                System.out.println( i + " is even");
            }
            else
            {
                System.out.println(i + " is odd");
            }

            i++;
        }
    }

    public void countSumAvg(){

        float i = 1;
        float sum = 0;
        float iterations = 0;
        float avg;

        while (i < 21) 
        {
            sum += i;
            iterations++;
            avg = sum/iterations;

            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + avg);
            System.out.println(" ");
            i++;
        }
    }


}
