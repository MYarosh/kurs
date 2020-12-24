package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.GadgetsFrom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface GadgetsFromCrudRepository extends JpaRepository<GadgetsFrom, Integer> {

    /*select страна, count(*) as "количество" from
    (select "человек_установщик"."страна", "устройства_передатчики"."id_устройства"
    from устройства_передатчики join человек_установщик on
     "устройства_передатчики"."человек_установщик"="человек_установщик"."id_человека")t1
      group by страна order by количество desc limit 1;
     */
    @Query("select m.country.country, count(g.id) as numbers from GadgetsFrom g join ManDo m on g.manDo=m group by m.country.country order by numbers desc")
    Page<String> findcountry(Pageable pageable);
}
