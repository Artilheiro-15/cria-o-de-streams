import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("====================================");

    List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

    //isso aki e cria uma Stream apartir de uma coleçao que no caso e lista
    Stream<Integer> st1 = list.stream().map(x -> x * 10);
    System.out.println(Arrays.toString(st1.toArray()));
    System.out.println("====================================");
    //como criar uma Stream usando uma Stream.of
    Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
    System.out.println(Arrays.toString(st2.toArray()));
    System.out.println("====================================");
    //como criar uma Stream usando a funçao de interaçao
    Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
    System.out.println(Arrays.toString(st3.limit(10).toArray()));
    System.out.println("====================================");
    //agora vou gerar uma Stream que e a sequencioa de fibonate
    Stream<Long> st4 = Stream
      .iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] })
      .map(p -> p[0]);
    System.out.println(Arrays.toString(st4.limit(10).toArray()));

    System.out.println("====================================");
  }
}
