import java.util.ArrayList;

public class Dog
{
    private String dogName;
    private String ownerName;

    public Dog (String chosenDogName, String chosenOwnerName)
    {
        dogName = chosenDogName;
        ownerName = chosenOwnerName;
    }

    public String getDogName()
    {
        return dogName;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
}