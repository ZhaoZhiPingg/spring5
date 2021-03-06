package com.zzp.spring;

import com.zzp.spring.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class Clinet {
    public static void main(String[] args) {
        //调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:52565");

        //根据id查询
        String id = "1";
        User user = webClient.get().uri("/user/{id}",id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println(user.getName());

        //查询所有
        Flux<User> userFlux = webClient.get().uri("/users")
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);
        userFlux.map(per -> per.getName())
                .buffer().doOnNext(System.out::println).blockFirst();
    }
}
