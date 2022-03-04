package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by LaunchCode
 */
public class TestTaskSix extends AbstractTest {

    @Test
    public void testJobFieldClassExists() {
        try {
            Class theClass = getClassByName("JobField");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.JobField does not exist");
        }
    }

    @Test
    public void testEmployerExtendsJobField() {

        Class employerClass;
        Class jobFieldClass = null;
        Class superclass;

        try {
            jobFieldClass = getClassByName("JobField");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Employer does not exist");
        }

        try {
            employerClass = getClassByName("Employer");
            superclass = employerClass.getSuperclass();
            assertEquals(superclass, jobFieldClass);
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Employer does not exist");
        }

    }

    @Test
    public void testCoreCompetencyExtendsJobField() {

        Class coreCompetencyClass;
        Class jobFieldClass = null;
        Class superclass;

        try {
            jobFieldClass = getClassByName("JobField");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Employer does not exist");
        }

        try {
            coreCompetencyClass = getClassByName("CoreCompetency");
            superclass = coreCompetencyClass.getSuperclass();
            assertEquals(superclass, jobFieldClass);
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.CoreCompetency does not exist");
        }

    }

    @Test
    public void testLocationExtendsJobField() {

        Class locationClass;
        Class jobFieldClass = null;
        Class superclass;

        try {
            jobFieldClass = getClassByName("JobField");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Employer does not exist");
        }

        try {
            locationClass = getClassByName("Location");
            superclass = locationClass.getSuperclass();
            assertEquals(superclass, jobFieldClass);
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Location does not exist");
        }

    }

    @Test
    public void testPositionTypeExtendsJobField() {

        Class positionTypeClass;
        Class jobFieldClass = null;
        Class superclass;

        try {
            jobFieldClass = getClassByName("JobField");
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.Employer does not exist");
        }

        try {
            positionTypeClass = getClassByName("PositionType");
            superclass = positionTypeClass.getSuperclass();
            assertEquals(superclass, jobFieldClass);
        } catch (ClassNotFoundException e) {
            fail("Class org.launchcode.techjobs.oo.PositionType does not exist");
        }

    }

    public static class Job {

        private int id;
        private static int nextId = 1;

        private String name;
        private Employer employer;
        private Location location;
        private PositionType positionType;
        private CoreCompetency coreCompetency;

        // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
        //  other five fields. The second constructor should also call the first in order to initialize
        //  the 'id' field.

        public Job(int id) {
            this.id = id;
        }

        public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;
        }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
        //  match.

        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id.

        public int getId() {
            return id;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employer getEmployer() {
            return employer;
        }

        public void setEmployer(Employer employer) {
            this.employer = employer;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public PositionType getPositionType() {
            return positionType;
        }

        public void setPositionType(PositionType positionType) {
            this.positionType = positionType;
        }

        public CoreCompetency getCoreCompetency() {
            return coreCompetency;
        }

        public void setCoreCompetency(CoreCompetency coreCompetency) {
            this.coreCompetency = coreCompetency;
        }
    }
}
