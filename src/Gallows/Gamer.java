package Gallows;

import java.util.ArrayList;
import java.util.Scanner;

public class Gamer {
    char letter;
    ArrayList<Character> arrayOfLetters;

    public Gamer() {
        arrayOfLetters = new ArrayList<>();
    }

    public void showAlreadyEnteredLetters() {//этот метод показывает уже введённые пользователем буквы
        System.out.println("\nУже введённые вами буквы: ");//здесь по сути просто вызывается атрибут класса массив введённых
        for (int i = 0; i < arrayOfLetters.size(); i++) {//букв и идёт поэлементное выведение и всё
            if (i < arrayOfLetters.size() - 1) {
                System.out.print(arrayOfLetters.get(i) + ", ");
            }
            else{
                System.out.println(arrayOfLetters.get(i));
            }
        }
    }

    public void setLetter() {
        String enteredString;
        do {
            this.showAlreadyEnteredLetters();//здесь вызывается метод, который был описан выше, для текущего объекта, чтобы вывести уже введённые буквы
            System.out.println("Введите только одну букву, которая не вводилась ранее: ");
            Scanner in = new Scanner(System.in); //на этом этапе пользователем вводится буква в консоль
            enteredString = in.nextLine();//сюда записывается строка, которая вводится пользователем
            letter = enteredString.charAt(0); // нулевой элемент введённой строки записывается в атрибут letter
        } while (arrayOfLetters.contains(letter) || enteredString.length() != 1);//цикл будет выполняться, пока введённая
        //буква есть в массиве ужё введённых, либо если пользователь ввёл больше одного символа(эта та ошибка, на которую ты мне указал ещё в прошлый раз)
        arrayOfLetters.add(letter); //если цикл выполнился и всё хорошо, введённая буква добавится в массив уже введённых
        //чтобы выводить их потом
    }


}
