package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		Characteristic characteristic1 = new Characteristic();
		characteristic1.setDefense(50);
		characteristic1.setDribbling(49);
		characteristic1.setGoalkeeper(70);
		characteristic1.setPhysical(60);
		characteristic1.setRhythm(70);
		characteristic1.setShot(80);
		Player player1 = new Player();
		player1.setName("JD el tarde");
		player1.setPositionPref(PositionEnum.POR);
		player1.setCharacteristic(characteristic1);
		Characteristic characteristic2 = new Characteristic();
		characteristic2.setDefense(80);
		characteristic2.setDribbling(58);
		characteristic2.setGoalkeeper(94);
		characteristic2.setPhysical(88);
		characteristic2.setRhythm(54);
		characteristic2.setShot(70);
		Player player2 = new Player();
		player2.setName("JD el pro");
		player2.setPositionPref(PositionEnum.POR);
		player2.setCharacteristic(characteristic2);
		Characteristic characteristic3 = new Characteristic();
		characteristic3.setDefense(77);
		characteristic3.setDribbling(40);
		characteristic3.setGoalkeeper(0);
		characteristic3.setPhysical(0);
		characteristic3.setRhythm(60);
		characteristic3.setShot(30);
		Player player3 = new Player();
		player3.setName("JD el fumador");
		player3.setPositionPref(PositionEnum.POR);
		player3.setCharacteristic(characteristic3);
		
		
		Characteristic characteristic4 = new Characteristic();
		characteristic4.setDefense(100);
		characteristic4.setDribbling(80);
		characteristic4.setGoalkeeper(20);
		characteristic4.setPhysical(74);
		characteristic4.setRhythm(62);
		characteristic4.setShot(92);
		Player player4 = new Player();
		player4.setName("Este no es JD");
		player4.setPositionPref(PositionEnum.POR);
		player4.setCharacteristic(characteristic4);
		Characteristic characteristic5 = new Characteristic();
		characteristic5.setDefense(40);
		characteristic5.setDribbling(40);
		characteristic5.setGoalkeeper(10);
		characteristic5.setPhysical(50);
		characteristic5.setRhythm(40);
		characteristic5.setShot(100);
		Player player5 = new Player();
		player5.setName("JD estoy hasta el nabo");
		player5.setPositionPref(PositionEnum.POR);
		player5.setCharacteristic(characteristic5);
		Characteristic characteristic6 = new Characteristic();
		characteristic6.setDefense(40);
		characteristic6.setDribbling(56);
		characteristic6.setGoalkeeper(77);
		characteristic6.setPhysical(87);
		characteristic6.setRhythm(65);
		characteristic6.setShot(75);
		Player player6 = new Player();
		player6.setName("JD de copiar mierdas");
		player6.setPositionPref(PositionEnum.POR);
		player6.setCharacteristic(characteristic6);
		
		Team team1 = new Team();
		Team team2 = new Team();
		List<Player> allPlayers = new ArrayList<Player>();
		allPlayers.add(player1);
		allPlayers.add(player2);
		allPlayers.add(player3);
		allPlayers.add(player4);
		allPlayers.add(player5);
		allPlayers.add(player6);
		double minimumDif = Double.MAX_VALUE;
		for(int i=0; i<100000;i++){
			List<Player> allPlayersAux = new ArrayList<Player>();
			allPlayersAux.addAll(allPlayers);
			Collections.shuffle(allPlayersAux);
			Set<Player> playerSet1 = new HashSet<Player>();
			playerSet1.add(allPlayersAux.get(0));
			playerSet1.add(allPlayersAux.get(1));
			playerSet1.add(allPlayersAux.get(2));
			Team teamAux1 = new Team();
			teamAux1.setPlayers(playerSet1);
			Set<Player> playerSet2 = new HashSet<Player>();
			playerSet2.add(allPlayersAux.get(3));
			playerSet2.add(allPlayersAux.get(4));
			playerSet2.add(allPlayersAux.get(5));
			Team teamAux2 = new Team();
			teamAux2.setPlayers(playerSet2);
			//double diferenciaActualCaracteristicas = Methods.diferenciasCaracteristicas(teamAux1, teamAux2);
			
			/*if(diferenciaActualCaracteristicas<minimumDif){
				minimumDif = diferenciaActualCaracteristicas;
				team1 = teamAux1;
				team2 = teamAux2;
				
			}*/
			
			double diferenciaActualZonas = Methods.diferenciasZonasCampo(teamAux1, teamAux2);
			if(diferenciaActualZonas<minimumDif){
				minimumDif = diferenciaActualZonas;
				team1 = teamAux1;
				team2 = teamAux2;
				
			}
			
			System.out.println("Iteración: " + i + ". Diferencia Actual: " + diferenciaActualZonas +
					". Diferencia Mínima hasta el momento: " + minimumDif);
		}
		
		System.out.println("Equipo 1: " +team1.toString());
		System.out.println("Equipo 2: " +team2.toString());
		
	}

}

//CONCLUSIONES: CARACTERÍSTICAS MUY BAJAS PUEDEN HACER QUE SE VAYA A LA MIERDA SI LAS DEMAS SON
//RELATIVAMENTE ALTAS



//TODO PONERLO POR ZONAS DEL CAMPO






