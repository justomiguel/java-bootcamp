package topic_0_2;

public class RoomFactory {
	
	public Room getRoom(String type){
		if(type.equals("Op"))
			return new OperationRoom();
		if(type.equals("P"))
			return new PatientRoom();
		return null;
	}
}
