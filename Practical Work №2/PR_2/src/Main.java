import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Перевернуть строку");
                System.out.println("2. Умножение чисел");
                System.out.println("3. Показать информацию о книге");
                System.out.println("4. Установить и получить цену продукта");
                System.out.println("5. Включить устройство");
                System.out.println("0. Выйти");

                System.out.print("Введите номер действия: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        reverseString(scanner);
                        break;
                    case 2:
                        multiplyNumbers(scanner);
                        break;
                    case 3:
                        showBookInfo(scanner);
                        break;
                    case 4:
                        setAndGetProductPrice(scanner);
                        break;
                    case 5:
                        powerOnDevice(scanner);
                        break;
                    case 0:
                        exit = true;
                        System.out.println("Выход из программы...");
                        break;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
                }
            }

            scanner.close();
        }

        private static void reverseString(Scanner scanner) {
            System.out.print("Введите строку для переворота: ");
            String input = scanner.nextLine();
            System.out.println("Перевернутая строка: " + StringOpposite.reverseString(input));
        }

        private static void multiplyNumbers(Scanner scanner) {
            Calculator calculator = new Calculator();
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println("Результат умножения: " + calculator.multiply(a, b));
        }

        private static void showBookInfo(Scanner scanner) {
            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.print("Введите автора книги: ");
            String author = scanner.nextLine();
            Book book = new Book(title, author);
            book.displayInfo();
        }

        private static void setAndGetProductPrice(Scanner scanner) {
            Product product = new Product();
            System.out.print("Введите цену продукта: ");
            double price = scanner.nextDouble();
            product.setPrice(price);
            System.out.println("Цена продукта: " + product.getPrice());
        }

        private static void powerOnDevice(Scanner scanner) {
            System.out.println("Выберите устройство для включения:");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Laptop");
            int choice = scanner.nextInt();

            Device device;
            if (choice == 1) {
                device = new Smartphone();
            } else if (choice == 2) {
                device = new Laptop();
            } else {
                System.out.println("Неверный выбор.");
                return;
            }

            device.powerOn();
        }

}