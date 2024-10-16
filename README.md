SerenityBdd challenge for NTT Data

Requirements:

- Local Machine with windows 11
- IDE IntelliJ IDEA 2024.2.3 (Ultimate Edition)
- Maven version 3.9.9
- JDK version 17

Install commands:
- mvn install -DskipTests (install all POM dependencies)

Instructions to run tests Serenity:

- 1.- Right-click and run LoginTest.Java on Intellij, it will run without cucumber
- 2.- Open console
- 3.- Run mvn clean verify, it will run tests with screenplay and cucumber

  
  Instructions to run reports
- 1.- Open the console
- 2.- Type the command mvn clean verify
- 3.- Go to target/custom-reports/serenity-reports
- 4.- Open the desired report on chrome