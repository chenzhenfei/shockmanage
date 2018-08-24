package com.shock.psm.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.shock.psm.domain.Num;


@WebService(serviceName="NumberService",  endpointInterface="com.shock.psm.services.NumberService" )
@Path("/number")
@Api("/number")
public interface NumberService {
	@WebMethod
	@GET
	@Path("/findNum")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("findNum")
	Num findNum();
	
	@WebMethod
	@POST
	@Path("/addNum")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("addNum")
	void addNum(@BeanParam Num num);
	
	@WebMethod
	@POST
	@Path("/updateNum")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("updateNum")
	int updateNum(@BeanParam Num num);
	
	@WebMethod
	@GET
	@Path("/deleteNumByid")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("deleteNumByid")
	int deleteNumByid(@QueryParam("id") String id);
	
	@WebMethod
	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("findAll")
	List<Num> findAll();
}
