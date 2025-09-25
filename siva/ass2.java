
	package siva;

	class Box<T> {  
	    private T value;

	    public void set(T value) {
	        this.value = value;
	    }

	    public T get() {
	        return value;
	    }
	}

	public class ass2 {
	    public static void main(String[] args) {
	        Box<String> b1 = new Box<>();
	        b1.set("Hello Generics");
	        System.out.println("String value: " + b1.get());

	        Box<Integer> b2 = new Box<>();
	        b2.set(123);
	        System.out.println("Integer value: " + b2.get());
	    }
	}


