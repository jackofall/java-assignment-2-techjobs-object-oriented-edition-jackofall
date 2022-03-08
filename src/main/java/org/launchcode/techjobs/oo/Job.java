package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;
    private Employer employer;
    private CoreCompetency coreCompetency;
    private Location location;
    private PositionType positionType;

    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(Employer employer, CoreCompetency coreCompetency, Location location, PositionType positionType) {
        this();
        this.employer = employer;
        this.coreCompetency = coreCompetency;
        this.location = location;
        this.positionType = positionType;
    }
    public int getId() {
        return id;
    }




    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
