import java.util.Scanner;
public class Class {
    private Student [][] chart;

    public Class(Student [][] chart) {
        this.chart = chart;
    }
    public void intro (){
        chart = new Student[6][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is your current seat: " + seatChooser());

    }
    public String seatChooser (){
        int row = (int) (Math.random()*6);
        int col = (int) (Math.random()*4);
        return ("["+row+","+col+"]");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need any accomodations for your seat?");
        System.out.println("For example, being in the front because you can't see well");
        String yesno = scanner.nextLine();
        String accomodation = scanner.nextLine();

        if (yesno.equals("yes")) {
            System.out.println("This is your new seat: ");
        }

    }

}
