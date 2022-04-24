package com.programmers.springbootbasic.consolestarter;

import com.programmers.springbootbasic.configuration.RootAppConfig;
import com.programmers.springbootbasic.service.CustomerService;
import com.programmers.springbootbasic.service.StatusService;
import com.programmers.springbootbasic.service.VoucherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsoleAppEntryPoint {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(RootAppConfig.class);

        new VoucherManagementConsoleApp
                (applicationContext.getBean(VoucherService.class),
                        applicationContext.getBean(CustomerService.class),
                        applicationContext.getBean(StatusService.class)).run();

        applicationContext.close();
    }

}
