package one.innovation.digital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Calculadora {
    public int soma(String expressao) {
        int n = 0;
        for (String valorSomar : expressao.split("\\+"))
            n += Integer.parseInt(valorSomar);

        System.out.println(n);
        return n;
    }

    public int novaSoma(int ...valores) {
        int n = 0;
        for (int valor : valores) {
            n += valor;
        }
        return n;
    }
}
