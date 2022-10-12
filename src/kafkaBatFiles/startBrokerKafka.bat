@ECHO off

TITLE Kafka broker

cd C:\kafka

bin\windows\kafka-server-start.bat config\server.properties

PAUSE