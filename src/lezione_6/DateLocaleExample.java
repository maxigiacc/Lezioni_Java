import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateLocaleExample {
    public static void main(String[] args) {

        // 1️⃣ Calcola giorni tra due date
        LocalDate dataInizio = LocalDate.of(2023, 7, 10);
        LocalDate dataFine = LocalDate.of(2025, 7, 26);

        long giorniTra = ChronoUnit.DAYS.between(dataInizio, dataFine);
        System.out.println("Giorni tra " + dataInizio + " e " + dataFine + ": " + giorniTra);

        System.out.println();

        // 2️⃣ Stampa la data corrente in diversi formati locali
        LocalDate oggi = LocalDate.now();

        DateTimeFormatter formatoIT = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY);
        DateTimeFormatter formatoUS = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);
        DateTimeFormatter formatoJP = DateTimeFormatter.ofPattern("yyyy年MM月dd日", Locale.JAPAN);

        System.out.println("Data italiana: " + oggi.format(formatoIT));
        System.out.println("Data USA: " + oggi.format(formatoUS));
        System.out.println("Data Giappone: " + oggi.format(formatoJP));

        System.out.println();

        // 3️⃣ Stampa una cifra in formato valuta per vari paesi + data localizzata
        double cifra = 123456.78;

        stampaValutaConData(cifra, Locale.ITALY, formatoIT, oggi);
        stampaValutaConData(cifra, Locale.US, formatoUS, oggi);
        stampaValutaConData(cifra, Locale.GERMANY, DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMANY), oggi);
    }

    private static void stampaValutaConData(double cifra, Locale locale, DateTimeFormatter formatter, LocalDate data) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println("🌍 " + locale.getDisplayCountry() + ": " + nf.format(cifra) + " (data: " + data.format(formatter) + ")");
    }
}
