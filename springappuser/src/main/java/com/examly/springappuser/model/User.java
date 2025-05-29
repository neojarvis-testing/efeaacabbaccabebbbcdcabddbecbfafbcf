package com.examly.springappuser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    // userid, email, password, username, mobileNumber,userRole

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private String userRole;

    public User() {
    }

    public User(int userId, String email, String password, String username, String mobileNumber, String userRole) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.userRole = userRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}



// <?xml version="1.0" encoding="UTF-8"?>
// <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//     xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//     <modelVersion>4.0.0</modelVersion>

//     <parent>
//         <groupId>org.springframework.boot</groupId>
//         <artifactId>spring-boot-starter-parent</artifactId>
//         <version>3.1.10</version>
//         <relativePath/> <!-- lookup parent from repository -->
//     </parent>

//     <groupId>com.examly</groupId>
//     <artifactId>springapp</artifactId>
//     <version>0.0.1-SNAPSHOT</version>
//     <name>springapp</name>
//     <description>Demo project for Spring Boot</description>

//     <properties>
//         <java.version>17</java.version>
// 		 <spring-cloud.version>2022.0.5</spring-cloud.version>
//     </properties>

// <dependencies>
// 		<dependency>
// 			<groupId>org.springframework.boot</groupId>
// 			<artifactId>spring-boot-starter-data-jpa</artifactId>
// 		</dependency>
// 		<dependency>
// 			<groupId>org.springframework.boot</groupId>
// 			<artifactId>spring-boot-starter-security</artifactId>
// 		</dependency>
// 		<dependency>
// 			<groupId>org.springframework.boot</groupId>
// 			<artifactId>spring-boot-starter-web</artifactId>
// 		</dependency>
// 		<dependency>
// 			<groupId>org.springframework.boot</groupId>
// 			<artifactId>spring-boot-starter-web-services</artifactId>
// 		</dependency>

// 		<dependency>
// 			<groupId>org.springframework.boot</groupId>
// 			<artifactId>spring-boot-devtools</artifactId>
// 			<scope>runtime</scope>
// 			<optional>true</optional>
// 		</dependency>
// 		<dependency>
// 			<groupId>com.mysql</groupId>
// 			<artifactId>mysql-connector-j</artifactId>
// 			<scope>runtime</scope>
// 		</dependency>
// 		<dependency>
// 			<groupId>org.springframework.boot</groupId>
// 			<artifactId>spring-boot-starter-test</artifactId>
// 			<scope>test</scope>
// 		</dependency>
// 		<dependency>
// 			<groupId>io.jsonwebtoken</groupId>
// 			<artifactId>jjwt-api</artifactId>
// 			<version>0.11.5</version>
// 		</dependency>

// 		<dependency>
// 			<groupId>io.jsonwebtoken</groupId>
// 			<artifactId>jjwt-impl</artifactId>
// 			<version>0.11.5</version>
// 			<scope>runtime</scope>
// 		</dependency>

// 		<dependency>
// 			<groupId>io.jsonwebtoken</groupId>
// 			<artifactId>jjwt-jackson</artifactId>
// 			<version>0.11.5</version>
// 			<scope>runtime</scope>
// 		</dependency>
//         <dependency>
//             <groupId>javax.xml.bind</groupId>
//             <artifactId>jaxb-api</artifactId>
//             <version>2.3.1</version>
//         </dependency>
// 		<dependency>
// 			<groupId>org.springframework.security</groupId>
// 			<artifactId>spring-security-test</artifactId>
// 			<scope>test</scope>
// 		</dependency>
// 			<dependency>
//             <groupId>org.springframework.cloud</groupId>
//             <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
//         </dependency>
// 	</dependencies>

// <dependencyManagement>
// 		<dependencies>
// 			<dependency>
// 				<groupId>org.springframework.cloud</groupId>
// 				<artifactId>spring-cloud-dependencies</artifactId>
// 				<version>${spring-cloud.version}</version>
// 				<type>pom</type>
// 				<scope>import</scope>
// 			</dependency>
// 		</dependencies>
// 	</dependencyManagement>

//     <build>
//         <plugins>
//             <plugin>
//                 <groupId>org.springframework.boot</groupId>
//                 <artifactId>spring-boot-maven-plugin</artifactId>
//             </plugin>
//         </plugins>
//     </build>

// </project>
