package com.htc.hospitalapigateway.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class LoggingFilter extends ZuulFilter {
	
	private Logger logger= LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
		logger.info("request={} request URI={}",request,request.getRequestURI());
		logger.info("Remote Host Request={}",request.getRemoteHost());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
