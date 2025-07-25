package wickedlysmart.headfirst.observer.simple;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
		
		simpleSubject.removeObserver(simpleObserver);
	}
}
