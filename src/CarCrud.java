import java.util.Arrays;

public class CarCrud {
    private Car[] dtCsrs = new Car[10];
    private static int saze = 0;

    public void add(Car newCar) {
        this.dtCsrs[saze++] = newCar;

        System.out.println("saccesful car");

    }

    public Car[] getAll() {
        boolean isblok = false;
        for (int i = 0; i < dtCsrs.length; i++) {
            isblok = true;
            System.out.println(dtCsrs[i].toString());
            System.out.println(" car tabyldy !");
        }
        return dtCsrs;


    }

    public void getBayId(Long id) {
        boolean isblok = false;
        for (int i = 0; i < dtCsrs.length; i++) {
            if (dtCsrs[i].getId().equals(id)) {
                isblok = true;
                System.out.println(dtCsrs[i].toString());
                System.out.println(" car tabyldy !");
            }


        }
        if (!isblok) {
            System.out.println("mundai  " + id + " jok! ");

        }

    }

    public void updateCar(Long id, Car newCar) {
        boolean isblok = false;

        for (int i = 0; i < saze; i++) {
            if (dtCsrs[i].getId().equals(id)) {
                isblok = true;
                dtCsrs[i] = newCar;
                System.out.println(dtCsrs[i].toString());

            }

        }
        if (!isblok) {
            System.out.println("myndai " + id + " ID tabylgan jok ");


        }

    }

    public void deleteCar(Long id) {
        boolean isblok = false;
        for (int i = 0; i < saze; i++) {
            if (dtCsrs[i].getId().equals(id)) {
                isblok = true;
                for (int k = i; k < saze - 1; k++) {
                    dtCsrs[k] = dtCsrs[k + 1];

                }
                saze--;
                System.out.println("delete " + id + " !!");
            }
        }
        dtCsrs = Arrays.copyOf(dtCsrs, dtCsrs.length - 1);
        if (!isblok) {
            System.out.println("myndai " + id + " jook!!");
        }
    }
}



