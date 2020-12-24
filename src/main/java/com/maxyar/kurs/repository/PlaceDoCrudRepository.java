package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.PlaceDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaceDoCrudRepository extends JpaRepository<PlaceDo, Integer> {

    /*select
    case when exists(select * from место_установки where "x"=x and "y"=y and "z"=z) then 'небезопасно'
    else 'безопасно'
    */

    @Query(
            value = "select\n" +
                    "case when exists(select * from место_установки p where p.x= :x and p.y= :y and p.z= :z) then 'небезопасно'\n" +
                    "else 'безопасно'\n" +
                    "end\n",
    nativeQuery = true)
    String check(@Param("x") double x, @Param("y") double y, @Param("z") double z);

    /*select модель, тип, частота from устройства_передатчики where место_установки in
    (select "место_установки"."id_места" from место_установки where "x"=x and "y"=y and "z"=z);
     */
    @Query(
            value = "select g.модель, g.тип, g.частота from устройства_передатчики g where g.место_установки in \n" +
                    "    (select p.id_места from место_установки p where p.x= :x and p.y= :y and p.z= :z);",
            nativeQuery = true)
    Iterable<String> checkGadgets(@Param("x") double x, @Param("y") double y, @Param("z") double z);
}
