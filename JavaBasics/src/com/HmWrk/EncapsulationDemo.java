package com.HmWrk;

class EncapsulationDemo{
	  
	  private long acc_no;
	  private String name,email;
	  private float amount;
	  
	public long getAcc_no() {
			return acc_no;
		}
		public void setAcc_no(long newAcc_no) {
		    acc_no = newAcc_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String newName) {
			this.name = newName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String newEmail) {
			  email = newEmail;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float newAmount) {
			   amount = newAmount;
		}
	}
	class Main000 {
	  public static void main(String[] args) {
	    
	    EncapsulationDemo obj= new EncapsulationDemo();
	    
	    obj.setAcc_no(7560504000L);
	    obj.setName("Sumair");
	    obj.setEmail("sumair@syntaxsolutions.com");
	    obj.setAmount((float) 500000.0);
	    
	    System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
	  }
	}