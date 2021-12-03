package edu.isu.cs.cs2263.hw02;

import edu.isu.cs.cs2263.hw02.data.Course;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseTest {

    Course course;

    @BeforeEach
    public void setup(){
        course = new Course("name", "code?", 15, 2);
    }

    @Test
    public void testSetNumber(){
        course.setNumber(1);
        assertEquals(1, course.getNumber());
    }
    @Test
    public void testGetNumber(){
        assertEquals(15, course.getNumber());
        course.setNumber(25);
        assertEquals(25, course.getNumber());
    }
    @Test
    public void testSetName(){
        course.setName("new name");
        assertEquals("new name", course.getName());
    }
    @Test
    public void testGetName(){
        assertEquals("name", course.getName());
        course.setName("different name?");
        assertEquals("different name?", course.getName());
    }
    @Test
    public void testSetCredits(){
        course.setCredits(5);
        assertEquals(5, course.getCredits());
    }
    @Test
    public void testGetCredits(){
        assertEquals(2, course.getCredits());
        course.setCredits(6);
        assertEquals(6, course.getCredits());
    }
    @Test
    public void testSetCode(){
        course.setCode("2033");
        assertEquals("2033", course.getCode());
    }
    @Test
    public void testGetCode(){
        assertEquals("code?", course.getCode());
    }

}
