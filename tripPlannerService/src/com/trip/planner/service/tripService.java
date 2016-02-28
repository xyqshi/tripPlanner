package com.trip.planner.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.trip.planner.persistence.model.TripModel;

@Path("/trips")
public class tripService {

   @GET
   @Path("/getTripById")
   @Produces(MediaType.APPLICATION_XML)
   public TripModel getTripById(@PathParam("tripId") String tripId){
       TripModel trip = new TripModel();
       trip.setTripDescription("This is a trip returned by specified tripId");
       trip.setTripId(111);
       System.out.println("HAHHHHHHHHHHHHHHHHHHH");
       return trip;
   }
   
   @GET
   @Path("/getTripsByLocationId")
   @Produces(MediaType.APPLICATION_XML)
   public List<TripModel> getTripsByLocationId(@PathParam("tripId") Integer tripId) {

       List<TripModel> trips = new ArrayList<>();
       trips.add(new TripModel());
      return trips;

   }
   
   @GET
   @Path("/testTrip")
   public Response testTrip() {
       String output = "Hello this is a test to the tripService.testTrip";
       return Response.status(200).entity(output).build();
   }
}