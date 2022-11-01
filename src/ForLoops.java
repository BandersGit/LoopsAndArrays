public class ForLoops {
    
    public void count(){
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public void countEvenOdd(){
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println( i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }
        }
    }

    public void countMult(){
        for (int i = 0; i <= 1832; i++) {
            int timesNine = i * 9;
            
            System.out.println(i + " x " + 9 + " = " + timesNine);
        }
    }

    public void countSumEven(){
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            System.out.println("The current number is " + i);

            if (i % 2 == 0) {
                sum += i;
                System.out.println("The sum of the even numbers are " + sum);
                
            }
            else{
                System.out.println(i + " is odd");
                
            }
            System.out.println(" ");
        }
    }

    public void countDivSeven(){
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 7 == 0) {
                sum += i;
                System.out.println( i + " is divisible by 7");
                System.out.println("The current sum is " + sum);    
            }
        }
    }
}
