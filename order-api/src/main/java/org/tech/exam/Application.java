package org.tech.exam;


import com.assessment.common.dto.ShippingDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tech.exam.model.OrderDetails;
import org.tech.exam.model.Orders;
import org.tech.exam.model.Product;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner cmdRunner() {
        return runner -> {
            Orders o = Orders.builder()
                    .orderNo(new Random().nextInt(100000))
                    .accountId("marcgamboa")
                    .placedOn(new Date())
                    .orderDetails(List.of(
                            OrderDetails.builder().id(new Random().nextInt(100000))
                                    .product(Product.builder()
                                            .id(new Random().nextInt(100000))
                                            .productName("Red Rose Bouquet")
                                            .price(399.00)
                                            .build())
                                    .build()
                    ))
                    .build();

            log.info("[🟢{}] {}", Application.class.getSimpleName(), o.toString());
        };
    }
}