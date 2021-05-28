public class Rectangle_1 {
    public static void main(String[] args) {

        //Print out what the program does 
        System.out.println("\nThis program creates two rectangle objects and displays their");
        System.out.println("width, height, area and perimeter.\n");

        double width1 = 40; 
        double height1 = 4; 

        double width2 = 50; 
        double height2 = 3.5; 

        double area1 = width1 * height1; 
        double area2 = width2 * height2; 

        double perimeter1 = 2.2 * width1;
        double perimeter2 = 3.4 * width2; 

        //Print two rectangle objects
        System.out.println("Rectangle 1: ");
        System.out.printf("%.2f\n", height1);
        System.out.printf("%.2f\n", width1);
        System.out.printf("%.2f\n", area1);
        System.out.printf("%.2f\n", perimeter1);

        System.out.println("\nRectangle 2: ");
        System.out.printf("%.2f\n", height2);
        System.out.printf("%.2f\n", width2);
        System.out.printf("%.2f\n", area2);
        System.out.printf("%.2f\n", perimeter2);
        
        //Print out a goodbye message
        System.out.println("\nGoodbye ...\n");

     }
    
}
