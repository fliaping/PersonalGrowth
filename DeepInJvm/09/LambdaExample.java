import java.util.stream.IntStream;

public class LambdaExample {
    
    public static void main(String[] args) {
        int x = 1;
        IntStream.of(1, 2, 3).map(i -> i * 2).map(i -> i * x);
    }
} 