package zoo;

// IS A relationship
public class BigDog extends Dog {
	
	// A big dog is a dog, and only speaks twice
	public void speak() {
		super.speak();
		super.speak();
	}

}
