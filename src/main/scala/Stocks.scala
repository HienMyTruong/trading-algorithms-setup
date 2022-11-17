import breeze.*
import org.apache.spark.sql.SparkSession
import scala.math.*
import com.norbitltd.spoiwo.*

object Stocks {
  var stocks = spark.read_csv("sp_500_stocks.csv")
}
