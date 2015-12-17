package proc.memory.stack.size.Question03;

public class App1 {
    int fun(int k0, int k1, int k2) {
        int a = k0 + k1;
        int b = k1 + k2;
        int c = k2 + k0;
        return fun(a, b, c);
    }
}
