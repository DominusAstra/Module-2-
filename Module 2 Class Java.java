package petbag; // Name of Package

public class Dog {
  
  	// Variable Instances
  	
  	private int dogSpaceNumber; // Kennel Space Indicator
  	private double dogWeight; // Private Integer
  	private boolean grooming; // Was there grooming? Y = Yes N= No
  
  	
  	// Set base characteristics of the Dog class
    private Dog(String petName, int petAge int dogSpace, int daysStay, int dogSpaceNumber, double dogWeight, boolean grooming) {
      
}
  
// Constructor default with no arguements and 3 fields
  	public Dog() {
      this.dogSpaceNumber = 0;
      this.dogWeight = 0;
      this.grooming = false;
}

// Constructor default with 2 arguements and 1 field.
    public Dog(int dogSpaceNumber, double dogWeight) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;

        this.grooming = false;
}
      
// Assesor Method
	public int getDogSpaceNumber() {
      return dogSpaceNumber;
}

// Mutator Method with return for dogSpaceNumber
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;

        // Validates user input. 

        if (this.dogSpaceNumber < 0) {
            System.out.println("ERROR: Enter a valid space number.\nMust be between 1-30.");
            System.out.println("Dog Space Number Selected: " + this.dogSpaceNumber);
        } else if (this.dogSpaceNumber > 31) {
            System.out.println("ERROR: Enter a valid space number.\nMust be between 1-30.");
            System.out.println("Dog Space Number Selected: " + this.dogSpaceNumber);

        } else if (this.dogSpaceNumber == 0) {
            System.out.println("Default Space Number.\nSet space number between 1-30");
        } else if (this.dogSpaceNumber > 0 && this.dogSpaceNumber < 31) {
            System.out.println("Dog Space Number Selected: " + this.dogSpaceNumber);
        }
    }

// Assesor Method for dogSpaceNumber with new parameter.

    public double getDogWeight() {
        return dogWeight;
    }

//Mutator Method for dogSpaceNumber with new values inserterted
 public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;

        // validates weight input.

        if (this.dogWeight < 0) {
            System.out.println("ERROR: Enter valid weight .");
        } else if (this.dogWeight > 0.0 && this.dogWeight < 20.0) {

            amountDue += (24.00 * daysStay);
            if (isGrooming()) {
                amountDue += 19.95;
            }
            System.out.println("Boarding fee: $24.00 a day. \nGrooming fee: $19.95");
        } else if (this.dogWeight > 19 && this.dogWeight < 31) {
            amountDue += (29.00 * daysStay);
            if (isGrooming()) {
                amountDue += 24.95;

            }
            System.out.println("Boarding fee: $29.00 a day. \nGrooming fee: $24.95");
        } else if (this.dogWeight > 30) {
            amountDue += (34.00 * daysStay);
            if (isGrooming()) {
                amountDue += 29.95;
            }
            System.out.println("Boarding fee: $34.00 a day. \nGrooming fee: $29.95");
        }
    }
// Assesor Method for dogWeight.
    public boolean isGrooming() {
        return this.grooming;
    }

// Mutator Method dogWeight with new parameter.
    public void setGrooming(String selectGrooming, int daysStay) {
        
        if ((daysStay > 1) && (petType.equalsIgnoreCase("dog"))) {

            // Confirmation True/False outputs to user for this.grooming boolean

            System.out.println("Grooming Available.\n Enter \"yes\" to select grooming.");
            if (selectGrooming.equalsIgnoreCase("yes")) {
                this.grooming = true;
                System.out.println("Grooming has been Selected");
            } else {
                System.out.println("Grooming has been declined.");
            }
        } else if (daysStay < 2) {
            System.out.println("Grooming not available.");
        }
    }
}