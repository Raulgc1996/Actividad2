package org.gonicollazo.airlines.models;

public class Pilot {
private long id;
private String name;
private int liciense;
private Aircraft aircraft;
public Pilot(String name, int liciense) {
	this.name = name;
	this.liciense = liciense;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLiciense() {
	return liciense;
}
public void setLiciense(int liciense) {
	this.liciense = liciense;
}
public Aircraft getAircraft() {
	return aircraft;
}
public void setAircraft(Aircraft aircraft) {
	this.aircraft = aircraft;
}
@Override
public String toString() {
	return "Pilot [id=" + id + ", name=" + name + ", liciense=" + liciense + ", aircraft=" + aircraft + "]";
}

}
