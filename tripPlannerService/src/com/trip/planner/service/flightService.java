package com.trip.planner.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/flights")
public class flightService {

   @GET
   @Path("/getFlightById")
   @Produces(MediaType.APPLICATION_XML)
   public Response getFlightById(@QueryParam("flightId") String flightId) {
       String output = "Hello this is a test to the flightService.getFlightById with flightId" + flightId;
       return Response.status(200).entity(output).build();
   }
}