//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Он не досиг совершеннолетия, нужно немного подождать");
        }


        int temperature = -14;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }



        int speed = 90;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }



        int age1 = 15;
        if (age1 >= 2 && age1 <=6){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17){
            System.out.println("если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        if (age1 > 24){
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }



        int age2 = 16;
        if (age2 < 5){
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на атракционе");
        }
        if (age2 >= 5 && age2 < 14){
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на атракционе только в сопровождении возрослого");
        }
        if (age2 >= 14){
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }



        int quantity = 47;
        int capacity = 102;
        int sedentary = 60;
        if (quantity <= capacity && quantity <= sedentary){
            System.out.println("В вагоне есть сидячии места");
        } else if (quantity <= capacity && quantity > sedentary){
            System.out.println("В вагоне нет сидячих, но есть стоячии места");
        } else {
            System.out.println("В вагоне мест нет");
        }



        int one = 47;
        int two = 11;
        int three = 345;
        if (one > two && one > three){
            System.out.println("one");
        } else if (two > one && two > three){
            System.out.println("two");
        } else if (three > one && three > two){
            System.out.println("three");
        }





    }
}