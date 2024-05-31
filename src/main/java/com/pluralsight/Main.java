package com.pluralsight;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            homeScreen();
            exit();
            Scanner scanner = new Scanner(System.in);
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choose: ");
            int Choice = scanner.nextInt();
            switch (Choice) {

                case 1:
                    homeScreen();
                    break;
                case 0:
                    exit();
                    break;
            }

        }


        private static void exit() {
            System.exit(0);
        }

        public static void homeScreen() {
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("Choose:");
            Scanner scanner = new Scanner(System.in);
            int Choice = scanner.nextInt();
            switch (Choice) {

                case 1:
                   newOrder();
                    break;
                case 0:
                    exit();
                    break;
            }
            }

            public static void newOrder() {
            Scanner scanner = new Scanner(System.in);
                Sandwich sandwich = new Sandwich();
                System.out.println("Enter the type of bread");
                System.out.println("Must Type white, wheat, rye, wrap");
                String userBreadType = scanner.nextLine();
                sandwich.setBreadType(userBreadType);

                System.out.print("Enter size for the bread: ");
                int userBreadSize = scanner.nextInt();
                sandwich.setBreadSize(userBreadSize);

                System.out.print("toppings included ");
                String  userPremiumToppings  = scanner.nextLine();
                PremiumToppings.getPremiumToppings(userPremiumToppings);

                System.out.println("Sandwich BreadType: " + sandwich.getBreadType() + " Bread size "+ sandwich.getBreadSize() + " price " + sandwich.getPrice());



            }


        }