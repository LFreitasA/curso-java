package classe;

public class AreaCircunferencia {
	double raio;
	static final double pi=3.14;
	AreaCircunferencia(double raioInicial){
		raio = raioInicial;
	}
	
	double area(){
		return raio*raio * pi;
	}
}
