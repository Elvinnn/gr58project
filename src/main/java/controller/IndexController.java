package controller;

import model.PersonModel;
import persistence.service.PersonService;
import persistence.service.PersonServiceImpl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/index")

public class IndexController {

    private PersonService personService = new PersonServiceImpl();

    @Path("/get")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonModel> getAllPersons(){

        return personService.getAllPersons();
    }




}
