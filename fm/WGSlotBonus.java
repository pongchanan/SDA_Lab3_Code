public class WGSlotBonus extends Slot {
    public WGSlotBonus() {
		name="Bonus";
		software = "Symbian";
		components.add("Medium");
		components.add("ticketinticketout");
		components.add("VGA");
		components.add("ARM");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}
}
