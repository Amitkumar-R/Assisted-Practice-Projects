package com.assisted.project2;

// Default Access Modifier
class Default {
	void displayDefault() {
		System.out.println("Default access modifier");
	}
}

// Private Access Modifier 
//class Private {
//	private void displayPrivate() {
//		System.out.println("Private access modifier");
//	}
//}

// Protected Access Modifier
class Protected {
	protected void displayProtected() {
		System.out.println("Protected Access Modifier");
	}
}

// Public Access Modifier
class Public {
	public void displayPublic() {
		System.out.println("Public Access Modifier");
	}
}


public class P2AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Default access modifier
		Default def = new Default();
		def.displayDefault();
		
		// Private Access Modifier 
//		Private p = new Private();
//		p.displayPrivate();		// error: displayPrivate() has private access in Private
		
		// Protected access modifier
		Protected pro = new Protected();
		pro.displayProtected();
		
		// Public access modifier
		Public pub = new Public();
		pub.displayPublic();
		
	}

}
