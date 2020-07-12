// Demomstrate a repeated annotation.

import java.lang.annotation.*;
import java.lang.reflect.*;

// Make MyAnno repeatable.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
	String str() default "Testing";
	int val() default 9000;
}

// This is the container annoatation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	MyAnno[] value();
}

class RepeatAnno {
	
	// Repeat MyAnno on myMeth().
	@MyAnno(str = "First annotation", val = -1)
	@MyAnno(str = "second annotation", val = 100)
	public static void myMeth(String str, int i) 
	{
		RepeatAnno ob = new RepeatAnno();

		try {
			Class<?> c = ob.getClass();

			// Obtain the annotation for myMeth().
			Method m = c.getMethod("myMeth", String.class, int.class);

			// Display the repeated MyAnno annotations.
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		} catch(NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth("test", 10);
	}
}