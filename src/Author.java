public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Author inObj = (Author) obj;
            return firstName.equals(inObj.getFirstName()) && lastName.equals(inObj.getLastName());
        } catch (ClassCastException e) {
            System.out.println("Классы не совпадают");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() - lastName.hashCode();
    }

}
