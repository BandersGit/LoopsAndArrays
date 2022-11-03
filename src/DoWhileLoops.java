public class DoWhileLoops {
    
    public void count(){

        int i = 1;
        
        do {
            System.out.println(i);
            i++;
            continue;
        } while (i < 21);
    }

    public void countEvenOdd(){

        int i = 1;

        do 
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
            continue;
        } while (i < 21);
    }

    public void squareOdd(){

        int i = 0;

        do 
        {
            if (i % 2 == 0) 
            {
                
            }
            else
            {
                System.out.println(i + " squared is: " + i*i);
            }
            i++;
            continue;
        } while (i <= 10);
    }
}
