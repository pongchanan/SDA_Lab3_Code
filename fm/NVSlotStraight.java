public class NVSlotStraight extends Slot {
	public NVSlotStraight() {
		name="Straight";
		software = "Linux";
		components.add("Large");
		components.add("ticketinticketout");
		components.add("reels");
		components.add("ARM");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}
}
