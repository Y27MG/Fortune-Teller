
public class Person{

// Private fields
private String _firstName;
private String _lastName;
private int age;
private int birth;
private int siblings;
public String color;
private String[] ROYGBIV = { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };


// Getter for the first name
public String getFirstName() {
    return _firstName;
}


    // Setter for the first name
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 50) {
            System.out.println("First name cannot be greater than 50 characters or null");
        } else {
            this._firstName = firstName;
        }
    }

    // Getter for the last name
    public String getLastName() {
        return _lastName;
    }

    // Setter for the last name
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 50) {
            System.out.println("Last name cannot be greater than 50 characters or null");
        } else {
            this._lastName = lastName;
        }
    }

    // Getter for the age
    public int getAge() {
        return age;
    }

    // Setter for the age
    public void setAge(int age) {
        if (age > 130 || age < 0) {
            System.out.println("Age needs to be from 0-130 years old");
        } else {
            this.age = age;
        }
    }

    // Getter for the birth month
    public int getBirth() {
        return birth;
    }

    // Setter for the birth month
    public void setBirth(int birth) {
        if (birth > 12 || birth < 1) {
            System.out.println("Birth Month should be between 1-12");
        } else {
            this.birth = birth;
        }
    }

    // Getter for the number of siblings
    public int getSiblings() {
        return siblings;
    }

    // Setter for the number of siblings
    public void setSiblings(int siblings) {
        if (siblings > 13 || siblings < 0) {
            System.out.println("Number of siblings cannot be more than 13");
        } else {
            this.siblings = siblings;
        }
    }

    // Getter for the favorite color
    public String getColor() {
        return color;
    }

    // Setter for the favorite color
    public void setColor(String color) {
        for (int i = 0; i < ROYGBIV.length; i++) {
            if (color.equalsIgnoreCase(ROYGBIV[i])) {
                this.color = color;
                return;
            }
        }
        System.out.println("Color must be one of the ROYGBIV colors. Type 'Help' to view the available list colors.");
    }
    
}
