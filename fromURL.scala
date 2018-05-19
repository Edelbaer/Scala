import scala.io.Source
val URL_content = scala.io.Source.fromURL("URL").mkString
println(URL_content)
