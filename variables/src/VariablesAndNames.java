public class VariablesAndNames {
   public static void main( String[] args){
      int cars, drivers, passengers, cars_not_driven, cars_driven;
      double space_in_a_car, carpool_capacity, average_passengers_per_car;

      cars = 100;
      space_in_a_car = 4.0;
      drivers = 30;
      passengers = 90;
      cars_not_driven = cars - drivers;
      cars_driven = drivers;
      carpool_capacity = cars_driven * space_in_a_car;
      average_passengers_per_car = passengers / cars_driven;

      System.out.println( "There are " + cars + " cars available." );
      System.out.println( "There are only " + drivers + " drivers    available." );
      System.out.println( "There will be " + cars_not_driven + " empty cars today." );
      System.out.println( "We can transport " + carpool_capacity + " people today." );
      System.out.println( "We have " + passengers + " to carpool today." );
      System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

      int room;
      double e_is_close_to;
      String Computer_Science;

      room = 113;
      e_is_close_to = 2.71828;
      Computer_Science = "Computer Science";

       System.out.println("This is room #" + room);
       System.out.println("e is close to" + " " + e_is_close_to);
       System.out.println("I am learning a bit about" + " " + Computer_Science);

      System.out.println("+----------------------------------------------------------------+");
      System.out.println("| 1 |                             English III |        Ms. Lapan |");
      System.out.println("| 2 |                             Precalculus |      Mrs. Gideon |");
      System.out.println("| 3 |                            Music Theory |        Mr. Davis |");
      System.out.println("| 4 |                           Biotechnology |       Ms. Palmer |");
      System.out.println("| 5 |              Principles of Technology I |       Ms. Garcia |");
      System.out.println("| 6 |                                Latin II |      Mrs. Barnett|");
      System.out.println("| 7 |                          AP US  History |  Ms. Johannessen |");
      System.out.println("| 8 |   Business Computer Information Systems |        Mr. James |");
      System.out.println("+----------------------------------------------------------------+");


   }
}
