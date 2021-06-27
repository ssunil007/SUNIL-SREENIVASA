Mobile Automation Framework
=======================

#Testing Mobile App using Open Source Tools

##Objective

Intent of this proect is to illustrate how wide range of **Open Source Tools** can be used to test mobile applications both **Android** or **iOS** and parallelise the test suite with multiple connected devices.

##Snapshot

This is a simple **Maven** project designed as a hybrid framwork with combination of Page Object Model and Data Driven Framework and is created using various **Open Source Tools** such as

* Appium - Open Source Tool for cross platform testing
* Selenium WebDriver - WebDriver API used to to perform mobile gestures
* Maven - Dependency Management
* TestNG - Test Annotation to organize test suite and parameterization

##Installations

1. Download and Install JDK8 from the below link
[https://adoptopenjdk.net/]

2. Download and Install Android Studio from the below link
[https://developer.android.com/studio?gclid=CjwKCAjww-CGBhALEiwAQzWxOhsAUZlMWuodNM3WgYZUY82q1QILJoGWT2AW5ESns35NwSgD60pYfxoCjkwQAvD_BwE&gclsrc=aw.ds]

3. Download and Install Appium Desktop from the below link 
[https://github.com/appium/appium-desktop/releases/]
>Note: Appium version above  1.17.0 is preferrable

4. Setting Envirnoment variables JAVA_HOME & ANDRIOD_HOME

##Steps for Execution

1. Clone  the repository into any IDE ( Eclipse or IntelliJ )

2. Open **Android Studio**, configure an _emulator_ in AVD Manager and launch it

3. Launch the **Appium Deskop** and start the server

4. Build the Project using **Maven** to update the dependencies

5. Run the below command to start execution
     '''
    mvn clean test  -Drelease.arguments=testng_android3.xml
    -Dplatform=Android -DdeviceName=Android -DplatformVersion=9.0 -DappPath=/src/test/resources/AppFile/com.monefy.app.lite_2021-06-15.apk  -DlogFilePath=/src/test/resources/Screenshots
     '''
