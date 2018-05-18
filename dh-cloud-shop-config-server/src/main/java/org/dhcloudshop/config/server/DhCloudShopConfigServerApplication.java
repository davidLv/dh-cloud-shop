package org.dhcloudshop.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DhCloudShopConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhCloudShopConfigServerApplication.class, args);
	}
}
