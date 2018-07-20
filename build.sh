cd Chat
mvn clean
mvn package
mvn install
java -jar target/chat.jar
cd ..
cd father1
mvn clean
mvn package
mvn install
java -jar target/father1.jar
java -cp target/father1.jar father.Main2
cd ..
