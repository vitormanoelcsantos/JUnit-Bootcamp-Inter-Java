package one.innovation.digital;

public class Calculadora {
    public int sum(String expressao) {
        int n = 0;
        for (String valorSomar : expressao.split("\\+"))
            n += Integer.parseInt(valorSomar);

        System.out.println(n);
        return n;
    }
}
