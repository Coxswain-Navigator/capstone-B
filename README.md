This is the github page for our team!

Setup Instructions :

Step 1 : Install  Intellij IDEA Ultimate 2022.3.2 and MySQL Workbench 8.0.32 if you do not already have them. Later versions may potentially work, but these are the versions we used. Make sure to install the community edition of MYSQL and not "web" community edition which is missing important features. Ensure that that MySQL server and shell are installed.

Step 2 : Ensure that MySQL is running on services. Run the query "Final query edfdb" in MySQL and then add MySQL as a database source in intellij with edfdb as the name of the database. Test connection, build, and run on intellij.

Step 3 : IntelliJ doesn't import the project structure from maven (or gradle) automatically. You need to right-click on the pom.xml file in the email directory, and select 'Add as maven project'. Then the folders will be marked correctly, and dependent libraries will be imported.

Step 4 : You will be prompted to accept some configurations from maven, and you must accept them for it to run. If not done so already, set the configuration to springboot, set the module to java 19, and -cp signin on the next field. In the third field look up com.valencia.edfforum.EdfApplication and apply the changes. The configuration must be given a name, and EdfApplication will suffice. Ensure that the configuration is running on local machine. Finally, build the project and run once again.

Step 5 : Navigate to localhost:8080/edf and fill out the forum. As soon as the forum is completed, the requisite emails will be sent. The emails will contain links to the supervisor and student forums, which can be filled out in a chain.
