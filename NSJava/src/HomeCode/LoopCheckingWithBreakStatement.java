package HomeCode;

public class LoopCheckingWithBreakStatement
{
    public static void main(String[] args) {
        for(int i = 0 ; i<3 ;i++)
        {
            for(int j = 0; true; j++)
            {
                if(j==2)
                {
                    break;  //It will break only inner loop when condition become true
                }
                else {
                    System.out.println("i=" + i + "j=" + j);
                }
            }
            System.out.println("i outer loop="+ i);
        }
    }
}
