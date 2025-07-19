public class NJSlotStraight extends Slot {
	public NJSlotStraight() {
		name="Straight";
		software = "Window ME";
		components.add("Small");
		components.add("coins");
		components.add("LCD");
		components.add("ARM");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}
}
