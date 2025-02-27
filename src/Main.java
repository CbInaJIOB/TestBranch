public class Main {
    public static String checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " год - високосный год";
        } else {
            return year + " год - не високосный год";
        }
    }

    public static void checkOSandDate(int clientOS, int clientDeviceYear) {
        if ((clientOS == 1) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((clientOS == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((clientOS == 0) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOS == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static String deliveryTime(int deliveryDistance) {
        int deliveryDay = 0;
        if (deliveryDistance < 20) {
            deliveryDay++;
            return "Потребуется дней: " + deliveryDay;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay = deliveryDay + 2;
            return "Потребуется дней: " + deliveryDay;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay = deliveryDay + 3;
            return "Потребуется дней: " + deliveryDay;
        } else {
            return "Доставки нет";
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2023;
        System.out.println(checkYear(year));

        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2017;
        checkOSandDate(clientOS, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance  = 95;
        System.out.println(deliveryTime(deliveryDistance));
    }
}