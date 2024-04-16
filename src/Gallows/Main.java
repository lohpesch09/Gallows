package Gallows;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {//здесь пришлось прописать тоже это ебучее исключение
        Start start = new Start();//создаём объект старта игры))
        start.startGame();//метод старта игры, который в случае "да" просто продолжает программу, а в случае "нет" завершает её
        String enter = "да";//здесь если программа продолжилась, то я присваиваю enter значение "да", чтобы передать его в условие while
        //и тем самым начать игру. В следующий раз значение enter будет изменено после выполнения start.restartGame() и если пользователь ответит "нет", то игра завершится как и в начале, а если "да", то продолжится
        while(enter.equals("да")){//соответственно цикл, который проверяет значение enter
            int numberOfErrors = 0;//счётчик числа ошибок
            HiddenWord hiddenWord = new HiddenWord();//создаём объект загаданного слова
            hiddenWord.generationWord();//генерируем слово
            hiddenWord.outputEmptyField();//выводим подчёркивания
            Gamer gamer = new Gamer();//создаём объект игрок
            PlayingField playingField = new PlayingField(hiddenWord);//создаём объект игровое поле и передаём туда объект
            ConstructionOfGallows constructionOfGallows = new ConstructionOfGallows();//создаём объект построения виселицы
            while(numberOfErrors < 10){//цикл, который будет перезапускаться, пока не наберётся 10 ошибок
                gamer.setLetter();//пользователь вводит букву
                ComparatorLetterAndHiddenWord comparatorLetterAndHiddenWord = new ComparatorLetterAndHiddenWord();//создаём объект сравнения введённой буквы и загаданного слова
                comparatorLetterAndHiddenWord.compare(hiddenWord, gamer);//сравниваем, передавая объект игрока и загаданного слова
                numberOfErrors += comparatorLetterAndHiddenWord.numberOfErrors;//так как в каждом новом цикле создаётся новый объект сравнения, то атрибут numberOfErrors в нём будет либо 0 либо 1 каждый раз, поэтому для numberOfErrors в оновном методе main необходимо именно суммировать
                playingField.changingProgress(comparatorLetterAndHiddenWord, gamer);//здесь мы записываем в массив с пробелами отгаданные буквы, если они есть
                playingField.printField();//выводим этот массив, а так же массив с подчёркиваниями
                constructionOfGallows.construction(numberOfErrors);//стром виселицу в зависимости от числа ошибок
                CheckIfWin checkIfWin = new CheckIfWin();//создаём объект проверки выигрыша
                checkIfWin.countingSpaces(playingField);//считаем пробелы
                checkIfWin.winOrNot();//проверяем если выиграли, где как раз атрибуту win внутри этого метода и будет присваиваться либо true либо false
                if(checkIfWin.win == true){//если присвоили true то из-за break текущая игра завершится и выведется сообщение о победе
                    break;
                }
            }
            if(numberOfErrors == 10){//если вышли из цикла текущей игры, то проверяем сколько ошибок. Если набралось 10, то сообщение о проигрыше
                System.out.println("Вы проиграли!((");
                System.out.println("Загаданное слово было: " + hiddenWord.word);//ну тут, в случае проигрыша, ещё можно вывесли слово, которое было загадано
            }
            enter = start.restartGame();//перезапуск игры, работает по аналогии с запуском
        }
    }
}
