package com.trip.planner.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hotels")
public class hotelService {

   @GET
   @Path("/getHotelById")
   public Response getHotelById(@QueryParam("hotelId") String hotelId) {
       String output = "Hello this is a test to the hotelService.getHotelById with flightId" + hotelId;
       return Response.status(200).entity(output).build();
   }
   
   @GET
   @Path("/testHotel")
   public Response testHotel() {
       String output = "Hello this is a test to the hotelService.testHotel";
       return Response.status(200).entity(output).build();
   }
}