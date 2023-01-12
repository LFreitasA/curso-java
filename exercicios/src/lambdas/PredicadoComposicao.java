package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num>=100 && num<=999;
		
		System.out.println(isPar.and(isTresDigitos).test(35));
		System.out.println(isPar.and(isTresDigitos).negate().test(99));
		System.out.println(isPar.and(isTresDigitos).test(100));
		System.out.println(isPar.or(isTresDigitos).test(105));
		System.out.println(isPar.or(isTresDigitos).test(99));
	}
}
