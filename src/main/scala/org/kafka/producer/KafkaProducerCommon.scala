package org.kafka.producer
import org.apache.kafka
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord}
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.serialization.{ByteArrayDeserializer, ByteArraySerializer, StringDeserializer, StringSerializer}
import java.util.Properties
class KafkaProducerCommon {
  def  kafkaProducer(topic : String, brokers : String): Unit={
    try {
      val props = new Properties()
      props.put("bootstrap.server", brokers)
      props.put("key.serializer", classOf[StringSerializer])
      props.put("value.serializer", classOf[StringSerializer])
      println("setting properties")
      val kafka = new KafkaProducer[String, String](props)
      println("create records")
      val records = new ProducerRecord[String, String](topic, "key", "value")
      println("send data")
      kafka.send(records)
    }
    catch{

      case e: IndexOutOfBoundsException => System.out.println("enter to the exception   ")

    }
  }
}
