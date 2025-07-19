public class WGSlotProgressive extends Slot {
    public WGSlotProgressive() {
		name="Progressive";
		software = "Android";
		components.add("Large");
		components.add("coins");
		components.add("reels");
		components.add("ARM");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}
}
