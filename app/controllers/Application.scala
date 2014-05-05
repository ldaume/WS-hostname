package controllers

import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.ws.WS

object Application extends Controller {

  def index = Action.async {
    WS.url("https://github.com/").get.map { r =>
      Ok(s"'https://github.com/' answers with ${r.status}")
    }
  }

}