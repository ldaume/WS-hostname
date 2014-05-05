package ws

import javax.net.ssl.{SSLSession, HostnameVerifier}
import play.api.Logger

class NoHostnameCanBeTrusted extends HostnameVerifier {
  override def verify(hostname: String, session: SSLSession) = {
    Logger.info(s"cannot verify '$hostname'")
    false
  }
}
