public class dogDriver
{
    public static void main(String[] args)
    {
        String compare = null;
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("Max", 6, "Golden Retriever", 110);

        if(dog2.compareTo(dog1) == 1)
        {
            compare = dog2.getName() + " is older than " + dog1.getName();
        }


        System.out.println(dog1.getBreed() + "\n" + dog1.getAge());
        System.out.println(dog2.getWeight());
        System.out.println(dog3.toString());
        System.out.println(Dog.getCount());
        System.out.println(compare);

        if(dog1.compareTo(dog3) == -1)
        {
            compare = dog1.getName() + " is younger than " + dog3.getName();
        }
        System.out.println(compare);
    }// end of main method
}// end of driver class
