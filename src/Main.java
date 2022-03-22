public class Main {
    public static void main(String[] args) {
        //Объявляете переменные для входных данных и параметров программы:
        int tiketPrice = 100; // хранение стоимости 1 билета
        int bonusMile = 20; //хранения количества 20р = 1миля
        // Рассчитываете количество бонусных милль и выводим на экран
        System.out.println("Количество бонусных миль:" + (tiketPrice / bonusMile));
    }
}
