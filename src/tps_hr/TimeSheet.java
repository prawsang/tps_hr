package tps_hr;

import java.util.Calendar;

public class TimeSheet {
	private Calendar date;
	private String startTime , endTime;
	private String note;
	private Employee user;
	
	public TimeSheet(Calendar date,String startTime ,String endTime , String note,Employee user) {
		setDate (Calendar.getInstance());
		setStartTime(startTime);
		setEndTime(endTime);
		setNote(note);
		setUser(user);
		this.getUser().timeSheetList.add(this);
		
	}
	
	public void editTimeSheet(String part,String editedInfo) {
		if(part.toLowerCase() == "starttime") {
			setStartTime(editedInfo);
			setDate(Calendar.getInstance());
			return;
		}
		if(part.toLowerCase() == "endtime") {
			setEndTime(editedInfo);
			setDate(Calendar.getInstance());
			return;
		}
		if(part.toLowerCase() == "note") {
			setNote(editedInfo);
			setDate(Calendar.getInstance());
			return;
		}
	}
	
	public void addNote(String newnote) {
		setNote(this.getNote()+"\n"+newnote);
	}
	
	@Override
	public String toString() {
		return "Last Update:"+date.toString()+"\n"+"Start Time :"+startTime+"\n"+"End Time :"+endTime+"\n"+"Note :" + note;
	}
	
	//getters and setters
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Employee getUser() {
		return user;
	}

	public void setUser(Employee user) {
		this.user = user;
	}

	
}
