package Gallows;

import java.util.ArrayList;

public class ComparatorLetterAndHiddenWord {
    int numberOfErrors;
    public ComparatorLetterAndHiddenWord() {//здесь будем сравнивать введённую пользователем букву и загаданное слово
    }
    ArrayList<Character> numbersGuessedLetters = new ArrayList<>();//в этот массив будут записываться индексы тех
    //элементов, которые совпадут с введённой пользователем буквой
    public void compare(HiddenWord hiddenWord, Gamer gamer){
        int numberOfMatches = 0;// в эту переменную будет записываться количество совпадений введённой игроком буквы
        //с буквами в загаданном слове
        for(int i = 0; i < hiddenWord.word.length(); i++){
            if(hiddenWord.word.charAt(i) == gamer.letter){//если буква совпадает с буквой слова, увеличиваем значение
                numberOfMatches++;//счётчика на единицу
                numbersGuessedLetters.add((char) i);//в массив записываем индекс буквы, которая совпала со введённой
            }
        }
        if(numberOfMatches > 0){
            System.out.println("В загаданном слове есть такая буква!");
        }
        else{
            System.out.println("в загаданном слове нет такой буквы(");
            numberOfErrors++;//это значение будет потом вызываться в main, чтобы передать в основной счётчик ошибок, который уже будет передаваться в учловие while
        }
    }
}
