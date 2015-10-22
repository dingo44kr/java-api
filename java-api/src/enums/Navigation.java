package enums;

public class Navigation {
	private Direction direction;
	private String msg;
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(int i) {
		switch (i) {
		case 1:
			this.direction = Direction.동;
			break;
		case 2:
			this.direction = Direction.서;
			break;
		case 3:
			this.direction = Direction.남;
			break;
		case 4:
			this.direction = Direction.북;
			break;

		default:
			break;
		}
	}
}
