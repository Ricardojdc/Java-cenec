package ricardo.torneopoder;

public class Funciones {
	
	
	public static int devolverPoder(Luchador lu) {
		
		
		if(lu.getClass().getSimpleName().compareTo("Namekiano")== 0) {
			
			return(((Namekiano) lu).getMasenko()+((Namekiano) lu).getAtaqueFisico());
			
	
		}if(lu.getClass().getSimpleName().compareTo("Universo7")== 0){
			
			return(((Universo7) lu).getKi()+((Universo7) lu).getAtaqueFisico());
			
		}
		if(lu.getClass().getSimpleName().compareTo("Universo6")== 0){
			
			return (((Universo6) lu).getKi()+((Universo6) lu).getAtaqueFisico());
		}
		if(lu.getClass().getSimpleName().compareTo("DemonioFrio")== 0){
			
			return(((DemonioFrio) lu).getKi()+((DemonioFrio) lu).getAtaqueFisico());
		}
		return 0;
		
		
		
	}

}
