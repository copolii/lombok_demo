package ca.mahram.demo.lombok.model;

import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test public void adamSavage () {
        final Person adam = Person.builder()
        		.name("Adam Savage")
        		.age(47)
        		.job("MythBusters")
        		.job("Unchained Reaction")
        		.build();
        
        assertEquals("Adam Savage", adam.getName());
        assertEquals(47,  adam.getAge());
        
        final Set<String> jobs = adam.getJobs();
        assertEquals(2, jobs.size());
        assertTrue(jobs.contains("MythBusters"));
        assertTrue(jobs.contains("Unchained Reaction"));
    }

}