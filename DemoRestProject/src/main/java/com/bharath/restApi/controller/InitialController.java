package com.bharath.restApi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bharath.restApi.model.MessageBean;
import com.bharath.restApi.service.InitialService;

@Path("/initial")
public class InitialController {
	InitialService service = new InitialService();
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return service.getMessage();
		
	}
	@GET
	@Path("/messages")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MessageBean> getMessageDetail() {
		return service.getMessageDetails();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public MessageBean getMessageForId(@PathParam("messageId") int messageId) {
		return service.getMessageForId(messageId);
	}
}
