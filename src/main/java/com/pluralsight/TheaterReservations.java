package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        // asks user for their name
        System.out.print("Please enter your full name: ");
        String fullName = input.nextLine().trim();

        // asks user to input the date of their show
        System.out.print("Please enter the date of the show you're attending using MM/DD/YYYY format: ");
        String userDateInput = input.nextLine();

        // fixes formatting of the date, makes it American standard
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateOfShow = LocalDate.parse(userDateInput, formatter);

        // asks user how many tickets they want
        System.out.print("Please enter the number of tickets you want: ");
        int numberOfTickets = input.nextInt();

        // final output
        System.out.println();
        System.out.println(numberOfTickets + " tickets reserved for the date of " + dateOfShow + " under the name " + fullName);

    }
}
