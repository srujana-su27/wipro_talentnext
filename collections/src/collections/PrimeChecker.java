package collections;

interface PrimeChecker {
 String check(int num);
}

class NumberChecker {

 public String checkPrime(int num) {
     boolean isPrime = true;
     if (num <= 1) {
         isPrime = false;
     } else {
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) {
                 isPrime = false;
                 break;
             }
         }
     }
     return isPrime ? "Prime" : "Not Prime";
 }
}

class MyMainDemo {
 public static void main(String[] args) {
     NumberChecker checkerInstance = new NumberChecker();
     
     PrimeChecker checker = checkerInstance::checkPrime;
    
     System.out.println(checker.check(11)); 
     System.out.println(checker.check(12)); 
 }
}