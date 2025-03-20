import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        String season;
        switch (month) {
            case 3: case 4:  
                season = "Spring (Bashanta)"; break;
            case 5: case 6:  
                season = "Summer (Grishmo)"; break;
            case 7: case 8:  
                season = "Monsoon (Borsha)"; break;
            case 9: case 10: 
                season = "Autumn (Shorot)"; break;
            case 11: case 12: 
                season = "Late Autumn (Hemonto)"; break;
            case 1: case 2:  
                season = "Winter (Sheet)"; break;
            default:
                season = "Invalid month!";
        }

        System.out.println("Season: " + season);
        scanner.close();
    }
}
