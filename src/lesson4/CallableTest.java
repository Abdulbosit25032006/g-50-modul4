package lesson4;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        transfer("8600","9860",50000);
        long end = System.currentTimeMillis();

        System.out.println(end - begin);

    }

    public static void transfer(String fromCard,String toCard,long amount){

        try {
            ExecutorService executorService = Executors.newFixedThreadPool(3);

            Callable<Boolean> validFromCardCallable = ()-> cardCheck(fromCard);
            Callable<Boolean> validToCardCallable = ()-> cardCheck(fromCard);
            Callable<Boolean> chackedBalanceFromCardCallableCallable = ()-> checkBalance(fromCard);

            Future<Boolean> validFromCardFuture = executorService.submit(validFromCardCallable);
            Future<Boolean> validToCardFuture = executorService.submit(validToCardCallable);
            Future<Boolean> checkedBalanceFromCardFuture = executorService.submit(chackedBalanceFromCardCallableCallable);

            Boolean validFromCard = validFromCardFuture.get();
            Boolean validToCard = validToCardFuture.get();
            Boolean checkedBalanceFromCard = checkedBalanceFromCardFuture.get();


            if (validFromCard && validToCard && checkedBalanceFromCard){
                System.out.println("Transacting....");
                Thread.sleep(2000);

            }

            executorService.shutdown();


        }catch (Exception e){

        }


    }

    private static Boolean checkBalance(String fromCard) {
        System.out.println("checked balance ....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    private static Boolean cardCheck(String fromCard) {
        System.out.println(" card checked  ....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }




}
