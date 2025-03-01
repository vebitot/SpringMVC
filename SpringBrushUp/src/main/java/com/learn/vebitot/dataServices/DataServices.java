package com.learn.vebitot.dataServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/DataServices")
public interface DataServices {
	
	@GET
	@Path("/getData")
	@Produces({MediaType.APPLICATION_JSON})
	public String getData(@QueryParam("token") String token);
}
