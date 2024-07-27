# Step 1: Set Up Your Environment
# Java Development Kit (JDK)

# Download and install the JDK from the official Oracle website.
# Set the JAVA_HOME environment variable to point to your JDK installation directory.
# Install Maven (Optional but recommended)

# Download and install Maven from the official Apache Maven website.
# Set the MAVEN_HOME environment variable to point to your Maven installation directory.
# Add the bin directory of both JAVA_HOME and MAVEN_HOME to your PATH environment variable.

# Step 2: Create a New Maven Project
# Open a terminal or command prompt.
# Navigate to the directory where you want to create your project.
# Run the following command to create a new Maven project:
# sh
# mvn archetype:generate -DgroupId=com.example -DartifactId=SQLInjectionExample -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
# Navigate to the project directory:

# cd SQLInjectionExample
# Step 3: Add Selenium Dependencies
# Open the pom.xml file in a text editor or IDE (e.g., IntelliJ IDEA, Eclipse).
# Add the Selenium dependency inside the <dependencies> tag:
# xml
# <dependencies>
   #  <dependency>
   #      <groupId>org.seleniumhq.selenium</groupId>
   #      <artifactId>selenium-java</artifactId>
      #  <version>4.1.0</version>
 #    </dependency>
# </dependencies>
# Step 4: Write the Java Program
 # Open the src/main/java/com/example/App.java file.
# Step 5: Download and Configure ChromeDriver
# Download ChromeDriver from the official ChromeDriver website.
# Extract the downloaded file and place the chromedriver executable in a directory of your choice.
# Update the System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); line in the App.java file to point to the location of the chromedriver executable.
# Step 6: Set Up the Vulnerable Web Application
# Set up a sample vulnerable web application like DVWA (Damn Vulnerable Web Application) in a controlled environment.
# Ensure the application is running and accessible at the specified URL (e.g., http://your-vulnerable-app/login).
# Step 7: Build and Run the Program
# Open a terminal or command prompt in the project directory.
# Run the following command to build the project:
