package com.programmers.springbootbasic.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class CustomerVoucherLog {

    private String customerId;
    private UUID voucherId;
    private LocalDateTime registrationDate;

    public CustomerVoucherLog(String customerId, UUID voucherId) {
        this.customerId = customerId;
        this.voucherId = voucherId;
    }

    public CustomerVoucherLog(String customerId, UUID voucherId, LocalDateTime registrationDate) {
        this.customerId = customerId;
        this.voucherId = voucherId;
        this.registrationDate = registrationDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public UUID getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(UUID voucherId) {
        this.voucherId = voucherId;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "[회원 ID: " + customerId + "], [할인권 ID: " + voucherId + "]";
    }

}
