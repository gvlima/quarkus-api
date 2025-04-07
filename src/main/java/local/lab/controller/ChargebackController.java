package local.lab.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


@Path("/chargebacks")
public class ChargebackController {

    @GET
    public Response getChargebackByUser(@QueryParam("customerId")Long customerId) {
        System.out.println(customerId);
        return Response.ok("get all chargebacks by customerId").build();
    }

    @GET
    @Path("/{id}")
    public Response getChargeback(@PathParam("id")Long id){
        System.out.println(id);
        return Response.ok("get chargeback detail").build();
    }

    @POST
    public Response createChargeback(){
        System.out.println("post done");
        return Response.ok("create new chargeback").build();
    }
}
