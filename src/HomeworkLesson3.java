import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson3
{


    static  void   guessTheWord (String hiddenWord)
    {

        Scanner scanner = new Scanner(System.in);
        String word;  //Введённое пользовательм слово
        //Заполнение подсказки "#"
        char[] outputLine = new char[15];
        for (int i = 0; i < outputLine.length; i++)
        {
            outputLine[i] = '#';
        }
        System.out.println("Загаданное слово: " + hiddenWord );
        System.out.println("Попробуйте угадать, заданое слово");
        char[] hiddenWords = hiddenWord.toCharArray();
        while (true)
        {
            System.out.print("Введите слово либо 0 для выхода: ");
            word = scanner.nextLine();
            char[] inputChar = word.toCharArray(); //Разбитие введённого слова на символы
            if (word.equals("0"))
            {
                break;
            }
            if (word.equals(hiddenWord))
            {
                System.out.println("Поздравляю!Вы угадали!");
                break;
            }
            else
            {
                System.out.println("Вы не угадали!");
                for (int i = 0; i < hiddenWords.length; i++)
                {
                    if (i >= inputChar.length)
                    {
                        break;
                    }
                    if (hiddenWords[i] == inputChar[i])
                    {
                        outputLine[i]=hiddenWords[i];
                    }
                }
                System.out.println(String.valueOf(outputLine));
            }
        }
    }


    public static void main(String[] args) {

        Random rnd = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        System.out.println(Arrays.toString(words));
        int n = rnd.nextInt(words.length);
        guessTheWord(words[n]);

    }
}
