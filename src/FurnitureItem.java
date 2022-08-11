import java.util.Scanner;

public class FurnitureItem {

        int furnitureCode;
        String furnitureType;
        String gradeOfFurniture;
        String color;
        String furnitureUsage;
        double price;
        double discount;

        FurnitureItem() {

             this.furnitureCode = furnitureCode;
             this.furnitureType = furnitureType;
             this.gradeOfFurniture = gradeOfFurniture;
             this.color = color;
             this.furnitureUsage = furnitureUsage;
            this.price = price;
            this.discount = discount;
        }

            public void furniture() {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter furnitureCode");
                furnitureCode = sc.nextInt();
                System.out.println("enter furnitureType ");
                furnitureType = sc.next();
                sc.nextLine();
                System.out.println("enter gradeOfFurniture");
                gradeOfFurniture = sc.next();
                sc.nextLine();
                System.out.println("enter color");
                color = sc.next();
                sc.nextLine();
                System.out.println("enter furnitureUsage");
                furnitureUsage = sc.next();
                sc.nextLine();
                System.out.println("enter price of furniture");
                price = sc.nextDouble();
                System.out.println("enter discount");
                discount = sc.nextDouble();


                System.out.println("furnitureCode = " + furnitureCode);
                System.out.println("furnitureType = " + furnitureType);
                System.out.println("gradeOfFurniture = " + gradeOfFurniture);
                System.out.println("color = " + color);
                System.out.println("price = $" + price);
            }
                public double discountPrice(double discount)
                {

                    furniture();
                     if(furnitureUsage == "outdoor"){
                    double discountPrice =  price - (discount*price/100);
                    System.out.println("discountPrice = " + discountPrice);
                    return  discountPrice;

                }
                    return discount;
                }
}


