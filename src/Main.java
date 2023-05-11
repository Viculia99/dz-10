import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();
        /*--------------------------------1-------------------------------*/
        try {
            bankApplication.process("accountId000", 50, "USD");
        }catch (WrongAccountException myWrongAccountException) {
            System.out.println("No such account exists");
        }catch (WrongCurrencyException myWrongCurrencyException){
            System.out.println("The account has an account in another currency");
        }catch (WrongOperationException myWrongOperationException){
            System.out.println("The account does not have enough funds");
        }catch (Exception myException){
            System.out.println("A processing error occurred, please try again");
        }finally{
            System.out.println("Thank you for using our service:)");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*---------------------------2------------------------------------*/
        try{
        bankApplication.process("accountId003", 250, "HRV");
        }catch (WrongAccountException myWrongAccountException) {
            System.out.println("No such account exists");
        }catch (WrongCurrencyException myWrongCurrencyException){
            System.out.println("The account has an account in another currency");
        }catch (WrongOperationException myWrongOperationException){
            System.out.println("The account does not have enough funds");
        }catch (Exception myException){
            System.out.println("A processing error occurred, please try again");
        }finally{
            System.out.println("Thank you for using our service:)");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*--------------------------3-------------------------------------*/
        try {
            bankApplication.process("accountId001", 50, "EUR");
        }catch (WrongAccountException myWrongAccountException) {
            System.out.println("No such account exists");
        }catch (WrongCurrencyException myWrongCurrencyException){
            System.out.println("The account has an account in another currency");
        }catch (WrongOperationException myWrongOperationException){
            System.out.println("The account does not have enough funds");
        }catch (Exception myException){
            System.out.println("A processing error occurred, please try again");
        }finally{
            System.out.println("Thank you for using our service:)");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*----------------------------4-----------------------------------*/
        try {
            bankApplication.process("accountId001", 850, "USD");
        }catch (WrongAccountException myWrongAccountException) {
            System.out.println("No such account exists");
        }catch (WrongCurrencyException myWrongCurrencyException){
            System.out.println("The account has an account in another currency");
        }catch (WrongOperationException myWrongOperationException){
            System.out.println("The account does not have enough funds");
        }catch (Exception myException){
            System.out.println("A processing error occurred, please try again");
        }finally{
            System.out.println("Thank you for using our service:)");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        /*----------------------------5-----------------------------------*/
        try {
            bankApplication.process("accountId001", 50, "USD");
        }catch (WrongAccountException myWrongAccountException) {
            System.out.println("No such account exists");
        }catch (WrongCurrencyException myWrongCurrencyException){
            System.out.println("The account has an account in another currency");
        }catch (WrongOperationException myWrongOperationException){
            System.out.println("The account does not have enough funds");
        }catch (Exception myException){
            System.out.println("A processing error occurred, please try again");
        }finally{
            System.out.println("Thank you for using our service:)");
        }
    }
}
