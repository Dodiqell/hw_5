public class Main {
    public static void main(String[] args) {
        //Задача 1-2

        int iOs = 0;
        int android = 1;
        int checkyear = 2015;

        int clientOs = 1;
        int clientYear = 2016;

        if (clientOs == 1) {
            if (clientYear <= checkyear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientYear > checkyear) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");

            } else if (clientOs == 2) {
                if (clientYear <= checkyear) {
                    System.out.println("Установите облегченную версию приложения для android по ссылке");
                } else if (clientYear > checkyear) {
                    System.out.println("Установите обычную версию приложения для android по ссылке");
                }
            }
        }
        //Задача 3
        int year = 2023;
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Високосный год");
        } else {
                    System.out.println("Не високосный год");
                }
        //Задача 5
        int month = 13;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Весна");
            default:
                System.out.println("Введите число от 1 до 12");
        }




            }
        }

