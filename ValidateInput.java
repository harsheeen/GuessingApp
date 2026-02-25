class ValidateInput extends Exception {
  //define the user defined exception function
    public ValidateInput(String message) {
        super(message); 
        System.out.println("UserDefinedException created as " + message);
    }

    //function to validate the user input using user defined exception - validainput
    public static int validainput(String input) throws ValidateInput {
        int value = Integer.parseInt(input);
        if (value < 1 || value > 100) {
         
            throw new ValidateInput("Number must be between 1 & 100");
        }
        return value;
    }
}


