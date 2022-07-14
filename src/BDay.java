import java.util.Scanner;

public class BDay {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] congrats = {"Здоровья физического и ментального!", "Роста и развития личностного и карьерного!", "Сил и терпения на пути к достижению целей!", "Невыносимой лёгкости бытия!"};
        System.out.println("С днём Рождения, птичка!");
        System.out.println("Чтобы получить поздравления введи число от 0 до 3");
        while (true) {
            try {
                int z = scanner.nextInt();
                if (z == 5) break;
                System.out.println(congrats[z] + " ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Остальные поздравления не для тебя, пиши числа от 0 до 3");
            } finally {
                Thread.sleep(3000);
                System.out.println("Ето была шутка, ты не понял");
            }
        }
    }
}