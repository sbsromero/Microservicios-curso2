package com.microservice.zuulgateway.filters;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		if (request.getAttribute("AUTH_HEADER") == null) {
			String sessionId = UUID.randomUUID().toString();
			ctx.addZuulRequestHeader("AUTH_HEADER", sessionId);
		}
		System.out
				.println("Pre Filter: " + request.getMethod() + " Request URL: " + request.getRequestURL().toString());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
