public class AreaRettangolo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java AreaRettangolo <base> <altezza>");
            return;
        }
        int base = Integer.parseInt(args[0]);
        int altezza = Integer.parseInt(args[1]);
        int area = base * altezza;

        System.out.println("L'area del rettangolo è: " + area);
    }
}
