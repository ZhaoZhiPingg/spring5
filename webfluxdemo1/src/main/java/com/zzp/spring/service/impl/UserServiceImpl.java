package com.zzp.spring.service.impl;

import com.zzp.spring.entity.User;
import com.zzp.spring.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserServiceImpl implements UserService {

    //创建map集合存储数据
    private final Map<Integer,User> userMap = new HashMap<>();

    public UserServiceImpl(){
        this.userMap.put(1,new User("小明","男",20));
        this.userMap.put(2,new User("小王","男",30));
        this.userMap.put(3,new User("小芳","女",25));
    }

    //根据id查询
    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.userMap.get(id));
    }

    //查询所有用户
    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.userMap.values());
    }

    //添加用户
    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person->{
            //向map集合里面放值
            int size = userMap.size() + 1;
            userMap.put(size,person);
        }).thenEmpty(Mono.empty());
    }
}
