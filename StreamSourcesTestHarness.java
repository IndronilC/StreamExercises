public class StreamSourcesTestHarness {
    public static void main(String[] args){
        StreamSources.streamOfNumberSources().forEach(System.out::println);
        StreamSources.initStreamOfNumbers().filter(number -> number < 5).forEach(System.out::println);
        StreamSources.initStreamOfNumbers().filter(number -> number > 5)
                .skip(1)
                .limit(2).forEach(System.out::println);
        Integer value = StreamSources.initStreamOfNumbers().filter(number -> number > 5).findFirst().orElse(-1);
        System.out.println(value);
        StreamSources.streamOfUsers().map(user -> user.getName()).forEach(System.out::println);
    }
}
