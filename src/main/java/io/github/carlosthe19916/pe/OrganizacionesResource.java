package io.github.carlosthe19916.pe;

import io.github.carlosthe19916.pe.representations.idm.OrganizacionInformacionAdicionalRepresentation;
import io.github.carlosthe19916.pe.representations.idm.OrganizacionInformacionSunatRepresentation;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/organizations/{organizationId}/peru")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface OrganizacionesResource {

    @GET
    @Path("/informacion-adicional")
    OrganizacionInformacionAdicionalRepresentation getOrganization(
            @PathParam("organizationId") String organizationId
    );

    @PUT
    @Path("/informacion-adicional")
    OrganizacionInformacionAdicionalRepresentation updateOrganizationInformacionAdicional(
            @PathParam("organizationId") String organizationId,
            @Valid OrganizacionInformacionAdicionalRepresentation rep
    );

    @GET
    @Path("/informacion-sunat")
    OrganizacionInformacionSunatRepresentation getOrganizationInformacionSUNAT(
            @PathParam("organizationId") String organizationId
    );

    @PUT
    @Path("/informacion-sunat")
    OrganizacionInformacionSunatRepresentation updateOrganizationInformacionSUNAT(
            @PathParam("organizationId") String organizationId,
            @Valid OrganizacionInformacionSunatRepresentation rep
    );

}
