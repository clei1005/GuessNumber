package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int a[]=new int[4];
        int b[]=new int[4];
        int A=0;int B=0;

        int intUserInput= Integer.valueOf(userInput).intValue();
        a[0]=(int)intUserInput/1000;
        a[1]=(int)intUserInput%1000/100;
        a[2]=(int)intUserInput%1000%100/10;
        a[3]=intUserInput%1000%100%10;

        int intRandomNumber= Integer.valueOf(randomNumber).intValue();
        b[0]=(int)intRandomNumber/1000;
        b[1]=(int)intRandomNumber%1000/100;
        b[2]=(int)intRandomNumber%1000%100/10;
        b[3]=intRandomNumber%1000%100%10;
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++){
                if(a[j]==b[i]&&(i==j))
                    A++;
                if(a[j]==b[i]&&(i!=j))
                    B++;
            }

        String sa=A+"a"+B+"b";

      //  if(userInput.equals(randomNumber)){
      //      return "4a0b";
      //  }
        return sa;

    }
}
