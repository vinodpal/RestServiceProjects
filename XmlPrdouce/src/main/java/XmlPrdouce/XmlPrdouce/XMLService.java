/**
 * 
 */
package XmlPrdouce.XmlPrdouce;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/xml/user")
public class XMLService {

	@GET
	@Path("/get")
	@Produces("application/xml")
	public User getUserInXML() {
		User user = new User();
		user.setUsername("vinod");
		user.setPassword("password");
		user.setPin(UUID.randomUUID().toString());
		return user;

	}

}