import java.lang.Math

import org.apache.spark.*
import org.apache.spark.sql.SparkSession
import scala.math.*
import scala.sys.*

object Secret {
  val symbol = "AAPL"
  val IEX_CLOUD_API_TOKEN = "Tpk_059b97af715d417d9f49f50b51b1c448"
  val token = sys.env(IEX_CLOUD_API_TOKEN)
  val url =
    "https://sandbox.iexapis.com/stable/stock/AAPL/quote?token=Tpk_059b97af715d417d9f49f50b51b1c448"

//  val url =
//    (s"https://sandbox.iexapis.com/stable/stock/${symbol}/quote?token=${IEX_CLOUD_API_TOKEN}")

}

object API_Call {
  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  @throws(classOf[java.io.IOException])
  def getURL(url: String): String =
    io.Source.fromURL(url).mkString

  val data = spark.get()

}
