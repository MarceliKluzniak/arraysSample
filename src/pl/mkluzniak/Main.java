package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // arrays = used to store multiple values in a single variable

        String[] cars = new String[3]; //creating array type declaring size of array as 3, data type have to be the sam for every input
        cars[0] = "Camaro"; //declaring first array list. Starting from 0
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        for (int i = 0; i < cars.length; i++) { //for loop that list every declared car started from first to las
            System.out.println(cars[i]); //printing for loop in terminal

        }

    }
}
