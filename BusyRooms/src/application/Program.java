package application;

import entities.Student;

import java.util.Scanner;

public class Program {

    public static boolean roomIsValid(int roomNumber, int roomsSize) {
        return roomNumber < roomsSize;
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented?");
        int busyRooms = sc.nextInt();

        Student[] rentendRooms = new Student[10];

        for (int i = 0; i < busyRooms; i++){
            System.out.println("Rent #" + (i+1));
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room Number: ");
            int roomNumber = sc.nextInt();

            if(roomIsValid(roomNumber, rentendRooms.length)) {
                rentendRooms[roomNumber] = new Student(name, email, roomNumber);
            } else {
                System.out.println("There is no room with this number, only (0-9), next one...");
            };

        }

        System.out.println("Busy rooms: ");
        for (int j = 0; j < rentendRooms.length; j++){
            if(rentendRooms[j] != null) {System.out.println(rentendRooms[j]);}

        }
    }
}
