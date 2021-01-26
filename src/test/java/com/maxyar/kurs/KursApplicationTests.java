package com.maxyar.kurs;

import com.maxyar.kurs.entities.People;
import com.maxyar.kurs.repository.PeopleCrudRepository;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Optional;

import static io.restassured.RestAssured.given;


@SpringBootTest
class KursApplicationTests {

    @Autowired
    private PeopleCrudRepository peopleCrudRepository;
    private People people;

    @BeforeClass
    public void doBefore(){
        people = new People();
        people.setName("name");
        people.setSurname("surname");
    }

    @Test(priority = 0)
    public void testAdd(){
        System.out.println(people.getName());
        String s = given()
                .contentType("application/json").body(people)
                .when().post("http://localhost:36000/Add/People")
                .then()
                .statusCode(HttpStatus.SC_OK).and().extract().body().asString();
        System.out.println(s);
    }

    @Test(priority = 1)
    public void testSelect(){
        String s = given()
                .contentType("application/json").body(people)
                .when().post("http://localhost:36000/Select/People")
                .then()
                .statusCode(HttpStatus.SC_OK).and().extract().body().asString();
        System.out.println(s);
    }

    @Test(priority = 2)
    public void testUpdate(){
        people.setName("newname");
        String s = given()
                .contentType("application/json").body(people)
                .when().post("http://localhost:36000/Update/People")
                .then()
                .statusCode(HttpStatus.SC_OK).and().extract().body().asString();
        System.out.println(s);
    }

    @Test(priority = 3)
    public void testDelete(){
        String s = given()
                .contentType("application/json").body(people)
                .when().post("http://localhost:36000/Delete/People")
                .then()
                .statusCode(HttpStatus.SC_OK).and().extract().body().asString();
        System.out.println(s);
    }
}
