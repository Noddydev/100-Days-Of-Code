import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

class Marker {

	// Annotation a method using a marker.
	// Notice that no ( ) is needed.
	@MyMarker
	public static void myMeth() {
			Marker ob = new Marker();

			try {
				Method m = ob.getClass().getMethod("myMeth");

				// Determine if thye annotation is present.
				if(m.isAnnotationPresent(MyMarker.class))
						System.out.println("My Marker is Present.");
			} catch(NoSuchMethodException exc) {
					System.out.println("Method Not Found.");
			} 
	}

	public static void main(String[] args) {
		myMeth();
	}
}