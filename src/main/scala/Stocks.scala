import org.apache.spark.sql.SparkSession
import scala.math.*

object Stocks {
  var stocks = API_Call.spark.read_csv("sp_500_stocks.csv")
}
