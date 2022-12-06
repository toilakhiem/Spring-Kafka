1: bin/zookeeper-server-start.sh config/zookeeper.properties
2: bin/kafka-server-start.sh config/server.properties
3: bin/kafka-console-consumer.sh --topic khiem --from-beginning --bootstrap-server localhost:9092

Note : khiem la ten topic
