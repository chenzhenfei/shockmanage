package com.shock.psm.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shock.psm.domain.Hello;


/**
 * webservice
 * date: 2018年7月19日 下午4:46:43 <br/>  
 * @author czf
 * @version
 */
@WebService(serviceName="HelloService",  endpointInterface="com.shock.psm.services.HelloService" )
@Path("/hello")
@Api("/hello")
public interface HelloService {
	@WebMethod
	@GET
	@Path("/sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("问好")
	public Hello sayHello();
	
	@WebMethod
	@POST
	@Path("/sayBeyBey")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@ApiOperation("beybey问好")
	public void sayBeyBey(@BeanParam Hello hello);
	
}
