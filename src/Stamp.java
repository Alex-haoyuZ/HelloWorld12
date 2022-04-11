import java.util.ArrayList;

public class Stamp {
    private String postCode;

    public void displayStateName(String postCode)
    {
        this.postCode = postCode;
        switch (postCode.charAt(0))
        {
            case '2':
                System.out.println("NSW");
                break;
            case '3':
                System.out.println("Victoria");
                break;
            case '4':
                System.out.println("Queensland");
                break;
            case '5':
                System.out.println("South Australia");
                break;
            case '6':
                System.out.println("Western Australia");
                break;
            case '7':
                System.out.println("Tasmania");
                break;
            default:
                System.out.println("Postcode not known");
                break;
        }
    }

    public static void main(String[] args) {
            Stamp s = new Stamp();
            s.displayStateName("3189");
    }

}
