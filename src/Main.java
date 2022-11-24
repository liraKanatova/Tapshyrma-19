import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     Week week=Week.MONDAY;
        Scanner scanner=new Scanner(System.in);
        week= Week.valueOf(scanner.nextLine());

        switch ( week){
            case MONDAY:
                System.out.println("Дуйшөмбү куну жава окуйм");
                break;
            case TUESDAY:
                System.out.println("Шейшемби күнү англис тили окуйм");
                break;
            case WEDNESDAY:
                System.out.println("Шаршенби куну софт скиллс окуйм ");
                break;
            case THURSDAY:
                System.out.println("Бейшенби куну жава сабагынан практика кылам");
                break;
            case FRIDAY:
                System.out.println("Жума куну англис тилин практика кылам");
                break;
            case SATURDAY:
                System.out.println("Ишенби куну бардык сабактарынын уй ишин жасайм ");
                break;
            case SUNDAY:
                System.out.println("Жекшенби куну сабактарды кайталайм ");
                break;



        }
    }
}