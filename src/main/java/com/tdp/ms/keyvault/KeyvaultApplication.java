package com.tdp.ms.keyvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class: KeyvaultApplication. <br/>
 * <b>Copyright</b>: &copy; 2019 Telef&oacute;nica del Per&uacute;<br/>
 * <b>Company</b>: Telef&oacute;nica del Per&uacute;<br/>
 *
 * @author Telef&oacute;nica del Per&uacute; (TDP) <br/>
 * <u>Service Provider</u>: Everis Per&uacute; SAC (EVE) <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>Developer name</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>YYYY-MM-DD Creaci&oacute;n del proyecto.</li>
 * </ul>
 * @version 1.0
 */

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
@SpringBootApplication
@RestController
public class KeyvaultApplication implements CommandLineRunner {

    @Value("${admin}")
    private String admin;

    public static void main(String[] args) {
        SpringApplication.run(KeyvaultApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(String.format("\nConexion in Azure Key Vault:\n%s\n",admin));
    }


    @GetMapping("/get")
    public String get() {
        return admin;
    }

    @GetMapping("/test")
    public String get() {
        return "test alex mancilla";
    }
}
