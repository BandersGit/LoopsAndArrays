public class ForLoops {
    
    public void count(){

        for (int i = 1; i < 21; i++) 
        {
            System.out.println(i);
        }
    }

    public void countEven(){
        
        for (int i = 1; i < 21; i++) {
            
            if (i % 2 == 0) 
            {
                System.out.println( i + " is even");
                continue;
            }
            else
            {
                System.out.println(i + " is odd");
                continue;
            }
        }
    }

    public void countMult(){

        for (int i = 0; i < 11; i++) 
        {
            int timesNine = i * 9;
            
            System.out.println(i + " x " + 9 + " = " + timesNine);
        }
    }
}
