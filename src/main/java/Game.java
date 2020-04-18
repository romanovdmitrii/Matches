import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private static int COUNT = 20;
    private static int COMPUTER_COUNT;
    private static int USER_COUNT;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void startGame() {
        System.out.println("На столе осталось " + COUNT + " спичек");
        while (COUNT > 1) {
            COUNT -= computerRun(COUNT);
            if (winner(COUNT)) {
                System.out.println("Для игрока осталась последняя спичка. Игрок проиграл");
                break;
            } else {
                System.out.println("На столе осталось " + COUNT + " спичек");
                userRun();
                COUNT -= USER_COUNT;

                System.out.println("На столе осталось " + COUNT + " спичек");
            }
        }
    }

    public boolean winner(int count) {
        return count == 1;
    }

    public int computerRun(int count) {
        if (count >= 12) {
            COMPUTER_COUNT = 3;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }

        if (count == 11) {
            COMPUTER_COUNT = 2;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }
        if (count == 10) {
            COMPUTER_COUNT = 1;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }
        if (count == 8) {
            COMPUTER_COUNT = 3;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }
        if (count == 7) {
            COMPUTER_COUNT = 2;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }
        if (count == 6) {
            COMPUTER_COUNT = 1;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }
        if (count == 4) {
            COMPUTER_COUNT = 3;
            System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
            return COMPUTER_COUNT;
        }
        if (count == 3) {
            COMPUTER_COUNT = 2;
        } else {
            COMPUTER_COUNT = 1;
        }
        System.out.println("- Количество выбранных компьютером спичек = " + COMPUTER_COUNT);
        return COMPUTER_COUNT;
    }

    public void userRun() {
        do {
            try {
                System.out.print("- Ход игрока. Введите количество спичек: ");
                USER_COUNT = Integer.parseInt(reader.readLine());
                if (USER_COUNT < 1 || USER_COUNT > 3) {
                    System.out.println("Некорректное количество спичек!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Вы не ввели число");
            }
        } while (true);
    }
}