@ECHO off

TITLE Kafka Consumer

cd C:\kafka

:: replace 'tutorialspedia' with name of the topic

bin\windows\kafka-console-consumer.bat --topic tutorialspedia --bootstrap-server localhost:9092
