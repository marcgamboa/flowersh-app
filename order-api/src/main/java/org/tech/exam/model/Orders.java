package org.tech.exam.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderNo;
    private String accountId;
    private String trackingNo;
    private String orderStatus;
    private Date placedOn;
    private Date shippedOn;
    private Date deliveredOn;
    @OneToMany
    private List<OrderDetails> orderDetails;
}
