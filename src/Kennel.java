import java.util.ArrayList;

// 19) Use the Dog & Kennel classes to fill in the missing methods.

public class Kennel
{
    private ArrayList<Dog> dogsInKennel;

    public Kennel()
    {
        dogsInKennel = new ArrayList<Dog>();
    }


    /*
     * This Method creates a new Dog object and adds it to the dogsInKennel ArrayList
     *
     * @param   dogName name of the new Dog
     * @param   ownerName the owner's name
     * @return  the index where the Dog was placed
     */
    public int addDogToKennel(String dogName, String ownerName)
    {
        ...
    }

    /*
     * This Method searches for a Dog by the given name.
     * It returns the Dog object, if it is found.
     * If the Dog object is not found, it returns null.
     *
     * @param   targetDog name of the Dog
     * @return  reference to found Dog object
     */
    public Dog findDog(String targetDog)
    {
        ...
    }

    /*
     * This Method removes all dogs with the given owner name.
     * It returns the number of dogs removed from the kennel.
     *
     * @param   targetOwner name of the owner
     * @return  number of Dogs removed
     */
    public int removeDogs(String targetOwner)
    {
        ...
    }
}