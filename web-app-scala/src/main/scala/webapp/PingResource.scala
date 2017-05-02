package webapp

import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces, QueryParam}

/**
  * Created by williame on 5/2/17.
  */
@Path("ping")
class PingResource {

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def ping(@QueryParam("url") url: String): String = {
    scala.io.Source.fromURL(s"url").mkString
  }
}
