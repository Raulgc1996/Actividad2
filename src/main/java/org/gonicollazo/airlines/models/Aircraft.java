package org.gonicollazo.airlines.models;

public class Aircraft {
private long id;
private String model;
private float autonomy;
private Pilot pilot;

public Aircraft( String model, float autonomy) {

	this.model = model;
	this.autonomy = autonomy;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public float getAutonomy() {
	return autonomy;
}
public void setAutonomy(float autonomy) {
	this.autonomy = autonomy;
}
public Pilot getPilot() {
	return pilot;
}
public void setPilot(Pilot pilot) {
	this.pilot = pilot;
}
@Override
public String toString() {
	return "Aircraft [id=" + id + ", model=" + model + ", autonomy=" + autonomy + ", pilot=" + pilot + "]";
}

}
