package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job myJob = new Job();
        Job myNewJob= new Job() ;
 assertEquals(1, myJob.getId());
 assertEquals(2, myNewJob.getId());
        assertNotEquals(myJob.getId(), myNewJob.getId());
    }
@Test
public void testJobConstructorSetsAllFields() {
        Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertEquals("Product tester",myJob.getName());
assertEquals("ACME",myJob.getEmployer().getValue());
assertEquals("Desert",myJob.getLocation().getValue());
assertEquals("Quality control",myJob.getPositionType().getValue());
assertEquals("Persistence",myJob.getCoreCompetency().getValue());


}
@Test
public void testJobsForEquality(){
    Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(myJob.getId(),myJob.getId());
}
    public JobTest() {
    }

}



