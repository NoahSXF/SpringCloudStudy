package com.example.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example.filter
 * @Author: SXF
 * @CreateTime: 2023-05-07  16:42
 * @Description: 继承order，指定过滤的顺序
 * @Version: 1.0
 */

@Component
public class TestFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//      获取ServerHttpRequest，注意不是HttpServletRequest
        ServerHttpRequest request = exchange.getRequest();
//        打印所有参数
        System.out.println(request.getQueryParams());
//      判断是否包含Test，且参数值为1   全局的ordered默认为1，优先级相同的时候，全局过滤器优先级更高
        List<String> value = request.getQueryParams().get("Test");
        if (value != null && value.contains("1")) {
//            将ServerWebExchange向过滤链的下一级传递
            return chain.filter(exchange);
        } else {
//            不再向下传递，然后返回响应
            return exchange.getResponse().setComplete();
        }
    }

    @Override
    public int getOrder() {
//        越小优先级越高
        return 0;
    }
}
