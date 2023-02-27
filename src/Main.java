import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //создаем экземпляр класса Wine
        Wine w1 = new Wine("Hospices de Beaune","Casella Wines","France", LocalDate.of(2017,2,2));


       Binodel binodel=new Binodel("Alamos","Nomer: 717273","Italiya",LocalDate.of(2021,12,20),"PJJ");
       w1.calculationOfExposure(LocalDate.of(2021,12,1));


        //и выводим результат на консоль
        System.out.println("Выдержка вина под названием " + w1.getName()+ " составляет " + binodel.getDateSpill() + " дней");
        System.out.println("Его торговая марка: " + binodel.getTrademark());
        System.out.println("Страна производства: " + binodel.getCountry());
        System.out.println("Примечание: " + binodel.getNote());

    }
}
