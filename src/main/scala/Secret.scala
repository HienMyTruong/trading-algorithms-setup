import breeze.*
import org.apache.spark.sql.SparkSession
import scala.math.*
import com.norbitltd.spoiwo.*

object Secret {
  val IEX_CLOUD_API_TOKEN = "Tpk_059b97af715d417d9f49f50b51b1c448"
  val token = sys.env(s"{IEX_CLOUD_API_TOKEN}")
}
