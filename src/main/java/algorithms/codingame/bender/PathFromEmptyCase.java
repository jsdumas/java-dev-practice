package algorithms.codingame.bender;

public class PathFromEmptyCase implements PathFinder {

	private final PathPriority_old pathPriority_old;

	public PathFromEmptyCase(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.pathPriority_old = new PathPriority_old(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return pathPriority_old.getNextCase();
	}

}
