package Customization;

import FinalizationOrder.CartList;
import Interfaces.Add_To_Cart.AddCoffeesToCart;
import Interfaces.Other.MyScanner;
import Products.Coffees;

public class CoffeesCustomization {

    static int flag1 = 0;
    static int flag2 = 0;
    static int flag3 = 0;
    static int flag4 = 0;
    static int flag5 = 0;
    static int flag6 = 0;
    static int flag7 = 0;


    public static void coffeesCustomization() {

        System.out.println("\nDo you want to customize selected item? Y/N");
        String decision = MyScanner.myLineScanner();

        switch(decision) {

            case "Y":
                displayCoffeesAdditions();
                yesChosen();
                break;


            case "N":
                AddCoffeesToCart.addCoffeesToCart();
                break;

            default:
                System.out.println("Please try again...");
                coffeesCustomization();
                break;

        }
    }

    static void yesChosen() {

        System.out.println("Select addition you want to add to coffee: ");
        int choice = MyScanner.myIntScanner();

        if (choice < 1 || choice > 8) {
            System.out.println("Please try again...");
            yesChosen();
        } else {

            switch (choice) {

                case 1:
                    if(flag1 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag1 == 0) {
                    CartList.addToCartValue(0.20);
                    System.out.println("0.20 PLN added to bill");
                    flag1 = 1;
                    yesChosen();
                }
                    break;

                case 2:

                    if(flag2 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag2 == 0) {
                    CartList.addToCartValue(0.20);
                    System.out.println("0.20 PLN added to bill");
                    flag2 = 1;
                    yesChosen();
                }
                    break;

                case 3:

                    if(flag3 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag3 == 0) {
                    CartList.addToCartValue(0.20);
                    System.out.println("0.20 PLN added to bill");
                    flag3 = 1;
                    yesChosen();
                }
                    break;

                case 4:
                    if(flag4 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag4 == 0) {
                    CartList.addToCartValue(2.00);
                    System.out.println("2.00 PLN added to bill");
                    flag4 = 1;
                    yesChosen();
                }
                    break;

                case 5:
                    if(flag5 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag5 == 0) {
                    CartList.addToCartValue(1.50);
                    System.out.println("1.50 PLN added to bill");
                    flag5 = 1;
                    yesChosen();
                }
                    break;

                case 6:
                    if(flag6 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag6 == 0) {
                    CartList.addToCartValue(1.50);
                    System.out.println("1.50 PLN added to bill");
                    flag6 = 1;
                    yesChosen();
                }
                    break;

                case 7:
                    if(flag7 == 1) {
                        System.out.println("Addition has already been added once");
                        yesChosen();
                    } if (flag7 == 0) {
                    CartList.addToCartValue(1.50);
                    System.out.println("1.50 PLN added to bill");
                    flag7 = 1;
                    yesChosen();
                }
                    break;

                case 8:
                    Coffees.displayCoffeesList();
                    AddCoffeesToCart.addCoffeesToCart();
                    break;


            }
        }
    }

    static void displayCoffeesAdditions() {

        System.out.println("1.White sugar - 0.20 PLN\n2.Sugar Cane - 0.20 PLN\n3.Sweetener - 0.20 PLN\n4.Extra espresso - 2.00 PLN" +
                "\n5.Caramel syrup - 1.50 PLN\n6.Vanilla syrup - 1.50 PLN\n7.Season syrup - 1.50 PLN\n\n8.End customization");


    }




}