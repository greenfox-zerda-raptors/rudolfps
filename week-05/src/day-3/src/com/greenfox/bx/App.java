package com.greenfox.bx;

import java.util.ArrayList;

/**
 * Created by gabrud on 2016-11-16.
 */
    public class App {

        final static String[] lsDow = { "MON","TUE","WED","THU","FRI","SAT","SUN"};

        public static void main(String[] args) {
            ArrayList<Reservations> bookings = new ArrayList<Reservations>();
            int ct = 10;

            for (int i = 0; i<ct; i++) {
                bookings.add(new Reservations(randomDow(10)));
            }

            for (Reservations iBooking: bookings){
                System.out.println(iBooking.toString());
            }

        }


        static String randomDow(int ct) {
            return lsDow[(int)( Math.random() * 6)];
        }
 }

