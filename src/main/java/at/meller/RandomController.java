package at.meller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("")
public class RandomController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/api")
    public String randomNumb() {
        return String.valueOf(generator());
    }

    public int generator() {
        // comment
        Random rand = new Random(); //instance of random class
        int upperbound = 101;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
