public class Main {

    public static void main(String[] args) {
        //create an array which will hold all the bikes
        Bike stockBikes[] = new Bike[5];

        //create the first Bike we can reference to it as "myBike"
        Bike myBike = new Bike("red","Road Bike");

        //we can change the color after we created the bike by using method setColour();
        myBike.setColour("white");

        //save a reference to "myBike" to the first element of the array
        stockBikes[0] = myBike;

        //create the first Bike we can reference to it as "mySecondBike"
        Bike mySecondBike = new Bike("blue","Time Trial");

        //save a reference to "mySecondBike" to the first element of the array
        stockBikes[1] = mySecondBike;

        //print information about "myBike" using the original reference
        System.out.println(myBike.toString());

        //print information about "mySecondBike" using the reference from the array stockBikes
        System.out.println(stockBikes[1].toString());
    }
}
