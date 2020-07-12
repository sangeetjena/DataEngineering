package org.kafka.producer

object CallKafka {
  def main(args: Array[String]): Unit = {
    val kafka = new KafkaProducerCommon()

    kafka.kafkaProducer("test","127.0.0.13:9094")
  }
}
