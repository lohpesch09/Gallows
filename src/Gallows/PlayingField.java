package Gallows;

import java.util.ArrayList;

public class PlayingField {
    public ArrayList<Character> underlines;//создаю массив, который заполню нижними подчёркиваниями
    public ArrayList<Character> wordGuessingProgress;//создаю изменяемый массив, который буду заполнять
//буквами, которые уже отгаданы и пробелами на местах ещё не открытых букв
    public PlayingField(HiddenWord hiddenWord) {//передаю в конструктор загаданное слово и по его размеру заполняю массив
        underlines = new ArrayList<>();
        wordGuessingProgress = new ArrayList<>();
        for (int i = 0; i < hiddenWord.word.length(); i++){//нижними подчёркиваниями, а массив для букв просто пробелами
            underlines.add('_');
            wordGuessingProgress.add(' ');
        }
    }
    public void changingProgress(ComparatorLetterAndHiddenWord comparatorLetterAndHiddenWord, Gamer gamer){
        for (int i = 0; i < comparatorLetterAndHiddenWord.numbersGuessedLetters.size(); i++){//передаю в этот метод массив
            wordGuessingProgress.set(comparatorLetterAndHiddenWord.numbersGuessedLetters.get(i), gamer.letter);//с индексами отгаданных букв и в массиве с пробелами на местах
        }//равных этим индексам ставлю введённую пользователем букву
    }
    public void printField(){//этот метод просто выводит сначала массив с подчёркиваниями
        for (Character underline : underlines) {
            System.out.print(underline);// а затем массив с пробелами и отгаданными буквами
        }
        System.out.print("\n");
        for (Character guessingProgress : wordGuessingProgress) {
            System.out.print(guessingProgress);
        }
        System.out.println("\n");
    }
}
