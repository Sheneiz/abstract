import java.util.List;

    public class Utils {
        public static <E> List<E> filterByClass(List<E> input, Class<?> clazz) {
            return input.stream().filter(clazz::isInstance).toList();
        }

        public static <T extends Comparable<T>> long countInRange(List<T> list, T min, T max) {
            RangePredicate<T> predicate = new RangePredicate<>(min, max);
          return list.stream().filter(predicate).count();
        }
    }

