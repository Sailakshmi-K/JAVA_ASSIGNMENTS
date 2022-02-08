package CustomExceptions;

public class RegisterUser {
    public void validate(int age,String citizenship) throws InvalidAgeException {
        if(age <= 18)
            throw new InvalidAgeException("You are Minor");//2options==>try catch /throws

        if(!"Indian".equalsIgnoreCase(citizenship))
            throw  new InvalidCitizenshipException("Citizenship should be INDIAN");
    }
}

