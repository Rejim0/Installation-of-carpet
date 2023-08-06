//SP2023InstallationCarpetQuote_OLI
//SP2023_LAB7PART2_OLI

import java.util.Scanner;

public class SP2023InstallationCarpetQuote_OLI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double carpetCostPerSqFt = 2.75;
    double laborCostPerSqFt = 1.25;
    double materialsCostPercentage = 0.1;
    double taxPercentage = 0.0825;

   
   

    // Initialize variables
    double totalArea = 0;
    String output = "";
    double area = 0;
    String shapeOutput = "";

    // Loop through shapes and calculate areas
    while (true) {
      // Display menu and get user input
      System.out.println("SP2023_InstallationCarpetQuote_OLI.java");
      System.out.println("ART CARPET INSTALLATION COMPANY - REJIM OLI");
      System.out.println("-----------------------------------------------------");
      System.out.println(" 1.Square");
      System.out.println(" 2.Rectangle");
      System.out.println(" 3.Triangle");
      System.out.println(" 4.Circle");
      System.out.println(" 5.Trapezoid");
      System.out.println(" 6.Parallelogram");
      System.out.println(" 0.DONE");
     
      System.out.print("Enter shape number: ");
      int shape = input.nextInt();
      if(shape == 0)
      {
    	  break;
      }

      
    do {  
      
      
     if(shape == 1) {

      // Get shape information

        System.out.print("Enter side length: ");
        double side = input.nextDouble();
        input.nextLine();
        area = SP2023_StaticMethod_OLI.squareArea(side);
        String roundedArea = String.format("%.2f", area);
        shapeOutput = "SQUARE - Side length = " + side + "               " + roundedArea;
        System.out.println("");
        break;
        
      }
     else if (shape == 2) {
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        input.nextLine();
        area = SP2023_StaticMethod_OLI.rectangleArea(length, width);
        String roundedArea = String.format("%.2f", area);
        shapeOutput = "RECTANGLE - Length = " + length + " Width = " + width + "            " + roundedArea;
        System.out.println("");
        break;
        
     }
     else if (shape == 3) {
        System.out.print("Enter base length: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        input.nextLine();
        area = SP2023_StaticMethod_OLI.triangleArea(base, height);
        String roundedArea = String.format("%.2f", area);
        shapeOutput = "TRIANGLE - Base = " + base + " Height = " + height + "                    " + roundedArea;
        System.out.println("");
        break;
     }
     else if (shape == 4) {
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        input.nextLine();
        area = SP2023_StaticMethod_OLI.circleArea(radius);
        String roundedArea = String.format("%.2f", area);
        shapeOutput = "CIRCLE - Radius = " + radius + "                                " + roundedArea;
        System.out.println("");
        break;
     }
     else if (shape == 5) {
        System.out.print("Enter top length: ");
        double top = input.nextDouble();
        System.out.print("Enter bottom length: ");
        double bottom = input.nextDouble();
        System.out.print("Enter height: ");
        double trapHeight = input.nextDouble();
        input.nextLine();
        area = SP2023_StaticMethod_OLI.trapezoidArea(top, bottom, trapHeight);
        String roundedArea = String.format("%.2f", area);     
        shapeOutput = "TRAPEZOID - Top = " + top + " Bottom = " + bottom + " Height = " + trapHeight + " " + roundedArea;
        System.out.println("");
        break;
     }
     else if (shape == 6) {
        System.out.print("Enter base length: ");
        double parallelogramBase = input.nextDouble();
        System.out.print("Enter height: ");
        double parallelogramHeight = input.nextDouble();
        input.nextLine();
        area = SP2023_StaticMethod_OLI.parallelogramArea(parallelogramBase, parallelogramHeight);
        String roundedArea = String.format("%.2f", area);
        shapeOutput = "PARALLELOGRAM - Base = " + parallelogramBase + " Height = " + parallelogramHeight + " " + roundedArea;
        System.out.println("");
        break;
     }

     
    	 else {System.out.println("Invalid shape entered.");
    
    	 }
    }while(shape >= 1 && shape <=6);
    totalArea += area;
    output += shapeOutput + "\n";
    }
  

        
     
    String roundedTotalArea = String.format("%.2f", totalArea);
    
    
    
      // Add shape area to total area and output string
      

    // Calculate costs and totals
    double carpetCost = totalArea * 2.75;
    double materialsCost = carpetCost * materialsCostPercentage;
    double laborCost = totalArea * laborCostPerSqFt;
    double subtotal = materialsCost + laborCost + carpetCost;
    double tax = subtotal * taxPercentage;
    double totalCost = subtotal + tax;

//    // Print quote
    System.out.println("\nSP2022_CarpetInstallationQuote_OLI.java");
    System.out.println("ART CARPET INSTALLATION COMPANY - REJIM OLI");
    System.out.print("PROJECT AT: ");
    System.out.println("123 Walnut Road Dallas TX 75243");
    System.out.println("----------------------------------------------------------");
 
    System.out.print(output);
    System.out.println("Sum of area (square feet)                           "  + roundedTotalArea);
    System.out.println("----------------------------------------------------------");
    System.out.printf("Carpet Cost ($2.75 per square feet) %22.2f%n", carpetCost);
    System.out.printf("Labor ($1.25 per square feet) %28.2f%n", laborCost);
    System.out.printf("Materials %48.2f%n", materialsCost);
    System.out.printf("Subtotal %49.2f%n", subtotal);
    System.out.print("Tax (8.25%) ");
    System.out.printf("%46.2f%n", tax);
    System.out.printf("Total charge %45.2f%n", totalCost);
  }

}