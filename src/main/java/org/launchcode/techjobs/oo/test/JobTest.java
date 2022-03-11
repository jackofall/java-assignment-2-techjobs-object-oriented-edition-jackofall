package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
 assertFalse(myJob.getId()==myNewJob.getId());
    }

    public JobTest() {
    }
}




