package homework.a12calprime;

public class CB implements IMyPrime{
    @Override
    public void prime(int x){
        int number = 0;
        for(int i=2;i<=x;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                p[number]=i;
                number++;
            }
        }
    }
    @Override
    public void output(){
        for (int j : p) {
            if(j!=0){
                System.out.print(j + " ");
            }
        }
    }
}
