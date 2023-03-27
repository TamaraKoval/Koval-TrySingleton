import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size, max, f;

        logger.log("Запускаем программу");
        logger.log("Приветствуем пользователя");
        System.out.println("Добро пожаловать!");
        try {
            logger.log("Просим пользователя ввести размер списка");
            System.out.println("Введите размер списка: ");
            size = Integer.parseInt(scanner.nextLine());
            logger.log("Пользователь ввел размер списка");
            logger.log("Просим пользователя ввести верхнюю границу значений элементов в списке");
            System.out.println("Введите верхнюю границу значений элементов в списке: ");
            max = Integer.parseInt(scanner.nextLine());
            logger.log("Пользователь ввел верхнюю границу значений элементов в списке");
            logger.log("Создаем список и наполняем его значениями");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(random.nextInt(max));
            }
            logger.log("Выводим на экран полученный список");
            System.out.println("Вот полученный список случайных чисел: " + list);
            logger.log("Просим пользователя ввести число для фильтрации списка");
            System.out.println("Введите число для фильтрации списка: ");
            f = Integer.parseInt(scanner.nextLine());
            logger.log("Пользователь ввел число для фильтрации списка");
            Filter filter = new Filter(f);
            logger.log("Запускаем фильтрацию");
            List<Integer> filteredList = new ArrayList<>(filter.filterOut(list));
            logger.log("Выводим на экран отфильтрованный список");
            System.out.println("Отфильтрованный список: " + filteredList);
            logger.log("Завершаем программу");
        } catch (NumberFormatException exception) {
            System.out.println("Вы вводите не цифры, а что-то другое! Повторите попытку");
        }
    }
}