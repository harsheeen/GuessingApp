class ValidateInput extends Exception {
  
    public ValidateInput(String message) {
        super(message); 
        System.out.println("UserDefinedException created: " + message);
    }

    
    public static int validainput(String input) throws ValidateInput {
        int value = Integer.parseInt(input);
        if (value < 1 || value > 100) {
         
            throw new ValidateInput("Number must be between 1 and 100");
        }
        return value;
    }
}


