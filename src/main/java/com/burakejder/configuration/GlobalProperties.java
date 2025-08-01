package com.burakejder.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // uyguluma ayağa kalkarken uygulumanon bağlı olduğu propertyden değerli oku
@Data      // alttaki değerleri doldur ve spring containerda beanlerimi oluştur
public class GlobalProperties {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
}
