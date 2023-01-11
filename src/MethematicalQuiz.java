import java.util.Random;

public class MethematicalQuiz
{
    public void start() {
        System.out.println("Добро пожаловать на математическую викторину \n выполните арифметические примеры :");
        Random random = new Random();
        for (int questionIndex = 1; questionIndex <= 10; questionIndex++) {
            int mathOperationIndex = random.nextInt(4);
            int number1 = random.nextInt(11, 100);
            int number2 = random.nextInt(1, 10);


            if (mathOperationIndex == 0) {
                int division = number1 / number2;
                System.out.println(number1 + "/" + number2);
                System.out.println("Ответ :" + division);
            }
            if (mathOperationIndex == 1) {
                int multiplication = number1 * number2;
                System.out.println(number1 + "*" + number2);
                System.out.println("Ответ :" + multiplication);
            }
            if (mathOperationIndex == 2) {
                int subtraction = number1 + number2;
                System.out.println(number1 + "+" + number2);
                System.out.println("Ответ :" + subtraction);
            }
            if (mathOperationIndex == 3) {
                int division = number1 - number2;
                System.out.println(number1 + "-" + number2);
                System.out.println("Ответ :" + division);
            }
        }

    }
}
