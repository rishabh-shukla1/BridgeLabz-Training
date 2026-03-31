package functional_interfaces;

import java.time.*;
import java.time.format.*;

interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(
            DateUtils.formatDate(today, "dd-MM-yyyy"));

        System.out.println(
            DateUtils.formatDate(today, "yyyy/MM/dd"));
    }
}

