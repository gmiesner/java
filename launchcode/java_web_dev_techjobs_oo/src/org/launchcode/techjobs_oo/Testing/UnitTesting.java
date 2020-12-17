package org.launchcode.techjobs_oo.Testing;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.testng.annotations.Test;

import javax.naming.Name;

import static org.junit.Assert.*;


public class UnitTesting {
    Job test_job = new Job();
    Job test_job2 = new Job();
    Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job test_job4 = new Job("Ella", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Java Developer"), new CoreCompetency("Creativity"));
    Job test_job5 = new Job("Ella", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Java Developer"), new CoreCompetency("Creativity"));
    Job test_job6 = new Job("Denise", new Employer(""), new Location("Denver"), new PositionType("UX"), new CoreCompetency("Patience"));
    @Test
    public void testingJobObjectsAreDifferent(){ assertEquals(test_job.getId(), test_job2.getId() - test_job.getId(), 1); }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(test_job3.getName(), "Product tester", test_job3.getName());
        assertEquals(test_job3.getEmployer().getValue(), "ACME", "ACME");
        assertEquals(test_job3.getLocation().getValue(), "Desert", "Desert");
        assertEquals(test_job3.getPositionType().getValue(), "Quality control", "Quality control");
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
        assertTrue(test_job3 instanceof Job);
        }

        @Test
    public void testJobsForEquality(){
        assertEquals(test_job4.equals(test_job5), false);
        }

// testing
    @Test
    public void JobObjectNewLine(){
        assertEquals(test_job3.toString().startsWith("\n"), true);
        assertEquals(test_job3.toString().endsWith("\n"), true);
    }

    @Test
    public void noBlankValues(){
        assertEquals(test_job6.toString(), "\n" +
                "ID: 6\n" +
                "Name: Denise\n" +
                "Employer: Data not available\n" +
                "Location: Denver\n" +
                "Position Type: UX\n" +
                "Core Competency: Patience\n" + "\n" );
        System.out.println(test_job6.toString());

        ;
    }
}
