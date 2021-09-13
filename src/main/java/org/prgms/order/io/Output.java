package org.prgms.order.io;

import org.prgms.order.voucher.service.VoucherService;

public interface Output {

    void mainMenu();

    void voucherMenu();
    void customerMenu();
    void walletMenu();

    void createVoucherType();

    void deleteWallet();

    void deleteVoucher();
}
