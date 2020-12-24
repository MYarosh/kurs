package com.maxyar.kurs;

import com.maxyar.kurs.repository.PeopleCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class KursApplicationTests {

    @Autowired
    private PeopleCrudRepository peopleCrudRepository;
/*
    @Test
    @Transactional
    public void testRep(){
        Optional<People> people = peopleCrudRepository.findById(1);
        System.out.println(people.map(e -> e.getName()));
    }

    @Test
    public void testRest(){
        People people = new People();
        people.setName("name");
        people.setSurname("surname");
        String s = given()
                .contentType("application/json").body(people)
                .when().post("http://localhost:8080/Select/People")
                .then()
                .statusCode(HttpStatus.SC_OK).and().extract().body().asString();
        System.out.println(s);
    }
*/
}
