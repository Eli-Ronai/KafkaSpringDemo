@ECHO off

TITLE Kafka Producer

cd C:\kafka

:: replace 'tutorialspedia' with name of the topic

bin\windows\kafka-console-producer.bat --topic tutorialspedia --bootstrap-server localhost:9092
