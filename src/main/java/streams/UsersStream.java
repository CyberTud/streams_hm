package streams;

import streams.Models.User;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

public class UsersStream {

    static Stream<User> stream = new Stream<User>() {
        @Override
        public Stream<User> filter(Predicate<? super User> predicate) {
            return null;
        }

        @Override
        public <R> Stream<R> map(Function<? super User, ? extends R> mapper) {
            return null;
        }

        @Override
        public IntStream mapToInt(ToIntFunction<? super User> mapper) {
            return null;
        }

        @Override
        public LongStream mapToLong(ToLongFunction<? super User> mapper) {
            return null;
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction<? super User> mapper) {
            return null;
        }

        @Override
        public <R> Stream<R> flatMap(Function<? super User, ? extends Stream<? extends R>> mapper) {
            return null;
        }

        @Override
        public IntStream flatMapToInt(Function<? super User, ? extends IntStream> mapper) {
            return null;
        }

        @Override
        public LongStream flatMapToLong(Function<? super User, ? extends LongStream> mapper) {
            return null;
        }

        @Override
        public DoubleStream flatMapToDouble(Function<? super User, ? extends DoubleStream> mapper) {
            return null;
        }

        @Override
        public Stream<User> distinct() {
            return null;
        }

        @Override
        public Stream<User> sorted() {
            return null;
        }

        @Override
        public Stream<User> sorted(Comparator<? super User> comparator) {
            return null;
        }

        @Override
        public Stream<User> peek(Consumer<? super User> action) {
            return null;
        }

        @Override
        public Stream<User> limit(long maxSize) {
            return null;
        }

        @Override
        public Stream<User> skip(long n) {
            return null;
        }

        @Override
        public void forEach(Consumer<? super User> action) {

        }

        @Override
        public void forEachOrdered(Consumer<? super User> action) {

        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <A> A[] toArray(IntFunction<A[]> generator) {
            return null;
        }

        @Override
        public User reduce(User identity, BinaryOperator<User> accumulator) {
            return null;
        }

        @Override
        public Optional<User> reduce(BinaryOperator<User> accumulator) {
            return Optional.empty();
        }

        @Override
        public <U> U reduce(U identity, BiFunction<U, ? super User, U> accumulator, BinaryOperator<U> combiner) {
            return null;
        }

        @Override
        public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super User> accumulator, BiConsumer<R, R> combiner) {
            return null;
        }

        @Override
        public <R, A> R collect(Collector<? super User, A, R> collector) {
            return null;
        }

        @Override
        public Optional<User> min(Comparator<? super User> comparator) {
            return Optional.empty();
        }

        @Override
        public Optional<User> max(Comparator<? super User> comparator) {
            return Optional.empty();
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public boolean anyMatch(Predicate<? super User> predicate) {
            return false;
        }

        @Override
        public boolean allMatch(Predicate<? super User> predicate) {
            return false;
        }

        @Override
        public boolean noneMatch(Predicate<? super User> predicate) {
            return false;
        }

        @Override
        public Optional<User> findFirst() {
            return Optional.empty();
        }

        @Override
        public Optional<User> findAny() {
            return Optional.empty();
        }

        @Override
        public Iterator<User> iterator() {
            return null;
        }

        @Override
        public Spliterator<User> spliterator() {
            return null;
        }

        @Override
        public boolean isParallel() {
            return false;
        }

        @Override
        public Stream<User> sequential() {
            return null;
        }

        @Override
        public Stream<User> parallel() {
            return null;
        }

        @Override
        public Stream<User> unordered() {
            return null;
        }

        @Override
        public Stream<User> onClose(Runnable closeHandler) {
            return null;
        }

        @Override
        public void close() {

        }
    };

    public static Stream<User> getStream() {
        return stream;
    }

}
