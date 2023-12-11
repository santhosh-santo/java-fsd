package cameraRentApp;

public interface AdminOperations {
	
		public void adminCredentialsCheck();

		// admin login logic
		public void adminLogin();

		//aadmin register Customer
		public void adminRegisterCustomer();
		
		//admin get Customer
		public void adminGetCustomer();
		
		//admin recharege Customer Account balance
		public void adminRechargeCustomer(String custId, int rechargeAmount);
		
		//admin delete customer by id
		public void adminDelteCustomer(String custId);
		// admin logout logic
		public void adminLogout();

}
