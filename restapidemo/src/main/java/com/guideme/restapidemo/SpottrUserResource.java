
package com.guideme.restapidemo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.SQLException;
import java.util.ArrayList; 
import java.util.List; 


/** Example resource class hosted at the URI path "/myresource"
 */

@Path("SpottrUserResource")
public class SpottrUserResource {
    
	SpottrUserBackend server = new SpottrUserBackend();
	
	
	

    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public List<SpottrUser> getAllSpottrUsers() throws SQLException {
    	
    
    	
        return server.getStudent();
    }
    
    @GET
    @Path("SpottrUserSearch/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public SpottrUser getSpottrUser(@PathParam("email") String email) throws SQLException
    {
   
    	
    	
    	
    	return server.getSpottrUser(email);
    }
    
    
    @POST
    @Path("SpottrUserAdd")
    public SpottrUser addSpottrUser(SpottrUser userName) throws Exception
    {
    	
    	server.createSpottrUser(userName);
    	return userName;
    	
    }
    
    @PUT
    @Path("SpottrUserUpdate/UpdateGender")
    public SpottrUser updateSpottrUser(SpottrUser userName)
    {
    	
    	
    	return null;
    }
    
    
    
    
       
}


