package Gallows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class HiddenWord {
    String word;
    public HiddenWord() {
    }
    public void generationWord() throws IOException {//так, брат, вот тут если четсно, я пока с try и catch не супер мега разобрался, хотя я представляю чё они должны как бы делать, но в этом случае мне компилтор сам подсказал, что в методе нужно прописать исключение
        try {
            List<String> directory = Files.readAllLines(Path.of("C:\\Users\\lohpe\\OneDrive\\Рабочий стол\\джава\\словарь.txt"));
        }
        catch (IOException e) {
            System.out.println("Ошибка! Файл не найден!");
        }
        finally {//вот здесь пишется хуйня, которая выполнится в любом случае, как я понимаю
            List<String> directory = Files.readAllLines(Path.of("C:\\Users\\lohpe\\OneDrive\\Рабочий стол\\джава\\словарь.txt"));
            //вытаскиваем словарь из файла и записываем в коллекцию
            Random randomizer = new Random();
            do {
                word = directory.get(randomizer.nextInt(directory.size())); //в атрибут word записывается случайно
            } while (word.length() <= 5);// сгенерированное слово длинною больше пяти букв, чтобы не было слишком коротким
        }
    }
    public void outputEmptyField(){//этот метод выводит подчёркивания в количестве равном количеству букв в загаданном слове
        StringBuilder emptyField = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            emptyField.append('_');
        }
        System.out.println("Слово загадано: " + emptyField);
    }
}
