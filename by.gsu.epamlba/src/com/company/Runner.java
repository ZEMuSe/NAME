package com.company;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] BusinessTrips = {
                new BusinessTrip("Shelly", 50, 10),
                null,
                new BusinessTrip("Sam", 251, 20),
                new BusinessTrip("Teddy", 145, 15),
                new BusinessTrip()
        };
        BusinessTrip max = new BusinessTrip();
        max.setExpenses(-228);
        for (BusinessTrip businessTrips : BusinessTrips) {
            if (businessTrips != null) {
                businessTrips.show();

                for (BusinessTrip businessTrip : BusinessTrips) {
                    if (businessTrips != null){
                        if (businessTrip.getExpenses() > max.getExpenses()) {
                            max = businessTrip;
                        }
                    }
                }
                System.out.println(max.getExpenses());
            }
        }


    }
}
