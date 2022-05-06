import java.io._

object runWebScrape {
  def main(args: Array[String]): Unit = {
    val pw = new PrintWriter(new File("output/comics.html" ))
    pw.write("<html>\n<head><title>Paul's comics page</title></head>\n")
    pw.write("<body>\nI am a webpage\n</body>\n</html>")
    pw.close
  }
}
