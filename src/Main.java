import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarCrud cruds = null;
        cruds.add(new Car(1L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.BMW));
        cruds.add(new Car(2L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(3L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(4L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(5L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(6L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(7L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(8L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(9L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
        cruds.add(new Car(10L, "bmw", "m7", 400.00, LocalDate.of(2002, 1, 14), CarType.MERCEDES));
//
//        Car[] all = cruds.getAll();
//        for (Car car : all){
//            System.out.println(car);
//        }
        System.out.println("///////////////////////////////////");

        cruds.getBayId(5L);
//cruds.updateCar(4L,new Car(4L,"bmw","M5",50000.00,LocalDate.of(1999,12,2),CarType.BMW));

//        cruds.deleteCar(10L);
//        System.out.println(cruds.getAll());
    }

}


