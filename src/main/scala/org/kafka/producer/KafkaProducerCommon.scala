package org.kafka.producer
import org.apache.kafka.clients.producer._
import java.util.Properties
class KafkaProducerCommon {
  def  kafkaProducer(topic : String, brokers : String): Unit={
    try {
      val props = new Properties()
      props.put("bootstrap.server", brokers)
      props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerialization")
      props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerialization")
      val kafka = new KafkaProducer[String, String](props)
      val records = new ProducerRecord[String, String](topic, "key", "value")
      kafka.send(records)
    }
    catch{
      case e: IndexOutOfBoundsException => System.out.println("00   ")

    }
  }

  def main(args: Array[String]): Unit = {
    val kafka = new KafkaProducerCommon()
    kafka.kafkaProducer("test","127.0.0.13:9094")
  }
}
