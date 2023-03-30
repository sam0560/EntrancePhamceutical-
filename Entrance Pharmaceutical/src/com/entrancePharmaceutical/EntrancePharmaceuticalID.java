package com.entrancePharmaceutical;

import java.util.Scanner;

public class EntrancePharmaceuticalID {

    public static void main(String[] args) {
        createReceipt();
    }
    static void createReceipt(){
//
        int totalQuantityOfItems;
        double subTotalOfFirstItem, subTotalOfSecondItem,subTotalOfThirdItem,subTotalOfFourthItem, subTotalOfFifthItem, totalOrder;
        final double totalDiscount;

        // Scanner for Inputs
        Scanner scanNow = new Scanner(System.in);

        System.out.println("Welcome to Entrance Pharmaceuticals");

//         Customer Name and Customer phone number
        CustomerID customerInfo = new CustomerID();
        System.out.print("\nPlease Enter Customer's Name: ");
        customerInfo.setCustomerName(scanNow.nextLine()); /////// Enter customer name
        System.out.print("Please Enter Customer's Phone Number: ");
        customerInfo.setCustomerMobileNumber(scanNow.next()); ////// Customer Phone number

        ////////// Prices of product
        PricesID prices = new PricesID();

        System.out.print("What is the price of Paracetamol: $ "); // price of first item
        prices.setPriceOfItemOne(scanNow.nextDouble());

        System.out.print("What is the price of Fepack: $ "); // price of second item
        prices.setPriceOfItemTwo(scanNow.nextDouble());

        System.out.print("What is the price of Apetamin: $ "); // price of third item
        prices.setPriceOfItemThree(scanNow.nextDouble());

        System.out.println("What is the price of Coldrilif: $ "); // Price of fourth item
        prices.setPriceOfItemFour(scanNow.nextDouble());

        System.out.println("What is the price of fenaglobin: $ "); // Price of fifth item
        prices.setPriceOfItemFive(scanNow.nextDouble());

        /////// quantity of item bought
        ItemsID items = new ItemsID();

        System.out.print("How many Paracetamol(s) where ordered: ");
        items.setTotalNumberOfFirstItem(scanNow.nextInt());

        System.out.print("How many Fepack(s) where ordered: ");
        items.setTotalNumberOfSecondItem(scanNow.nextInt());

        System.out.print("How many Apetamin(s) where ordered: ");
        items.setTotalNumberOfThirdItem(scanNow.nextInt());

        System.out.print("How many Coldrilif(s) where ordered: ");
        items.setTotalNumberOfFourthItem(scanNow.nextInt());

        System.out.print("How many fenaglobin(s) where ordered: ");
        items.setTotalNumberOfFifthItem(scanNow.nextInt());


        //   Details of Client visit Date
        System.out.println("Enter details of client's visit below");
        System.out.println("****************************************");

        DateID date = new DateID();
        // Enter month number
        System.out.print("Enter Month-number: ");
        date.setOrderMonth(scanNow.nextShort());

        // Enter day number
        System.out.print("Enter Day-number: ");
        date.setOrderDay(scanNow.nextShort());

        // Enter year number
        System.out.print("Enter Year: ");
        date.setOrderYear(scanNow.nextShort());

//     Calculations
//     Subtotal of Orders
        subTotalOfFirstItem = items.totalNumberOfFirstItem * prices.priceOfItemOne;
        subTotalOfSecondItem = items.totalNumberOfSecondItem * prices.priceOfItemTwo;
        subTotalOfThirdItem = items.totalNumberOfThirdItem * prices.priceOfItemThree;
        subTotalOfFourthItem = items.totalNumberOfFourthItem * prices.priceOfItemFour;
        subTotalOfFifthItem = items.totalNumberOfFifthItem * prices.priceOfItemFive;

//      Total orders
        totalOrder = subTotalOfFirstItem + subTotalOfSecondItem + subTotalOfThirdItem + subTotalOfFourthItem + subTotalOfFifthItem;

//       Total Number of items
         totalQuantityOfItems = items.totalNumberOfFirstItem + items.totalNumberOfSecondItem + items.totalNumberOfThirdItem + items.totalNumberOfFourthItem +items.totalNumberOfFifthItem;

//       Total Discount
         totalDiscount = (totalOrder * 0.25);


        // Displaying of Invoice
        System.out.println("\n-/-\tEntrance Pharmaceuticals\t -/-");
        System.out.println("=======================================");
        System.out.println("Customer: "+customerInfo.getCustomerName(customerInfo.customerName));
        System.out.println("Mobile Phone: "+customerInfo.getCustomerMobileNumber(customerInfo.customerMobileNumber));
        System.out.println("Order Date: "+date.getOrderDay(date.orderDay)+"/"+date.getOrderMonth(date.orderMonth)+"/"+date.getOrderYear(date.orderYear));

        System.out.println("---------------------------------------------");
        System.out.println("Item Type\t\t"+"Qty\t\t"+"UnitPrice\t\t"+"Sub-Total");
        System.out.println("---------------------------------------------");
        System.out.print("\nParacetamol\t\t"+items.totalNumberOfFirstItem+"\t\t$ "+prices.priceOfItemOne+"\t\t$ "+subTotalOfFirstItem);
        System.out.print("\nFepack\t\t  "+items.totalNumberOfSecondItem+" \t\t$ "+prices.priceOfItemTwo+"\t\t$ "+subTotalOfSecondItem);
        System.out.print("\nApetamin\t\t"+items.totalNumberOfThirdItem+"\t\t$ "+prices.priceOfItemThree+"\t\t$ "+subTotalOfThirdItem);
        System.out.print("\nColdrilif\t\t"+items.totalNumberOfFourthItem+"\t\t$ "+prices.priceOfItemFour+"\t\t$ "+subTotalOfFourthItem);
        System.out.print("\nfenaglobin\t\t"+items.totalNumberOfFifthItem+"\t\t$ "+prices.priceOfItemFive+"\t\t$ "+subTotalOfFifthItem);

        System.out.println("\n---------------------------------------------");
        System.out.print("\nNumber of items: "+totalQuantityOfItems);
        System.out.print("\nTotal Order: $"+totalOrder+" TotalDiscount: $"+totalDiscount);
        System.out.println("\n============================================== \nCreated by Group 14, \nIndex Numbers");
//        System.out.println("\nCreated by Group 14, \nIndex Numbers");
    }
}