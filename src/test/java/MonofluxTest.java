import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonofluxTest {

    @Test
    public void testMono(){
        Mono<?> monoString = Mono.just("java-techie")
                  //.then(Mono.error(new RuntimeException("error")))
                  .log();
        monoString.subscribe(System.out::println);
    }

    @Test
    public void testFlux(){
        Flux<String> fluxString =  Flux.just("Test1", "Test2", "Test3", "Test4")
                .log();
        fluxString.subscribe(System.out::println);
    }

}
