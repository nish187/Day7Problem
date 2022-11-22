import java.util.Scanner;
public class Gambling {
    public static void main(String[] args) {
        System.out.println("Enter the stake price: ");
        Scanner sc= new Scanner(System.in);
        int stake=sc.nextInt();
        System.out.println("Enter the goal to set: ");
        int goal=sc.nextInt();
        System.out.println("Enter the trials want: ");
        int trials=sc.nextInt();
        int bet=0,win=0;
        for(int t=0;t<trials;t++){
            int cash=stake;
            while(cash>0 && cash<goal){
                bet++;
                if(Math.random()<0.5)
                    cash++;
                            else
                                cash--;
            }
            if(cash==goal)
                win++;
        }
        System.out.println(win +"win of"+ trials);
        System.out.println("% of game won" +100*win/trials);
        System.out.println("Avg of bets=" +1*bet/trials);
    }
}
