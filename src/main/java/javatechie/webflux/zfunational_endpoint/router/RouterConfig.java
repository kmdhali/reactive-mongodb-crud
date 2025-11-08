/*
package javatechie.webflux.zfunational_endpoint.router;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Autowired
    private CustomerHandlerStream streamHandler;

    @Bean
    public RouterFunction<ServerResponse> routerConfiguration(){

        return RouterFunctions.route()
                //.GET("/router/customers", null)
                .GET("/router/customers/stream", streamHandler::loadCustomersStream)
                .build();
    }
}
*/
