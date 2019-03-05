package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date ChekIn;
	private Date ChekOut;
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date chekIn, Date chekOut) {
		this.roomNumber = roomNumber;
		ChekIn = chekIn;
		ChekOut = chekOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getChekIn() {
		return ChekIn;
	}

	
	public Date getChekOut() {
		return ChekOut;
	}
	public long duration() {
		long diff = ChekOut.getTime() - ChekIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	public void updateDates(Date chekIn , Date checkOut ) {
		this.ChekIn = chekIn;
		this.ChekOut = checkOut;
		
	}

	@Override
	public String toString() {
		return "Room"
				+ roomNumber
				+", Check - in: "
				+sdf.format(ChekIn)
				+", check - Out:"
				+sdf.format(ChekOut)
				+", "
				+duration()
				+"nigths";
	}
		

}
