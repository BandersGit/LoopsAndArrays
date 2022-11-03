import java.util.Random;

public class WhileLoops {
    
    public void count(){

        int i = 1;

        while (i < 21) 
        {
            System.out.println(i);
            i++;
        }
    }

    public void countEvenOdd(){

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

        while (i <= 50) 
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

    public void findLargest(){
        Integer[] numbers = new Integer[10];
        Random generator = new Random();
        int loopControl = 0;
        int largestNumber = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(100);
            System.out.println(numbers[i]);
        }

        while (loopControl <= 9) {
            if (largestNumber <= numbers[loopControl]) {
                largestNumber = numbers[loopControl];
            }
            loopControl++;
        }

        System.out.println("The largest number in the array is " + largestNumber);
    }


}
