package rnd.ws.rs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rnd.util.helper.CommandHelper;


@Path("/cmd")
public class CommandResource {
    
    @GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelp() {
	    return "Help is comming";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String execute() throws Exception {
	    return CommandHelper.execCmd("ls -ltr");
	}
}
