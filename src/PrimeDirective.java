import java.util.ArrayList;

public class PrimeDirective {
    public boolean isPrime(int numbers){
        if (numbers == 2){
            return true;
        } else if (numbers < 2) {
            return false;

        }else
        for (int i = 2; i < numbers; i++){
            if (numbers % i == 0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> OnlyPrime(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(7));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(2));
        System.out.println(pd.isPrime(0));
        System.out.println(pd.OnlyPrime(numbers));
    }
}
