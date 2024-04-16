package Gallows;

import java.util.Scanner;

public class Start {
    public Start() {
    }
    public void startGame() {//этот метод запускает игру, как ты мог догадаться
        String enter;
        do {//с помощью этого цикла я пофиксил проблему, на которую ты указал мне в прошлый раз
            System.out.println("Напишите 'да', если хотите начать новую игру или 'нет', если хотите выйти из игры.");
            Scanner in = new Scanner(System.in);//здесь вводится строка
            enter = in.nextLine();
        }while(!(enter.equals("да") || enter.equals("нет")));//если строка не является одной из тех, которые мы ожидаем, то есть либо "да" либо "нет", то цикл запускается опять
        if (enter.equals("нет")){//если "нет", то программа просто завершается
            System.out.println("До новых встреч!");
            System.exit(0);
        }
    }
    public String restartGame() {//этот метод рестартит игру
        String enter;
        do {//по сути цикл здесь в точночти такой же, но метод возвращает строку, которая так же должна быть либо "да" либо "нет", и она передаётся уже в условие while
            System.out.println("Напишите 'да', если хотите начать новую игру или 'нет', если хотите выйти из игры.");
            Scanner in = new Scanner(System.in);
            enter = in.nextLine();
        }while(!(enter.equals("да") || enter.equals("нет")));
        return enter;
    }
}
