public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age;
        age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int outsideTemperature;
        outsideTemperature = 18;
        if (outsideTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        if (outsideTemperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed;
        speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 28;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        } else if (age >= 19 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 7;
        boolean haveParent = true;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14 && haveParent) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age >= 5 && age < 14 && !haveParent) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе, нет взрослого.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе самому.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int passengersNumber = 98;
        int totalPlace = 102;
        int seatPlase = 60;
        if (passengersNumber > 0 && passengersNumber <= seatPlase) {
            System.out.println("Есть сидячие места в вагоне");
        } else if (passengersNumber > 60 && passengersNumber <= 101) {
            System.out.println("В вагоне только стоячие места");
        } else if (passengersNumber > 102) {
            System.out.println("В вагоне нет мест");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 40;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }
    }
}