package com.food.ordering.system.order.service.domain;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BeanConfiguration {

    @Bean
    public OrderDomainService orderDomainService() {
        return new OrderDomainServiceImpl();
    }
}
