package service;

import entities.Fly;
import Enum.TypeAirPlane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFlyTest {

    HashMap<String, Fly> flyList;

    @BeforeEach
    void setUp() {
        flyList = new HashMap<>();
        flyList.put("AAD512", new Fly("AAD512",23456,true, LocalDate.of(2023,10,28), LocalTime.of(2,35), TypeAirPlane.AIRBUSA320.getAirPlane()));
        flyList.put("ZZU098", new Fly("ZZU098",15432,true,LocalDate.of(2023,6,10),LocalTime.of(3,50), TypeAirPlane.BOEING747));
        flyList.put("JFG432", new Fly("JFG432",87644,true,LocalDate.of(2023,4,8),LocalTime.of(6,5), TypeAirPlane.BOEING737));
    }

    @Test
    void addWellTheDateInTheList () {
        LocalDate date = LocalDate.parse("2023-04-08");
        assertEquals(date,flyList.get("JFG432").getDate());
    }
}