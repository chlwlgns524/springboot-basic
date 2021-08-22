package org.prgrms.kdt.Repository;

import org.prgrms.kdt.Model.Voucher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Qualifier("file")
public class FileVoucherRepository implements VoucherRepository{

    @Override
    public Optional<Voucher> findById(UUID voucherId) {
        return Optional.empty();
    }

    @Override
    public Voucher save(Voucher voucher)  {
       return null;
    }

    @Override
    public List<Voucher> findAll() {
        return null;
    }
}
