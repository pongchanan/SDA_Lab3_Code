public class WGSlotStraight extends Slot {
    public WGSlotStraight() {
		name="Straight";
		software = "Linux";
		components.add("Large");
		components.add("bills");
		components.add("reels");
		components.add("ARM");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}
}
