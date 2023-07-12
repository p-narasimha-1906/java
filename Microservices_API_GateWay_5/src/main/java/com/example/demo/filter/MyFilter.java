 package com.example.demo.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;


import reactor.core.publisher.Mono;

public class MyFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		  System.out.println(exchange.getRequest());
		  ServerHttpRequest shr=exchange.getRequest();
		  System.out.println(shr.getHeaders());
		  Set<String> keyset=shr.getHeaders().keySet();
		  for(String key:keyset)
		  {
			  System.out.print(key+"---");
			  System.out.println(shr.getHeaders().getValuesAsList(key));
		  }
		  
		return chain.filter(exchange);
	}
	

}
