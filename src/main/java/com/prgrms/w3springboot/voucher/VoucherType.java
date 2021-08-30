package com.prgrms.w3springboot.voucher;

import java.util.Arrays;

public enum VoucherType {
    FIXED("fixed"),
    PERCENT("percent");

    private final String type;

    VoucherType(String type) {
        this.type = type;
    }

    public static VoucherType of(final String type) {
        return Arrays.stream(VoucherType.values())
                .filter(v -> v.isVoucherType(type))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    private boolean isVoucherType(final String type) {
        return this.type.equals(type);
    }

}