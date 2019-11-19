public class Dog implements Comparable <Dog>
{
    // instance variables
    private String name, breed;
    private int age;
    private double weight;
    private static int count = 0;

    public Dog()
    {
        name = null;
        age = 0;
        breed = null;
        weight = 0.0;
        count++;
    }// end of defaults class

    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        count++;
    }// end of dog class overload

    public int compareTo(Dog someDog)
    {
        if(this.age < someDog.age)
        {
            return -1;
        }
        else if (this.age == someDog.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }// end of compare to

    private void setName(String newName)
    {
        name = newName;
    }// end of name setter

    private void setAge(int newAge)
    {
        age = newAge;
    }// end of age setter

    private void setBreed(String newBreed)
    {
        breed = newBreed;
    }// end of breed setter

    private void setWeight(double newWeight)
    {
        weight = newWeight;
    }// end of weight setter

    public String getName()
    {
        return name;
    }// end of name getter

    public int getAge()
    {
        return age;
    }// end of age getter

    public String getBreed()
    {
        return breed;
    }// end of breed getter

    public double getWeight()
    {
        return weight;
    }// end of weight getter

    public static int getCount()
    {
        return count;
    }// end of count getter

    public String toString()
    {
        return "The dogs name is " + name + "\nIt is " + age + " years old."
                + "\nIt is a: " + breed + "\nIt weighs " + weight + " lbs";
    }// end of toString class

    public String toKilo(double kilo)
    {
        kilo = weight * .453592;
        return "It weighs " + kilo + " kg";
    }// end of toKilo class

}// end of dog class
