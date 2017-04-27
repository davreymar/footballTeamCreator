package domain;

public class Methods {
	
	public static double diferenciasCaracteristicas(Team team1, Team team2){
		double result = 0;
		result += Math.abs((team1.getDefenseAverage()+team1.getDribblingAverage()+
				team1.getGoalkeeperAverage()+team1.getPhysicalAverage()+team1.getRythmAverage()
				+team1.getShotAverage())- (team2.getDefenseAverage()+team2.getDribblingAverage()+
						team2.getGoalkeeperAverage()+team2.getPhysicalAverage()+team2.getRythmAverage()
						+team2.getShotAverage()));
		
		
		return result;
	}
	
	public static double diferenciasZonasCampo(Team team1, Team team2){
		double result = 0;
		double diferenciasFront = team1.getFrontLane() - team2.getFrontLane();
		double diferenciasMid = team1.getMidLane() - team2.getMidLane();
		double diferenciasBack = team1.getBackLane()- team2.getBackLane();
		double diferenciasGoal = team1.getGoalkeeper() - team2.getGoalkeeper();
		result = Math.abs(diferenciasFront + diferenciasMid + diferenciasBack + diferenciasGoal);
		return result;
	}
	
	
}
