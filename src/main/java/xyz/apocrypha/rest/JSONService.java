package xyz.apocrypha.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONWriter;

import xyz.apocrypha.MathService;
import xyz.apocrypha.PostObject;

@Path("/json")
public class JSONService {

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response jsonAdd(PostObject track) throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put("sum", MathService.add(track.getX(), track.getY()));
		return Response.status(201).entity(obj.toString()).build();
		
	}
	
}