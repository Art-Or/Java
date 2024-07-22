import java.util.Scanner;

class Anagram
{
    private String x;

    //геттер
    public String getX() {
        return x;
    }

    //сеттер
    public void setX(String x) 
    {
        this.x = x;
    }

    // рабочий метод
    public String toAnagram(String data)
    {
        char[] arr = data.toCharArray();

        for(int i=0; i< arr.length/2; i++)
        {
            if (!Character.isDigit(arr[i]) && !Character.isDigit(arr[arr.length-1-i])) 
            {
                char buffer = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = buffer;
            }
        }

        return new String(arr);
    }
}

public class Program {
    public static void main(String[] args) {

        //сразу создал новый объект класса
        Anagram anagram = new Anagram();
        
        //это для ввода исходника
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string:");
        anagram.setX(in.nextLine());            //записываем введенный исходник в класс
        in.close();
        
        //запускаем решение и сразу ловим ответ в переменную
        String answer = anagram.toAnagram(anagram.getX());

        //вывод результата
        System.out.println(anagram.getX() + " -> " + answer);
    }
}