package quru.qa.hw;

public class Main {

    public static void main(String[] args) {

        int x = 28;
        int y = 5;

        //Переполнение
        byte testByte = 120;
        byte testByte2 = 20;
        byte result = (byte) (testByte + testByte2);
        System.out.println(result);

        //Сложение
        int testInt = -99;
        double testDouble = 2.33;
        double additionResult = testInt + testDouble;
        System.out.println(additionResult);

        //Вычитание
        int subtractionResult = y - x;
        System.out.println(subtractionResult);

        //Умножение
        int multiplicationResult = x * y;
        System.out.println(multiplicationResult);

        //Деление
        int divisionResult = x / y;
        System.out.println(divisionResult);

        //Остаток от деления
        int divisionRemainder = x % y;
        System.out.println(divisionRemainder);

        //Логические опараторы
        int a = 3;
        int b = 8;
        int c = 10;

        if (a < b) {
            System.out.println("A is less than B");
        } else if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("A is equal to B");
        }

        if (a < b && a < c) {
            System.out.println("A is lesser than B, A is lesser than C");
        } else {
            System.out.println("A is not lesser than B, A is not lesser than C");
        }

        String hiStr = "Hi";
        String helloStr = "Hello";

        if (hiStr.equals("Hi") || helloStr.equals("Hello")) {
            System.out.println("At least one string is equal to its value");
        } else {
            System.out.println("Neither string is equal to its value");
        }

        int employmentTimeInMonths = 5;
        boolean isEmployeeGotBonusThreeMonthPrior = false;
        if (!isEmployeeGotBonusThreeMonthPrior && employmentTimeInMonths >= 6) {
            System.out.println("Employee gets a bonus");
        } else if (isEmployeeGotBonusThreeMonthPrior){
            System.out.println("You've already got a bonus");
        } else if (employmentTimeInMonths <= 6){
            System.out.println("You are required to be employed for at lest six months to get a bonus");
        }

    }

}
