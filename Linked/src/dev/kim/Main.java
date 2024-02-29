package dev.kim;

import java.util.LinkedList;
import java.util.Scanner;

record Place( String name, int distance){
    @Override
    public String toString() {
        return String.format("%s -> %d", name, distance);
    }
}

public class Main  {

    public static void main(String[] args) {

        LinkedList<Place> places = new LinkedList<>();

        Place mombasa = new Place("Mombasa", 500);
        addPlace(places,mombasa);
        addPlace(places, new Place("Kisumu", 400));
        addPlace(places, new Place("Nakuru", 250));
        addPlace(places, new Place("Eldoret", 300));
        addPlace(places, new Place("Busia", 900));
        addPlace(places, new Place("Pokot", 1000));
        addPlace(places, new Place("Kericho", 550));
        addPlace(places, new Place("Voi", 750));

        places.addFirst(new Place("Nairobi", 0));
        System.out.println(places);

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop){
            


            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F": System.out.println("User want to go forward");
                break;

                case "B": System.out.println("User want to go backwards");
                    break;

                case "M": printMenu();
                    break;

                case "L": System.out.println(places);
                    break;

                default : quitLoop =true;
                break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list , Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace: list){
            if (place.distance()< listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void printMenu(){
        System.out.println(
                """
                        Available actions (select word or letter):
                        (F)orward
                        (B)ackwards
                        (L)ist Places
                        (M)enu
                        (Q)uit"""
        );
    }

}
