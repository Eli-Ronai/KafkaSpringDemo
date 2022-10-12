
Instructions
----------------------------------------------------------------------------------------------------

RUN local Zookeeper
RUN local Broker

Create TOPIC "name"

Ensure "name" matches to the listener componant & the kafka controller

Endpoints:

post - hello world
http://localhost:8080/kafka/produce?message=helloworld

get list of messages from that topic
http://localhost:8080/kafka/messages
---------------------------------------------------------------------------------------------------
::Create new topic called 'tutorialspedia'

kafka-topics.bat --create --topic tutorialspedia --bootstrap-server localhost:9092

::Get list of topics

kafka-topics.bat --list --bootstrap-server localhost:9092

::Publish messages to this topic
bin\windows\kafka-console-producer.bat --topic tutorialspedia --bootstrap-server localhost:9092

::Consume messages from this topic
bin\windows\kafka-console-consumer.bat --topic tutorialspedia --bootstrap-server localhost:9092