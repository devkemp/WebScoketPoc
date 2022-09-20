package com.websocket.wstutorial.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
public class WebSocketApplication {

	 
		public static void main(String[] args) {
			  SpringApplication springApplication = new SpringApplication(WebSocketApplication.class);
		        springApplication.run(args);
		}
}
