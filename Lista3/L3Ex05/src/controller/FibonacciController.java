package controller;
public class FibonacciController {
    public FibonacciController(){}

    public int calculate(int n) {
        // Os dois primeiros números da sequência fibonacci são ambos 1
        if(n <= 2) return 1;

        // Aqui o termo atual é calculado através da soma dos dois termos anteriores recursivamente
        return calculate(n - 1) + calculate(n - 2);
    }
}
