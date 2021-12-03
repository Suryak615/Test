package com.dnpass.corejavatraining.day7Exceptions;

import java.util.List;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
			Scanner in=null;
			int value=0;
			try {
				in= new Scanner(System.in);
				System.out.println("Enter a number");
				String input=in.next();
				value=Integer.parseInt(input);
				System.out.println("Enter value="+value);
				}catch (NumberFormatException exception) {
					System.err.println("Input was not Number");
					System.err.println("Input was not a Number"+value);
					System.err.println("Exception message"+exception.getMessage());
					System.err.println("Exception LocalizedMessage"+exception.getLocalizedMessage());
					System.out.println("Exception cause"+exception.getCause());
					System.err.println("Exception stack trace"+exception.getStackTrace());
					exception.printStackTrace();
				}catch (Exception exception) {
					System.err.println("other exception occured");
				}finally {
					in.close();
				}	
	}

}
class Account{
     private int accountNumber;
     private double accountBalance;
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void withdraw(double withdrawlAmount) {
		if(accountBalance<withdrawlAmount) {
			
			throw new IllegalArgumentException("Amount exceeds balance");
		}else
			accountBalance=accountBalance-withdrawlAmount;
	}
	public void withdraw1(double withdrawlAmount) {
		if(accountBalance<withdrawlAmount) {
			 
			throw new InsufficientFundsRuntimeException("withdrawl of"+withdrawlAmount+"exceeds balance of"+accountBalance,ErrorCode.ERR0001);
		}else
			accountBalance=accountBalance-withdrawlAmount;
	}
	public void withdrawl2(double withdrawlAmount)throws InsufficientFundsException {
		if(accountBalance<withdrawlAmount) {
			
			throw new InsufficientFundsException("withdrawl of"+withdrawlAmount+"exceeds balance of"+accountBalance,ErrorCode.ERR0002);
		}
		else
			accountBalance=accountBalance-withdrawlAmount;
	}
}
enum ErrorCode{
	ERR0001,ERR0002
}
class InsufficientFundsRuntimeException extends RuntimeException{
	private List<String> details;
	private final ErrorCode code;
	public InsufficientFundsRuntimeException(ErrorCode code) {
		super();
		this.code = code;
	}
	public InsufficientFundsRuntimeException(String message,Throwable cause, ErrorCode code) {
		super(message,cause);
		this.code = code;
	}
	public InsufficientFundsRuntimeException(List<String> details,String message,Throwable cause, ErrorCode code) {
		super(message,cause);
		this.details = details;
		this.code = code;
	}
	public InsufficientFundsRuntimeException(String message,ErrorCode code) {
		super(message);
		this.code=code;
	}
	public InsufficientFundsRuntimeException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code=code;
	}
	public List<String> getDetails(){
		return details;
	}
	public ErrorCode getCode() {
		return code;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
}
class InsufficientFundsException extends Exception{
	private List<String> details;
	private ErrorCode code;
  
  public InsufficientFundsException(String message,Throwable cause, ErrorCode code) {
	super(message,cause);
	this.code = code;
}
  public InsufficientFundsException(String message,ErrorCode code) {
		super(message);
		this.code=code;
	}
  public InsufficientFundsException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code=code;
	}
public List<String> getDetails() {
	return details;
}
public ErrorCode getCode() {
	return code;
}
public void setDetails(List<String> details) {
	this.details = details;
}
public void setCode(ErrorCode code) {
	this.code = code;
}
  
  
}