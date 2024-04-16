package Gallows;

public class CheckIfWin {
    public int numberOfSpaces;
    public boolean win;
    public CheckIfWin() {
    }
    public void countingSpaces(PlayingField playingField){//в этот метод мы передаём объект класса нашего игрового поля и затем в цикле извлекается массив,
        for(int i = 0; i < playingField.wordGuessingProgress.size(); i++){//где на месте ещё не отгаданных букв стоят пробелы, которые этот метод и подсчитывает
            if(playingField.wordGuessingProgress.get(i) == ' '){
                numberOfSpaces++;
            }
        }
    }
    public boolean winOrNot(){
        if(numberOfSpaces == 0){//если количество пробелов получилось равно 0, то пользователь выиграл, а атрибуту win присвоится true,
            System.out.println("Вы выиграли! Поздравляем!");
            win = true;
        }
        else{//если не равно 0, то присвоится false
            win = false;
        }
        return win;//возвращаем атрибут win в main и если будет true, то я там прописываю break и цикл текущей игры завершится
    }
}
