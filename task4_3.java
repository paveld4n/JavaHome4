
import java.util.Scanner;
import java.util.LinkedList;

public class task4_3 {
    public static void main(String[] args) {
        LinkedList<Double> resList = new LinkedList<Double>();  // Создаем список
        try (Scanner sc = new Scanner(System.in)) {             // Создаем сканер
            System.out.print("Введите первое число: ");
            resList.add(sc.nextDouble());  // Добавляем первое число в список
            sc.nextLine();
//  Находимся в цикле, пока запущен калькулятор
            while(true) {  
                System.out.print("Выберите действие ( +, -, *, / ) \n или клавишу [C] для отмены последнего действия: ");
                String lastSymb = sc.nextLine();     // Вводим действие     

                if ("C".equals(lastSymb) || "c".equals(lastSymb)) {  // Если введена отмена, удаляем из списка последний элемент
                    resList.removeFirst();

                    if (resList.isEmpty()) resList.add(0.0);  // Если список пустой, добавляем ноль
                    }
                else {
                    System.out.print("Введите второе число: ");  
                    double num2 = sc.nextDouble();  //  Добавляем второе число в список

                    calculate(resList, lastSymb, num2);  //  Проводим расчет
                    sc.nextLine();   //  седующее действие
                    }

                System.out.println("Результат: " + resList.getFirst());  // Выводим результат             
            }
        }
    }

    public static void calculate(LinkedList<Double> resList, String lastSymb, double num2) {  // Ф-ция расчета
        double res = resList.getFirst();      //  Переменная для вывода промежуточного результата
        switch (lastSymb) {                 // Получаем последний добавленный элемент списка и проводим выбранное действие
            
            case "+":
                resList.add(0, resList.getFirst() + num2);
                System.out.printf(res + " " + lastSymb + " " + num2 + " = " + resList.getFirst() + "\n");               
                break;
            
            case "-":
                resList.add(0, resList.getFirst() - num2);
                System.out.printf(res + " " + lastSymb + " " + num2 + " = " + resList.getFirst() + "\n"); 
                break;

            case "*":
                resList.add(0, resList.getFirst() * num2);
                System.out.printf(res + " " + lastSymb + " " + num2 + " = " + resList.getFirst() + "\n");   
                break;
            
            case "/":
                if (num2 == 0) {       // Исключаем деление на ноль
                    System.out.println("Ошибка! На ноль делить нельзя");
                    break;
                }
                resList.add(0, resList.getFirst() / num2);
                System.out.printf(res + " " + lastSymb + " " + num2 + " = " + resList.getFirst() + "\n");  
                break;
            
            default:
                System.out.println("Ошибка! Повториете ввод! ");
        }
    }
}

