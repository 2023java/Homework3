public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task1(){
        System.out.println("Задача 1");
        byte A = 100;
        short B = 1000;
        int C = 1000000;
        long D = 6969696969L;
        float E = 3.14F;
        double F = 3.14159265358979323846264338327950288419716939937510;
        System.out.println("Значение переменной A с типом byte равно " + A);
        System.out.println("Значение переменной B с типом short равно " + B);
        System.out.println("Значение переменной C с типом int равно " + C);
        System.out.println("Значение переменной D с типом long равно " + D);
        System.out.println("Значение переменной E с типом float равно " + E);
        System.out.println("Значение переменной F с типом double равно " + F);
    }
    public static void task2(){
        System.out.println("Задача 2");
        float A = 27.12f;
        long B = 987678965549L;
        float C = 2.786f;
        short D = 569;
        short E = -159;
        short F = 27897;
        byte G = 67;
        System.out.println("Значение переменной A с типом float равно " + A);
        System.out.println("Значение переменной B с типом long равно " + B);
        System.out.println("Значение переменной C с типом float равно " + C);
        System.out.println("Значение переменной D с типом short равно " + D);
        System.out.println("Значение переменной E с типом short равно " + E);
        System.out.println("Значение переменной F с типом short равно " + F);
        System.out.println("Значение переменной G с типом byte равно " + G);
    }
    public static void task3(){
        System.out.println("Задача 3");
        byte a = 23;
        byte b = 27;
        byte c = 30;
        short l = 480;
        int allStudents = a+b+c;
        int numberOfSheetsPerStudent = l/allStudents;
        System.out.println("На каждого ученика рассчитано " + numberOfSheetsPerStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottlePerformance = 16;
        byte time0 = 2;
        int speed = bottlePerformance / time0;
        byte time1 = 20;
        short time2 = 24 * 60;
        short time3 = 3 * 24 * 60;
        int time4 = 24 * 60 * 31;
        int a = speed * time1;
        System.out.println("За " + time1 + " минут машина произвела " + a + " штук бутылок");
        int b = speed * time2;
        System.out.println("За " + time2 + " минут машина произвела " + b + " штук бутылок");
        int c = speed * time3;
        System.out.println("За " + time3 + " минут машина произвела " + c + " штук бутылок");
        int d = speed * time4;
        System.out.println("За " + time4 + " минут машина произвела " + d + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte cansOfPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintForClass = whitePaint + brownPaint;
        int classrooms = cansOfPaint/paintForClass;
        int totalWhitePaint = classrooms * whitePaint;
        int totalBrownPaint = classrooms * brownPaint;
        System.out.println("В школе, где " + classrooms +" классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananas = 5*80;
        short milk = 200/100*105;
        short iceCream = 2*100;
        short rawEggs = 4*70;
        int weightInGrams = bananas + milk + iceCream + rawEggs;
        float  weightInKilograms = weightInGrams/1000f;
        System.out.println("Результат в граммах: " + weightInGrams );
        System.out.println("Результат в килограммах: " + weightInKilograms );
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte excessWeight = 7;
        float a = 0.250f;
        float b = 0.500f;
        float varA = excessWeight / a;
        float varB = excessWeight / b;
        float averageNumberOfDays = ( varA + varB ) / 2;
        System.out.println( varA + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println( varB + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println( "В среднем " + averageNumberOfDays + " день уйдет на похудение");
    }
    public static void task8() {
        System.out.println("Задача 7.1");
        short excessWeight = 7000;
        short a = 250;
        short b = 500;
        int varA = excessWeight / a;
        int varB = excessWeight / b;
        int averageNumberOfDays = ( varA + varB ) / 2;
        System.out.println( varA + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println( varB + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println( "В среднем " + averageNumberOfDays + " день уйдет на похудение");
    }
    public static void task9() {
        System.out.println("Задача 8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76320;
        int yearSalaryM = salaryM * 12;
        int yearSalaryD = salaryD * 12;
        int yearSalaryK = salaryK * 12;
        float newSalaryM = salaryM * 1.1f;
        float newSalaryD = salaryD * 1.1f;
        float newSalaryK = salaryK * 1.1f;
        float newYearSalaryM = newSalaryM * 12;
        float newYearSalaryD = newSalaryD * 12;
        float newYearSalaryK = newSalaryK * 12;
        float differenceM = newYearSalaryM - yearSalaryM;
        float differenceD = newYearSalaryD - yearSalaryD;
        float differenceK = newYearSalaryK - yearSalaryK;
        System.out.println("Маша теперь получает " + newSalaryM + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + newSalaryD + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryK + " рублей. Годовой доход вырос на " + differenceK + " рублей");
    }


}