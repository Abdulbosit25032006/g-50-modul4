package lesson4Homework.task4;

import java.util.concurrent.*;

public class UserService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /// single
//        UserService userService = new UserService();
//
//        long start = System.currentTimeMillis();
//        userService.register();
//        long end = System.currentTimeMillis();
//
//        System.out.println("Time : " + (end - start));
//

        /// Callable
        ExecutorService executor = Executors.newFixedThreadPool(3);

        long startTime = System.currentTimeMillis();

        Future<User> saveUserFuture = executor.submit(() -> saveUser());
        Future<String> generateCodeFuture = executor.submit(() -> generateCode());
        Future<Boolean> sendInviteFuture = executor.submit(() -> sendInviteText());

        User user = saveUserFuture.get();
        String code = generateCodeFuture.get();
        boolean sent = sendInviteFuture.get();

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Future-based execution: " + timeTaken + " ms");

        executor.shutdown();


    }

    private void register() {

        User user = saveUser();
        String code = generateCode();
        Boolean cent = sendInviteText();


    }

    private static Boolean sendInviteText() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    private static String generateCode() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "code156";

    }

    private static User saveUser() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new User();
    }
}
