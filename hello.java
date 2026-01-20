public class hello{
    
    public static void main(String[] args) 
    {
        int x= 0;
        int y=0;
        for(x=5; x>0;x--)
        {
            for(y=0; y<x; y++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}