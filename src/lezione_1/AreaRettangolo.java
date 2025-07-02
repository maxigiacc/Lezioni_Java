public class AreaRettangolo {
    public static void main(String[] args) {


        System.out.println(args[0]);
        System.out.println(args[1]);
        int base = Integer.parseInt(args[0]);
        int altezza = Integer.parseInt(args[1]);
        int area = base * altezza;

        System.out.println("L'area del rettangolo è: " + area);
    }
}
