package lessonssssss.lesson07;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 5;
        if (x == 5) {
            System.out.println("if:  x = 5 ");
        } else if (x == 7) {
            System.out.println("else if:  x = 7 ");

        } else {
            System.out.println("else:  что-то другое ");
        }
        
        switch (x) {
            case 5:
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;
            default:
                System.out.println("что-то другое");
                break;

        }
    }}


