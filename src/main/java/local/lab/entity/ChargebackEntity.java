package local.lab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ChargebackEntity {

    @Id
    @GeneratedValue
    public Long id;

    public Long transactionId;

    public Long customerId;

    public String reason;
}
