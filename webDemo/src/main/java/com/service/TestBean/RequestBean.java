package com.service.TestBean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by jyning on 2020/6/16.
 */
@Component
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBean {
}
